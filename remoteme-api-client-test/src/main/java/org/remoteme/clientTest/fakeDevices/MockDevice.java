package org.remoteme.clientTest.fakeDevices;



import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.ARemoteMeMessage;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.PingMessage;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.SyncResponseMessage;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.SyncUserMessage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Supplier;


public abstract class MockDevice {

	final String token;
	final int deviceId;
	private final String host;
	private final int port;


	LinkedBlockingDeque<ARemoteMeMessage> receivedMessages = new LinkedBlockingDeque<>();

	protected MockDevice(String token,int deviceId,String host,int port) {
		this.token=token;
		this.deviceId=deviceId;
		this.host=host;
		this.port=port;
	}


	protected void afterConnect(){
		SocketDeviceManager.get().addSocket(this);
	}

	protected void afterDisconnect(){
		SocketDeviceManager.get().removeSocket(this);
	}
	protected String getToken() {
		return token;
	}

	public final String getHost() {
		return host;
	}

	public final int getPort() {
		return port;
	}



	public final ARemoteMeMessage getMessage() throws InterruptedException {
		return receivedMessages.poll(10, TimeUnit.SECONDS);
	}

	public  void  connectAndWait(Function<Integer,Boolean> isConnected) throws InterruptedException, ExecutionException, URISyntaxException, IOException {
		connect();
		for(int i=0;i<500;i++){//5s

			if (isConnected.apply(getDeviceId())){
				return;
			}
			Thread.sleep(10);
		}

		throw new RuntimeException("ddint connect");

	}

	protected abstract void  connect() throws InterruptedException, ExecutionException, URISyntaxException, IOException;

	protected final void handleMessage(ARemoteMeMessage decode) {
		if (decode instanceof SyncUserMessage) {
			SyncUserMessage message = (SyncUserMessage) decode;
			List<Integer> messageB = message.getMessage();
			for (int i = 0; i < messageB.size(); i++) {
				messageB.set(i, 2 * messageB.get(i));
			}
			SyncResponseMessage responseMessage = new SyncResponseMessage(message.getMessageId(), messageB);

			sendMessage(responseMessage);

		} else {
			//log.info("got message into {}", receivedMessages.size());
			receivedMessages.add(decode);
		}
	}

	public abstract void sendMessage(ARemoteMeMessage responseMessage);
	public abstract void disconnect() throws IOException ;

	public void disconnectAndWait(Function<Integer,Boolean> isConnected) throws IOException, InterruptedException {
		disconnect();
		for(int i=0;i<500;i++){//5s
			if (!isConnected.apply(getDeviceId())){
				Thread.sleep(100);//events are send
				return;
			}
			Thread.sleep(10);
		}
		throw new RuntimeException("ddint disconnect");

	}

	public final int getDeviceId() {
		return deviceId;
	}

	public void sendPing() {
		sendMessage(new PingMessage());
	}

	public boolean isMessageWaiting() {
		return !receivedMessages.isEmpty();
	}
}

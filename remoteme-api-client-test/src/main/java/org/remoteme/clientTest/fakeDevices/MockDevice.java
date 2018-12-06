package org.remoteme.clientTest.fakeDevices;



import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.ARemoteMeMessage;
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


public abstract class MockDevice {
	final UserDevice userDevice;
	final String token;

	LinkedBlockingDeque<ARemoteMeMessage> receivedMessages = new LinkedBlockingDeque<>();

	protected MockDevice(String token, UserDevice userDevice) {

		this.userDevice = userDevice;
		this.token=token;
	}


	protected String getToken() {
		return token;
	}


	public UserDevice getUserDevice() {
		return userDevice;
	}




	public final ARemoteMeMessage getMessage() throws InterruptedException {
		return receivedMessages.poll(10, TimeUnit.SECONDS);
	}

	public  void  connectAndWait() throws InterruptedException, ExecutionException, TimeoutException, URISyntaxException, IOException {
		boolean connected=false;
		connect();
		for(int i=0;i<500;i++){//5s

			/*if (context.getBean(DeviceConnectionManager.class).isDeviceConnected(userDevice)){
				connected=true;
				break;
			}*/
			Thread.sleep(10);
		}

		if (!connected){
			throw new TimeoutException("ddint connect");
		}

	}

	protected abstract void  connect() throws InterruptedException, ExecutionException, TimeoutException, URISyntaxException, IOException;

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

	public final int getDeviceId() {
		return userDevice.getDeviceId();
	}

	public boolean isMessageWaiting() {
		return !receivedMessages.isEmpty();
	}
}

package org.remoteme.clientTest.fakeDevices;



import org.remoteme.utils.messages.v1.core.messages.remoteMe.ARemoteMeMessage;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.PingMessage;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Optional;

public abstract class SocketDevice extends MockDevice{


	int port;

	protected Socket clientSocket;

	public SocketDevice(String token,UserDevice userDevice  ,int port) {
		super(token,userDevice);
		this.port = port;

	}



	public void checkAndRead() throws IOException {
		Optional<ARemoteMeMessage> aRemoteMeMessage = readMessage();
		if (aRemoteMeMessage.isPresent()){
			handleMessage(aRemoteMeMessage.get());
		}
	}
	public void connect() throws IOException {
		clientSocket = new Socket("localhost", port);
		writeAuthMessage();
		SocketDeviceManager.get().addSocket(this);

	}

	protected abstract void writeAuthMessage() throws IOException;


	protected Optional<ARemoteMeMessage> readMessage() throws IOException {
		InputStream inputStream = clientSocket.getInputStream();
		if (inputStream.available()!=0){
			DataInputStream dataInputStream = new DataInputStream(inputStream);

			int messageType = dataInputStream.readUnsignedShort();
			if (messageType==0){//ping
				dataInputStream.skipBytes(dataInputStream.available());
				return Optional.empty();
			}
			int size = dataInputStream.readUnsignedShort();

			ByteBuffer allocate = ByteBuffer.allocate(size + 4);
			allocate.putShort((short) messageType);
			allocate.putShort((short) size);
			byte[] data = new byte[size];
			dataInputStream.read(data);
			allocate.put(data);
			allocate.rewind();

			return Optional.of(ARemoteMeMessage.decode(allocate));
		}else{
			return Optional.empty();
		}


	}


	public void disconnect() throws IOException {
		clientSocket.close();
		SocketDeviceManager.get().removeSocket(this);
	}

	@Override
	public void sendMessage(ARemoteMeMessage responseMessage) {
		try {
			clientSocket.getOutputStream().write(responseMessage.toByteBuffer().array());
		} catch (IOException e) {
			System.out.println("error whiel sneding message");
			SocketDeviceManager.get().removeSocket(this);
		}
	}

	public void sendPing() {
		sendMessage(new PingMessage(getDeviceId()));
	}
}

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



	protected Socket clientSocket;

	public SocketDevice(int deviceId, String token, String host, int port) {
		super(token,deviceId,host, port);

	}



	public void checkAndRead() throws IOException {
		Optional<ARemoteMeMessage> aRemoteMeMessage = readMessage();
		if (aRemoteMeMessage.isPresent()){
			handleMessage(aRemoteMeMessage.get());
		}
	}
	public void connect() throws IOException {
		clientSocket = new Socket(getHost(), getPort());
		writeAuthMessage();
		afterConnect();
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
		try {
			clientSocket.close();
		}catch (Exception ex){

		}
		afterDisconnect();
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


}

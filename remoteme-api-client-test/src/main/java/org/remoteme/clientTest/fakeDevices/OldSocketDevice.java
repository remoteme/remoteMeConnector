package org.remoteme.clientTest.fakeDevices;



import java.io.DataOutputStream;
import java.io.IOException;

public class OldSocketDevice extends SocketDevice{


	public OldSocketDevice(int deviceId,String token,String host   ) {
		super(deviceId, token, host, 18);

	}


	@Override
	protected void writeAuthMessage() throws IOException {
		DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		dataOutputStream.writeShort(getDeviceId());
		dataOutputStream.write( getToken().getBytes());
		dataOutputStream.write(0);
		dataOutputStream.flush();
	}



}

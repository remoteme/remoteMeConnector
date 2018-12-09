package org.remoteme.clientTest.fakeDevices;



import org.remoteme.utils.messages.v1.core.messages.remoteMe.AuthentificateMessage;

import java.io.DataOutputStream;
import java.io.IOException;

public class NewSocketDevice extends SocketDevice{


	public NewSocketDevice(int deviceId, String token, String host) {
		super(deviceId, token, host, 19);

	}


	@Override
	protected void writeAuthMessage() throws IOException {
		DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		dataOutputStream.write(new AuthentificateMessage(getDeviceId(), getToken()).toByteBuffer().array());


		dataOutputStream.flush();
	}
}

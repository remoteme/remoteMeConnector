package org.remoteme.clientTest.fakeDevices;



import org.remoteme.utils.messages.v1.core.messages.remoteMe.AuthentificateMessage;
import org.springframework.context.ApplicationContext;

import java.io.DataOutputStream;
import java.io.IOException;

public class NewSocketDevice extends SocketDevice{


	public NewSocketDevice(String token,UserDevice ud  ) {
		super(token,ud,19);

	}


	@Override
	protected void writeAuthMessage() throws IOException {
		DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		dataOutputStream.write(new AuthentificateMessage(getDeviceId(), getToken()).toByteBuffer().array());


		dataOutputStream.flush();
	}
}

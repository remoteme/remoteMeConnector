package org.remoteme.clientTest.fakeDevices;



import org.remoteme.utils.messages.v1.core.messages.remoteMe.ARemoteMeMessage;
import org.remoteme.utils.general.ByteBufferUtils;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.io.IOException;
import java.nio.ByteBuffer;


public class StdWebSocketDevice extends WebSocketDevice {

	public StdWebSocketDevice(int deviceId,String token,int port,String host ) {
		super(deviceId,token,port,host  );

	}


	@Override
	protected WebSocketHandler getWebSocketHandler() {
		return new AbstractWebSocketHandler() {
			@Override
			protected void handleBinaryMessage(WebSocketSession session, BinaryMessage bmessage) {
				ByteBuffer payload = bmessage.getPayload();
				int i = Short.toUnsignedInt(payload.getShort());
				if (i!=0){//not ping
					payload.rewind();
					ARemoteMeMessage decode =ARemoteMeMessage.decode(payload);
					StdWebSocketDevice.super.handleMessage(decode);
				}

			}
		};
	}

	@Override
	protected String getUrl() {
		return "ws://"+ getHost() +":"+getPort()+"/api/" + getToken() + "/ws/v1/" +getDeviceId() + "/";

	}

	@Override
	public void sendMessage(ARemoteMeMessage responseMessage) {
		try {
			webSocketSession.sendMessage(new BinaryMessage(	ByteBufferUtils.readByteArray(responseMessage.toByteBuffer())));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


}

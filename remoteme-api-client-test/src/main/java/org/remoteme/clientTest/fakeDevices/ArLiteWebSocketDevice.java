package org.remoteme.clientTest.fakeDevices;


import org.remoteme.utils.jackson.JacksonHelper;
import org.remoteme.utils.messages.v1.core.messages.AMessage;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.ARemoteMeMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;


public class ArLiteWebSocketDevice extends WebSocketDevice {



	public ArLiteWebSocketDevice(int deviceId,String token,int port,String host   ) {
		super(deviceId,token,port,host);
	}


	@Override
	protected String getUrl() {
		return  "ws://"+getHost()+":"+getPort()+"/arLite/"+token+"/ws/v1/" + getDeviceId() + "/";
	}

	@Override
	protected WebSocketHandler getWebSocketHandler() {
		return new TextWebSocketHandler(){
			@Override
			protected void handleTextMessage(WebSocketSession session, TextMessage message)   {

				String payload = message.getPayload();


				AMessage messageUD = JacksonHelper.deserialize(payload,AMessage.class);


				if (messageUD instanceof ARemoteMeMessage){
					ArLiteWebSocketDevice.super.handleMessage((ARemoteMeMessage)messageUD);
				}

			}
		};
	}

	@Override
	public void sendMessage(ARemoteMeMessage responseMessage) {
		try {

			webSocketSession.sendMessage(new TextMessage(JacksonHelper.serialize(responseMessage)) );

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	protected WebSocketHttpHeaders getHeaders() {
		//WebSocketHttpHeaders webSocketHttpHeaders = new WebSocketHttpHeaders();
		//webSocketHttpHeaders.set(ARLiteTokenAuthentification.getHeaderTokenName(),ARLiteTokenAuthentification.createToken(smartPhone.getOwner()));
		return null;// webSocketHttpHeaders;

	}


}

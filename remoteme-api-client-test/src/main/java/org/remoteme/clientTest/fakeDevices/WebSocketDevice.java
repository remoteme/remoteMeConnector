package org.remoteme.clientTest.fakeDevices;

import lombok.extern.slf4j.Slf4j;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.UserMessage;
import org.remoteme.utils.messages.v1.enums.UserMessageSettings;
import org.springframework.context.ApplicationContext;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public abstract class WebSocketDevice extends MockDevice {


	protected WebSocketSession webSocketSession;
	private int port;

	public WebSocketDevice(String token,int port,  UserDevice userDevice) {
		super(token,userDevice);
		this.port=port;

	}


	protected int getPort(){
		return port;
	}



	protected void connect() throws InterruptedException, ExecutionException, TimeoutException, URISyntaxException {
		WebSocketClient webSocketClient = new StandardWebSocketClient();


		String url = getUrl();


		webSocketSession = webSocketClient.doHandshake(getWebSocketHandler(), getHeaders(), new URI(url)).get(10, TimeUnit.SECONDS);


	}

	protected abstract WebSocketHandler getWebSocketHandler();




	protected WebSocketHttpHeaders getHeaders() {
		return new WebSocketHttpHeaders();

	}

	protected abstract String getUrl();




	public void disconnect() throws IOException {
		webSocketSession.close();
	}

	public void sendUserMessageMessage(int deviceId, String hex) {
		sendMessage(new UserMessage(UserMessageSettings.NO_RENEWAL, deviceId, getDeviceId(), 0, hex));
	}



}
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

	public WebSocketDevice(int deviceId,String token,int port,String host   ) {
		super(token, deviceId,host, port);


	}





	protected void connect() throws InterruptedException, ExecutionException, URISyntaxException {
		WebSocketClient webSocketClient = new StandardWebSocketClient();


		String url = getUrl();


		try {
			webSocketSession = webSocketClient.doHandshake(getWebSocketHandler(), getHeaders(), new URI(url)).get(10, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			throw new RuntimeException(e);
		}

		afterConnect();

	}

	protected abstract WebSocketHandler getWebSocketHandler();




	protected WebSocketHttpHeaders getHeaders() {
		return new WebSocketHttpHeaders();

	}

	protected abstract String getUrl();




	public void disconnect() throws IOException {
		try {
			webSocketSession.close();
		}catch (Exception ex){

		}
		afterDisconnect();
	}

	public void sendUserMessageMessage(int deviceId, String hex) {
		sendMessage(new UserMessage(UserMessageSettings.NO_RENEWAL, deviceId, getDeviceId(), 0, hex));
	}



}
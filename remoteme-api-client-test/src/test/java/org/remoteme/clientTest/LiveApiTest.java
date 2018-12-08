package org.remoteme.clientTest;

import org.apache.commons.codec.digest.DigestUtils;
import org.remoteme.client.api.ArliterestApi;
import org.remoteme.client.api.ArliterestpartnerApi;
import org.remoteme.client.api.ArliterestuserApi;
import org.remoteme.client.api.ArliterestvariablesApi;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class LiveApiTest extends ApiTest {




	static ArliterestuserApi userApi;
	static ArliterestpartnerApi partnerApi;
	static ArliterestApi restApi;
	static ArliterestvariablesApi variableApi;

	protected static ArliterestpartnerApi getPartnerApi() {
		if (partnerApi==null) {
			partnerApi = new ArliterestpartnerApi();
			partnerApi.setBasePath(partnerApi.getBasePath().replaceAll("https://app.remmoteme.org/", "http://127.0.0.1:8082/"));
			partnerApi.setBasePath(partnerApi.getBasePath().replaceAll("https://", "http://"));
		}
		return partnerApi;
	}

	protected static ArliterestvariablesApi getVariableApi() {
		if (variableApi==null) {
			variableApi = new ArliterestvariablesApi();
			variableApi.setBasePath(partnerApi.getBasePath().replaceAll("https://app.remmoteme.org/", "http://127.0.0.1:8082/"));
			variableApi.setBasePath(partnerApi.getBasePath().replaceAll("https://", "http://"));
		}
		return variableApi;
	}

	protected static ArliterestApi getRestApi() {
		if (restApi==null){
			restApi = new ArliterestApi();
			restApi.setBasePath(restApi.getBasePath().replaceAll("https://app.remmoteme.org/","http://127.0.0.1:8082/"));
			restApi.setBasePath(restApi.getBasePath().replaceAll("https://","http://"));
		}

		return restApi;
	}
	protected static ArliterestuserApi getUserApi( ) {
		return getUserApi(false);
	}
		protected static ArliterestuserApi getUserApi(boolean createNew) {
		if (userApi==null || createNew){
			userApi = new ArliterestuserApi();
			userApi.setBasePath(userApi.getBasePath().replaceAll("https://app.remmoteme.org/","http://127.0.0.1:8082/"));
			userApi.setBasePath(userApi.getBasePath().replaceAll("https://","http://"));

		}

		return userApi;
	}

}

package org.remoteme.clientTest;

import org.apache.commons.codec.digest.DigestUtils;
import org.remoteme.client.api.ArliterestApi;
import org.remoteme.client.api.ArliterestpartnerApi;
import org.remoteme.client.api.ArliterestuserApi;
import org.remoteme.client.api.ArliterestvariablesApi;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ApiTest {
	static final String partnerToken;//it should be rpelaced by your partner token contact contact@remoteme.org to get your won partner token but its needed only if u want to create new users otherwise u dont need it

	static {//here is some generated token which is unique for my machine so nobody can copy it and i can test my app without reading some keys from the file ;)
		String temp=null;
		try {
			temp = DigestUtils.sha256Hex(NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getHardwareAddress());
			temp=DigestUtils.sha256Hex(temp+System.getProperty("user.home")+System.getProperty("user.dir"));
		} catch (Exception e) {
			temp=null;
		}
		System.out.println(temp);
		partnerToken=temp;
	}




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

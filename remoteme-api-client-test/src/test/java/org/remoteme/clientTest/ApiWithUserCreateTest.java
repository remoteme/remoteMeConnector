package org.remoteme.clientTest;

import org.apache.commons.codec.digest.DigestUtils;
import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.remoteme.client.api.ArliterestApi;
import org.remoteme.client.api.ArliterestpartnerApi;
import org.remoteme.client.api.ArliterestuserApi;
import org.remoteme.client.invoker.ApiException;
import org.remoteme.client.model.AndroidRegisterDto;
import org.remoteme.client.model.RegisterDto;
import org.remoteme.clientTest.fakeDevices.ArLiteWebSocketDevice;
import org.remoteme.clientTest.fakeDevices.MockDevice;

import java.util.function.Function;

public class ApiWithUserCreateTest extends ApiTest {
	protected static String arToken;

	@BeforeClass
	public static void before() throws ApiException {
		String password = DigestUtils.md5Hex("p");
		ArliterestpartnerApi arlitepartnerrestApi = getPartnerApi();
		ArliterestApi rest = getRestApi();

		String user123 = "userRestTest"+ Math.abs(Math.random()*10000);
		arlitepartnerrestApi.createUser1(user123,password,partnerToken,null);

		arToken = rest.getPartnerToken(user123, password, null).getToken();
	}

	@AfterClass
	public static void after() throws ApiException {
		getUserApi().deleteUser(arToken);
	}

	protected Function<Integer, Boolean> getConnectedCheck() {
		return (deviceId)-> {
			try {
				return getDevicesApi().isDeviceConnected(deviceId,arToken);
			} catch (ApiException e) {
				return false;
			}
		};
	}


	protected MockDevice getArLiteWebSocketDevice(String token) {
		try {
			Assert.assertThat(getDevicesApi().getDevices(arToken), IsCollectionWithSize.hasSize(0));

			AndroidRegisterDto android = new AndroidRegisterDto();
			android.setNiceName("test123");
			android.setSmartPhoneId("test123");

			RegisterDto register = getDevicesApi().register(android, token);

			return new ArLiteWebSocketDevice(register.getDeviceId(), token, getPort(), getHost());
		} catch (ApiException e) {
			throw new RuntimeException(e);
		}
	}


}

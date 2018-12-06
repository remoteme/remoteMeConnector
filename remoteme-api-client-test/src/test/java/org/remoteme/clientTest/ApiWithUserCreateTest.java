package org.remoteme.clientTest;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.remoteme.client.api.ArliterestApi;
import org.remoteme.client.api.ArliterestpartnerApi;
import org.remoteme.client.api.ArliterestuserApi;
import org.remoteme.client.invoker.ApiException;

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


}

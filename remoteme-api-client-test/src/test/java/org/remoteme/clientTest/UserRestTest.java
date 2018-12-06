package org.remoteme.clientTest;


import org.apache.commons.codec.digest.DigestUtils;
import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.Assert;
import org.junit.Test;

import org.remoteme.client.api.ArliterestApi;
import org.remoteme.client.api.ArliterestpartnerApi;
import org.remoteme.client.api.ArliterestuserApi;
import org.remoteme.client.invoker.ApiException;
import org.remoteme.client.model.TokenDto;

import java.util.List;


public class UserRestTest extends ApiTest {

	@Test
	public void simple(){
		Assert.assertTrue(true);
	}


	@Test
	public void sayHi() throws ApiException {
		ArliterestpartnerApi partnerApi = getPartnerApi();
		String pam = partnerApi.sayHi("test",  partnerToken,null);


	}

	@Test
	public void sayHiOptional() throws ApiException {
		ArliterestpartnerApi partnerApi = getPartnerApi();
		String pam = partnerApi.sayHi1("test",  partnerToken,null);
		String pam2 = partnerApi.sayHi2("test",  "surname pam",partnerToken,null);

		System.out.println(pam);
		System.out.println(pam2);

	}



	@Test
	public void createUser() throws ApiException {
		String password = DigestUtils.md5Hex("p");
		ArliterestpartnerApi arlitepartnerrestApi = getPartnerApi();
		ArliterestApi rest = getRestApi();

		arlitepartnerrestApi.createUser1("user1235",password,partnerToken,null);
		try{
			arlitepartnerrestApi.createUser1("user1235",password,partnerToken,null);
			Assert.assertTrue(false);
		}catch (Exception e){
			Assert.assertTrue(true);
			e.printStackTrace();
		}
		String token = rest.getPartnerToken("user1235", password, null).getToken();

		ArliterestuserApi userApi = getUserApi();

		List<TokenDto> tokens= userApi.getTokens(true, token);
		Assert.assertThat(tokens, IsCollectionWithSize.hasSize(1));

		userApi.deleteUser(token);




	}
}

package org.remoteme.clientTest;


import org.apache.commons.codec.digest.DigestUtils;
import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.remoteme.client.api.ArliterestApi;
import org.remoteme.client.api.ArliterestpartnerApi;
import org.remoteme.client.invoker.ApiException;
import org.remoteme.client.model.TokenDto;

import java.util.List;


public class UsertTest2 extends ApiWithUserCreateTest {


	@Test
	public void wrongToken() throws ApiException {

		getUserApi().getTokens(true,  "sdx");
		Assert.assertTrue(true);//we jave jsession
		getRestApi().logout(null);

		List<TokenDto> tokens;
		try{
			tokens= getUserApi().getTokens(true,  "sdx");//and wrong token but we logout second ago
			Assert.assertTrue(false);
		}catch (Exception ex){
			Assert.assertTrue(true);

		}
		tokens= getUserApi(true).getTokens(true,  arToken);

	}


	@Test
	public void createRemoveUpdateToken() throws ApiException {

		List<TokenDto> tokens = getUserApi().getTokens(true, arToken);
		Assert.assertThat(tokens, IsCollectionWithSize.hasSize(1));
		getUserApi().deleteToken(tokens.get(0).getToken(),arToken);


		tokens = getUserApi().getTokens(true, arToken);
		Assert.assertThat(tokens, IsCollectionWithSize.hasSize(0));


		String token = getUserApi().createToken("test1", true, arToken);
		tokens = getUserApi().getTokens(true, arToken);
		Assert.assertThat(tokens, IsCollectionWithSize.hasSize(1));
		Assert.assertEquals("test1",tokens.get(0).getName());
		Assert.assertEquals(token,tokens.get(0).getToken());
		Assert.assertEquals(true,tokens.get(0).getActive());


		String token2 = getUserApi().createToken("test2", false, arToken);

		tokens = getUserApi().getTokens(true, arToken);
		Assert.assertThat(tokens, IsCollectionWithSize.hasSize(1));

		tokens = getUserApi().getTokens(false, arToken);
		Assert.assertThat(tokens, IsCollectionWithSize.hasSize(2));
		Assert.assertEquals("test2",tokens.get(1).getName());
		Assert.assertEquals(token2,tokens.get(1).getToken());
		Assert.assertEquals(false,tokens.get(1).getActive());

		getUserApi().deleteToken(token2,arToken);

		tokens = getUserApi().getTokens(false, arToken);
		Assert.assertThat(tokens, IsCollectionWithSize.hasSize(1));


		getUserApi().updateToken("test3",token, false,arToken);

		tokens = getUserApi().getTokens(false, arToken);

		Assert.assertThat(tokens, IsCollectionWithSize.hasSize(1));
		Assert.assertEquals("test3",tokens.get(0).getName());
		Assert.assertEquals(token,tokens.get(0).getToken());
		Assert.assertEquals(false,tokens.get(0).getActive());
	}





}

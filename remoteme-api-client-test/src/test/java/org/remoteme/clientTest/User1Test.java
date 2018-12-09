package org.remoteme.clientTest;

import org.apache.commons.codec.digest.DigestUtils;
import org.hamcrest.collection.IsCollectionWithSize;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.remoteme.client.api.ArliterestApi;
import org.remoteme.client.api.ArliterestpartnerApi;
import org.remoteme.client.api.ArliterestvariablesApi;
import org.remoteme.client.invoker.ApiException;
import org.remoteme.client.model.VariableDto;
import org.remoteme.client.model.VariableDto.TypeEnum;
import org.remoteme.client.model.VariableSchedulerDto;
import org.remoteme.client.model.VariableSchedulerDto.ModeEnum;
import org.remoteme.client.model.VariableSchedulerEntityDto;
import org.remoteme.utils.general.DateTimeUtils;
import org.remoteme.utils.messages.v1.core.messages.variables.values.IntegerBooleanVV;

import java.util.Arrays;
import java.util.List;


public class User1Test extends ApiTest {




	@Test
	public void createRemoveAddVariable() throws ApiException {


		String arToken = getRestApi().getPartnerToken("user1", DigestUtils.md5Hex("xxxxxx"), null).getToken();
		List<VariableDto> variables = getVariableApi().getVariables(arToken);
		for (VariableDto variable : variables) {
			System.out.println(variable.getName());
		}
	}

	@Test
	public void testAldrin() throws ApiException {
		String arToken = "~XFt2FmYgf3dxKTdZpb3CuCZJRTq4Z55FkNSJwQwFry1A64iEvchIs3WTKXezEFh4j";
		ArliterestvariablesApi f = new ArliterestvariablesApi();
		VariableDto v = new VariableDto();
		v.setName("button3");
		v.setType(TypeEnum.BOOLEAN);

		List<VariableSchedulerEntityDto> schedulers = getVariableApi().getSchedulers(v.getName(), v.getType().toString(), arToken);
		System.out.println(" Testing: "+ schedulers.get(0).getTime() +" "+schedulers.get(0));
	}

}

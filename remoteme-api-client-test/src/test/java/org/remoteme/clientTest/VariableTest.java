package org.remoteme.clientTest;
import org.hamcrest.collection.IsEmptyCollection;
import org.remoteme.client.model.VariableSchedulerDto.ModeEnum;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.remoteme.client.model.VariableDto.TypeEnum;


import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.Assert;
import org.junit.Test;
import org.remoteme.client.invoker.ApiException;
import org.remoteme.client.model.VariableDto;
import org.remoteme.client.model.VariableSchedulerDto;
import org.remoteme.client.model.VariableSchedulerEntityDto;
import org.remoteme.utils.general.DateTimeUtils;
import org.remoteme.utils.messages.v1.core.messages.variables.values.IntegerBooleanVV;

import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;


public class VariableTest extends ApiWithUserCreateTest {




	@Test
	public void createRemoveAddVariable() throws ApiException {

		VariableDto v = new VariableDto();
		v.setHistory(false);
		v.setName("t1");
		v.setPersistent(false);
		v.setScheduled(false);
		v.setType(TypeEnum.TEXT);


		getVariableApi().createVariable(v,arToken);

		List<VariableDto> variables = getVariableApi().getVariables(arToken);
		Assert.assertThat(variables,IsCollectionWithSize.hasSize(1));


		Assert.assertThat(v, new ReflectionEquals(variables.get(0)));

		v.setName("t12");
		v.setPersistent(true);
		v.setScheduled(false);
		v.setHistory(true);
		v.setType(TypeEnum.TEXT);

		getVariableApi().updateVariable(v,"t1",TypeEnum.TEXT.toString(),arToken);

		variables = getVariableApi().getVariables(arToken);
		Assert.assertThat(variables,IsCollectionWithSize.hasSize(1));


		Assert.assertThat(v, new ReflectionEquals(variables.get(0)));


		v.setName("t13");
		v.setPersistent(true);
		v.setScheduled(true);
		v.setHistory(false);
		v.setType(TypeEnum.TEXT);

		getVariableApi().updateVariable(v,"t12",TypeEnum.TEXT.toString(),arToken);

		variables = getVariableApi().getVariables(arToken);
		Assert.assertThat(variables,IsCollectionWithSize.hasSize(1));


		Assert.assertThat(v, new ReflectionEquals(variables.get(0)));

		getVariableApi().deleteVariable("t13",TypeEnum.TEXT.toString(),arToken);
		variables = getVariableApi().getVariables(arToken);
		Assert.assertThat(variables,IsCollectionWithSize.hasSize(0));
	}


	@Test
	public void variableValuesNoPersistant() throws ApiException {
		VariableDto v=createVariable(false, false, TypeEnum.INTEGER);
		String variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertTrue(variableValue.isEmpty());

		getVariableApi().setVariableTextValue("123",v.getName(),v.getType().toString(),arToken);

		variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertTrue(variableValue.isEmpty());


	}

	@Test
	public void variableValuesPersistant() throws ApiException {
		VariableDto v=createVariable(true, false, TypeEnum.INTEGER);
		String variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertTrue(variableValue.isEmpty());

		getVariableApi().setVariableTextValue("123",v.getName(),v.getType().toString(),arToken);

		variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertEquals("123",variableValue);
	}


	@Test
	public void variableValuesPersistantDouble() throws ApiException {
		VariableDto v=createVariable(true, false, TypeEnum.DOUBLE);
		String variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertTrue(variableValue.isEmpty());

		getVariableApi().setVariableTextValue("-123.456",v.getName(),v.getType().toString(),arToken);

		variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertEquals("-123.456",variableValue);
	}

	@Test
	public void variableValuesPersistantBoolean() throws ApiException {
		VariableDto v=createVariable(true, false, TypeEnum.BOOLEAN);
		String variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertTrue(variableValue.isEmpty());

		getVariableApi().setVariableTextValue("true",v.getName(),v.getType().toString(),arToken);

		variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertEquals("true",variableValue);


		getVariableApi().setVariableTextValue("false",v.getName(),v.getType().toString(),arToken);

		variableValue = getVariableApi().getVariableTextValue(v.getName(), v.getType().toString(), arToken);
		Assert.assertEquals("false",variableValue);
	}

	private VariableDto createVariable(boolean persistant, boolean scheduled, TypeEnum type) throws ApiException {
		VariableDto v = new VariableDto();
		v.setHistory(false);
		v.setName("t1");
		v.setPersistent(persistant);
		v.setScheduled(scheduled);
		v.setType(type);
		getVariableApi().createVariable(v,arToken);
		return v;
	}


	//--------------------- scheduler

	@Test
	public void createSchedulers() throws ApiException {
		String time = "01.01.2030 08:00";
		VariableDto v=createVariable(true, true, TypeEnum.BOOLEAN);

		VariableSchedulerDto scheduler = new VariableSchedulerDto();
		scheduler.setCron("");
		scheduler.setMode(ModeEnum.TIME);
		scheduler.setTime(time);
		scheduler.setValues(Arrays.asList("true","false"));



		getVariableApi().addScheduler(scheduler,v.getName(),v.getType().toString(),arToken);


		List<VariableSchedulerEntityDto> schedulers = getVariableApi().getSchedulers(v.getName(), v.getType().toString(), arToken);
		Assert.assertThat(schedulers,IsCollectionWithSize.hasSize(1));


		Assert.assertThat(schedulers.get(0).getValues(),IsCollectionWithSize.hasSize(2));
		schedulers.get(0).getValues().remove("true");
		schedulers.get(0).getValues().remove("false");
		Assert.assertThat(schedulers.get(0).getValues(),IsCollectionWithSize.hasSize(0));

		Assert.assertEquals("", schedulers.get(0).getCron());
		Assert.assertEquals(VariableSchedulerEntityDto.ModeEnum.TIME, schedulers.get(0).getMode());

		Assert.assertEquals(DateTimeUtils.getMillis(time), schedulers.get(0).getNextTimeRun().longValue());

		time = "01.01.2031 08:00";
		scheduler.setTime(time);
		getVariableApi().updateScheduler(scheduler,schedulers.get(0).getVariableSchedulerId(),arToken);
		schedulers = getVariableApi().getSchedulers(v.getName(), v.getType().toString(), arToken);
		Assert.assertThat(schedulers,IsCollectionWithSize.hasSize(1));


		Assert.assertEquals("", schedulers.get(0).getCron());
		Assert.assertEquals(VariableSchedulerEntityDto.ModeEnum.TIME, schedulers.get(0).getMode());
		Assert.assertEquals(DateTimeUtils.getMillis(time), schedulers.get(0).getNextTimeRun().longValue());


		String time2 = "01.01.2033 08:00";
		scheduler.setTime(time2);
		scheduler.setValues(Arrays.asList("true"));
		getVariableApi().addScheduler(scheduler,v.getName(),v.getType().toString(),arToken);

		schedulers = getVariableApi().getSchedulers(v.getName(), v.getType().toString(), arToken);

		Assert.assertThat(schedulers,IsCollectionWithSize.hasSize(2));
		Assert.assertEquals(DateTimeUtils.getMillis(time), schedulers.get(0).getNextTimeRun().longValue());
		Assert.assertEquals(DateTimeUtils.getMillis(time2), schedulers.get(1).getNextTimeRun().longValue());


		getVariableApi().deleteScheduler(schedulers.get(0).getVariableSchedulerId(),arToken);
		schedulers = getVariableApi().getSchedulers(v.getName(), v.getType().toString(), arToken);

		Assert.assertThat(schedulers,IsCollectionWithSize.hasSize(1));

		getVariableApi().deleteScheduler(schedulers.get(0).getVariableSchedulerId(),arToken);
		schedulers = getVariableApi().getSchedulers(v.getName(), v.getType().toString(), arToken);


		Assert.assertThat(schedulers,IsCollectionWithSize.hasSize(0));

	}


	@Test
	public void diffrentScheduleTypes() throws ApiException {

		String time = "01.01.2030 08:00";
		VariableDto v=createVariable(true, true, TypeEnum.INTEGER_BOOLEAN);

		VariableSchedulerDto scheduler = new VariableSchedulerDto();
		scheduler.setCron("");
		scheduler.setMode(ModeEnum.TIME);
		scheduler.setTime(time);
		scheduler.setValues(Arrays.asList(new IntegerBooleanVV(123,true).toString(),
				new IntegerBooleanVV(-45,false).toString()));



		getVariableApi().addScheduler(scheduler,v.getName(),v.getType().toString(),arToken);
		List<String> values = getVariableApi().getSchedulers(v.getName(), v.getType().toString(), arToken).get(0).getValues();

		Assert.assertThat(values,IsCollectionWithSize.hasSize(2));

		Assert.assertTrue(values.get(0) instanceof String);

		values.removeAll(scheduler.getValues());

		Assert.assertThat(values, IsEmptyCollection.empty());


	}
}

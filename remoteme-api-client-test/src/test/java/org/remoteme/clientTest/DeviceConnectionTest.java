package org.remoteme.clientTest;
import org.remoteme.client.model.DeviceDto;
import org.remoteme.client.model.VariableDto.TypeEnum;

import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.remoteme.client.invoker.ApiException;
import org.remoteme.client.model.AndroidRegisterDto;
import org.remoteme.client.model.RegisterDto;
import org.remoteme.client.model.VariableDto;
import org.remoteme.clientTest.fakeDevices.ArLiteWebSocketDevice;
import org.remoteme.clientTest.fakeDevices.Configuration;
import org.remoteme.clientTest.fakeDevices.MockDevice;
import org.remoteme.clientTest.fakeDevices.NewSocketDevice;
import org.remoteme.clientTest.fakeDevices.OldSocketDevice;
import org.remoteme.clientTest.fakeDevices.SocketDeviceManager;
import org.remoteme.clientTest.fakeDevices.StdWebSocketDevice;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.ARemoteMeMessage;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.VariableChangeMessage;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.VariableChangePropagateMessage;
import org.remoteme.utils.messages.v1.core.messages.remoteMe.VariableObserveMessage;
import org.remoteme.utils.messages.v1.core.messages.variables.IntegerVariableState;
import org.remoteme.utils.messages.v1.core.messages.variables.VariableIdentifier;
import org.remoteme.utils.messages.v1.enums.variables.VariableType;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;


public class DeviceConnectionTest extends ApiWithUserCreateTest {

	private String token;

	@Before
	public void createToken() throws ApiException {
		SocketDeviceManager.get().setPing(true);
		token = getUserApi().getTokens(true, arToken).get(0).getToken();
	}


	@Test
	public void observeVariableNewSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		observeVariable(() -> new NewSocketDevice(123, token, getHost()));
	}

	@Test
	public void observeVariableOldSocketDevice() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		observeVariable(() -> new OldSocketDevice(123, token, getHost()));
	}

	@Test
	public void observeVariableArLiteWebSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		observeVariable(() ->getArLiteWebSocketDevice(token));
	}


	@Test
	public void observeVariabletdWebSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		observeVariable(() -> new StdWebSocketDevice(123, token, getPort(), getHost()));
	}

	//-------


	@Test
	public void connectNewSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		connectDevice(() -> new NewSocketDevice(123, token, getHost()));
	}

	@Test
	public void devicePingDisconnectedNewbSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		devicePingDisconnected(() -> new NewSocketDevice(123, token, getHost()));
	}

	@Test
	public void connectOldSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		connectDevice(() -> new OldSocketDevice(123, token, getHost()));
	}

	@Test
	public void devicePingDisconnectedOldSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		devicePingDisconnected(() -> new OldSocketDevice(123, token, getHost()));
	}


	@Test
	public void connectArLiteWebSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		connectDevice(() -> getArLiteWebSocketDevice(token));
	}

	@Test
	public void devicePingDisconnectedArLiteWebSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		devicePingDisconnected(() -> new ArLiteWebSocketDevice(123, token, getPort(), getHost()));
	}

	@Test
	public void connectStdWebSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		connectDevice(() -> new StdWebSocketDevice(123, token, getPort(), getHost()));
	}

	@Test
	public void devicePingDisconnectedStdWebSocket() throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		devicePingDisconnected(() -> new StdWebSocketDevice(123, token, getPort(), getHost()));
	}


	public void connectDevice(Supplier< MockDevice> factory) throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
/*
		DeviceDto deviceDto = new DeviceDto();
		deviceDto.setActive(true);
		deviceDto.setDeviceId(123);
		deviceDto.setName("name1");



		getDevicesApi().createArduinoDevice(deviceDto,arToken);*/



		/*List<DeviceFullDto> devices = getDevicesApi().getDevices(arToken);
		Assert.assertThat(devices,IsCollectionWithSize.hasSize(1));
		DeviceFullDto deviceFullDto = devices.get(0);
		Assert.assertEquals("name1",deviceFullDto.getName());
		Assert.assertEquals(true,deviceFullDto.getActive());
		Assert.assertEquals(DeviceFullDto.ConnectedEnum.NOT_CONNECTED,deviceFullDto.getConnected());
		Assert.assertEquals(123,(int)deviceFullDto.getDeviceId());
		Assert.assertEquals(DeviceFullDto.TypeEnum.ARDUINO,deviceFullDto.getType());

		Assert.assertFalse(getDevicesApi().isDeviceConnected(deviceId,arToken));
*/

		MockDevice d = factory.get();


		d.connectAndWait(getConnectedCheck());



		Assert.assertThat(getDevicesApi().getDevices(arToken), IsCollectionWithSize.hasSize(1));

		Assert.assertTrue(getDevicesApi().isDeviceConnected(d.getDeviceId(), arToken));


		d.disconnectAndWait(getConnectedCheck());

		Thread.sleep(1000);
		getDevicesApi().deleteDevice(d.getDeviceId(), arToken);
		Assert.assertThat(getDevicesApi().getDevices(arToken), IsCollectionWithSize.hasSize(0));
	}




	public void devicePingDisconnected(Supplier< MockDevice> factory) throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {

/*
		DeviceDto deviceDto = new DeviceDto();
		deviceDto.setActive(true);
		deviceDto.setDeviceId(123);
		deviceDto.setName("name1");

		String token = getUserApi().getTokens(true, arToken).get(0).getToken();

		getDevicesApi().createArduinoDevice(deviceDto,arToken);*/

		//int deviceId = 123;
		//Assert.assertFalse(getDevicesApi().isDeviceConnected(deviceId, arToken));

		MockDevice d = factory.get();//new NewSocketDevice(deviceId, token, getHost());
		Assert.assertThat(getDevicesApi().getDevices(arToken), IsCollectionWithSize.hasSize(0));

		d.connectAndWait(getConnectedCheck());
		Assert.assertThat(getDevicesApi().getDevices(arToken), IsCollectionWithSize.hasSize(1));

		Assert.assertTrue(getDevicesApi().isDeviceConnected(d.getDeviceId(), arToken));

		Thread.sleep((int)(Configuration.getPingTimeOut()*2.5));

		Assert.assertTrue(getDevicesApi().isDeviceConnected(d.getDeviceId(), arToken));
		SocketDeviceManager.get().setPing(false);

		Thread.sleep((int)(Configuration.getPingTimeOut()*2.5));



		Assert.assertFalse(getDevicesApi().isDeviceConnected(d.getDeviceId(), arToken));
		d.disconnect();
		Thread.sleep(1000);
		getDevicesApi().deleteDevice(d.getDeviceId(), arToken);
		Assert.assertThat(getDevicesApi().getDevices(arToken), IsCollectionWithSize.hasSize(0));

	}

	public void observeVariable(Supplier< MockDevice> factory) throws ApiException, InterruptedException, ExecutionException, TimeoutException, IOException, URISyntaxException {
		VariableDto v = new VariableDto();
		v.setHistory(false);
		v.setName("integer");
		v.setPersistent(true);
		v.setScheduled(false);
		v.setType(TypeEnum.INTEGER);

		getVariableApi().createVariable(v,token);
		MockDevice mockDevice = factory.get();

		mockDevice.connectAndWait(getConnectedCheck());

		VariableObserveMessage obMessage = new VariableObserveMessage(mockDevice.getDeviceId(), Arrays.asList(new VariableIdentifier(v.getName(), VariableType.valueOf(v.getType().toString()))));

		List<DeviceDto> observingDevice = getVariableApi().getObservingDevice(v.getName(), v.getType().toString(), arToken);
		Assert.assertThat(observingDevice,IsCollectionWithSize.hasSize(0));

		mockDevice.sendMessage(obMessage);
		Thread.sleep(500);

		observingDevice=getVariableApi().getObservingDevice(v.getName(), v.getType().toString(), arToken);
		Assert.assertThat(observingDevice,IsCollectionWithSize.hasSize(1));

		Assert.assertEquals(mockDevice.getDeviceId(),(int)observingDevice.get(0).getDeviceId());


		getVariableApi().setVariableTextValue("1234",v.getName(),v.getType().toString(),token);
		Thread.sleep(500);
		VariableChangePropagateMessage message = (VariableChangePropagateMessage)mockDevice.getMessage();
		Assert.assertEquals("1234",message.getStates().get(0).getDataString());
		Assert.assertEquals(v.getName(),message.getStates().get(0).getIdentifier().getName());
		Assert.assertEquals(v.getType().toString(),message.getStates().get(0).getIdentifier().getType().toString());


		VariableChangeMessage vcm = new VariableChangeMessage(mockDevice.getDeviceId(), Collections.emptySet(), Arrays.asList(new IntegerVariableState(v.getName(),456)));
		mockDevice.sendMessage(vcm);
		Thread.sleep(500);

		Assert.assertEquals("456",getVariableApi().getVariableTextValue(v.getName(),v.getType().toString(),token));

		mockDevice.disconnect();
		Thread.sleep(500);

		observingDevice = getVariableApi().getObservingDevice(v.getName(), v.getType().toString(), arToken);
		Assert.assertThat(observingDevice,IsCollectionWithSize.hasSize(0));

		getVariableApi().deleteVariable(v.getName(),v.getType().toString(),token);

	}


}

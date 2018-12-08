# ArliterestdevicesApi

All URIs are relative to *https://app.remoteme.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createArduinoDevice**](ArliterestdevicesApi.md#createArduinoDevice) | **POST** /arLite/rest/v1/device/arduino/ | createArduinoDevice
[**createRasbperryPiDevice**](ArliterestdevicesApi.md#createRasbperryPiDevice) | **POST** /arLite/rest/v1/device/rasbperryPi/ | createRasbperryPiDevice
[**createWebpageDevice**](ArliterestdevicesApi.md#createWebpageDevice) | **POST** /arLite/rest/v1/device/webPage/ | createWebpageDevice
[**getDevices**](ArliterestdevicesApi.md#getDevices) | **GET** /arLite/rest/v1/getAllDevices/ | getDevices
[**isDeviceConnected**](ArliterestdevicesApi.md#isDeviceConnected) | **GET** /arLite/rest/v1/device/{deviceId}/connected/ | isDeviceConnected
[**register**](ArliterestdevicesApi.md#register) | **POST** /arLite/rest/v1/register/ | Register
[**registerEr**](ArliterestdevicesApi.md#registerEr) | **POST** /arLite/rest/v1/registerEr/ | Register
[**updateMessageToken**](ArliterestdevicesApi.md#updateMessageToken) | **PUT** /arLite/rest/v1/addMessageToken/{deviceId}/{messageToken}/ | updateMessageToken


<a name="createArduinoDevice"></a>
# **createArduinoDevice**
> createArduinoDevice(deviceDto, aRLiteToken)

createArduinoDevice

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestdevicesApi;

ArliterestdevicesApi apiInstance = new ArliterestdevicesApi();
DeviceDto deviceDto = new DeviceDto(); // DeviceDto | deviceDto
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.createArduinoDevice(deviceDto, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestdevicesApi#createArduinoDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceDto** | [**DeviceDto**](DeviceDto.md)| deviceDto |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRasbperryPiDevice"></a>
# **createRasbperryPiDevice**
> createRasbperryPiDevice(deviceDto, aRLiteToken)

createRasbperryPiDevice

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestdevicesApi;

ArliterestdevicesApi apiInstance = new ArliterestdevicesApi();
DeviceDto deviceDto = new DeviceDto(); // DeviceDto | deviceDto
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.createRasbperryPiDevice(deviceDto, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestdevicesApi#createRasbperryPiDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceDto** | [**DeviceDto**](DeviceDto.md)| deviceDto |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWebpageDevice"></a>
# **createWebpageDevice**
> createWebpageDevice(deviceDto, aRLiteToken)

createWebpageDevice

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestdevicesApi;

ArliterestdevicesApi apiInstance = new ArliterestdevicesApi();
DeviceDto deviceDto = new DeviceDto(); // DeviceDto | deviceDto
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.createWebpageDevice(deviceDto, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestdevicesApi#createWebpageDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceDto** | [**DeviceDto**](DeviceDto.md)| deviceDto |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDevices"></a>
# **getDevices**
> List&lt;DeviceFullDto&gt; getDevices(aRLiteToken)

getDevices

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestdevicesApi;

ArliterestdevicesApi apiInstance = new ArliterestdevicesApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    List<DeviceFullDto> result = apiInstance.getDevices(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestdevicesApi#getDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**List&lt;DeviceFullDto&gt;**](DeviceFullDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="isDeviceConnected"></a>
# **isDeviceConnected**
> Boolean isDeviceConnected(deviceId, aRLiteToken)

isDeviceConnected

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestdevicesApi;

ArliterestdevicesApi apiInstance = new ArliterestdevicesApi();
Integer deviceId = 56; // Integer | deviceId
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    Boolean result = apiInstance.isDeviceConnected(deviceId, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestdevicesApi#isDeviceConnected");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **Integer**| deviceId |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="register"></a>
# **register**
> RegisterDto register(registerDto, aRLiteToken)

Register

Registers device - return deviceId new or old one

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestdevicesApi;

ArliterestdevicesApi apiInstance = new ArliterestdevicesApi();
AndroidRegisterDto registerDto = new AndroidRegisterDto(); // AndroidRegisterDto | registerDto
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    RegisterDto result = apiInstance.register(registerDto, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestdevicesApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerDto** | [**AndroidRegisterDto**](AndroidRegisterDto.md)| registerDto |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**RegisterDto**](RegisterDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="registerEr"></a>
# **registerEr**
> RegisterDto registerEr(registerDto, aRLiteToken)

Register

Registers device - return deviceId new or old one

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestdevicesApi;

ArliterestdevicesApi apiInstance = new ArliterestdevicesApi();
AndroidRegisterDto registerDto = new AndroidRegisterDto(); // AndroidRegisterDto | registerDto
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    RegisterDto result = apiInstance.registerEr(registerDto, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestdevicesApi#registerEr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerDto** | [**AndroidRegisterDto**](AndroidRegisterDto.md)| registerDto |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**RegisterDto**](RegisterDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateMessageToken"></a>
# **updateMessageToken**
> StandardResponse updateMessageToken(deviceId, messageToken, aRLiteToken)

updateMessageToken

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestdevicesApi;

ArliterestdevicesApi apiInstance = new ArliterestdevicesApi();
Integer deviceId = 56; // Integer | deviceId
String messageToken = "messageToken_example"; // String | messageToken
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    StandardResponse result = apiInstance.updateMessageToken(deviceId, messageToken, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestdevicesApi#updateMessageToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **Integer**| deviceId |
 **messageToken** | **String**| messageToken |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**StandardResponse**](StandardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


# ArliterestApi

All URIs are relative to *https://127.0.0.1:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDevices**](ArliterestApi.md#getDevices) | **GET** /arLite/rest/v1/getAllDevices/ | getDevices
[**getPartnerToken**](ArliterestApi.md#getPartnerToken) | **GET** /arLite/rest/v1/getToken/ | generateToken
[**hello**](ArliterestApi.md#hello) | **GET** /arLite/rest/v1/hello/{name}/ | hello
[**logout**](ArliterestApi.md#logout) | **GET** /arLite/rest/v1/logout/ | clears session
[**register**](ArliterestApi.md#register) | **POST** /arLite/rest/v1/register/ | Register
[**registerEr**](ArliterestApi.md#registerEr) | **POST** /arLite/rest/v1/registerEr/ | Register
[**sendMessage**](ArliterestApi.md#sendMessage) | **PUT** /arLite/rest/v1/sendMessage/ | sendMessage
[**throwError**](ArliterestApi.md#throwError) | **GET** /arLite/rest/v1/throwError/ | throwError
[**updateMessageToken**](ArliterestApi.md#updateMessageToken) | **PUT** /arLite/rest/v1/addMessageToken/{deviceId}/{messageToken}/ | updateMessageToken


<a name="getDevices"></a>
# **getDevices**
> List&lt;DeviceDto&gt; getDevices(aRLiteToken)

getDevices

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    List<DeviceDto> result = apiInstance.getDevices(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#getDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**List&lt;DeviceDto&gt;**](DeviceDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPartnerToken"></a>
# **getPartnerToken**
> ARTokenDto getPartnerToken(username, password, aRLiteToken)

generateToken

token can be later use for authorize requests, and websockets, then add it in header as ARLiteToken

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
String username = "username_example"; // String | username
String password = "password_example"; // String | password
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    ARTokenDto result = apiInstance.getPartnerToken(username, password, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#getPartnerToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |
 **password** | **String**| password |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**ARTokenDto**](ARTokenDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="hello"></a>
# **hello**
> HelloDto hello(name, aRLiteToken)

hello

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
String name = "name_example"; // String | name
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    HelloDto result = apiInstance.hello(name, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#hello");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**HelloDto**](HelloDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="logout"></a>
# **logout**
> PlainResultDto logout(aRLiteToken)

clears session

clear session cookie at server side - usefull for logout since server creating session

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    PlainResultDto result = apiInstance.logout(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#logout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**PlainResultDto**](PlainResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="register"></a>
# **register**
> RegisterDto register(registerDto, aRLiteToken)

Register

Registers device - return deviceId new or old one

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
AndroidRegisterDto registerDto = new AndroidRegisterDto(); // AndroidRegisterDto | registerDto
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    RegisterDto result = apiInstance.register(registerDto, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#register");
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
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
AndroidRegisterDto registerDto = new AndroidRegisterDto(); // AndroidRegisterDto | registerDto
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    RegisterDto result = apiInstance.registerEr(registerDto, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#registerEr");
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

<a name="sendMessage"></a>
# **sendMessage**
> StandardResponse sendMessage(messageDto, aRLiteToken)

sendMessage

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
AMessage messageDto = new AMessage(); // AMessage | messageDto
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    StandardResponse result = apiInstance.sendMessage(messageDto, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageDto** | [**AMessage**](AMessage.md)| messageDto |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**StandardResponse**](StandardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="throwError"></a>
# **throwError**
> Integer throwError(aRLiteToken)

throwError

just throw error noting more so u can check

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    Integer result = apiInstance.throwError(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#throwError");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateMessageToken"></a>
# **updateMessageToken**
> StandardResponse updateMessageToken(deviceId, messageToken, aRLiteToken)

updateMessageToken

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestApi;

ArliterestApi apiInstance = new ArliterestApi();
Integer deviceId = 56; // Integer | deviceId
String messageToken = "messageToken_example"; // String | messageToken
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    StandardResponse result = apiInstance.updateMessageToken(deviceId, messageToken, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestApi#updateMessageToken");
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


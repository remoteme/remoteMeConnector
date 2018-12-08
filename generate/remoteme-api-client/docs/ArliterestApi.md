# ArliterestApi

All URIs are relative to *https://app.remoteme.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPartnerToken**](ArliterestApi.md#getPartnerToken) | **GET** /arLite/rest/v1/getToken/ | generateToken
[**hello**](ArliterestApi.md#hello) | **GET** /arLite/rest/v1/hello/{name}/ | hello
[**logout**](ArliterestApi.md#logout) | **GET** /arLite/rest/v1/logout/ | clears session
[**sendMessage**](ArliterestApi.md#sendMessage) | **PUT** /arLite/rest/v1/sendMessage/ | sendMessage
[**throwError**](ArliterestApi.md#throwError) | **GET** /arLite/rest/v1/throwError/ | throwError


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


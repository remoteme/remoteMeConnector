# AruserrestexampleApi

All URIs are relative to *https://127.0.0.1:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTokenUsingDELETE**](AruserrestexampleApi.md#deleteTokenUsingDELETE) | **DELETE** /arLite/restExample/v1/user/token/{key}/ | deleteToken
[**getMessageTypeUsingPOST1**](AruserrestexampleApi.md#getMessageTypeUsingPOST1) | **POST** /arLite/restExample/v1/user/tokens/{activeOnly}/ | getMessageType
[**removeUserUsingDELETE**](AruserrestexampleApi.md#removeUserUsingDELETE) | **DELETE** /arLite/restExample/v1/user/user/ | removeUser
[**updateTokenUsingPOST**](AruserrestexampleApi.md#updateTokenUsingPOST) | **POST** /arLite/restExample/v1/user/token/{name}/{key}/{active}/ | updateToken


<a name="deleteTokenUsingDELETE"></a>
# **deleteTokenUsingDELETE**
> deleteTokenUsingDELETE(key, aRLiteToken)

deleteToken

### Example
```java
// Import classes:
//import org.remoteme.client.api.AruserrestexampleApi;

AruserrestexampleApi apiInstance = new AruserrestexampleApi();
String key = "key_example"; // String | key
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.deleteTokenUsingDELETE(key, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling AruserrestexampleApi#deleteTokenUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMessageTypeUsingPOST1"></a>
# **getMessageTypeUsingPOST1**
> List&lt;TokenDto&gt; getMessageTypeUsingPOST1(activeOnly, aRLiteToken)

getMessageType

### Example
```java
// Import classes:
//import org.remoteme.client.api.AruserrestexampleApi;

AruserrestexampleApi apiInstance = new AruserrestexampleApi();
Boolean activeOnly = true; // Boolean | activeOnly
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    List<TokenDto> result = apiInstance.getMessageTypeUsingPOST1(activeOnly, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AruserrestexampleApi#getMessageTypeUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activeOnly** | **Boolean**| activeOnly |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**List&lt;TokenDto&gt;**](TokenDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="removeUserUsingDELETE"></a>
# **removeUserUsingDELETE**
> removeUserUsingDELETE(aRLiteToken)

removeUser

### Example
```java
// Import classes:
//import org.remoteme.client.api.AruserrestexampleApi;

AruserrestexampleApi apiInstance = new AruserrestexampleApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.removeUserUsingDELETE(aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling AruserrestexampleApi#removeUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateTokenUsingPOST"></a>
# **updateTokenUsingPOST**
> updateTokenUsingPOST(name, key, active, aRLiteToken)

updateToken

### Example
```java
// Import classes:
//import org.remoteme.client.api.AruserrestexampleApi;

AruserrestexampleApi apiInstance = new AruserrestexampleApi();
String name = "name_example"; // String | name
String key = "key_example"; // String | key
Boolean active = true; // Boolean | active
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.updateTokenUsingPOST(name, key, active, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling AruserrestexampleApi#updateTokenUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **key** | **String**| key |
 **active** | **Boolean**| active |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


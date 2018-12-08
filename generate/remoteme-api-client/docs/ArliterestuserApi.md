# ArliterestuserApi

All URIs are relative to *https://app.remoteme.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](ArliterestuserApi.md#createToken) | **PUT** /arLite/restExample/v1/user/token/{name}/{active}/ | createToken
[**deleteToken**](ArliterestuserApi.md#deleteToken) | **DELETE** /arLite/restExample/v1/user/token/{token}/ | deleteToken
[**deleteUser**](ArliterestuserApi.md#deleteUser) | **DELETE** /arLite/restExample/v1/user/user/ | deleteUser
[**getTokens**](ArliterestuserApi.md#getTokens) | **GET** /arLite/restExample/v1/user/tokens/{activeOnly}/ | getTokens
[**updateToken**](ArliterestuserApi.md#updateToken) | **POST** /arLite/restExample/v1/user/token/{name}/{token}/{active}/ | updateToken


<a name="createToken"></a>
# **createToken**
> String createToken(name, active, aRLiteToken)

createToken

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestuserApi;

ArliterestuserApi apiInstance = new ArliterestuserApi();
String name = "name_example"; // String | name
Boolean active = true; // Boolean | active
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    String result = apiInstance.createToken(name, active, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestuserApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **active** | **Boolean**| active |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(token, aRLiteToken)

deleteToken

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestuserApi;

ArliterestuserApi apiInstance = new ArliterestuserApi();
String token = "token_example"; // String | token
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.deleteToken(token, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestuserApi#deleteToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(aRLiteToken)

deleteUser

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestuserApi;

ArliterestuserApi apiInstance = new ArliterestuserApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.deleteUser(aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestuserApi#deleteUser");
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

<a name="getTokens"></a>
# **getTokens**
> List&lt;TokenDto&gt; getTokens(activeOnly, aRLiteToken)

getTokens

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestuserApi;

ArliterestuserApi apiInstance = new ArliterestuserApi();
Boolean activeOnly = true; // Boolean | activeOnly
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    List<TokenDto> result = apiInstance.getTokens(activeOnly, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestuserApi#getTokens");
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

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateToken"></a>
# **updateToken**
> updateToken(name, token, active, aRLiteToken)

updateToken

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestuserApi;

ArliterestuserApi apiInstance = new ArliterestuserApi();
String name = "name_example"; // String | name
String token = "token_example"; // String | token
Boolean active = true; // Boolean | active
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.updateToken(name, token, active, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestuserApi#updateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **token** | **String**| token |
 **active** | **Boolean**| active |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


# ArliterestpartnerApi

All URIs are relative to *https://app.remoteme.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](ArliterestpartnerApi.md#createUser) | **PUT** /arLite/rest/v1/PARTNER_AUTH/createUser/{userName}/{email}/{md5Password}/{partnerSecretToken}/ | createUser
[**createUser1**](ArliterestpartnerApi.md#createUser1) | **PUT** /arLite/rest/v1/PARTNER_AUTH/createUser/{userName}/{md5Password}/{partnerSecretToken}/ | createUser
[**sayHi**](ArliterestpartnerApi.md#sayHi) | **GET** /arLite/rest/v1/PARTNER_AUTH/sayHi/{name}/{partnerSecretToken}/ | sayHi
[**sayHi1**](ArliterestpartnerApi.md#sayHi1) | **GET** /arLite/rest/v1/PARTNER_AUTH/sayHiWithOptional/{name}/{partnerSecretToken}/ | sayHiWithOptional
[**sayHi2**](ArliterestpartnerApi.md#sayHi2) | **GET** /arLite/rest/v1/PARTNER_AUTH/sayHiWithOptional/{name}/{surname}/{partnerSecretToken}/ | sayHiWithOptional


<a name="createUser"></a>
# **createUser**
> StandardResponse createUser(userName, email, md5Password, partnerSecretToken, aRLiteToken)

createUser

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestpartnerApi;

ArliterestpartnerApi apiInstance = new ArliterestpartnerApi();
String userName = "userName_example"; // String | someUser
String email = "email_example"; // String | email
String md5Password = "md5Password_example"; // String | md5Password
String partnerSecretToken = "partnerSecretToken_example"; // String | contact to get one
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    StandardResponse result = apiInstance.createUser(userName, email, md5Password, partnerSecretToken, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestpartnerApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| someUser |
 **email** | **String**| email |
 **md5Password** | **String**| md5Password |
 **partnerSecretToken** | **String**| contact to get one |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**StandardResponse**](StandardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUser1"></a>
# **createUser1**
> StandardResponse createUser1(userName, md5Password, partnerSecretToken, aRLiteToken)

createUser

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestpartnerApi;

ArliterestpartnerApi apiInstance = new ArliterestpartnerApi();
String userName = "userName_example"; // String | someUser
String md5Password = "md5Password_example"; // String | md5Password
String partnerSecretToken = "partnerSecretToken_example"; // String | contact to get one
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    StandardResponse result = apiInstance.createUser1(userName, md5Password, partnerSecretToken, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestpartnerApi#createUser1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| someUser |
 **md5Password** | **String**| md5Password |
 **partnerSecretToken** | **String**| contact to get one |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**StandardResponse**](StandardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sayHi"></a>
# **sayHi**
> String sayHi(name, partnerSecretToken, aRLiteToken)

sayHi

say Hi

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestpartnerApi;

ArliterestpartnerApi apiInstance = new ArliterestpartnerApi();
String name = "name_example"; // String | name
String partnerSecretToken = "partnerSecretToken_example"; // String | partnerSecretToken
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    String result = apiInstance.sayHi(name, partnerSecretToken, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestpartnerApi#sayHi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **partnerSecretToken** | **String**| partnerSecretToken |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="sayHi1"></a>
# **sayHi1**
> String sayHi1(name, partnerSecretToken, aRLiteToken)

sayHiWithOptional

say Hi with optional

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestpartnerApi;

ArliterestpartnerApi apiInstance = new ArliterestpartnerApi();
String name = "name_example"; // String | 
String partnerSecretToken = "partnerSecretToken_example"; // String | contact to get one
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    String result = apiInstance.sayHi1(name, partnerSecretToken, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestpartnerApi#sayHi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **partnerSecretToken** | **String**| contact to get one |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="sayHi2"></a>
# **sayHi2**
> String sayHi2(name, surname, partnerSecretToken, aRLiteToken)

sayHiWithOptional

say Hi with optional

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestpartnerApi;

ArliterestpartnerApi apiInstance = new ArliterestpartnerApi();
String name = "name_example"; // String | 
String surname = "surname_example"; // String | surname
String partnerSecretToken = "partnerSecretToken_example"; // String | contact to get one
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    String result = apiInstance.sayHi2(name, surname, partnerSecretToken, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestpartnerApi#sayHi2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **surname** | **String**| surname |
 **partnerSecretToken** | **String**| contact to get one |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


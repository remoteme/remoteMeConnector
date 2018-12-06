# ArliterestmessagesApi

All URIs are relative to *https://127.0.0.1:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMessage1**](ArliterestmessagesApi.md#sendMessage1) | **PUT** /arLite/restExample/v1/message/send/bytes/ | send message
[**sendMessage2**](ArliterestmessagesApi.md#sendMessage2) | **PUT** /arLite/restExample/v1/message/send/json/ | send message


<a name="sendMessage1"></a>
# **sendMessage1**
> sendMessage1(message, byteArrayARemoteMeMessageToSend_, aRLiteToken)

send message

Send message

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestmessagesApi;

ArliterestmessagesApi apiInstance = new ArliterestmessagesApi();
byte[] message = message_example; // byte[] | message
String byteArrayARemoteMeMessageToSend_ = "byteArrayARemoteMeMessageToSend__example"; // String | 
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.sendMessage1(message, byteArrayARemoteMeMessageToSend_, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestmessagesApi#sendMessage1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **byte[]**| message |
 **byteArrayARemoteMeMessageToSend_** | **String**|  |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: */*

<a name="sendMessage2"></a>
# **sendMessage2**
> sendMessage2(message, jsonAMessageToSend, aRLiteToken)

send message

Send message

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestmessagesApi;

ArliterestmessagesApi apiInstance = new ArliterestmessagesApi();
AMessage message = new AMessage(); // AMessage | message
String jsonAMessageToSend = "jsonAMessageToSend_example"; // String | 
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.sendMessage2(message, jsonAMessageToSend, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestmessagesApi#sendMessage2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**AMessage**](AMessage.md)| message |
 **jsonAMessageToSend** | **String**|  |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


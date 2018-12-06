# ArlitetypetestsApi

All URIs are relative to *https://127.0.0.1:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAVariableStateUsingGET**](ArlitetypetestsApi.md#getAVariableStateUsingGET) | **GET** /arLite/rest/v1/typeTest/AVariableState/ | getAVariableState
[**getDataSeriesUsingGET**](ArlitetypetestsApi.md#getDataSeriesUsingGET) | **GET** /arLite/rest/v1/typeTest/DataSeries/ | getDataSeries
[**getVariableDetailsUsingGET**](ArlitetypetestsApi.md#getVariableDetailsUsingGET) | **GET** /arLite/rest/v1/typeTest/variableDetails/ | getVariableDetails
[**getVariableIdentifierUsingGET**](ArlitetypetestsApi.md#getVariableIdentifierUsingGET) | **GET** /arLite/rest/v1/typeTest/variableIdentifier/ | getVariableIdentifier
[**getVariableRemoveMessageDataUsingGET**](ArlitetypetestsApi.md#getVariableRemoveMessageDataUsingGET) | **GET** /arLite/rest/v1/typeTest/VariableRemoveMessageData/ | getVariableRemoveMessageData
[**getVariableRenameMessageDataUsingGET**](ArlitetypetestsApi.md#getVariableRenameMessageDataUsingGET) | **GET** /arLite/rest/v1/typeTest/VariableRenameMessageData/ | getVariableRenameMessageData


<a name="getAVariableStateUsingGET"></a>
# **getAVariableStateUsingGET**
> AVariableStateOfobject getAVariableStateUsingGET(aRLiteToken)

getAVariableState

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArlitetypetestsApi;

ArlitetypetestsApi apiInstance = new ArlitetypetestsApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    AVariableStateOfobject result = apiInstance.getAVariableStateUsingGET(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArlitetypetestsApi#getAVariableStateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**AVariableStateOfobject**](AVariableStateOfobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDataSeriesUsingGET"></a>
# **getDataSeriesUsingGET**
> DataSeries getDataSeriesUsingGET(aRLiteToken)

getDataSeries

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArlitetypetestsApi;

ArlitetypetestsApi apiInstance = new ArlitetypetestsApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    DataSeries result = apiInstance.getDataSeriesUsingGET(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArlitetypetestsApi#getDataSeriesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**DataSeries**](DataSeries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariableDetailsUsingGET"></a>
# **getVariableDetailsUsingGET**
> VariableDetails getVariableDetailsUsingGET(aRLiteToken)

getVariableDetails

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArlitetypetestsApi;

ArlitetypetestsApi apiInstance = new ArlitetypetestsApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    VariableDetails result = apiInstance.getVariableDetailsUsingGET(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArlitetypetestsApi#getVariableDetailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**VariableDetails**](VariableDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariableIdentifierUsingGET"></a>
# **getVariableIdentifierUsingGET**
> VariableIdentifier getVariableIdentifierUsingGET(aRLiteToken)

getVariableIdentifier

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArlitetypetestsApi;

ArlitetypetestsApi apiInstance = new ArlitetypetestsApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    VariableIdentifier result = apiInstance.getVariableIdentifierUsingGET(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArlitetypetestsApi#getVariableIdentifierUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**VariableIdentifier**](VariableIdentifier.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariableRemoveMessageDataUsingGET"></a>
# **getVariableRemoveMessageDataUsingGET**
> VariableRemoveMessageData getVariableRemoveMessageDataUsingGET(aRLiteToken)

getVariableRemoveMessageData

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArlitetypetestsApi;

ArlitetypetestsApi apiInstance = new ArlitetypetestsApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    VariableRemoveMessageData result = apiInstance.getVariableRemoveMessageDataUsingGET(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArlitetypetestsApi#getVariableRemoveMessageDataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**VariableRemoveMessageData**](VariableRemoveMessageData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariableRenameMessageDataUsingGET"></a>
# **getVariableRenameMessageDataUsingGET**
> VariableRenameMessageData getVariableRenameMessageDataUsingGET(aRLiteToken)

getVariableRenameMessageData

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArlitetypetestsApi;

ArlitetypetestsApi apiInstance = new ArlitetypetestsApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    VariableRenameMessageData result = apiInstance.getVariableRenameMessageDataUsingGET(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArlitetypetestsApi#getVariableRenameMessageDataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**VariableRenameMessageData**](VariableRenameMessageData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


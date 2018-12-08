# ArliterestvariablesApi

All URIs are relative to *https://app.remoteme.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addScheduler**](ArliterestvariablesApi.md#addScheduler) | **POST** /arLite/rest/v1/variables/{variableName}/{variableType}/schedulers/ | add new Scheduler
[**createVariable**](ArliterestvariablesApi.md#createVariable) | **POST** /arLite/rest/v1/variables/ | add variables
[**deleteScheduler**](ArliterestvariablesApi.md#deleteScheduler) | **DELETE** /arLite/rest/v1/variables/schedulers/{schedulerId}/ | add new Scheduler
[**deleteVariable**](ArliterestvariablesApi.md#deleteVariable) | **DELETE** /arLite/rest/v1/variables/{variableName}/{variableType}/ | delete variable
[**getSchedulers**](ArliterestvariablesApi.md#getSchedulers) | **GET** /arLite/rest/v1/variables/{variableName}/{variableType}/schedulers/ | get schedulers for variable
[**getVariableTextValue**](ArliterestvariablesApi.md#getVariableTextValue) | **GET** /arLite/rest/v1/getVariableTextValue/{name}/{type}/ | get Variables text format value 
[**getVariables**](ArliterestvariablesApi.md#getVariables) | **GET** /arLite/rest/v1/variables/ | getVariables
[**setVariableTextValue**](ArliterestvariablesApi.md#setVariableTextValue) | **POST** /arLite/rest/v1/setVariableTextValue/{name}/{type}/ | set Variable value using string format
[**updateScheduler**](ArliterestvariablesApi.md#updateScheduler) | **PUT** /arLite/rest/v1/variables/schedulers/{schedulerId}/ | updateScheduler
[**updateVariable**](ArliterestvariablesApi.md#updateVariable) | **PUT** /arLite/rest/v1/variables/{variableName}/{variableType}/ | update variable name and/or properties


<a name="addScheduler"></a>
# **addScheduler**
> VariableSchedulerDto addScheduler(variableSchedulerDto, variableName, variableType, aRLiteToken)

add new Scheduler

add new VariableScheduler id is ignored

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
VariableSchedulerDto variableSchedulerDto = new VariableSchedulerDto(); // VariableSchedulerDto | variableSchedulerDto
String variableName = "variableName_example"; // String | Variable name
String variableType = "variableType_example"; // String | Variable type
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    VariableSchedulerDto result = apiInstance.addScheduler(variableSchedulerDto, variableName, variableType, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#addScheduler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableSchedulerDto** | [**VariableSchedulerDto**](VariableSchedulerDto.md)| variableSchedulerDto |
 **variableName** | **String**| Variable name |
 **variableType** | **String**| Variable type | [enum: BOOLEAN, INTEGER, TEXT, SMALL_INTEGER_3, SMALL_INTEGER_2, INTEGER_BOOLEAN, DOUBLE, TEXT_2, SMALL_INTEGER_2_TEXT_2]
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**VariableSchedulerDto**](VariableSchedulerDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createVariable"></a>
# **createVariable**
> VariableDto createVariable(v, aRLiteToken)

add variables

return enw created variable, mode is set as local

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
VariableDto v = new VariableDto(); // VariableDto | v
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    VariableDto result = apiInstance.createVariable(v, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#createVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **v** | [**VariableDto**](VariableDto.md)| v |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**VariableDto**](VariableDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScheduler"></a>
# **deleteScheduler**
> Object deleteScheduler(schedulerId, aRLiteToken)

add new Scheduler

update VariableScheduler

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
Integer schedulerId = 56; // Integer | schedulerId
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    Object result = apiInstance.deleteScheduler(schedulerId, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#deleteScheduler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerId** | **Integer**| schedulerId |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVariable"></a>
# **deleteVariable**
> VariableDto deleteVariable(variableName, variableType, aRLiteToken)

delete variable

return rmeoved variable

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
String variableName = "variableName_example"; // String | variableName
String variableType = "variableType_example"; // String | variableType
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    VariableDto result = apiInstance.deleteVariable(variableName, variableType, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#deleteVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableName** | **String**| variableName |
 **variableType** | **String**| variableType | [enum: BOOLEAN, INTEGER, TEXT, SMALL_INTEGER_3, SMALL_INTEGER_2, INTEGER_BOOLEAN, DOUBLE, TEXT_2, SMALL_INTEGER_2_TEXT_2]
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**VariableDto**](VariableDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchedulers"></a>
# **getSchedulers**
> List&lt;VariableSchedulerEntityDto&gt; getSchedulers(variableName, variableType, aRLiteToken)

get schedulers for variable

Get schedulers for variable

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
String variableName = "variableName_example"; // String | Variable name
String variableType = "variableType_example"; // String | Variable type
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    List<VariableSchedulerEntityDto> result = apiInstance.getSchedulers(variableName, variableType, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#getSchedulers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableName** | **String**| Variable name |
 **variableType** | **String**| Variable type | [enum: BOOLEAN, INTEGER, TEXT, SMALL_INTEGER_3, SMALL_INTEGER_2, INTEGER_BOOLEAN, DOUBLE, TEXT_2, SMALL_INTEGER_2_TEXT_2]
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**List&lt;VariableSchedulerEntityDto&gt;**](VariableSchedulerEntityDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariableTextValue"></a>
# **getVariableTextValue**
> String getVariableTextValue(name, type, aRLiteToken)

get Variables text format value 

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
String name = "name_example"; // String | name
String type = "type_example"; // String | type
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    String result = apiInstance.getVariableTextValue(name, type, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#getVariableTextValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **type** | **String**| type |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getVariables"></a>
# **getVariables**
> List&lt;VariableDto&gt; getVariables(aRLiteToken)

getVariables

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    List<VariableDto> result = apiInstance.getVariables(aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#getVariables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**List&lt;VariableDto&gt;**](VariableDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setVariableTextValue"></a>
# **setVariableTextValue**
> setVariableTextValue(value, name, type, aRLiteToken)

set Variable value using string format

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
String value = "value_example"; // String | value
String name = "name_example"; // String | name
String type = "type_example"; // String | type
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    apiInstance.setVariableTextValue(value, name, type, aRLiteToken);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#setVariableTextValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| value |
 **name** | **String**| name |
 **type** | **String**| type |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateScheduler"></a>
# **updateScheduler**
> Object updateScheduler(variableSchedulerDto, schedulerId, aRLiteToken)

updateScheduler

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
VariableSchedulerDto variableSchedulerDto = new VariableSchedulerDto(); // VariableSchedulerDto | variableSchedulerDto
Integer schedulerId = 56; // Integer | schedulerId
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    Object result = apiInstance.updateScheduler(variableSchedulerDto, schedulerId, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#updateScheduler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableSchedulerDto** | [**VariableSchedulerDto**](VariableSchedulerDto.md)| variableSchedulerDto |
 **schedulerId** | **Integer**| schedulerId |
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVariable"></a>
# **updateVariable**
> VariableDto updateVariable(variableDto, variableName, variableType, aRLiteToken)

update variable name and/or properties

it find variable by given name and type and updated based on variableDto - ot does not update type!

### Example
```java
// Import classes:
//import org.remoteme.client.api.ArliterestvariablesApi;

ArliterestvariablesApi apiInstance = new ArliterestvariablesApi();
VariableDto variableDto = new VariableDto(); // VariableDto | variableDto
String variableName = "variableName_example"; // String | variableName
String variableType = "variableType_example"; // String | variableType
String aRLiteToken = "aRLiteToken_example"; // String | generated token
try {
    VariableDto result = apiInstance.updateVariable(variableDto, variableName, variableType, aRLiteToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArliterestvariablesApi#updateVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableDto** | [**VariableDto**](VariableDto.md)| variableDto |
 **variableName** | **String**| variableName |
 **variableType** | **String**| variableType | [enum: BOOLEAN, INTEGER, TEXT, SMALL_INTEGER_3, SMALL_INTEGER_2, INTEGER_BOOLEAN, DOUBLE, TEXT_2, SMALL_INTEGER_2_TEXT_2]
 **aRLiteToken** | **String**| generated token | [optional]

### Return type

[**VariableDto**](VariableDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


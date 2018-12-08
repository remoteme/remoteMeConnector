# remoteme-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.remoteme</groupId>
    <artifactId>remoteme-api-client</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.remoteme:remoteme-api-client:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/remoteme-api-client-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.remoteme.client.api.ArliterestApi;

public class ArliterestApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app.remoteme.org*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArliterestApi* | [**getPartnerToken**](docs/ArliterestApi.md#getPartnerToken) | **GET** /arLite/rest/v1/getToken/ | generateToken
*ArliterestApi* | [**hello**](docs/ArliterestApi.md#hello) | **GET** /arLite/rest/v1/hello/{name}/ | hello
*ArliterestApi* | [**logout**](docs/ArliterestApi.md#logout) | **GET** /arLite/rest/v1/logout/ | clears session
*ArliterestApi* | [**sendMessage**](docs/ArliterestApi.md#sendMessage) | **PUT** /arLite/rest/v1/sendMessage/ | sendMessage
*ArliterestApi* | [**throwError**](docs/ArliterestApi.md#throwError) | **GET** /arLite/rest/v1/throwError/ | throwError
*ArliterestdevicesApi* | [**createArduinoDevice**](docs/ArliterestdevicesApi.md#createArduinoDevice) | **POST** /arLite/rest/v1/device/arduino/ | createArduinoDevice
*ArliterestdevicesApi* | [**createRasbperryPiDevice**](docs/ArliterestdevicesApi.md#createRasbperryPiDevice) | **POST** /arLite/rest/v1/device/rasbperryPi/ | createRasbperryPiDevice
*ArliterestdevicesApi* | [**createWebpageDevice**](docs/ArliterestdevicesApi.md#createWebpageDevice) | **POST** /arLite/rest/v1/device/webPage/ | createWebpageDevice
*ArliterestdevicesApi* | [**getDevices**](docs/ArliterestdevicesApi.md#getDevices) | **GET** /arLite/rest/v1/getAllDevices/ | getDevices
*ArliterestdevicesApi* | [**isDeviceConnected**](docs/ArliterestdevicesApi.md#isDeviceConnected) | **GET** /arLite/rest/v1/device/{deviceId}/connected/ | isDeviceConnected
*ArliterestdevicesApi* | [**register**](docs/ArliterestdevicesApi.md#register) | **POST** /arLite/rest/v1/register/ | Register
*ArliterestdevicesApi* | [**registerEr**](docs/ArliterestdevicesApi.md#registerEr) | **POST** /arLite/rest/v1/registerEr/ | Register
*ArliterestdevicesApi* | [**updateMessageToken**](docs/ArliterestdevicesApi.md#updateMessageToken) | **PUT** /arLite/rest/v1/addMessageToken/{deviceId}/{messageToken}/ | updateMessageToken
*ArliterestexampleApi* | [**getMessageTypeUsingPOST**](docs/ArliterestexampleApi.md#getMessageTypeUsingPOST) | **POST** /arLite/restExample/v1/getMessageType/ | getMessageType
*ArliterestexampleApi* | [**getUserMessageUsingGET**](docs/ArliterestexampleApi.md#getUserMessageUsingGET) | **GET** /arLite/restExample/v1/getUserMessage/ | getUserMessage
*ArliterestmessagesApi* | [**sendMessage1**](docs/ArliterestmessagesApi.md#sendMessage1) | **PUT** /arLite/restExample/v1/message/send/bytes/ | send message
*ArliterestmessagesApi* | [**sendMessage2**](docs/ArliterestmessagesApi.md#sendMessage2) | **PUT** /arLite/restExample/v1/message/send/json/ | send message
*ArliterestpartnerApi* | [**createUser**](docs/ArliterestpartnerApi.md#createUser) | **PUT** /arLite/rest/v1/PARTNER_AUTH/createUser/{userName}/{email}/{md5Password}/{partnerSecretToken}/ | createUser
*ArliterestpartnerApi* | [**createUser1**](docs/ArliterestpartnerApi.md#createUser1) | **PUT** /arLite/rest/v1/PARTNER_AUTH/createUser/{userName}/{md5Password}/{partnerSecretToken}/ | createUser
*ArliterestpartnerApi* | [**sayHi**](docs/ArliterestpartnerApi.md#sayHi) | **GET** /arLite/rest/v1/PARTNER_AUTH/sayHi/{name}/{partnerSecretToken}/ | sayHi
*ArliterestpartnerApi* | [**sayHi1**](docs/ArliterestpartnerApi.md#sayHi1) | **GET** /arLite/rest/v1/PARTNER_AUTH/sayHiWithOptional/{name}/{partnerSecretToken}/ | sayHiWithOptional
*ArliterestpartnerApi* | [**sayHi2**](docs/ArliterestpartnerApi.md#sayHi2) | **GET** /arLite/rest/v1/PARTNER_AUTH/sayHiWithOptional/{name}/{surname}/{partnerSecretToken}/ | sayHiWithOptional
*ArliterestuserApi* | [**createToken**](docs/ArliterestuserApi.md#createToken) | **PUT** /arLite/restExample/v1/user/token/{name}/{active}/ | createToken
*ArliterestuserApi* | [**deleteToken**](docs/ArliterestuserApi.md#deleteToken) | **DELETE** /arLite/restExample/v1/user/token/{token}/ | deleteToken
*ArliterestuserApi* | [**deleteUser**](docs/ArliterestuserApi.md#deleteUser) | **DELETE** /arLite/restExample/v1/user/user/ | deleteUser
*ArliterestuserApi* | [**getTokens**](docs/ArliterestuserApi.md#getTokens) | **GET** /arLite/restExample/v1/user/tokens/{activeOnly}/ | getTokens
*ArliterestuserApi* | [**updateToken**](docs/ArliterestuserApi.md#updateToken) | **POST** /arLite/restExample/v1/user/token/{name}/{token}/{active}/ | updateToken
*ArliterestvariablesApi* | [**addScheduler**](docs/ArliterestvariablesApi.md#addScheduler) | **POST** /arLite/rest/v1/variables/{variableName}/{variableType}/schedulers/ | add new Scheduler
*ArliterestvariablesApi* | [**createVariable**](docs/ArliterestvariablesApi.md#createVariable) | **POST** /arLite/rest/v1/variables/ | add variables
*ArliterestvariablesApi* | [**deleteScheduler**](docs/ArliterestvariablesApi.md#deleteScheduler) | **DELETE** /arLite/rest/v1/variables/schedulers/{schedulerId}/ | add new Scheduler
*ArliterestvariablesApi* | [**deleteVariable**](docs/ArliterestvariablesApi.md#deleteVariable) | **DELETE** /arLite/rest/v1/variables/{variableName}/{variableType}/ | delete variable
*ArliterestvariablesApi* | [**getSchedulers**](docs/ArliterestvariablesApi.md#getSchedulers) | **GET** /arLite/rest/v1/variables/{variableName}/{variableType}/schedulers/ | get schedulers for variable
*ArliterestvariablesApi* | [**getVariableTextValue**](docs/ArliterestvariablesApi.md#getVariableTextValue) | **GET** /arLite/rest/v1/getVariableTextValue/{name}/{type}/ | get Variables text format value 
*ArliterestvariablesApi* | [**getVariables**](docs/ArliterestvariablesApi.md#getVariables) | **GET** /arLite/rest/v1/variables/ | getVariables
*ArliterestvariablesApi* | [**setVariableTextValue**](docs/ArliterestvariablesApi.md#setVariableTextValue) | **POST** /arLite/rest/v1/setVariableTextValue/{name}/{type}/ | set Variable value using string format
*ArliterestvariablesApi* | [**updateScheduler**](docs/ArliterestvariablesApi.md#updateScheduler) | **PUT** /arLite/rest/v1/variables/schedulers/{schedulerId}/ | updateScheduler
*ArliterestvariablesApi* | [**updateVariable**](docs/ArliterestvariablesApi.md#updateVariable) | **PUT** /arLite/rest/v1/variables/{variableName}/{variableType}/ | update variable name and/or properties
*ArlitetypetestsApi* | [**getAVariableStateUsingGET**](docs/ArlitetypetestsApi.md#getAVariableStateUsingGET) | **GET** /arLite/rest/v1/typeTest/AVariableState/ | getAVariableState
*ArlitetypetestsApi* | [**getDataSeriesUsingGET**](docs/ArlitetypetestsApi.md#getDataSeriesUsingGET) | **GET** /arLite/rest/v1/typeTest/DataSeries/ | getDataSeries
*ArlitetypetestsApi* | [**getVariableDetailsUsingGET**](docs/ArlitetypetestsApi.md#getVariableDetailsUsingGET) | **GET** /arLite/rest/v1/typeTest/variableDetails/ | getVariableDetails
*ArlitetypetestsApi* | [**getVariableIdentifierUsingGET**](docs/ArlitetypetestsApi.md#getVariableIdentifierUsingGET) | **GET** /arLite/rest/v1/typeTest/variableIdentifier/ | getVariableIdentifier
*ArlitetypetestsApi* | [**getVariableRemoveMessageDataUsingGET**](docs/ArlitetypetestsApi.md#getVariableRemoveMessageDataUsingGET) | **GET** /arLite/rest/v1/typeTest/VariableRemoveMessageData/ | getVariableRemoveMessageData
*ArlitetypetestsApi* | [**getVariableRenameMessageDataUsingGET**](docs/ArlitetypetestsApi.md#getVariableRenameMessageDataUsingGET) | **GET** /arLite/rest/v1/typeTest/VariableRenameMessageData/ | getVariableRenameMessageData
*HellorestApi* | [**getHelloDtoUsingGET**](docs/HellorestApi.md#getHelloDtoUsingGET) | **GET** /arLite/rest/v1/NO_AUTH/getHelloDto/ | return some object
*HellorestApi* | [**getWithNameUsingGET**](docs/HellorestApi.md#getWithNameUsingGET) | **GET** /arLite/rest/v1/NO_AUTH/getWithName/{name}/ | say hello to You
*HellorestApi* | [**modifyUsingPOST**](docs/HellorestApi.md#modifyUsingPOST) | **POST** /arLite/rest/v1/NO_AUTH/modify/ | return modified object user


## Documentation for Models

 - [AMessage](docs/AMessage.md)
 - [ARTokenDto](docs/ARTokenDto.md)
 - [ARemoteMeMessage](docs/ARemoteMeMessage.md)
 - [AVariableStateOfobject](docs/AVariableStateOfobject.md)
 - [AndroidRegisterDto](docs/AndroidRegisterDto.md)
 - [DataSeries](docs/DataSeries.md)
 - [DeviceDto](docs/DeviceDto.md)
 - [DeviceFullDto](docs/DeviceFullDto.md)
 - [HelloDto](docs/HelloDto.md)
 - [PlainResultDto](docs/PlainResultDto.md)
 - [RegisterDto](docs/RegisterDto.md)
 - [StandardResponse](docs/StandardResponse.md)
 - [TokenDto](docs/TokenDto.md)
 - [VariableDetails](docs/VariableDetails.md)
 - [VariableDto](docs/VariableDto.md)
 - [VariableIdentifier](docs/VariableIdentifier.md)
 - [VariableRemoveMessageData](docs/VariableRemoveMessageData.md)
 - [VariableRenameMessageData](docs/VariableRenameMessageData.md)
 - [VariableSchedulerDto](docs/VariableSchedulerDto.md)
 - [VariableSchedulerEntityDto](docs/VariableSchedulerEntityDto.md)
 - [AddDataMessage](docs/AddDataMessage.md)
 - [CreateVariablesMessage](docs/CreateVariablesMessage.md)
 - [LogMessage](docs/LogMessage.md)
 - [NotifyAboutVariablesMessage](docs/NotifyAboutVariablesMessage.md)
 - [PingMessage](docs/PingMessage.md)
 - [RegisterDeviceMessage](docs/RegisterDeviceMessage.md)
 - [RegisterLeafDeviceMessage](docs/RegisterLeafDeviceMessage.md)
 - [SyncMessage](docs/SyncMessage.md)
 - [SyncResponseMessage](docs/SyncResponseMessage.md)
 - [SyncUserMessage](docs/SyncUserMessage.md)
 - [SystemMessage](docs/SystemMessage.md)
 - [UserMessage](docs/UserMessage.md)
 - [VariableChangeMessage](docs/VariableChangeMessage.md)
 - [VariableChangePropagateMessage](docs/VariableChangePropagateMessage.md)
 - [VariableObserveMessage](docs/VariableObserveMessage.md)
 - [VariableRemoveMessage](docs/VariableRemoveMessage.md)
 - [VariableRenameMessage](docs/VariableRenameMessage.md)
 - [WebRRCConnectionStatusChangeMessage](docs/WebRRCConnectionStatusChangeMessage.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@remoteme.org


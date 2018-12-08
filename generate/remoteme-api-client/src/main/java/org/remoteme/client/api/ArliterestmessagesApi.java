/**
 * Remoteme rest for advanced integration
 * If You want i can hide it but there is nothing danger
 *
 * OpenAPI spec version: 1.0
 * Contact: contact@remoteme.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.remoteme.client.api;

import org.remoteme.client.invoker.ApiException;
import org.remoteme.client.invoker.ApiInvoker;
import org.remoteme.client.invoker.Pair;

import org.remoteme.client.model.*;

import java.util.*;

import org.remoteme.client.model.AMessage;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ArliterestmessagesApi {
  String basePath = "https://app.remoteme.org";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
   * send message
   * Send message
   * @param message message
   * @param byteArrayARemoteMeMessageToSend_ 
   * @param aRLiteToken generated token
   * @return void
   */
  public void  sendMessage1 (byte[] message, String byteArrayARemoteMeMessageToSend_, String aRLiteToken) throws ApiException {
    Object localVarPostBody = byteArrayARemoteMeMessageToSend_;
    // verify the required parameter 'message' is set
    if (message == null) {
       throw new ApiException(400, "Missing the required parameter 'message' when calling sendMessage1");
    }
    // verify the required parameter 'byteArrayARemoteMeMessageToSend_' is set
    if (byteArrayARemoteMeMessageToSend_ == null) {
       throw new ApiException(400, "Missing the required parameter 'byteArrayARemoteMeMessageToSend_' when calling sendMessage1");
    }

    // create path and map variables
    String localVarPath = "/arLite/restExample/v1/message/send/bytes/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();


    localVarHeaderParams.put("ARLiteToken", ApiInvoker.parameterToString(aRLiteToken));

    String[] localVarContentTypes = {
      "text/plain"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * send message
   * Send message
   * @param message message
   * @param jsonAMessageToSend 
   * @param aRLiteToken generated token
   * @return void
   */
  public void  sendMessage2 (AMessage message, String jsonAMessageToSend, String aRLiteToken) throws ApiException {
    Object localVarPostBody = jsonAMessageToSend;
    // verify the required parameter 'message' is set
    if (message == null) {
       throw new ApiException(400, "Missing the required parameter 'message' when calling sendMessage2");
    }
    // verify the required parameter 'jsonAMessageToSend' is set
    if (jsonAMessageToSend == null) {
       throw new ApiException(400, "Missing the required parameter 'jsonAMessageToSend' when calling sendMessage2");
    }

    // create path and map variables
    String localVarPath = "/arLite/restExample/v1/message/send/json/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();


    localVarHeaderParams.put("ARLiteToken", ApiInvoker.parameterToString(aRLiteToken));

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}

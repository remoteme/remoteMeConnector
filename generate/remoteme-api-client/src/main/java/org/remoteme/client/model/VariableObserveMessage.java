package org.remoteme.client.model;

import java.util.*;
import org.remoteme.client.model.AMessage;
import org.remoteme.client.model.VariableIdentifier;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VariableObserveMessage extends AMessage {
  
  @SerializedName("deviceId")
  private Integer deviceId = null;
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;
  @SerializedName("variables")
  private List<VariableIdentifier> variables = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(Integer deviceId) {
    this.deviceId = deviceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<VariableIdentifier> getVariables() {
    return variables;
  }
  public void setVariables(List<VariableIdentifier> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableObserveMessage variableObserveMessage = (VariableObserveMessage) o;
    return (this.deviceId == null ? variableObserveMessage.deviceId == null : this.deviceId.equals(variableObserveMessage.deviceId)) &&
        (this.messageType == null ? variableObserveMessage.messageType == null : this.messageType.equals(variableObserveMessage.messageType)) &&
        (this.variables == null ? variableObserveMessage.variables == null : this.variables.equals(variableObserveMessage.variables));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.deviceId == null ? 0: this.deviceId.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.variables == null ? 0: this.variables.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableObserveMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  deviceId: ").append(deviceId).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  variables: ").append(variables).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

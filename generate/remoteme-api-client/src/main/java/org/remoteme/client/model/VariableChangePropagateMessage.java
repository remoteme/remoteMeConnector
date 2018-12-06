package org.remoteme.client.model;

import java.util.*;
import org.remoteme.client.model.AMessage;
import org.remoteme.client.model.AVariableStateOfobject;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VariableChangePropagateMessage extends AMessage {
  
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;
  @SerializedName("receiveDeviceId")
  private Integer receiveDeviceId = null;
  @SerializedName("senderDeviceId")
  private Integer senderDeviceId = null;
  @SerializedName("states")
  private List<AVariableStateOfobject> states = null;

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
  public Integer getReceiveDeviceId() {
    return receiveDeviceId;
  }
  public void setReceiveDeviceId(Integer receiveDeviceId) {
    this.receiveDeviceId = receiveDeviceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSenderDeviceId() {
    return senderDeviceId;
  }
  public void setSenderDeviceId(Integer senderDeviceId) {
    this.senderDeviceId = senderDeviceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AVariableStateOfobject> getStates() {
    return states;
  }
  public void setStates(List<AVariableStateOfobject> states) {
    this.states = states;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableChangePropagateMessage variableChangePropagateMessage = (VariableChangePropagateMessage) o;
    return (this.messageType == null ? variableChangePropagateMessage.messageType == null : this.messageType.equals(variableChangePropagateMessage.messageType)) &&
        (this.receiveDeviceId == null ? variableChangePropagateMessage.receiveDeviceId == null : this.receiveDeviceId.equals(variableChangePropagateMessage.receiveDeviceId)) &&
        (this.senderDeviceId == null ? variableChangePropagateMessage.senderDeviceId == null : this.senderDeviceId.equals(variableChangePropagateMessage.senderDeviceId)) &&
        (this.states == null ? variableChangePropagateMessage.states == null : this.states.equals(variableChangePropagateMessage.states));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.receiveDeviceId == null ? 0: this.receiveDeviceId.hashCode());
    result = 31 * result + (this.senderDeviceId == null ? 0: this.senderDeviceId.hashCode());
    result = 31 * result + (this.states == null ? 0: this.states.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableChangePropagateMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  receiveDeviceId: ").append(receiveDeviceId).append("\n");
    sb.append("  senderDeviceId: ").append(senderDeviceId).append("\n");
    sb.append("  states: ").append(states).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

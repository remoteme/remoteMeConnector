package org.remoteme.client.model;

import org.remoteme.client.model.AMessage;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SystemMessage extends AMessage {
  
  @SerializedName("message")
  private byte[] message = null;
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;
  @SerializedName("receiverDeviceId")
  private Integer receiverDeviceId = null;
  public enum SystemMessageTypeEnum {
     RESTART,  DEVICE_CONNECT_CHANGE, 
  };
  @SerializedName("systemMessageType")
  private SystemMessageTypeEnum systemMessageType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public byte[] getMessage() {
    return message;
  }
  public void setMessage(byte[] message) {
    this.message = message;
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
  public Integer getReceiverDeviceId() {
    return receiverDeviceId;
  }
  public void setReceiverDeviceId(Integer receiverDeviceId) {
    this.receiverDeviceId = receiverDeviceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SystemMessageTypeEnum getSystemMessageType() {
    return systemMessageType;
  }
  public void setSystemMessageType(SystemMessageTypeEnum systemMessageType) {
    this.systemMessageType = systemMessageType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemMessage systemMessage = (SystemMessage) o;
    return (this.message == null ? systemMessage.message == null : this.message.equals(systemMessage.message)) &&
        (this.messageType == null ? systemMessage.messageType == null : this.messageType.equals(systemMessage.messageType)) &&
        (this.receiverDeviceId == null ? systemMessage.receiverDeviceId == null : this.receiverDeviceId.equals(systemMessage.receiverDeviceId)) &&
        (this.systemMessageType == null ? systemMessage.systemMessageType == null : this.systemMessageType.equals(systemMessage.systemMessageType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.receiverDeviceId == null ? 0: this.receiverDeviceId.hashCode());
    result = 31 * result + (this.systemMessageType == null ? 0: this.systemMessageType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  receiverDeviceId: ").append(receiverDeviceId).append("\n");
    sb.append("  systemMessageType: ").append(systemMessageType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

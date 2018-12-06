package org.remoteme.client.model;

import java.util.*;
import org.remoteme.client.model.AMessage;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SyncMessage extends AMessage {
  
  @SerializedName("message")
  private List<Integer> message = null;
  @SerializedName("messageId")
  private Long messageId = null;
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;
  @SerializedName("receiverDeviceId")
  private Integer receiverDeviceId = null;
  public enum TypeEnum {
     GET_WEBRTC_CONENCTED_DEVICE_ID,  GET_FILES,  GET_FILE_CONTENT,  SAVE_FILE_CONTENT,  REMOVE_FILE,  REMOVE_DEVICE_DIRECTORY,  GET_FILE_SIZE,  RENAME_FILE,  GET_CONNECTED_DEVICES,  GET_WEBSOCKET_SERVER_LOCAL, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getMessage() {
    return message;
  }
  public void setMessage(List<Integer> message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getMessageId() {
    return messageId;
  }
  public void setMessageId(Long messageId) {
    this.messageId = messageId;
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
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncMessage syncMessage = (SyncMessage) o;
    return (this.message == null ? syncMessage.message == null : this.message.equals(syncMessage.message)) &&
        (this.messageId == null ? syncMessage.messageId == null : this.messageId.equals(syncMessage.messageId)) &&
        (this.messageType == null ? syncMessage.messageType == null : this.messageType.equals(syncMessage.messageType)) &&
        (this.receiverDeviceId == null ? syncMessage.receiverDeviceId == null : this.receiverDeviceId.equals(syncMessage.receiverDeviceId)) &&
        (this.type == null ? syncMessage.type == null : this.type.equals(syncMessage.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.messageId == null ? 0: this.messageId.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.receiverDeviceId == null ? 0: this.receiverDeviceId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  messageId: ").append(messageId).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  receiverDeviceId: ").append(receiverDeviceId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package org.remoteme.client.model;

import java.util.*;
import org.remoteme.client.model.AMessage;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SyncUserMessage extends AMessage {
  
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
  @SerializedName("senderDeviceId")
  private Integer senderDeviceId = null;

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
  public Integer getSenderDeviceId() {
    return senderDeviceId;
  }
  public void setSenderDeviceId(Integer senderDeviceId) {
    this.senderDeviceId = senderDeviceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncUserMessage syncUserMessage = (SyncUserMessage) o;
    return (this.message == null ? syncUserMessage.message == null : this.message.equals(syncUserMessage.message)) &&
        (this.messageId == null ? syncUserMessage.messageId == null : this.messageId.equals(syncUserMessage.messageId)) &&
        (this.messageType == null ? syncUserMessage.messageType == null : this.messageType.equals(syncUserMessage.messageType)) &&
        (this.receiverDeviceId == null ? syncUserMessage.receiverDeviceId == null : this.receiverDeviceId.equals(syncUserMessage.receiverDeviceId)) &&
        (this.senderDeviceId == null ? syncUserMessage.senderDeviceId == null : this.senderDeviceId.equals(syncUserMessage.senderDeviceId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.messageId == null ? 0: this.messageId.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.receiverDeviceId == null ? 0: this.receiverDeviceId.hashCode());
    result = 31 * result + (this.senderDeviceId == null ? 0: this.senderDeviceId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncUserMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  messageId: ").append(messageId).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  receiverDeviceId: ").append(receiverDeviceId).append("\n");
    sb.append("  senderDeviceId: ").append(senderDeviceId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

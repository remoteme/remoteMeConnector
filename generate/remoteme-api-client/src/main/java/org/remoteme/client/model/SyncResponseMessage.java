package org.remoteme.client.model;

import java.util.*;
import org.remoteme.client.model.AMessage;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SyncResponseMessage extends AMessage {
  
  @SerializedName("message")
  private List<Integer> message = null;
  @SerializedName("messageId")
  private Long messageId = null;
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncResponseMessage syncResponseMessage = (SyncResponseMessage) o;
    return (this.message == null ? syncResponseMessage.message == null : this.message.equals(syncResponseMessage.message)) &&
        (this.messageId == null ? syncResponseMessage.messageId == null : this.messageId.equals(syncResponseMessage.messageId)) &&
        (this.messageType == null ? syncResponseMessage.messageType == null : this.messageType.equals(syncResponseMessage.messageType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.messageId == null ? 0: this.messageId.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncResponseMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  messageId: ").append(messageId).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

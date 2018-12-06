package org.remoteme.client.model;

import org.remoteme.client.model.AMessage;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LogMessage extends AMessage {
  
  public enum LevelEnum {
     INFO,  WARN,  ERROR, 
  };
  @SerializedName("level")
  private LevelEnum level = null;
  @SerializedName("message")
  private String message = null;
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogMessage logMessage = (LogMessage) o;
    return (this.level == null ? logMessage.level == null : this.level.equals(logMessage.level)) &&
        (this.message == null ? logMessage.message == null : this.message.equals(logMessage.message)) &&
        (this.messageType == null ? logMessage.messageType == null : this.messageType.equals(logMessage.messageType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.level == null ? 0: this.level.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

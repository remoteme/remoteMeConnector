package org.remoteme.client.model;

import org.remoteme.client.model.AMessage;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class WebRRCConnectionStatusChangeMessage extends AMessage {
  
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;
  @SerializedName("rasbperryPiDeviceId")
  private Integer rasbperryPiDeviceId = null;
  public enum StatusEnum {
     CONNECTED,  DISCONNECTED,  FAILED,  CONNECTING,  DISCONNECTING,  CHECKING, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("webPageDeviceId")
  private Integer webPageDeviceId = null;

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
  public Integer getRasbperryPiDeviceId() {
    return rasbperryPiDeviceId;
  }
  public void setRasbperryPiDeviceId(Integer rasbperryPiDeviceId) {
    this.rasbperryPiDeviceId = rasbperryPiDeviceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getWebPageDeviceId() {
    return webPageDeviceId;
  }
  public void setWebPageDeviceId(Integer webPageDeviceId) {
    this.webPageDeviceId = webPageDeviceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebRRCConnectionStatusChangeMessage webRRCConnectionStatusChangeMessage = (WebRRCConnectionStatusChangeMessage) o;
    return (this.messageType == null ? webRRCConnectionStatusChangeMessage.messageType == null : this.messageType.equals(webRRCConnectionStatusChangeMessage.messageType)) &&
        (this.rasbperryPiDeviceId == null ? webRRCConnectionStatusChangeMessage.rasbperryPiDeviceId == null : this.rasbperryPiDeviceId.equals(webRRCConnectionStatusChangeMessage.rasbperryPiDeviceId)) &&
        (this.status == null ? webRRCConnectionStatusChangeMessage.status == null : this.status.equals(webRRCConnectionStatusChangeMessage.status)) &&
        (this.webPageDeviceId == null ? webRRCConnectionStatusChangeMessage.webPageDeviceId == null : this.webPageDeviceId.equals(webRRCConnectionStatusChangeMessage.webPageDeviceId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.rasbperryPiDeviceId == null ? 0: this.rasbperryPiDeviceId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.webPageDeviceId == null ? 0: this.webPageDeviceId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebRRCConnectionStatusChangeMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  rasbperryPiDeviceId: ").append(rasbperryPiDeviceId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  webPageDeviceId: ").append(webPageDeviceId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

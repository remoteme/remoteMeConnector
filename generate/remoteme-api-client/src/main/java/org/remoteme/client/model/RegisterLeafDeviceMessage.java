package org.remoteme.client.model;

import org.remoteme.client.model.AMessage;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RegisterLeafDeviceMessage extends AMessage {
  
  @SerializedName("deviceId")
  private Integer deviceId = null;
  @SerializedName("deviceName")
  private String deviceName = null;
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;
  @SerializedName("parentId")
  private Integer parentId = null;
  @SerializedName("restartParent")
  private Boolean restartParent = null;
  public enum TypeEnum {
     OTHER_SOCKET,  EXTERNAL_SCRIPT,  SERIAL,  NRF24,  GPIO, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

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
  public String getDeviceName() {
    return deviceName;
  }
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
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
  public Integer getParentId() {
    return parentId;
  }
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRestartParent() {
    return restartParent;
  }
  public void setRestartParent(Boolean restartParent) {
    this.restartParent = restartParent;
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
    RegisterLeafDeviceMessage registerLeafDeviceMessage = (RegisterLeafDeviceMessage) o;
    return (this.deviceId == null ? registerLeafDeviceMessage.deviceId == null : this.deviceId.equals(registerLeafDeviceMessage.deviceId)) &&
        (this.deviceName == null ? registerLeafDeviceMessage.deviceName == null : this.deviceName.equals(registerLeafDeviceMessage.deviceName)) &&
        (this.messageType == null ? registerLeafDeviceMessage.messageType == null : this.messageType.equals(registerLeafDeviceMessage.messageType)) &&
        (this.parentId == null ? registerLeafDeviceMessage.parentId == null : this.parentId.equals(registerLeafDeviceMessage.parentId)) &&
        (this.restartParent == null ? registerLeafDeviceMessage.restartParent == null : this.restartParent.equals(registerLeafDeviceMessage.restartParent)) &&
        (this.type == null ? registerLeafDeviceMessage.type == null : this.type.equals(registerLeafDeviceMessage.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.deviceId == null ? 0: this.deviceId.hashCode());
    result = 31 * result + (this.deviceName == null ? 0: this.deviceName.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.parentId == null ? 0: this.parentId.hashCode());
    result = 31 * result + (this.restartParent == null ? 0: this.restartParent.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterLeafDeviceMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  deviceId: ").append(deviceId).append("\n");
    sb.append("  deviceName: ").append(deviceName).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("  restartParent: ").append(restartParent).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

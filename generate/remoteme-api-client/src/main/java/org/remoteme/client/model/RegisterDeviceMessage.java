package org.remoteme.client.model;

import org.remoteme.client.model.AMessage;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RegisterDeviceMessage extends AMessage {
  
  @SerializedName("aditionalProperties")
  private Integer aditionalProperties = null;
  @SerializedName("deviceId")
  private Integer deviceId = null;
  @SerializedName("deviceName")
  private String deviceName = null;
  public enum DeviceTypeEnum {
     NETWORK,  SMARTPHONE,  WEBPAGE,  JSSCRIPT, 
  };
  @SerializedName("deviceType")
  private DeviceTypeEnum deviceType = null;
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAditionalProperties() {
    return aditionalProperties;
  }
  public void setAditionalProperties(Integer aditionalProperties) {
    this.aditionalProperties = aditionalProperties;
  }

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
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
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
    RegisterDeviceMessage registerDeviceMessage = (RegisterDeviceMessage) o;
    return (this.aditionalProperties == null ? registerDeviceMessage.aditionalProperties == null : this.aditionalProperties.equals(registerDeviceMessage.aditionalProperties)) &&
        (this.deviceId == null ? registerDeviceMessage.deviceId == null : this.deviceId.equals(registerDeviceMessage.deviceId)) &&
        (this.deviceName == null ? registerDeviceMessage.deviceName == null : this.deviceName.equals(registerDeviceMessage.deviceName)) &&
        (this.deviceType == null ? registerDeviceMessage.deviceType == null : this.deviceType.equals(registerDeviceMessage.deviceType)) &&
        (this.messageType == null ? registerDeviceMessage.messageType == null : this.messageType.equals(registerDeviceMessage.messageType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aditionalProperties == null ? 0: this.aditionalProperties.hashCode());
    result = 31 * result + (this.deviceId == null ? 0: this.deviceId.hashCode());
    result = 31 * result + (this.deviceName == null ? 0: this.deviceName.hashCode());
    result = 31 * result + (this.deviceType == null ? 0: this.deviceType.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterDeviceMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  aditionalProperties: ").append(aditionalProperties).append("\n");
    sb.append("  deviceId: ").append(deviceId).append("\n");
    sb.append("  deviceName: ").append(deviceName).append("\n");
    sb.append("  deviceType: ").append(deviceType).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

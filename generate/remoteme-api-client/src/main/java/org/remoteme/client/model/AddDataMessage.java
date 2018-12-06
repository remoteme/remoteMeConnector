package org.remoteme.client.model;

import java.util.*;
import org.remoteme.client.model.AMessage;
import org.remoteme.client.model.DataSeries;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AddDataMessage extends AMessage {
  
  @SerializedName("dataSeries")
  private List<DataSeries> dataSeries = null;
  public enum MessageTypeEnum {
     PING,  AUTHENTIFICATE,  USER_MESSAGE,  USER_MESSAGE_DELIVER_STATUS,  USER_SYNC_MESSAGE,  VARIABLE_CHANGE_MESSAGE,  VARIABLE_CHANGE_PROPAGATE_MESSAGE,  SYNC_MESSAGE,  SYNC_MESSAGE_RESPONSE,  VARIABLE_OBSERVE_MESSAGE,  REGISTER_DEVICE,  REGISTER_CHILD_DEVICE,  ADD_DATA,  LOG,  SYSTEM_MESSAGE,  WEB_RTC_CONNECTION_CHANGE, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;
  public enum SettingsEnum {
     NO_ROUND,  _1S,  _2S,  _5S,  _10S,  _15S,  _20S,  _30S,  _1M,  _5M,  _10M,  _15M,  _30M,  _1G,  _2G,  _3G,  _4G,  _5G,  _6G, 
  };
  @SerializedName("settings")
  private SettingsEnum settings = null;
  @SerializedName("time")
  private Long time = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DataSeries> getDataSeries() {
    return dataSeries;
  }
  public void setDataSeries(List<DataSeries> dataSeries) {
    this.dataSeries = dataSeries;
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
  public SettingsEnum getSettings() {
    return settings;
  }
  public void setSettings(SettingsEnum settings) {
    this.settings = settings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDataMessage addDataMessage = (AddDataMessage) o;
    return (this.dataSeries == null ? addDataMessage.dataSeries == null : this.dataSeries.equals(addDataMessage.dataSeries)) &&
        (this.messageType == null ? addDataMessage.messageType == null : this.messageType.equals(addDataMessage.messageType)) &&
        (this.settings == null ? addDataMessage.settings == null : this.settings.equals(addDataMessage.settings)) &&
        (this.time == null ? addDataMessage.time == null : this.time.equals(addDataMessage.time));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.dataSeries == null ? 0: this.dataSeries.hashCode());
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.settings == null ? 0: this.settings.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDataMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  dataSeries: ").append(dataSeries).append("\n");
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  settings: ").append(settings).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

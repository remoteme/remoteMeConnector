package org.remoteme.client.model;

import org.remoteme.client.model.AMessage;
import org.remoteme.client.model.VariableRemoveMessageData;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VariableRemoveMessage extends AMessage {
  
  @SerializedName("data")
  private VariableRemoveMessageData data = null;
  @SerializedName("deviceId")
  private Integer deviceId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public VariableRemoveMessageData getData() {
    return data;
  }
  public void setData(VariableRemoveMessageData data) {
    this.data = data;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableRemoveMessage variableRemoveMessage = (VariableRemoveMessage) o;
    return (this.data == null ? variableRemoveMessage.data == null : this.data.equals(variableRemoveMessage.data)) &&
        (this.deviceId == null ? variableRemoveMessage.deviceId == null : this.deviceId.equals(variableRemoveMessage.deviceId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.deviceId == null ? 0: this.deviceId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableRemoveMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  deviceId: ").append(deviceId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

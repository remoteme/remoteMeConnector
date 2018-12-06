package org.remoteme.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VariableSchedulerDto  {
  
  @SerializedName("cron")
  private String cron = null;
  public enum ModeEnum {
     CRON,  TIME, 
  };
  @SerializedName("mode")
  private ModeEnum mode = null;
  @SerializedName("time")
  private String time = null;
  @SerializedName("values")
  private List<String> values = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCron() {
    return cron;
  }
  public void setCron(String cron) {
    this.cron = cron;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModeEnum getMode() {
    return mode;
  }
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableSchedulerDto variableSchedulerDto = (VariableSchedulerDto) o;
    return (this.cron == null ? variableSchedulerDto.cron == null : this.cron.equals(variableSchedulerDto.cron)) &&
        (this.mode == null ? variableSchedulerDto.mode == null : this.mode.equals(variableSchedulerDto.mode)) &&
        (this.time == null ? variableSchedulerDto.time == null : this.time.equals(variableSchedulerDto.time)) &&
        (this.values == null ? variableSchedulerDto.values == null : this.values.equals(variableSchedulerDto.values));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cron == null ? 0: this.cron.hashCode());
    result = 31 * result + (this.mode == null ? 0: this.mode.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.values == null ? 0: this.values.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableSchedulerDto {\n");
    
    sb.append("  cron: ").append(cron).append("\n");
    sb.append("  mode: ").append(mode).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

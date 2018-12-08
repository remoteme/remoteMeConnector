package org.remoteme.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VariableSchedulerEntityDto  {
  
  @SerializedName("cron")
  private String cron = null;
  public enum ModeEnum {
     CRON,  TIME, 
  };
  @SerializedName("mode")
  private ModeEnum mode = null;
  @SerializedName("nextTimeRun")
  private Long nextTimeRun = null;
  @SerializedName("time")
  private String time = null;
  @SerializedName("values")
  private List<String> values = null;
  @SerializedName("variableSchedulerId")
  private Integer variableSchedulerId = null;

  /**
   * M H D Y check user interface to more help
   **/
  @ApiModelProperty(value = "M H D Y check user interface to more help")
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
  public Long getNextTimeRun() {
    return nextTimeRun;
  }
  public void setNextTimeRun(Long nextTimeRun) {
    this.nextTimeRun = nextTimeRun;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVariableSchedulerId() {
    return variableSchedulerId;
  }
  public void setVariableSchedulerId(Integer variableSchedulerId) {
    this.variableSchedulerId = variableSchedulerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableSchedulerEntityDto variableSchedulerEntityDto = (VariableSchedulerEntityDto) o;
    return (this.cron == null ? variableSchedulerEntityDto.cron == null : this.cron.equals(variableSchedulerEntityDto.cron)) &&
        (this.mode == null ? variableSchedulerEntityDto.mode == null : this.mode.equals(variableSchedulerEntityDto.mode)) &&
        (this.nextTimeRun == null ? variableSchedulerEntityDto.nextTimeRun == null : this.nextTimeRun.equals(variableSchedulerEntityDto.nextTimeRun)) &&
        (this.time == null ? variableSchedulerEntityDto.time == null : this.time.equals(variableSchedulerEntityDto.time)) &&
        (this.values == null ? variableSchedulerEntityDto.values == null : this.values.equals(variableSchedulerEntityDto.values)) &&
        (this.variableSchedulerId == null ? variableSchedulerEntityDto.variableSchedulerId == null : this.variableSchedulerId.equals(variableSchedulerEntityDto.variableSchedulerId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cron == null ? 0: this.cron.hashCode());
    result = 31 * result + (this.mode == null ? 0: this.mode.hashCode());
    result = 31 * result + (this.nextTimeRun == null ? 0: this.nextTimeRun.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.values == null ? 0: this.values.hashCode());
    result = 31 * result + (this.variableSchedulerId == null ? 0: this.variableSchedulerId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableSchedulerEntityDto {\n");
    
    sb.append("  cron: ").append(cron).append("\n");
    sb.append("  mode: ").append(mode).append("\n");
    sb.append("  nextTimeRun: ").append(nextTimeRun).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("  variableSchedulerId: ").append(variableSchedulerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

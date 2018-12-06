package org.remoteme.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VariableDetails  {
  
  @SerializedName("history")
  private Boolean history = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("persistent")
  private Boolean persistent = null;
  @SerializedName("scheduled")
  private Boolean scheduled = null;
  public enum TypeEnum {
     BOOLEAN,  INTEGER,  TEXT,  SMALL_INTEGER_3,  SMALL_INTEGER_2,  INTEGER_BOOLEAN,  DOUBLE,  TEXT_2,  SMALL_INTEGER_2_TEXT_2, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHistory() {
    return history;
  }
  public void setHistory(Boolean history) {
    this.history = history;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPersistent() {
    return persistent;
  }
  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getScheduled() {
    return scheduled;
  }
  public void setScheduled(Boolean scheduled) {
    this.scheduled = scheduled;
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
    VariableDetails variableDetails = (VariableDetails) o;
    return (this.history == null ? variableDetails.history == null : this.history.equals(variableDetails.history)) &&
        (this.name == null ? variableDetails.name == null : this.name.equals(variableDetails.name)) &&
        (this.persistent == null ? variableDetails.persistent == null : this.persistent.equals(variableDetails.persistent)) &&
        (this.scheduled == null ? variableDetails.scheduled == null : this.scheduled.equals(variableDetails.scheduled)) &&
        (this.type == null ? variableDetails.type == null : this.type.equals(variableDetails.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.history == null ? 0: this.history.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.persistent == null ? 0: this.persistent.hashCode());
    result = 31 * result + (this.scheduled == null ? 0: this.scheduled.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableDetails {\n");
    
    sb.append("  history: ").append(history).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  persistent: ").append(persistent).append("\n");
    sb.append("  scheduled: ").append(scheduled).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

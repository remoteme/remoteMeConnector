package org.remoteme.client.model;

import org.remoteme.client.model.VariableIdentifier;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AVariableStateOfobject  {
  
  @SerializedName("data")
  private Object data = null;
  @SerializedName("dataString")
  private String dataString = null;
  @SerializedName("identifier")
  private VariableIdentifier identifier = null;
  @SerializedName("size")
  private Integer size = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataString() {
    return dataString;
  }
  public void setDataString(String dataString) {
    this.dataString = dataString;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public VariableIdentifier getIdentifier() {
    return identifier;
  }
  public void setIdentifier(VariableIdentifier identifier) {
    this.identifier = identifier;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AVariableStateOfobject aVariableStateOfobject = (AVariableStateOfobject) o;
    return (this.data == null ? aVariableStateOfobject.data == null : this.data.equals(aVariableStateOfobject.data)) &&
        (this.dataString == null ? aVariableStateOfobject.dataString == null : this.dataString.equals(aVariableStateOfobject.dataString)) &&
        (this.identifier == null ? aVariableStateOfobject.identifier == null : this.identifier.equals(aVariableStateOfobject.identifier)) &&
        (this.size == null ? aVariableStateOfobject.size == null : this.size.equals(aVariableStateOfobject.size));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.dataString == null ? 0: this.dataString.hashCode());
    result = 31 * result + (this.identifier == null ? 0: this.identifier.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AVariableStateOfobject {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  dataString: ").append(dataString).append("\n");
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

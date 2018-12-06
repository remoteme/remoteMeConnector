package org.remoteme.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VariableIdentifier  {
  
  @SerializedName("name")
  private String name = null;
  public enum TypeEnum {
     BOOLEAN,  INTEGER,  TEXT,  SMALL_INTEGER_3,  SMALL_INTEGER_2,  INTEGER_BOOLEAN,  DOUBLE,  TEXT_2,  SMALL_INTEGER_2_TEXT_2, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

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
    VariableIdentifier variableIdentifier = (VariableIdentifier) o;
    return (this.name == null ? variableIdentifier.name == null : this.name.equals(variableIdentifier.name)) &&
        (this.type == null ? variableIdentifier.type == null : this.type.equals(variableIdentifier.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableIdentifier {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

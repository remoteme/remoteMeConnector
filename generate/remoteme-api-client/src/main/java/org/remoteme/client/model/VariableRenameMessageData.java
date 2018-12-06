package org.remoteme.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VariableRenameMessageData  {
  
  @SerializedName("newName")
  private String newName = null;
  @SerializedName("oldName")
  private String oldName = null;
  public enum TypeEnum {
     BOOLEAN,  INTEGER,  TEXT,  SMALL_INTEGER_3,  SMALL_INTEGER_2,  INTEGER_BOOLEAN,  DOUBLE,  TEXT_2,  SMALL_INTEGER_2_TEXT_2, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNewName() {
    return newName;
  }
  public void setNewName(String newName) {
    this.newName = newName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOldName() {
    return oldName;
  }
  public void setOldName(String oldName) {
    this.oldName = oldName;
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
    VariableRenameMessageData variableRenameMessageData = (VariableRenameMessageData) o;
    return (this.newName == null ? variableRenameMessageData.newName == null : this.newName.equals(variableRenameMessageData.newName)) &&
        (this.oldName == null ? variableRenameMessageData.oldName == null : this.oldName.equals(variableRenameMessageData.oldName)) &&
        (this.type == null ? variableRenameMessageData.type == null : this.type.equals(variableRenameMessageData.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.newName == null ? 0: this.newName.hashCode());
    result = 31 * result + (this.oldName == null ? 0: this.oldName.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableRenameMessageData {\n");
    
    sb.append("  newName: ").append(newName).append("\n");
    sb.append("  oldName: ").append(oldName).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

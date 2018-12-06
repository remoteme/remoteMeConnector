package org.remoteme.client.model;

import java.util.*;
import org.remoteme.client.model.AMessage;
import org.remoteme.client.model.VariableDetails;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CreateVariablesMessage extends AMessage {
  
  @SerializedName("variables")
  private List<VariableDetails> variables = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<VariableDetails> getVariables() {
    return variables;
  }
  public void setVariables(List<VariableDetails> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVariablesMessage createVariablesMessage = (CreateVariablesMessage) o;
    return (this.variables == null ? createVariablesMessage.variables == null : this.variables.equals(createVariablesMessage.variables));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.variables == null ? 0: this.variables.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVariablesMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  variables: ").append(variables).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

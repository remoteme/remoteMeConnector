package org.remoteme.client.model;

import java.util.*;
import org.remoteme.client.model.AMessage;
import org.remoteme.client.model.VariableIdentifier;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NotifyAboutVariablesMessage extends AMessage {
  
  @SerializedName("identifiers")
  private List<VariableIdentifier> identifiers = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<VariableIdentifier> getIdentifiers() {
    return identifiers;
  }
  public void setIdentifiers(List<VariableIdentifier> identifiers) {
    this.identifiers = identifiers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyAboutVariablesMessage notifyAboutVariablesMessage = (NotifyAboutVariablesMessage) o;
    return (this.identifiers == null ? notifyAboutVariablesMessage.identifiers == null : this.identifiers.equals(notifyAboutVariablesMessage.identifiers));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.identifiers == null ? 0: this.identifiers.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyAboutVariablesMessage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  identifiers: ").append(identifiers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

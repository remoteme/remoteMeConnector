package org.remoteme.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ARTokenDto  {
  
  @SerializedName("token")
  private String token = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ARTokenDto aRTokenDto = (ARTokenDto) o;
    return (this.token == null ? aRTokenDto.token == null : this.token.equals(aRTokenDto.token));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ARTokenDto {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

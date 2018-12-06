package org.remoteme.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class DataSeries  {
  
  @SerializedName("seriesId")
  private Integer seriesId = null;
  @SerializedName("value")
  private Double value = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSeriesId() {
    return seriesId;
  }
  public void setSeriesId(Integer seriesId) {
    this.seriesId = seriesId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSeries dataSeries = (DataSeries) o;
    return (this.seriesId == null ? dataSeries.seriesId == null : this.seriesId.equals(dataSeries.seriesId)) &&
        (this.value == null ? dataSeries.value == null : this.value.equals(dataSeries.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.seriesId == null ? 0: this.seriesId.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSeries {\n");
    
    sb.append("  seriesId: ").append(seriesId).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

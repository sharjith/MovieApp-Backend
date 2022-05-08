package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.CouponType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouponsSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-02T17:35:08.738+05:30")

public class CouponsSummaryResponse   {
  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("coupons")
  @Valid
  private List<CouponType> coupons = new ArrayList<>();

  public CouponsSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of coupons
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of coupons")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public CouponsSummaryResponse coupons(List<CouponType> coupons) {
    this.coupons = coupons;
    return this;
  }

  public CouponsSummaryResponse addCouponsItem(CouponType couponsItem) {
    this.coupons.add(couponsItem);
    return this;
  }

  /**
   * List of coupons
   * @return coupons
  **/
  @ApiModelProperty(required = true, value = "List of coupons")
  @NotNull

  @Valid

  public List<CouponType> getCoupons() {
    return coupons;
  }

  public void setCoupons(List<CouponType> coupons) {
    this.coupons = coupons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponsSummaryResponse couponsSummaryResponse = (CouponsSummaryResponse) o;
    return Objects.equals(this.totalCount, couponsSummaryResponse.totalCount) &&
        Objects.equals(this.coupons, couponsSummaryResponse.coupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, coupons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponsSummaryResponse {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import upgrad.movieapp.api.model.TheatreShowType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TheatreShowsSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-02T17:35:06.377+05:30")

public class TheatreShowsSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("shows")
  @Valid
  private List<TheatreShowType> shows = new ArrayList<>();

  public TheatreShowsSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched shows
   * @return page
  **/
  @ApiModelProperty(value = "page or position of the fetched shows")


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public TheatreShowsSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of shows fetched per this request
   * @return limit
  **/
  @ApiModelProperty(value = "number of shows fetched per this request")


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public TheatreShowsSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of shows in the movie
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of shows in the movie")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public TheatreShowsSummaryResponse shows(List<TheatreShowType> shows) {
    this.shows = shows;
    return this;
  }

  public TheatreShowsSummaryResponse addShowsItem(TheatreShowType showsItem) {
    this.shows.add(showsItem);
    return this;
  }

  /**
   * List of shows
   * @return shows
  **/
  @ApiModelProperty(required = true, value = "List of shows")
  @NotNull

  @Valid

  public List<TheatreShowType> getShows() {
    return shows;
  }

  public void setShows(List<TheatreShowType> shows) {
    this.shows = shows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheatreShowsSummaryResponse theatreShowsSummaryResponse = (TheatreShowsSummaryResponse) o;
    return Objects.equals(this.page, theatreShowsSummaryResponse.page) &&
        Objects.equals(this.limit, theatreShowsSummaryResponse.limit) &&
        Objects.equals(this.totalCount, theatreShowsSummaryResponse.totalCount) &&
        Objects.equals(this.shows, theatreShowsSummaryResponse.shows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, shows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheatreShowsSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    shows: ").append(toIndentedString(shows)).append("\n");
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


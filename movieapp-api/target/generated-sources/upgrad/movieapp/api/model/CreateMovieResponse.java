package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import upgrad.movieapp.api.model.MovieStatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateMovieResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-02T17:35:02.970+05:30")

public class CreateMovieResponse   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("status")
  private MovieStatusType status = null;

  public CreateMovieResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier in a standard UUID format generated by API backend
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier in a standard UUID format generated by API backend")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CreateMovieResponse status(MovieStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MovieStatusType getStatus() {
    return status;
  }

  public void setStatus(MovieStatusType status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMovieResponse createMovieResponse = (CreateMovieResponse) o;
    return Objects.equals(this.id, createMovieResponse.id) &&
        Objects.equals(this.status, createMovieResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMovieResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


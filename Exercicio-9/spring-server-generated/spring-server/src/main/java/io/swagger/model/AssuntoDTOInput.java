package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssuntoDTOInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-01T19:08:51.378Z")


public class AssuntoDTOInput   {
  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("flAtivo")
  private String flAtivo = null;

  public AssuntoDTOInput descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Get descricao
   * @return descricao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=250) 
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public AssuntoDTOInput flAtivo(String flAtivo) {
    this.flAtivo = flAtivo;
    return this;
  }

  /**
   * Get flAtivo
   * @return flAtivo
  **/
  @ApiModelProperty(value = "")


  public String getFlAtivo() {
    return flAtivo;
  }

  public void setFlAtivo(String flAtivo) {
    this.flAtivo = flAtivo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssuntoDTOInput assuntoDTOInput = (AssuntoDTOInput) o;
    return Objects.equals(this.descricao, assuntoDTOInput.descricao) &&
        Objects.equals(this.flAtivo, assuntoDTOInput.flAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, flAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssuntoDTOInput {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flAtivo: ").append(toIndentedString(flAtivo)).append("\n");
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


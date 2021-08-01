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
 * ProcessoDTOInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-01T19:08:51.378Z")


public class ProcessoDTOInput   {
  @JsonProperty("cdAssuntoId")
  private Long cdAssuntoId = null;

  @JsonProperty("cdInteressadoId")
  private Long cdInteressadoId = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("nuAno")
  private String nuAno = null;

  @JsonProperty("sgOrgaoSetor")
  private String sgOrgaoSetor = null;

  public ProcessoDTOInput cdAssuntoId(Long cdAssuntoId) {
    this.cdAssuntoId = cdAssuntoId;
    return this;
  }

  /**
   * Get cdAssuntoId
   * @return cdAssuntoId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getCdAssuntoId() {
    return cdAssuntoId;
  }

  public void setCdAssuntoId(Long cdAssuntoId) {
    this.cdAssuntoId = cdAssuntoId;
  }

  public ProcessoDTOInput cdInteressadoId(Long cdInteressadoId) {
    this.cdInteressadoId = cdInteressadoId;
    return this;
  }

  /**
   * Get cdInteressadoId
   * @return cdInteressadoId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getCdInteressadoId() {
    return cdInteressadoId;
  }

  public void setCdInteressadoId(Long cdInteressadoId) {
    this.cdInteressadoId = cdInteressadoId;
  }

  public ProcessoDTOInput descricao(String descricao) {
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

  public ProcessoDTOInput nuAno(String nuAno) {
    this.nuAno = nuAno;
    return this;
  }

  /**
   * Get nuAno
   * @return nuAno
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=4) 
  public String getNuAno() {
    return nuAno;
  }

  public void setNuAno(String nuAno) {
    this.nuAno = nuAno;
  }

  public ProcessoDTOInput sgOrgaoSetor(String sgOrgaoSetor) {
    this.sgOrgaoSetor = sgOrgaoSetor;
    return this;
  }

  /**
   * Get sgOrgaoSetor
   * @return sgOrgaoSetor
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=4) 
  public String getSgOrgaoSetor() {
    return sgOrgaoSetor;
  }

  public void setSgOrgaoSetor(String sgOrgaoSetor) {
    this.sgOrgaoSetor = sgOrgaoSetor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessoDTOInput processoDTOInput = (ProcessoDTOInput) o;
    return Objects.equals(this.cdAssuntoId, processoDTOInput.cdAssuntoId) &&
        Objects.equals(this.cdInteressadoId, processoDTOInput.cdInteressadoId) &&
        Objects.equals(this.descricao, processoDTOInput.descricao) &&
        Objects.equals(this.nuAno, processoDTOInput.nuAno) &&
        Objects.equals(this.sgOrgaoSetor, processoDTOInput.sgOrgaoSetor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdAssuntoId, cdInteressadoId, descricao, nuAno, sgOrgaoSetor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessoDTOInput {\n");
    
    sb.append("    cdAssuntoId: ").append(toIndentedString(cdAssuntoId)).append("\n");
    sb.append("    cdInteressadoId: ").append(toIndentedString(cdInteressadoId)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    nuAno: ").append(toIndentedString(nuAno)).append("\n");
    sb.append("    sgOrgaoSetor: ").append(toIndentedString(sgOrgaoSetor)).append("\n");
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


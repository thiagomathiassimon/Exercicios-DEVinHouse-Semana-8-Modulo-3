package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Assunto;
import io.swagger.model.Interessado;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessoDTOOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-01T19:08:51.378Z")


public class ProcessoDTOOutput   {
  @JsonProperty("cdAssunto")
  private Assunto cdAssunto = null;

  @JsonProperty("cdInteressado")
  private Interessado cdInteressado = null;

  @JsonProperty("chaveProcesso")
  private String chaveProcesso = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nuAno")
  private String nuAno = null;

  @JsonProperty("nuProcesso")
  private Long nuProcesso = null;

  @JsonProperty("sgOrgaoSetor")
  private String sgOrgaoSetor = null;

  public ProcessoDTOOutput cdAssunto(Assunto cdAssunto) {
    this.cdAssunto = cdAssunto;
    return this;
  }

  /**
   * Get cdAssunto
   * @return cdAssunto
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Assunto getCdAssunto() {
    return cdAssunto;
  }

  public void setCdAssunto(Assunto cdAssunto) {
    this.cdAssunto = cdAssunto;
  }

  public ProcessoDTOOutput cdInteressado(Interessado cdInteressado) {
    this.cdInteressado = cdInteressado;
    return this;
  }

  /**
   * Get cdInteressado
   * @return cdInteressado
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Interessado getCdInteressado() {
    return cdInteressado;
  }

  public void setCdInteressado(Interessado cdInteressado) {
    this.cdInteressado = cdInteressado;
  }

  public ProcessoDTOOutput chaveProcesso(String chaveProcesso) {
    this.chaveProcesso = chaveProcesso;
    return this;
  }

  /**
   * Get chaveProcesso
   * @return chaveProcesso
  **/
  @ApiModelProperty(value = "")


  public String getChaveProcesso() {
    return chaveProcesso;
  }

  public void setChaveProcesso(String chaveProcesso) {
    this.chaveProcesso = chaveProcesso;
  }

  public ProcessoDTOOutput descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Get descricao
   * @return descricao
  **/
  @ApiModelProperty(value = "")


  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ProcessoDTOOutput id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProcessoDTOOutput nuAno(String nuAno) {
    this.nuAno = nuAno;
    return this;
  }

  /**
   * Get nuAno
   * @return nuAno
  **/
  @ApiModelProperty(value = "")


  public String getNuAno() {
    return nuAno;
  }

  public void setNuAno(String nuAno) {
    this.nuAno = nuAno;
  }

  public ProcessoDTOOutput nuProcesso(Long nuProcesso) {
    this.nuProcesso = nuProcesso;
    return this;
  }

  /**
   * Get nuProcesso
   * @return nuProcesso
  **/
  @ApiModelProperty(value = "")


  public Long getNuProcesso() {
    return nuProcesso;
  }

  public void setNuProcesso(Long nuProcesso) {
    this.nuProcesso = nuProcesso;
  }

  public ProcessoDTOOutput sgOrgaoSetor(String sgOrgaoSetor) {
    this.sgOrgaoSetor = sgOrgaoSetor;
    return this;
  }

  /**
   * Get sgOrgaoSetor
   * @return sgOrgaoSetor
  **/
  @ApiModelProperty(value = "")


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
    ProcessoDTOOutput processoDTOOutput = (ProcessoDTOOutput) o;
    return Objects.equals(this.cdAssunto, processoDTOOutput.cdAssunto) &&
        Objects.equals(this.cdInteressado, processoDTOOutput.cdInteressado) &&
        Objects.equals(this.chaveProcesso, processoDTOOutput.chaveProcesso) &&
        Objects.equals(this.descricao, processoDTOOutput.descricao) &&
        Objects.equals(this.id, processoDTOOutput.id) &&
        Objects.equals(this.nuAno, processoDTOOutput.nuAno) &&
        Objects.equals(this.nuProcesso, processoDTOOutput.nuProcesso) &&
        Objects.equals(this.sgOrgaoSetor, processoDTOOutput.sgOrgaoSetor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdAssunto, cdInteressado, chaveProcesso, descricao, id, nuAno, nuProcesso, sgOrgaoSetor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessoDTOOutput {\n");
    
    sb.append("    cdAssunto: ").append(toIndentedString(cdAssunto)).append("\n");
    sb.append("    cdInteressado: ").append(toIndentedString(cdInteressado)).append("\n");
    sb.append("    chaveProcesso: ").append(toIndentedString(chaveProcesso)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nuAno: ").append(toIndentedString(nuAno)).append("\n");
    sb.append("    nuProcesso: ").append(toIndentedString(nuProcesso)).append("\n");
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


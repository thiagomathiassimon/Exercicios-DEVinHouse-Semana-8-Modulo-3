package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Assunto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-01T19:08:51.378Z")


public class Assunto   {
  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("dtCadastro")
  private LocalDate dtCadastro = null;

  @JsonProperty("flAtivo")
  private String flAtivo = null;

  @JsonProperty("id")
  private Long id = null;

  public Assunto descricao(String descricao) {
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

  public Assunto dtCadastro(LocalDate dtCadastro) {
    this.dtCadastro = dtCadastro;
    return this;
  }

  /**
   * Get dtCadastro
   * @return dtCadastro
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDtCadastro() {
    return dtCadastro;
  }

  public void setDtCadastro(LocalDate dtCadastro) {
    this.dtCadastro = dtCadastro;
  }

  public Assunto flAtivo(String flAtivo) {
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

  public Assunto id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assunto assunto = (Assunto) o;
    return Objects.equals(this.descricao, assunto.descricao) &&
        Objects.equals(this.dtCadastro, assunto.dtCadastro) &&
        Objects.equals(this.flAtivo, assunto.flAtivo) &&
        Objects.equals(this.id, assunto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, dtCadastro, flAtivo, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assunto {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    dtCadastro: ").append(toIndentedString(dtCadastro)).append("\n");
    sb.append("    flAtivo: ").append(toIndentedString(flAtivo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


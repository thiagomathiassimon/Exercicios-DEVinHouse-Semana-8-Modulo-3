/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Interessado
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-01T19:08:42.632Z")
public class Interessado {
  @SerializedName("dtNascimento")
  private LocalDate dtNascimento = null;

  @SerializedName("flAtivo")
  private String flAtivo = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("nmInteressado")
  private String nmInteressado = null;

  @SerializedName("nuIdentificacao")
  private String nuIdentificacao = null;

  public Interessado dtNascimento(LocalDate dtNascimento) {
    this.dtNascimento = dtNascimento;
    return this;
  }

   /**
   * Get dtNascimento
   * @return dtNascimento
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDtNascimento() {
    return dtNascimento;
  }

  public void setDtNascimento(LocalDate dtNascimento) {
    this.dtNascimento = dtNascimento;
  }

  public Interessado flAtivo(String flAtivo) {
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

  public Interessado id(Long id) {
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

  public Interessado nmInteressado(String nmInteressado) {
    this.nmInteressado = nmInteressado;
    return this;
  }

   /**
   * Get nmInteressado
   * @return nmInteressado
  **/
  @ApiModelProperty(value = "")
  public String getNmInteressado() {
    return nmInteressado;
  }

  public void setNmInteressado(String nmInteressado) {
    this.nmInteressado = nmInteressado;
  }

  public Interessado nuIdentificacao(String nuIdentificacao) {
    this.nuIdentificacao = nuIdentificacao;
    return this;
  }

   /**
   * Get nuIdentificacao
   * @return nuIdentificacao
  **/
  @ApiModelProperty(value = "")
  public String getNuIdentificacao() {
    return nuIdentificacao;
  }

  public void setNuIdentificacao(String nuIdentificacao) {
    this.nuIdentificacao = nuIdentificacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interessado interessado = (Interessado) o;
    return Objects.equals(this.dtNascimento, interessado.dtNascimento) &&
        Objects.equals(this.flAtivo, interessado.flAtivo) &&
        Objects.equals(this.id, interessado.id) &&
        Objects.equals(this.nmInteressado, interessado.nmInteressado) &&
        Objects.equals(this.nuIdentificacao, interessado.nuIdentificacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtNascimento, flAtivo, id, nmInteressado, nuIdentificacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interessado {\n");
    
    sb.append("    dtNascimento: ").append(toIndentedString(dtNascimento)).append("\n");
    sb.append("    flAtivo: ").append(toIndentedString(flAtivo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nmInteressado: ").append(toIndentedString(nmInteressado)).append("\n");
    sb.append("    nuIdentificacao: ").append(toIndentedString(nuIdentificacao)).append("\n");
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


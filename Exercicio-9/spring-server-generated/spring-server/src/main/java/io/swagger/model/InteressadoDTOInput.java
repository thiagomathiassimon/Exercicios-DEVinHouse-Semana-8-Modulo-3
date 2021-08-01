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
 * InteressadoDTOInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-01T19:08:51.378Z")


public class InteressadoDTOInput   {
  @JsonProperty("dtNascimento")
  private String dtNascimento = null;

  @JsonProperty("flAtivo")
  private String flAtivo = null;

  @JsonProperty("nmInteressado")
  private String nmInteressado = null;

  @JsonProperty("nuIdentificacao")
  private String nuIdentificacao = null;

  public InteressadoDTOInput dtNascimento(String dtNascimento) {
    this.dtNascimento = dtNascimento;
    return this;
  }

  /**
   * Get dtNascimento
   * @return dtNascimento
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^(?:(?:31(/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$") 
  public String getDtNascimento() {
    return dtNascimento;
  }

  public void setDtNascimento(String dtNascimento) {
    this.dtNascimento = dtNascimento;
  }

  public InteressadoDTOInput flAtivo(String flAtivo) {
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

  public InteressadoDTOInput nmInteressado(String nmInteressado) {
    this.nmInteressado = nmInteressado;
    return this;
  }

  /**
   * Get nmInteressado
   * @return nmInteressado
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=250) 
  public String getNmInteressado() {
    return nmInteressado;
  }

  public void setNmInteressado(String nmInteressado) {
    this.nmInteressado = nmInteressado;
  }

  public InteressadoDTOInput nuIdentificacao(String nuIdentificacao) {
    this.nuIdentificacao = nuIdentificacao;
    return this;
  }

  /**
   * Get nuIdentificacao
   * @return nuIdentificacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


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
    InteressadoDTOInput interessadoDTOInput = (InteressadoDTOInput) o;
    return Objects.equals(this.dtNascimento, interessadoDTOInput.dtNascimento) &&
        Objects.equals(this.flAtivo, interessadoDTOInput.flAtivo) &&
        Objects.equals(this.nmInteressado, interessadoDTOInput.nmInteressado) &&
        Objects.equals(this.nuIdentificacao, interessadoDTOInput.nuIdentificacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtNascimento, flAtivo, nmInteressado, nuIdentificacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteressadoDTOInput {\n");
    
    sb.append("    dtNascimento: ").append(toIndentedString(dtNascimento)).append("\n");
    sb.append("    flAtivo: ").append(toIndentedString(flAtivo)).append("\n");
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


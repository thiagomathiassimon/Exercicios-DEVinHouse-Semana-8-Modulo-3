/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AssuntoDTOInput;
import io.swagger.model.AssuntoDTOOutput;
import io.swagger.model.InteressadoDTOInput;
import io.swagger.model.InteressadoDTOOutput;
import io.swagger.model.ProcessoDTOInput;
import io.swagger.model.ProcessoDTOOutput;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-01T19:08:51.378Z")

@Validated
@Api(value = "v1", description = "the v1 API")
@RequestMapping(value = "")
public interface V1Api {

    @ApiOperation(value = "create", nickname = "createUsingPOST", notes = "", response = AssuntoDTOOutput.class, tags={ "assunto-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = AssuntoDTOOutput.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/assuntos",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AssuntoDTOOutput> createUsingPOST(@ApiParam(value = "assuntoDTO" ,required=true )  @Valid @RequestBody AssuntoDTOInput assuntoDTO);


    @ApiOperation(value = "create", nickname = "createUsingPOST1", notes = "", response = InteressadoDTOOutput.class, tags={ "interessado-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = InteressadoDTOOutput.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/interessados",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InteressadoDTOOutput> createUsingPOST1(@ApiParam(value = "interessadoDTO" ,required=true )  @Valid @RequestBody InteressadoDTOInput interessadoDTO);


    @ApiOperation(value = "create", nickname = "createUsingPOST2", notes = "", response = ProcessoDTOOutput.class, tags={ "processo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ProcessoDTOOutput.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/processos",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ProcessoDTOOutput> createUsingPOST2(@ApiParam(value = "processoDTO" ,required=true )  @Valid @RequestBody ProcessoDTOInput processoDTO);


    @ApiOperation(value = "delete", nickname = "deleteUsingDELETE", notes = "", tags={ "assunto-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/assuntos/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "delete", nickname = "deleteUsingDELETE1", notes = "", tags={ "interessado-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/interessados/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUsingDELETE1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "delete", nickname = "deleteUsingDELETE2", notes = "", tags={ "processo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/processos/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUsingDELETE2(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "findAll", nickname = "findAllUsingGET", notes = "", response = AssuntoDTOOutput.class, responseContainer = "List", tags={ "assunto-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssuntoDTOOutput.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/assuntos",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<AssuntoDTOOutput>> findAllUsingGET();


    @ApiOperation(value = "findAll", nickname = "findAllUsingGET1", notes = "", response = InteressadoDTOOutput.class, responseContainer = "List", tags={ "interessado-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InteressadoDTOOutput.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/interessados",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<InteressadoDTOOutput>> findAllUsingGET1(@ApiParam(value = "nu_identificacao") @Valid @RequestParam(value = "nu_identificacao", required = false) String nuIdentificacao);


    @ApiOperation(value = "findAll", nickname = "findAllUsingGET2", notes = "", response = ProcessoDTOOutput.class, responseContainer = "List", tags={ "processo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProcessoDTOOutput.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/processos",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ProcessoDTOOutput>> findAllUsingGET2(@ApiParam(value = "cd_assunto_descricao") @Valid @RequestParam(value = "cd_assunto_descricao", required = false) String cdAssuntoDescricao,@ApiParam(value = "chave_processo") @Valid @RequestParam(value = "chave_processo", required = false) String chaveProcesso,@ApiParam(value = "nu_processo") @Valid @RequestParam(value = "nu_processo", required = false) Long nuProcesso);


    @ApiOperation(value = "find", nickname = "findUsingGET", notes = "", response = AssuntoDTOOutput.class, tags={ "assunto-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssuntoDTOOutput.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/assuntos/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AssuntoDTOOutput> findUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "find", nickname = "findUsingGET1", notes = "", response = InteressadoDTOOutput.class, tags={ "interessado-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InteressadoDTOOutput.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/interessados/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InteressadoDTOOutput> findUsingGET1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "find", nickname = "findUsingGET2", notes = "", response = ProcessoDTOOutput.class, tags={ "processo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProcessoDTOOutput.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/processos/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProcessoDTOOutput> findUsingGET2(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "update", nickname = "updateUsingPUT", notes = "", tags={ "assunto-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/assuntos/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUsingPUT(@ApiParam(value = "assuntoDTO" ,required=true )  @Valid @RequestBody AssuntoDTOInput assuntoDTO,@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "update", nickname = "updateUsingPUT1", notes = "", tags={ "interessado-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/interessados/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUsingPUT1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "interessadoDTO" ,required=true )  @Valid @RequestBody InteressadoDTOInput interessadoDTO);


    @ApiOperation(value = "update", nickname = "updateUsingPUT2", notes = "", tags={ "processo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/processos/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUsingPUT2(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "processoDTO" ,required=true )  @Valid @RequestBody ProcessoDTOInput processoDTO);

}
package io.swagger.api;

import io.swagger.model.AssuntoDTOInput;
import io.swagger.model.AssuntoDTOOutput;
import io.swagger.model.InteressadoDTOInput;
import io.swagger.model.InteressadoDTOOutput;
import io.swagger.model.ProcessoDTOInput;
import io.swagger.model.ProcessoDTOOutput;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-01T19:08:51.378Z")

@Controller
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AssuntoDTOOutput> createUsingPOST(@ApiParam(value = "assuntoDTO" ,required=true )  @Valid @RequestBody AssuntoDTOInput assuntoDTO) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AssuntoDTOOutput>(objectMapper.readValue("{\"empty\": false}", AssuntoDTOOutput.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AssuntoDTOOutput>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AssuntoDTOOutput>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InteressadoDTOOutput> createUsingPOST1(@ApiParam(value = "interessadoDTO" ,required=true )  @Valid @RequestBody InteressadoDTOInput interessadoDTO) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InteressadoDTOOutput>(objectMapper.readValue("{\"empty\": false}", InteressadoDTOOutput.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InteressadoDTOOutput>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InteressadoDTOOutput>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProcessoDTOOutput> createUsingPOST2(@ApiParam(value = "processoDTO" ,required=true )  @Valid @RequestBody ProcessoDTOInput processoDTO) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProcessoDTOOutput>(objectMapper.readValue("{\"empty\": false}", ProcessoDTOOutput.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProcessoDTOOutput>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProcessoDTOOutput>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUsingDELETE1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUsingDELETE2(@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<AssuntoDTOOutput>> findAllUsingGET() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AssuntoDTOOutput>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AssuntoDTOOutput>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AssuntoDTOOutput>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<InteressadoDTOOutput>> findAllUsingGET1(@ApiParam(value = "nu_identificacao") @Valid @RequestParam(value = "nu_identificacao", required = false) String nuIdentificacao) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<InteressadoDTOOutput>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InteressadoDTOOutput>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InteressadoDTOOutput>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProcessoDTOOutput>> findAllUsingGET2(@ApiParam(value = "cd_assunto_descricao") @Valid @RequestParam(value = "cd_assunto_descricao", required = false) String cdAssuntoDescricao,@ApiParam(value = "chave_processo") @Valid @RequestParam(value = "chave_processo", required = false) String chaveProcesso,@ApiParam(value = "nu_processo") @Valid @RequestParam(value = "nu_processo", required = false) Long nuProcesso) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProcessoDTOOutput>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProcessoDTOOutput>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProcessoDTOOutput>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AssuntoDTOOutput> findUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AssuntoDTOOutput>(objectMapper.readValue("{\"empty\": false}", AssuntoDTOOutput.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AssuntoDTOOutput>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AssuntoDTOOutput>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InteressadoDTOOutput> findUsingGET1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InteressadoDTOOutput>(objectMapper.readValue("{\"empty\": false}", InteressadoDTOOutput.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InteressadoDTOOutput>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InteressadoDTOOutput>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProcessoDTOOutput> findUsingGET2(@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProcessoDTOOutput>(objectMapper.readValue("{\"empty\": false}", ProcessoDTOOutput.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProcessoDTOOutput>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProcessoDTOOutput>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUsingPUT(@ApiParam(value = "assuntoDTO" ,required=true )  @Valid @RequestBody AssuntoDTOInput assuntoDTO,@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUsingPUT1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "interessadoDTO" ,required=true )  @Valid @RequestBody InteressadoDTOInput interessadoDTO) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUsingPUT2(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "processoDTO" ,required=true )  @Valid @RequestBody ProcessoDTOInput processoDTO) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

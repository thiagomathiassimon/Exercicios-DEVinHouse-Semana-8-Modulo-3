# swagger-java-client

Api Documentation
- API version: 1.0
  - Build date: 2021-08-01T19:08:42.632Z

Api Documentation


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AssuntoControllerApi;

import java.io.File;
import java.util.*;

public class AssuntoControllerApiExample {

    public static void main(String[] args) {
        
        AssuntoControllerApi apiInstance = new AssuntoControllerApi();
        AssuntoDTOInput assuntoDTO = new AssuntoDTOInput(); // AssuntoDTOInput | assuntoDTO
        try {
            AssuntoDTOOutput result = apiInstance.createUsingPOST(assuntoDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssuntoControllerApi#createUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:3001*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssuntoControllerApi* | [**createUsingPOST**](docs/AssuntoControllerApi.md#createUsingPOST) | **POST** /v1/assuntos | create
*AssuntoControllerApi* | [**deleteUsingDELETE**](docs/AssuntoControllerApi.md#deleteUsingDELETE) | **DELETE** /v1/assuntos/{id} | delete
*AssuntoControllerApi* | [**findAllUsingGET**](docs/AssuntoControllerApi.md#findAllUsingGET) | **GET** /v1/assuntos | findAll
*AssuntoControllerApi* | [**findUsingGET**](docs/AssuntoControllerApi.md#findUsingGET) | **GET** /v1/assuntos/{id} | find
*AssuntoControllerApi* | [**updateUsingPUT**](docs/AssuntoControllerApi.md#updateUsingPUT) | **PUT** /v1/assuntos/{id} | update
*InteressadoControllerApi* | [**createUsingPOST1**](docs/InteressadoControllerApi.md#createUsingPOST1) | **POST** /v1/interessados | create
*InteressadoControllerApi* | [**deleteUsingDELETE1**](docs/InteressadoControllerApi.md#deleteUsingDELETE1) | **DELETE** /v1/interessados/{id} | delete
*InteressadoControllerApi* | [**findAllUsingGET1**](docs/InteressadoControllerApi.md#findAllUsingGET1) | **GET** /v1/interessados | findAll
*InteressadoControllerApi* | [**findUsingGET1**](docs/InteressadoControllerApi.md#findUsingGET1) | **GET** /v1/interessados/{id} | find
*InteressadoControllerApi* | [**updateUsingPUT1**](docs/InteressadoControllerApi.md#updateUsingPUT1) | **PUT** /v1/interessados/{id} | update
*ProcessoControllerApi* | [**createUsingPOST2**](docs/ProcessoControllerApi.md#createUsingPOST2) | **POST** /v1/processos | create
*ProcessoControllerApi* | [**deleteUsingDELETE2**](docs/ProcessoControllerApi.md#deleteUsingDELETE2) | **DELETE** /v1/processos/{id} | delete
*ProcessoControllerApi* | [**findAllUsingGET2**](docs/ProcessoControllerApi.md#findAllUsingGET2) | **GET** /v1/processos | findAll
*ProcessoControllerApi* | [**findUsingGET2**](docs/ProcessoControllerApi.md#findUsingGET2) | **GET** /v1/processos/{id} | find
*ProcessoControllerApi* | [**updateUsingPUT2**](docs/ProcessoControllerApi.md#updateUsingPUT2) | **PUT** /v1/processos/{id} | update


## Documentation for Models

 - [Assunto](docs/Assunto.md)
 - [AssuntoDTOInput](docs/AssuntoDTOInput.md)
 - [AssuntoDTOOutput](docs/AssuntoDTOOutput.md)
 - [Interessado](docs/Interessado.md)
 - [InteressadoDTOInput](docs/InteressadoDTOInput.md)
 - [InteressadoDTOOutput](docs/InteressadoDTOOutput.md)
 - [ProcessoDTOInput](docs/ProcessoDTOInput.md)
 - [ProcessoDTOOutput](docs/ProcessoDTOOutput.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




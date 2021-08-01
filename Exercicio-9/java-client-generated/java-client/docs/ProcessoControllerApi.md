# ProcessoControllerApi

All URIs are relative to *https://localhost:3001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST2**](ProcessoControllerApi.md#createUsingPOST2) | **POST** /v1/processos | create
[**deleteUsingDELETE2**](ProcessoControllerApi.md#deleteUsingDELETE2) | **DELETE** /v1/processos/{id} | delete
[**findAllUsingGET2**](ProcessoControllerApi.md#findAllUsingGET2) | **GET** /v1/processos | findAll
[**findUsingGET2**](ProcessoControllerApi.md#findUsingGET2) | **GET** /v1/processos/{id} | find
[**updateUsingPUT2**](ProcessoControllerApi.md#updateUsingPUT2) | **PUT** /v1/processos/{id} | update


<a name="createUsingPOST2"></a>
# **createUsingPOST2**
> ProcessoDTOOutput createUsingPOST2(processoDTO)

create

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessoControllerApi;


ProcessoControllerApi apiInstance = new ProcessoControllerApi();
ProcessoDTOInput processoDTO = new ProcessoDTOInput(); // ProcessoDTOInput | processoDTO
try {
    ProcessoDTOOutput result = apiInstance.createUsingPOST2(processoDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessoControllerApi#createUsingPOST2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processoDTO** | [**ProcessoDTOInput**](ProcessoDTOInput.md)| processoDTO |

### Return type

[**ProcessoDTOOutput**](ProcessoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUsingDELETE2"></a>
# **deleteUsingDELETE2**
> deleteUsingDELETE2(id)

delete

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessoControllerApi;


ProcessoControllerApi apiInstance = new ProcessoControllerApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteUsingDELETE2(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessoControllerApi#deleteUsingDELETE2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findAllUsingGET2"></a>
# **findAllUsingGET2**
> List&lt;ProcessoDTOOutput&gt; findAllUsingGET2(cdAssuntoDescricao, chaveProcesso, nuProcesso)

findAll

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessoControllerApi;


ProcessoControllerApi apiInstance = new ProcessoControllerApi();
String cdAssuntoDescricao = "cdAssuntoDescricao_example"; // String | cd_assunto_descricao
String chaveProcesso = "chaveProcesso_example"; // String | chave_processo
Long nuProcesso = 789L; // Long | nu_processo
try {
    List<ProcessoDTOOutput> result = apiInstance.findAllUsingGET2(cdAssuntoDescricao, chaveProcesso, nuProcesso);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessoControllerApi#findAllUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cdAssuntoDescricao** | **String**| cd_assunto_descricao | [optional]
 **chaveProcesso** | **String**| chave_processo | [optional]
 **nuProcesso** | **Long**| nu_processo | [optional]

### Return type

[**List&lt;ProcessoDTOOutput&gt;**](ProcessoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findUsingGET2"></a>
# **findUsingGET2**
> ProcessoDTOOutput findUsingGET2(id)

find

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessoControllerApi;


ProcessoControllerApi apiInstance = new ProcessoControllerApi();
Long id = 789L; // Long | id
try {
    ProcessoDTOOutput result = apiInstance.findUsingGET2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessoControllerApi#findUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**ProcessoDTOOutput**](ProcessoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUsingPUT2"></a>
# **updateUsingPUT2**
> updateUsingPUT2(id, processoDTO)

update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessoControllerApi;


ProcessoControllerApi apiInstance = new ProcessoControllerApi();
Long id = 789L; // Long | id
ProcessoDTOInput processoDTO = new ProcessoDTOInput(); // ProcessoDTOInput | processoDTO
try {
    apiInstance.updateUsingPUT2(id, processoDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessoControllerApi#updateUsingPUT2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **processoDTO** | [**ProcessoDTOInput**](ProcessoDTOInput.md)| processoDTO |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


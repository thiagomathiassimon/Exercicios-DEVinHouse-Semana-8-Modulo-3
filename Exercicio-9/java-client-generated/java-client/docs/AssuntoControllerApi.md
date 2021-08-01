# AssuntoControllerApi

All URIs are relative to *https://localhost:3001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST**](AssuntoControllerApi.md#createUsingPOST) | **POST** /v1/assuntos | create
[**deleteUsingDELETE**](AssuntoControllerApi.md#deleteUsingDELETE) | **DELETE** /v1/assuntos/{id} | delete
[**findAllUsingGET**](AssuntoControllerApi.md#findAllUsingGET) | **GET** /v1/assuntos | findAll
[**findUsingGET**](AssuntoControllerApi.md#findUsingGET) | **GET** /v1/assuntos/{id} | find
[**updateUsingPUT**](AssuntoControllerApi.md#updateUsingPUT) | **PUT** /v1/assuntos/{id} | update


<a name="createUsingPOST"></a>
# **createUsingPOST**
> AssuntoDTOOutput createUsingPOST(assuntoDTO)

create

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssuntoControllerApi;


AssuntoControllerApi apiInstance = new AssuntoControllerApi();
AssuntoDTOInput assuntoDTO = new AssuntoDTOInput(); // AssuntoDTOInput | assuntoDTO
try {
    AssuntoDTOOutput result = apiInstance.createUsingPOST(assuntoDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssuntoControllerApi#createUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assuntoDTO** | [**AssuntoDTOInput**](AssuntoDTOInput.md)| assuntoDTO |

### Return type

[**AssuntoDTOOutput**](AssuntoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> deleteUsingDELETE(id)

delete

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssuntoControllerApi;


AssuntoControllerApi apiInstance = new AssuntoControllerApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AssuntoControllerApi#deleteUsingDELETE");
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

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> List&lt;AssuntoDTOOutput&gt; findAllUsingGET()

findAll

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssuntoControllerApi;


AssuntoControllerApi apiInstance = new AssuntoControllerApi();
try {
    List<AssuntoDTOOutput> result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssuntoControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AssuntoDTOOutput&gt;**](AssuntoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findUsingGET"></a>
# **findUsingGET**
> AssuntoDTOOutput findUsingGET(id)

find

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssuntoControllerApi;


AssuntoControllerApi apiInstance = new AssuntoControllerApi();
Long id = 789L; // Long | id
try {
    AssuntoDTOOutput result = apiInstance.findUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssuntoControllerApi#findUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**AssuntoDTOOutput**](AssuntoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> updateUsingPUT(assuntoDTO, id)

update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssuntoControllerApi;


AssuntoControllerApi apiInstance = new AssuntoControllerApi();
AssuntoDTOInput assuntoDTO = new AssuntoDTOInput(); // AssuntoDTOInput | assuntoDTO
Long id = 789L; // Long | id
try {
    apiInstance.updateUsingPUT(assuntoDTO, id);
} catch (ApiException e) {
    System.err.println("Exception when calling AssuntoControllerApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assuntoDTO** | [**AssuntoDTOInput**](AssuntoDTOInput.md)| assuntoDTO |
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


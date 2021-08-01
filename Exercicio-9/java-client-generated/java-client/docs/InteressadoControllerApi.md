# InteressadoControllerApi

All URIs are relative to *https://localhost:3001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST1**](InteressadoControllerApi.md#createUsingPOST1) | **POST** /v1/interessados | create
[**deleteUsingDELETE1**](InteressadoControllerApi.md#deleteUsingDELETE1) | **DELETE** /v1/interessados/{id} | delete
[**findAllUsingGET1**](InteressadoControllerApi.md#findAllUsingGET1) | **GET** /v1/interessados | findAll
[**findUsingGET1**](InteressadoControllerApi.md#findUsingGET1) | **GET** /v1/interessados/{id} | find
[**updateUsingPUT1**](InteressadoControllerApi.md#updateUsingPUT1) | **PUT** /v1/interessados/{id} | update


<a name="createUsingPOST1"></a>
# **createUsingPOST1**
> InteressadoDTOOutput createUsingPOST1(interessadoDTO)

create

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteressadoControllerApi;


InteressadoControllerApi apiInstance = new InteressadoControllerApi();
InteressadoDTOInput interessadoDTO = new InteressadoDTOInput(); // InteressadoDTOInput | interessadoDTO
try {
    InteressadoDTOOutput result = apiInstance.createUsingPOST1(interessadoDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteressadoControllerApi#createUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interessadoDTO** | [**InteressadoDTOInput**](InteressadoDTOInput.md)| interessadoDTO |

### Return type

[**InteressadoDTOOutput**](InteressadoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> deleteUsingDELETE1(id)

delete

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteressadoControllerApi;


InteressadoControllerApi apiInstance = new InteressadoControllerApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteUsingDELETE1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InteressadoControllerApi#deleteUsingDELETE1");
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

<a name="findAllUsingGET1"></a>
# **findAllUsingGET1**
> List&lt;InteressadoDTOOutput&gt; findAllUsingGET1(nuIdentificacao)

findAll

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteressadoControllerApi;


InteressadoControllerApi apiInstance = new InteressadoControllerApi();
String nuIdentificacao = "nuIdentificacao_example"; // String | nu_identificacao
try {
    List<InteressadoDTOOutput> result = apiInstance.findAllUsingGET1(nuIdentificacao);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteressadoControllerApi#findAllUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nuIdentificacao** | **String**| nu_identificacao | [optional]

### Return type

[**List&lt;InteressadoDTOOutput&gt;**](InteressadoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findUsingGET1"></a>
# **findUsingGET1**
> InteressadoDTOOutput findUsingGET1(id)

find

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteressadoControllerApi;


InteressadoControllerApi apiInstance = new InteressadoControllerApi();
Long id = 789L; // Long | id
try {
    InteressadoDTOOutput result = apiInstance.findUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteressadoControllerApi#findUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**InteressadoDTOOutput**](InteressadoDTOOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUsingPUT1"></a>
# **updateUsingPUT1**
> updateUsingPUT1(id, interessadoDTO)

update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteressadoControllerApi;


InteressadoControllerApi apiInstance = new InteressadoControllerApi();
Long id = 789L; // Long | id
InteressadoDTOInput interessadoDTO = new InteressadoDTOInput(); // InteressadoDTOInput | interessadoDTO
try {
    apiInstance.updateUsingPUT1(id, interessadoDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling InteressadoControllerApi#updateUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **interessadoDTO** | [**InteressadoDTOInput**](InteressadoDTOInput.md)| interessadoDTO |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


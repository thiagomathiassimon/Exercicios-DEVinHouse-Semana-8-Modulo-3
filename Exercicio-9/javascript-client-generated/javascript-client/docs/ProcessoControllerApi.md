# ApiDocumentation.ProcessoControllerApi

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.ProcessoControllerApi();

var processoDTO = new ApiDocumentation.ProcessoDTOInput(); // ProcessoDTOInput | processoDTO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createUsingPOST2(processoDTO, callback);
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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.ProcessoControllerApi();

var id = 789; // Number | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteUsingDELETE2(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**| id | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findAllUsingGET2"></a>
# **findAllUsingGET2**
> [ProcessoDTOOutput] findAllUsingGET2(opts)

findAll

### Example
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.ProcessoControllerApi();

var opts = { 
  'cdAssuntoDescricao': "cdAssuntoDescricao_example", // String | cd_assunto_descricao
  'chaveProcesso': "chaveProcesso_example", // String | chave_processo
  'nuProcesso': 789 // Number | nu_processo
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findAllUsingGET2(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cdAssuntoDescricao** | **String**| cd_assunto_descricao | [optional] 
 **chaveProcesso** | **String**| chave_processo | [optional] 
 **nuProcesso** | **Number**| nu_processo | [optional] 

### Return type

[**[ProcessoDTOOutput]**](ProcessoDTOOutput.md)

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.ProcessoControllerApi();

var id = 789; // Number | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findUsingGET2(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**| id | 

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.ProcessoControllerApi();

var id = 789; // Number | id

var processoDTO = new ApiDocumentation.ProcessoDTOInput(); // ProcessoDTOInput | processoDTO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateUsingPUT2(id, processoDTO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**| id | 
 **processoDTO** | [**ProcessoDTOInput**](ProcessoDTOInput.md)| processoDTO | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


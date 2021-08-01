# ApiDocumentation.InteressadoControllerApi

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.InteressadoControllerApi();

var interessadoDTO = new ApiDocumentation.InteressadoDTOInput(); // InteressadoDTOInput | interessadoDTO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createUsingPOST1(interessadoDTO, callback);
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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.InteressadoControllerApi();

var id = 789; // Number | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteUsingDELETE1(id, callback);
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

<a name="findAllUsingGET1"></a>
# **findAllUsingGET1**
> [InteressadoDTOOutput] findAllUsingGET1(opts)

findAll

### Example
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.InteressadoControllerApi();

var opts = { 
  'nuIdentificacao': "nuIdentificacao_example" // String | nu_identificacao
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findAllUsingGET1(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nuIdentificacao** | **String**| nu_identificacao | [optional] 

### Return type

[**[InteressadoDTOOutput]**](InteressadoDTOOutput.md)

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.InteressadoControllerApi();

var id = 789; // Number | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findUsingGET1(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**| id | 

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.InteressadoControllerApi();

var id = 789; // Number | id

var interessadoDTO = new ApiDocumentation.InteressadoDTOInput(); // InteressadoDTOInput | interessadoDTO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateUsingPUT1(id, interessadoDTO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**| id | 
 **interessadoDTO** | [**InteressadoDTOInput**](InteressadoDTOInput.md)| interessadoDTO | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


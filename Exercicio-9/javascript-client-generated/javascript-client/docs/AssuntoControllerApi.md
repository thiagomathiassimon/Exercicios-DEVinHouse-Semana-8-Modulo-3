# ApiDocumentation.AssuntoControllerApi

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.AssuntoControllerApi();

var assuntoDTO = new ApiDocumentation.AssuntoDTOInput(); // AssuntoDTOInput | assuntoDTO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createUsingPOST(assuntoDTO, callback);
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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.AssuntoControllerApi();

var id = 789; // Number | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteUsingDELETE(id, callback);
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

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> [AssuntoDTOOutput] findAllUsingGET()

findAll

### Example
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.AssuntoControllerApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findAllUsingGET(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[AssuntoDTOOutput]**](AssuntoDTOOutput.md)

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.AssuntoControllerApi();

var id = 789; // Number | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findUsingGET(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**| id | 

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
```javascript
var ApiDocumentation = require('api_documentation');

var apiInstance = new ApiDocumentation.AssuntoControllerApi();

var assuntoDTO = new ApiDocumentation.AssuntoDTOInput(); // AssuntoDTOInput | assuntoDTO

var id = 789; // Number | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateUsingPUT(assuntoDTO, id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assuntoDTO** | [**AssuntoDTOInput**](AssuntoDTOInput.md)| assuntoDTO | 
 **id** | **Number**| id | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


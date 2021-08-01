/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.21
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/InteressadoDTOInput', 'model/InteressadoDTOOutput'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/InteressadoDTOInput'), require('../model/InteressadoDTOOutput'));
  } else {
    // Browser globals (root is window)
    if (!root.ApiDocumentation) {
      root.ApiDocumentation = {};
    }
    root.ApiDocumentation.InteressadoControllerApi = factory(root.ApiDocumentation.ApiClient, root.ApiDocumentation.InteressadoDTOInput, root.ApiDocumentation.InteressadoDTOOutput);
  }
}(this, function(ApiClient, InteressadoDTOInput, InteressadoDTOOutput) {
  'use strict';

  /**
   * InteressadoController service.
   * @module api/InteressadoControllerApi
   * @version 1.0
   */

  /**
   * Constructs a new InteressadoControllerApi. 
   * @alias module:api/InteressadoControllerApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createUsingPOST1 operation.
     * @callback module:api/InteressadoControllerApi~createUsingPOST1Callback
     * @param {String} error Error message, if any.
     * @param {module:model/InteressadoDTOOutput} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * create
     * @param {module:model/InteressadoDTOInput} interessadoDTO interessadoDTO
     * @param {module:api/InteressadoControllerApi~createUsingPOST1Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InteressadoDTOOutput}
     */
    this.createUsingPOST1 = function(interessadoDTO, callback) {
      var postBody = interessadoDTO;

      // verify the required parameter 'interessadoDTO' is set
      if (interessadoDTO === undefined || interessadoDTO === null) {
        throw new Error("Missing the required parameter 'interessadoDTO' when calling createUsingPOST1");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = InteressadoDTOOutput;

      return this.apiClient.callApi(
        '/v1/interessados', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteUsingDELETE1 operation.
     * @callback module:api/InteressadoControllerApi~deleteUsingDELETE1Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * delete
     * @param {Number} id id
     * @param {module:api/InteressadoControllerApi~deleteUsingDELETE1Callback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteUsingDELETE1 = function(id, callback) {
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling deleteUsingDELETE1");
      }


      var pathParams = {
        'id': id
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/v1/interessados/{id}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the findAllUsingGET1 operation.
     * @callback module:api/InteressadoControllerApi~findAllUsingGET1Callback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/InteressadoDTOOutput>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * findAll
     * @param {Object} opts Optional parameters
     * @param {String} opts.nuIdentificacao nu_identificacao
     * @param {module:api/InteressadoControllerApi~findAllUsingGET1Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/InteressadoDTOOutput>}
     */
    this.findAllUsingGET1 = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'nu_identificacao': opts['nuIdentificacao'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [InteressadoDTOOutput];

      return this.apiClient.callApi(
        '/v1/interessados', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the findUsingGET1 operation.
     * @callback module:api/InteressadoControllerApi~findUsingGET1Callback
     * @param {String} error Error message, if any.
     * @param {module:model/InteressadoDTOOutput} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * find
     * @param {Number} id id
     * @param {module:api/InteressadoControllerApi~findUsingGET1Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InteressadoDTOOutput}
     */
    this.findUsingGET1 = function(id, callback) {
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling findUsingGET1");
      }


      var pathParams = {
        'id': id
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = InteressadoDTOOutput;

      return this.apiClient.callApi(
        '/v1/interessados/{id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateUsingPUT1 operation.
     * @callback module:api/InteressadoControllerApi~updateUsingPUT1Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * update
     * @param {Number} id id
     * @param {module:model/InteressadoDTOInput} interessadoDTO interessadoDTO
     * @param {module:api/InteressadoControllerApi~updateUsingPUT1Callback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateUsingPUT1 = function(id, interessadoDTO, callback) {
      var postBody = interessadoDTO;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling updateUsingPUT1");
      }

      // verify the required parameter 'interessadoDTO' is set
      if (interessadoDTO === undefined || interessadoDTO === null) {
        throw new Error("Missing the required parameter 'interessadoDTO' when calling updateUsingPUT1");
      }


      var pathParams = {
        'id': id
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/v1/interessados/{id}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));

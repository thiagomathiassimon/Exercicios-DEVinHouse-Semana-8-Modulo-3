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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.ApiDocumentation) {
      root.ApiDocumentation = {};
    }
    root.ApiDocumentation.AssuntoDTOOutput = factory(root.ApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The AssuntoDTOOutput model module.
   * @module model/AssuntoDTOOutput
   * @version 1.0
   */

  /**
   * Constructs a new <code>AssuntoDTOOutput</code>.
   * @alias module:model/AssuntoDTOOutput
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>AssuntoDTOOutput</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AssuntoDTOOutput} obj Optional instance to populate.
   * @return {module:model/AssuntoDTOOutput} The populated <code>AssuntoDTOOutput</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('descricao'))
        obj.descricao = ApiClient.convertToType(data['descricao'], 'String');
      if (data.hasOwnProperty('dtCadastro'))
        obj.dtCadastro = ApiClient.convertToType(data['dtCadastro'], 'Date');
      if (data.hasOwnProperty('flAtivo'))
        obj.flAtivo = ApiClient.convertToType(data['flAtivo'], 'String');
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
    }
    return obj;
  }

  /**
   * @member {String} descricao
   */
  exports.prototype.descricao = undefined;

  /**
   * @member {Date} dtCadastro
   */
  exports.prototype.dtCadastro = undefined;

  /**
   * @member {String} flAtivo
   */
  exports.prototype.flAtivo = undefined;

  /**
   * @member {Number} id
   */
  exports.prototype.id = undefined;


  return exports;

}));

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
    define(['ApiClient', 'model/Assunto', 'model/Interessado'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Assunto'), require('./Interessado'));
  } else {
    // Browser globals (root is window)
    if (!root.ApiDocumentation) {
      root.ApiDocumentation = {};
    }
    root.ApiDocumentation.ProcessoDTOOutput = factory(root.ApiDocumentation.ApiClient, root.ApiDocumentation.Assunto, root.ApiDocumentation.Interessado);
  }
}(this, function(ApiClient, Assunto, Interessado) {
  'use strict';

  /**
   * The ProcessoDTOOutput model module.
   * @module model/ProcessoDTOOutput
   * @version 1.0
   */

  /**
   * Constructs a new <code>ProcessoDTOOutput</code>.
   * @alias module:model/ProcessoDTOOutput
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>ProcessoDTOOutput</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProcessoDTOOutput} obj Optional instance to populate.
   * @return {module:model/ProcessoDTOOutput} The populated <code>ProcessoDTOOutput</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('cdAssunto'))
        obj.cdAssunto = Assunto.constructFromObject(data['cdAssunto']);
      if (data.hasOwnProperty('cdInteressado'))
        obj.cdInteressado = Interessado.constructFromObject(data['cdInteressado']);
      if (data.hasOwnProperty('chaveProcesso'))
        obj.chaveProcesso = ApiClient.convertToType(data['chaveProcesso'], 'String');
      if (data.hasOwnProperty('descricao'))
        obj.descricao = ApiClient.convertToType(data['descricao'], 'String');
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('nuAno'))
        obj.nuAno = ApiClient.convertToType(data['nuAno'], 'String');
      if (data.hasOwnProperty('nuProcesso'))
        obj.nuProcesso = ApiClient.convertToType(data['nuProcesso'], 'Number');
      if (data.hasOwnProperty('sgOrgaoSetor'))
        obj.sgOrgaoSetor = ApiClient.convertToType(data['sgOrgaoSetor'], 'String');
    }
    return obj;
  }

  /**
   * @member {module:model/Assunto} cdAssunto
   */
  exports.prototype.cdAssunto = undefined;

  /**
   * @member {module:model/Interessado} cdInteressado
   */
  exports.prototype.cdInteressado = undefined;

  /**
   * @member {String} chaveProcesso
   */
  exports.prototype.chaveProcesso = undefined;

  /**
   * @member {String} descricao
   */
  exports.prototype.descricao = undefined;

  /**
   * @member {Number} id
   */
  exports.prototype.id = undefined;

  /**
   * @member {String} nuAno
   */
  exports.prototype.nuAno = undefined;

  /**
   * @member {Number} nuProcesso
   */
  exports.prototype.nuProcesso = undefined;

  /**
   * @member {String} sgOrgaoSetor
   */
  exports.prototype.sgOrgaoSetor = undefined;


  return exports;

}));

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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ApiDocumentation);
  }
}(this, function(expect, ApiDocumentation) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('InteressadoDTOOutput', function() {
      beforeEach(function() {
        instance = new ApiDocumentation.InteressadoDTOOutput();
      });

      it('should create an instance of InteressadoDTOOutput', function() {
        // TODO: update the code to test InteressadoDTOOutput
        expect(instance).to.be.a(ApiDocumentation.InteressadoDTOOutput);
      });

      it('should have the property dtNascimento (base name: "dtNascimento")', function() {
        // TODO: update the code to test the property dtNascimento
        expect(instance).to.have.property('dtNascimento');
        // expect(instance.dtNascimento).to.be(expectedValueLiteral);
      });

      it('should have the property flAtivo (base name: "flAtivo")', function() {
        // TODO: update the code to test the property flAtivo
        expect(instance).to.have.property('flAtivo');
        // expect(instance.flAtivo).to.be(expectedValueLiteral);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property nmInteressado (base name: "nmInteressado")', function() {
        // TODO: update the code to test the property nmInteressado
        expect(instance).to.have.property('nmInteressado');
        // expect(instance.nmInteressado).to.be(expectedValueLiteral);
      });

      it('should have the property nuIdentificacao (base name: "nuIdentificacao")', function() {
        // TODO: update the code to test the property nuIdentificacao
        expect(instance).to.have.property('nuIdentificacao');
        // expect(instance.nuIdentificacao).to.be(expectedValueLiteral);
      });

    });
  });

}));

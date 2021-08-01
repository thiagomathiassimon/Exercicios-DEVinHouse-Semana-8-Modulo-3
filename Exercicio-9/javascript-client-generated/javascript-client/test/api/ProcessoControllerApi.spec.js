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

  beforeEach(function() {
    instance = new ApiDocumentation.ProcessoControllerApi();
  });

  describe('(package)', function() {
    describe('ProcessoControllerApi', function() {
      describe('createUsingPOST2', function() {
        it('should call createUsingPOST2 successfully', function(done) {
          // TODO: uncomment, update parameter values for createUsingPOST2 call and complete the assertions
          /*
          var processoDTO = new ApiDocumentation.ProcessoDTOInput();
          processoDTO.cdAssuntoId = "0";
          processoDTO.cdInteressadoId = "0";
          processoDTO.descricao = "";
          processoDTO.nuAno = "";
          processoDTO.sgOrgaoSetor = "";

          instance.createUsingPOST2(processoDTO, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(ApiDocumentation.ProcessoDTOOutput);
            expect(data.cdAssunto).to.be.a(ApiDocumentation.Assunto);
                  expect(data.cdAssunto.descricao).to.be.a('string');
              expect(data.cdAssunto.descricao).to.be("");
              expect(data.cdAssunto.dtCadastro).to.be.a(Date);
              expect(data.cdAssunto.dtCadastro).to.be(new Date());
              expect(data.cdAssunto.flAtivo).to.be.a('string');
              expect(data.cdAssunto.flAtivo).to.be("");
              expect(data.cdAssunto.id).to.be.a('number');
              expect(data.cdAssunto.id).to.be("0");
            expect(data.cdInteressado).to.be.a(ApiDocumentation.Interessado);
                  expect(data.cdInteressado.dtNascimento).to.be.a(Date);
              expect(data.cdInteressado.dtNascimento).to.be(new Date());
              expect(data.cdInteressado.flAtivo).to.be.a('string');
              expect(data.cdInteressado.flAtivo).to.be("");
              expect(data.cdInteressado.id).to.be.a('number');
              expect(data.cdInteressado.id).to.be("0");
              expect(data.cdInteressado.nmInteressado).to.be.a('string');
              expect(data.cdInteressado.nmInteressado).to.be("");
              expect(data.cdInteressado.nuIdentificacao).to.be.a('string');
              expect(data.cdInteressado.nuIdentificacao).to.be("");
            expect(data.chaveProcesso).to.be.a('string');
            expect(data.chaveProcesso).to.be("");
            expect(data.descricao).to.be.a('string');
            expect(data.descricao).to.be("");
            expect(data.id).to.be.a('number');
            expect(data.id).to.be("0");
            expect(data.nuAno).to.be.a('string');
            expect(data.nuAno).to.be("");
            expect(data.nuProcesso).to.be.a('number');
            expect(data.nuProcesso).to.be("0");
            expect(data.sgOrgaoSetor).to.be.a('string');
            expect(data.sgOrgaoSetor).to.be("");

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('deleteUsingDELETE2', function() {
        it('should call deleteUsingDELETE2 successfully', function(done) {
          // TODO: uncomment, update parameter values for deleteUsingDELETE2 call
          /*
          var id = 789;

          instance.deleteUsingDELETE2(id, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('findAllUsingGET2', function() {
        it('should call findAllUsingGET2 successfully', function(done) {
          // TODO: uncomment, update parameter values for findAllUsingGET2 call and complete the assertions
          /*
          var opts = {};
          opts.cdAssuntoDescricao = "cdAssuntoDescricao_example";
          opts.chaveProcesso = "chaveProcesso_example";
          opts.nuProcesso = 789;

          instance.findAllUsingGET2(opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(ApiDocumentation.ProcessoDTOOutput);
              expect(data.cdAssunto).to.be.a(ApiDocumentation.Assunto);
                    expect(data.cdAssunto.descricao).to.be.a('string');
                expect(data.cdAssunto.descricao).to.be("");
                expect(data.cdAssunto.dtCadastro).to.be.a(Date);
                expect(data.cdAssunto.dtCadastro).to.be(new Date());
                expect(data.cdAssunto.flAtivo).to.be.a('string');
                expect(data.cdAssunto.flAtivo).to.be("");
                expect(data.cdAssunto.id).to.be.a('number');
                expect(data.cdAssunto.id).to.be("0");
              expect(data.cdInteressado).to.be.a(ApiDocumentation.Interessado);
                    expect(data.cdInteressado.dtNascimento).to.be.a(Date);
                expect(data.cdInteressado.dtNascimento).to.be(new Date());
                expect(data.cdInteressado.flAtivo).to.be.a('string');
                expect(data.cdInteressado.flAtivo).to.be("");
                expect(data.cdInteressado.id).to.be.a('number');
                expect(data.cdInteressado.id).to.be("0");
                expect(data.cdInteressado.nmInteressado).to.be.a('string');
                expect(data.cdInteressado.nmInteressado).to.be("");
                expect(data.cdInteressado.nuIdentificacao).to.be.a('string');
                expect(data.cdInteressado.nuIdentificacao).to.be("");
              expect(data.chaveProcesso).to.be.a('string');
              expect(data.chaveProcesso).to.be("");
              expect(data.descricao).to.be.a('string');
              expect(data.descricao).to.be("");
              expect(data.id).to.be.a('number');
              expect(data.id).to.be("0");
              expect(data.nuAno).to.be.a('string');
              expect(data.nuAno).to.be("");
              expect(data.nuProcesso).to.be.a('number');
              expect(data.nuProcesso).to.be("0");
              expect(data.sgOrgaoSetor).to.be.a('string');
              expect(data.sgOrgaoSetor).to.be("");
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('findUsingGET2', function() {
        it('should call findUsingGET2 successfully', function(done) {
          // TODO: uncomment, update parameter values for findUsingGET2 call and complete the assertions
          /*
          var id = 789;

          instance.findUsingGET2(id, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(ApiDocumentation.ProcessoDTOOutput);
            expect(data.cdAssunto).to.be.a(ApiDocumentation.Assunto);
                  expect(data.cdAssunto.descricao).to.be.a('string');
              expect(data.cdAssunto.descricao).to.be("");
              expect(data.cdAssunto.dtCadastro).to.be.a(Date);
              expect(data.cdAssunto.dtCadastro).to.be(new Date());
              expect(data.cdAssunto.flAtivo).to.be.a('string');
              expect(data.cdAssunto.flAtivo).to.be("");
              expect(data.cdAssunto.id).to.be.a('number');
              expect(data.cdAssunto.id).to.be("0");
            expect(data.cdInteressado).to.be.a(ApiDocumentation.Interessado);
                  expect(data.cdInteressado.dtNascimento).to.be.a(Date);
              expect(data.cdInteressado.dtNascimento).to.be(new Date());
              expect(data.cdInteressado.flAtivo).to.be.a('string');
              expect(data.cdInteressado.flAtivo).to.be("");
              expect(data.cdInteressado.id).to.be.a('number');
              expect(data.cdInteressado.id).to.be("0");
              expect(data.cdInteressado.nmInteressado).to.be.a('string');
              expect(data.cdInteressado.nmInteressado).to.be("");
              expect(data.cdInteressado.nuIdentificacao).to.be.a('string');
              expect(data.cdInteressado.nuIdentificacao).to.be("");
            expect(data.chaveProcesso).to.be.a('string');
            expect(data.chaveProcesso).to.be("");
            expect(data.descricao).to.be.a('string');
            expect(data.descricao).to.be("");
            expect(data.id).to.be.a('number');
            expect(data.id).to.be("0");
            expect(data.nuAno).to.be.a('string');
            expect(data.nuAno).to.be("");
            expect(data.nuProcesso).to.be.a('number');
            expect(data.nuProcesso).to.be("0");
            expect(data.sgOrgaoSetor).to.be.a('string');
            expect(data.sgOrgaoSetor).to.be("");

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('updateUsingPUT2', function() {
        it('should call updateUsingPUT2 successfully', function(done) {
          // TODO: uncomment, update parameter values for updateUsingPUT2 call
          /*
          var id = 789;
          var processoDTO = new ApiDocumentation.ProcessoDTOInput();
          processoDTO.cdAssuntoId = "0";
          processoDTO.cdInteressadoId = "0";
          processoDTO.descricao = "";
          processoDTO.nuAno = "";
          processoDTO.sgOrgaoSetor = "";

          instance.updateUsingPUT2(id, processoDTO, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));

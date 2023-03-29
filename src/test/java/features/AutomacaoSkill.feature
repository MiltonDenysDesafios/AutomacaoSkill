#Author: Milton Denys

@inm_test
Feature: Validar pagina de aulas Skill

  Scenario: Validar se é possivel cadastrar um aluno no site da skill

    Given que preencho os campos de cadastro nome "Milton", email "mdteste@gmail.com", telefone "11949852544", endereco "", estado "SÃO PAULO", cidade "SÃO PAULO"
    When clico no botao EU QUERO
    Then aluno deve ser cadastrado com sucesso
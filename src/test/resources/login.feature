# language: pt
Funcionalidade: Acessar SARE gestão e regulação

  @abrirSare
  Scenario: Acessar o sistema e validar logo
    Dado que acesso SARE gestão e regulação
    Quando clico em Minhas Aplicações
    Então valido que a logo do SARE é exibida

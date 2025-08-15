# language: pt
Funcionalidade: Acessar SARE gestão e regulação

  @abrirSare
  Cenário: Validar logo do sistema
    Dado que acesso SARE gestão e regulação
    Quando clico em Minhas Aplicações
    Então valido que o logo da SARE está visível

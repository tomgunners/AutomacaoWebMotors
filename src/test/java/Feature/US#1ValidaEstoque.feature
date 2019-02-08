Feature: Validando o Estoque
  Como usuário
  Quero a listagem de estoque
  De uma determinada loja
  
  Scenario: Valida Estoque
    Given que esteja na tela de resultado
    When eu clicar no botao PARTICULAR
    Then deve me mostrar a quantidade em estoque

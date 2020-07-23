#language:pt
Funcionalidade: Pesquisa de produtos
  Eu como cliente 
  quero pesquisar um produto ou categoria
  para efetuar uma compra

  @Pesquisa
  Esquema do Cenario: Pesquisar uma categoria
    Dado que estou na tela inicial do site
    Quando pesquiso por uma "<categoria>" na barra de pesquisa
    Entao e exibido uma pagina contendo os produtos da "<categoria>" pesquisada

    Exemplos: 
      | categoria |
      | bolsa     |

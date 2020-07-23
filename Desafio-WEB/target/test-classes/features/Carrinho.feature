#language:pt
Funcionalidade: Carrinho

  Contexto: Usuario pesquisou por um produto
    Dado que estou na tela de resultado de pesquisa

  @Carrinho
  Cenario: adicionar produto pesquisado no carrinho
    Dado clico em um produto na tela de resultado de pesquisa
    Quando clico em no botao comprar
    Entao sou levado para a tela do meu carrinho contendo o produto previamente selecionado

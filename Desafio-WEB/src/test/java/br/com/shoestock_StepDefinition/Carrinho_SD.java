package br.com.shoestock_StepDefinition;

import static org.junit.Assert.assertTrue;

import org.junit.runner.JUnitCore;

import br.com.shoestock_PageObject.Carrinho_PO;
import br.com.shoestock_PageObject.DetalhesDoProduto_PO;
import br.com.shoestock_PageObject.Pesquisa_PO;
import br.com.shoestock_PageObject.ResultadoDaPesquisa_PO;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Carrinho_SD extends base_SD {
	private Pesquisa_PO pesquisaPO;
	private Carrinho_PO carrinhoPO;
	private DetalhesDoProduto_PO detalhesDoProduto;
	private String codigoDoProduto;
	private String precoDoProduto;
	private String descricaoDoProduto;
	private ResultadoDaPesquisa_PO resultadoDaPesquisa;

	public Carrinho_SD() {
		driver = carregarDriver();

		carrinhoPO = new Carrinho_PO(driver);
		detalhesDoProduto = new DetalhesDoProduto_PO(driver);
		resultadoDaPesquisa = new ResultadoDaPesquisa_PO(driver);
		pesquisaPO = new Pesquisa_PO(driver);
	}

	@Dado("que estou na tela de resultado de pesquisa")
	public void que_estou_na_tela_de_resultado_de_pesquisa() {

	pesquisaPO.pesquisarNaBarra("bolsa");
		
	}

	@Dado("clico em um produto na tela de resultado de pesquisa")
	public void clico_em_um_produto_na_tela_de_resultado_de_pesquisa() {

		resultadoDaPesquisa.selecionarProdutoAleatorio();
	}

	@Quando("clico em no botao comprar")
	public void clico_em_no_botao_comprar() {

		detalhesDoProduto.clicarEmComprar();
	}

	@Entao("sou levado para a tela do meu carrinho contendo o produto previamente selecionado")
	public void sou_levado_para_a_tela_do_meu_carrinho_contendo_o_produto_previamente_selecionado() {

		codigoDoProduto = detalhesDoProduto.getCodigo();
		descricaoDoProduto = detalhesDoProduto.getDescricao();
		precoDoProduto = detalhesDoProduto.getPreco();
		
		assertTrue(carrinhoPO.codigoDoProduto().contains(codigoDoProduto));
		assertTrue(carrinhoPO.precoDoProduto().contains(precoDoProduto));
		assertTrue(carrinhoPO.descricaoDoProduto().contains(descricaoDoProduto));
	}
}

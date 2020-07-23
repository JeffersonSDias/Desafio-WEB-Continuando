package br.com.shoestock_StepDefinition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.runner.JUnitCore;

import br.com.shoestock_PageObject.Carrinho_PO;
import br.com.shoestock_PageObject.Conferencia_PO;
import br.com.shoestock_PageObject.DetalhesDoProduto_PO;
import br.com.shoestock_PageObject.Login_PO;
import br.com.shoestock_RunTest.Carrinho_RunTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Conferencia_SD extends base_SD {

	private JUnitCore jUnitCore;
	private Carrinho_PO carrinhoPO;
	private Login_PO loginPO;
	private Conferencia_PO conferenciaPO;
	private DetalhesDoProduto_PO detalhesDoProdutoPO;

	public Conferencia_SD() {
		driver = carregarDriver();
		jUnitCore = new JUnitCore();
		carrinhoPO = new Carrinho_PO(driver);
		loginPO = new Login_PO(driver);
		conferenciaPO = new Conferencia_PO(driver);
		detalhesDoProdutoPO = new DetalhesDoProduto_PO(driver);
	}

	@Dado("que estou na tela do meu carrinho contendo o produto previamente selecionado")
	public void que_estou_na_tela_do_meu_carrinho_contendo_o_produto_previamente_selecionado() {

		jUnitCore.run(Carrinho_RunTest.class);
	}

	@Dado("que clico no botao CONTINUAR")
	public void que_clico_no_botao_continuar() {

		carrinhoPO.clicarEmContinuar();
	}

	@Quando("na proxima tela realizo login com {string} e {string}")
	public void na_proxima_tela_realizo_login_com_e(String usuario, String senha) {

		loginPO.fazerLogin(usuario, senha);
	}

	@Entao("sou levado para a tela de checkout onde posso validar que o produto foi inserido corretamente no pedido")
	public void sou_levado_para_a_tela_de_checkout_onde_posso_validar_que_o_produto_foi_inserido_corretamente_no_pedido() {
		int quantidadeDeProdutosNoCarrinho = conferenciaPO.produtosNoCarrinho().size();
		int quantidadeDeProdutosNoPedido = conferenciaPO.produtosNoPedido().size();

		assertEquals(quantidadeDeProdutosNoCarrinho, quantidadeDeProdutosNoPedido);

		for (int i = 0; i < quantidadeDeProdutosNoCarrinho; i++) {
			assertEquals(conferenciaPO.produtosNoCarrinho().get(i), conferenciaPO.produtosNoPedido().get(i));
		}
	}
}

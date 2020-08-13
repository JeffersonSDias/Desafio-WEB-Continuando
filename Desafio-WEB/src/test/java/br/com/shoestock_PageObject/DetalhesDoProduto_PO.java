package br.com.shoestock_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.shoestock_ElementMap.DetalhesDoProduto_EM;

public class DetalhesDoProduto_PO extends DetalhesDoProduto_EM {

	private WebDriver driver;
	private static String codigo;
	private static String descricao;
	private static String preco;

	public DetalhesDoProduto_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Carrinho_PO clicarEmComprar() {
		dadosDoProduto();
		btn_Comprar.click();
		return new Carrinho_PO(driver);

	}

	public DetalhesDoProduto_PO dadosDoProduto() {
		setCodigo(labelComCodigo.getAttribute("innerText"));
		setDescricao(labelComDescricao.getAttribute("innerText"));
		setPreco(labelComPreco.getAttribute("innerText"));
		return this;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		DetalhesDoProduto_PO.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		DetalhesDoProduto_PO.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		DetalhesDoProduto_PO.preco = preco;
	}

}

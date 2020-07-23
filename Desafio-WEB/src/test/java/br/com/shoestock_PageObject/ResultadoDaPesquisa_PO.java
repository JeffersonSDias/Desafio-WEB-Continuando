package br.com.shoestock_PageObject;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import br.com.shoestock_ElementMap.ResultadoDaPesquisa_EM;

public class ResultadoDaPesquisa_PO extends ResultadoDaPesquisa_EM {
	private WebDriver driver;
	private Random numeroRandomico = new Random();
	int numeroDeProdutos;
	int numeroDoProduto;
	private String produtoNoGrid = "div[@class='item-card card-desktop card-with-rating lazy-price item-desktop--3']";

	public ResultadoDaPesquisa_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String tituloDaPaginaDeResultados() {
		return tituloDaPaginaDeResultado.getText();

	}

	public DetalhesDoProduto_PO selecionarProdutoAleatorio() {
		List<WebElement> listaDeProdutos = gridDeResultados.findElements(By.xpath(produtoNoGrid));
		numeroDeProdutos = listaDeProdutos.size();
		numeroDoProduto = numeroRandomico.nextInt(numeroDeProdutos);

		listaDeProdutos.get(numeroDoProduto).click();

		return new DetalhesDoProduto_PO(driver);
	}
}

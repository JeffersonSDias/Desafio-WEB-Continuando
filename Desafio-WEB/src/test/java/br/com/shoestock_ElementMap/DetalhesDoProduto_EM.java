package br.com.shoestock_ElementMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetalhesDoProduto_EM {

	@FindBy(id = "buy-button-now")
	protected WebElement btn_Comprar;

	@FindBy(xpath = "//div[@class='default-price']//following::strong[@itemprop='price']")
	protected WebElement labelComPreco;

	@FindBy(xpath = "//section[@class='short-description']//following::h1[@itemprop='name']")
	protected WebElement labelComDescricao;

	@FindBy(xpath = "//span[@qa-automation='product-sku']")
	protected WebElement labelComCodigo;
}

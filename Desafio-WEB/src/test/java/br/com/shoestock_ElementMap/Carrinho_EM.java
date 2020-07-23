package br.com.shoestock_ElementMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carrinho_EM {

	@FindBy(xpath = "//h3[@qa-auto='product-name']")
	protected WebElement labelNomeDoProduto;

	@FindBy(xpath = "//span[@qa-auto='product-sku']")
	protected WebElement labelCodigoDoProduto;

	@FindBy(xpath = "//p[@qa-auto='product-new-price']")
	protected WebElement labelPrecoDoProduto;

	@FindBy(xpath = "//a[@qa-auto='cart-buy-button']")
	protected WebElement btn_Continuar;
}

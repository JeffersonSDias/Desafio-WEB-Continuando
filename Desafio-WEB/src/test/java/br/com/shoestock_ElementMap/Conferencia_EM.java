package br.com.shoestock_ElementMap;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Conferencia_EM {

	@FindBy(xpath = "//ul[@class='customer-products']//div[@class='product-info']")
	protected List<WebElement> produtosNoCarrinho;

	@FindBy(xpath = "//ul[@class='summary-products']//div[@class='ns-w8 item-title']")
	protected List<WebElement> produtosNoPedido;

}

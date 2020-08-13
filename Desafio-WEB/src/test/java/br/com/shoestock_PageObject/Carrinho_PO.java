package br.com.shoestock_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.shoestock_ElementMap.Carrinho_EM;

public class Carrinho_PO extends Carrinho_EM {

	private WebDriver driver;

	public Carrinho_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Login_PO clicarEmContinuar() {
		btn_Continuar.click();
		return new Login_PO(driver);
	}

	public String precoDoProduto() {

		return labelPrecoDoProduto.getAttribute("innerText");
	}

	public String codigoDoProduto() {
		return labelCodigoDoProduto.getAttribute("innerText");
	}

	public String descricaoDoProduto() {
		return labelNomeDoProduto.getAttribute("innerText");
	}
}

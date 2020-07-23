package br.com.shoestock_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.shoestock_ElementMap.Login_EM;

public class Login_PO extends Login_EM {

	private WebDriver driver;

	public Login_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Conferencia_PO fazerLogin(String usuario, String senha) {
		txt_username.sendKeys(usuario);
		txt_password.sendKeys(senha);
		btn_AcessarConta.click();
		return new Conferencia_PO(driver);
	}
}

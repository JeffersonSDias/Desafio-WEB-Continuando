package br.com.shoestock_ElementMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_EM {

	@FindBy(id = "username")
	protected WebElement txt_username;

	@FindBy(id = "password")
	protected WebElement txt_password;

	@FindBy(id = "login-button")
	protected WebElement btn_AcessarConta;
}

package br.com.shoestock_ElementMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuSuperior_EM {

	@FindBy(id = "search-input")
	protected WebElement barraDePesquisa;

	@FindBy(xpath = "//button[@title='Buscar']")
	protected WebElement btn_Buscar;

}

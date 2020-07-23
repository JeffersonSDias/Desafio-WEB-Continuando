package br.com.shoestock_ElementMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultadoDaPesquisa_EM {

	@FindBy(xpath = "//h1[@class='search-query']")
	protected WebElement tituloDaPaginaDeResultado;

	@FindBy(xpath = "//div[@class='wrapper']")
	protected WebElement gridDeResultados;

}

package br.com.shoestock_PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.shoestock_ElementMap.Conferencia_EM;

public class Conferencia_PO extends Conferencia_EM {
	private WebDriver driver;
	private String tagDaDescricao = "strong";

	public Conferencia_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public List<String> produtosNoPedido() {
		List<String> prodPedido = new ArrayList<String>();
		for (int i = 0; i < produtosNoPedido.size(); i++) {
			String produto = produtosNoPedido.get(i).findElement(By.tagName("strong")).getAttribute("innerHTML");
			prodPedido.add(produto);
		}
		return prodPedido;
	}

	public List<String> produtosNoCarrinho() {
		List<String> prodCarrinho = new ArrayList<String>();
		for (int i = 0; i < produtosNoPedido.size(); i++) {
			String produto = produtosNoPedido.get(i).findElement(By.tagName("strong")).getAttribute("innerHTML");
			prodCarrinho.add(produto);
		}
		return prodCarrinho;
	}

}

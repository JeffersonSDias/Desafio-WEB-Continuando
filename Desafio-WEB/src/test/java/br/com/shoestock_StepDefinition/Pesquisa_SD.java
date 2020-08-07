package br.com.shoestock_StepDefinition;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import Utilidades.ReportManager;
import br.com.shoestock_PageObject.Pesquisa_PO;
import br.com.shoestock_PageObject.ResultadoDaPesquisa_PO;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Pesquisa_SD extends base_SD {
	private Pesquisa_PO pesquisaPO;
	private ResultadoDaPesquisa_PO resultadoDaPesquisa;

	private ExtentTest extentTest;

	private ReportManager reportManager;

	public Pesquisa_SD() {
		driver = carregarDriver();
		pesquisaPO = new Pesquisa_PO(driver);
		resultadoDaPesquisa = new ResultadoDaPesquisa_PO(driver);
	}

	@Before
	public void setUp(Scenario scenariof) {
		extentTest = reportManager.criarTest(scenariof.getName());
	}

	@After
	public void tearDown(Scenario scenariof) {
		reportManager.statusReported(extentTest, scenariof, driver);

		encerrarDriver();
	}

	@Dado("que estou na tela inicial do site")
	public void que_estou_na_tela_inicial_do_site() {
		// Write code here that turns the phrase above into concrete actions throw new
		// io.cucumber.java.PendingException();
	}

	@Quando("pesquiso por uma {string} na barra de pesquisa")
	public void pesquiso_por_uma_na_barra_de_pesquisa(String categoria) {

		pesquisaPO.pesquisarNaBarra(categoria);

	}

	@Entao("e exibido uma pagina contendo os produtos da {string} pesquisada")
	public void e_exibido_uma_pagina_contendo_os_produtos_da_pesquisada(String categoria) {

		categoria = categoria.toUpperCase();
		String tituloDaPagina = (String) resultadoDaPesquisa.tituloDaPaginaDeResultados();

		assertTrue(tituloDaPagina.contains(categoria));

	}

}

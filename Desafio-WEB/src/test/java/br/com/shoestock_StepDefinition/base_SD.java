package br.com.shoestock_StepDefinition;

import org.openqa.selenium.WebDriver;

import Utilidades.DriverManager;

public class base_SD {
	private static DriverManager driverManager = new DriverManager();
	protected static WebDriver driver;

	protected static WebDriver carregarDriver() {
		if (driver == null) {
			driver = driverManager.iniciarDriver();
		}
		return driver;
	}

	protected void encerrarDriver() {
		if (driver != null) {
			driverManager.encerrarDriver();
			driver = null;
		}
	}
}

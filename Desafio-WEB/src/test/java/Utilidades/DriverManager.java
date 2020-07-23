package Utilidades;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverManager {
	private WebDriver driver;
	EdgeOptions edgeOptions = new EdgeOptions();
	private static String url = "https://www.shoestock.com.br/";

	public WebDriver iniciarDriver() {
		System.setProperty("webdriver.edge.driver", "src/test/resources/Drivers/msedgedriver.exe");

		driver = new EdgeDriver();

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public void encerrarDriver() {
		driver.close();
		driver.quit();

	}
}

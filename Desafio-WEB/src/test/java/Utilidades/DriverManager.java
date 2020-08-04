package Utilidades;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private WebDriver driver;
	private ChromeOptions chromeOptions = new ChromeOptions();
	private static String url = "https://www.shoestock.com.br/";

	public WebDriver iniciarDriver() {

		WebDriverManager.chromedriver().setup();
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		return driver;
	}

	public void encerrarDriver() {
		driver.close();
		driver.quit();

	}
}

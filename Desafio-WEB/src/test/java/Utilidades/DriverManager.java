package Utilidades;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverManager {
	private WebDriver driver;
	EdgeOptions edgeOptions = new EdgeOptions();
	private ChromeOptions chromeOptions = new ChromeOptions();
	private static String url = "https://www.shoestock.com.br/";

	public WebDriver iniciarDriver() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");

		// chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);

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

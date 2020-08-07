package br.com.shoestock_RunTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Utilidades.ReportManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
                 glue = "classpath:br.com.shoestock_StepDefinition", 
                 dryRun = false, 
                 monochrome = true, 
                 plugin = {"pretty" }
                 )

public class TestRunner {

	private static ReportManager reportManager;
	
	@BeforeClass
	public static void setUp() {
		reportManager = new ReportManager();
		reportManager.iniciarExtent();
		reportManager = new ReportManager();
	}

	@AfterClass
	public static void tearDown() {
		reportManager.encerrarExtent();
	}
}

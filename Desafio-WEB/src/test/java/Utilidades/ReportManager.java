package Utilidades;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.Scenario;
import junit.framework.TestListener;
import junit.framework.TestResult;

public class ReportManager {

	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static Scenario scenario;

	public static void iniciarExtent() {
//		sparkReporter = new ExtentSparkReporter("./report/reportTestes.html");
		sparkReporter = new ExtentSparkReporter("../reportTestes.html");

		sparkReporter.config().setDocumentTitle("Report");
		sparkReporter.config().setReportName("Report");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();

		extent.attachReporter(sparkReporter);

	}

	public static ExtentTest criarTest(String testName) {
		test = extent.createTest(testName);
		return test;
	}

	public static void statusReported(ExtentTest test, Scenario result, WebDriver driver) {
		switch (result.getStatus()) {
		case FAILED:
			test.log(Status.FAIL, "" + result.getName());
			break;
		case SKIPPED:
			test.log(Status.SKIP, "" + result.getName());
			break;
		case PASSED:
			test.log(Status.PASS, "" + result.getName());
			break;

		}

	}

	public static void encerrarExtent() {
		extent.flush();
	}
}

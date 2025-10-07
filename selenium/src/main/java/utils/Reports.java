package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Reports {

	private static ExtentReports extentReports;
	private static ExtentSparkReporter sparkReporter;

	// Method to generate a timestamp
	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
	}

	// Method to initialize the ExtentReports instance
	public static ExtentReports initializeExtentReports() {
		if (extentReports == null) {
			String reportPath = "D:/5Extn/Report_" + timestamp() + ".html";

			// Ensure the directory exists
			File reportDir = new File("D:/5Extn/");
			if (!reportDir.exists()) {
				reportDir.mkdirs();
			}

			sparkReporter = new ExtentSparkReporter(reportPath);
			extentReports = new ExtentReports();
			extentReports.attachReporter(sparkReporter);
		}
		return extentReports;
	}

	// Method to create a test entry in the report
	public static ExtentTest createTest(String testName) {
		return extentReports.createTest(testName);
	}

	// Method to flush the report data
	public static void flushReports() {
		if (extentReports != null) {
			extentReports.flush();
		}
	}

	// FIXED: createExtentReports should return the actual initialized report
	public static ExtentReports createExtentReports() {
		return initializeExtentReports();
	}
}
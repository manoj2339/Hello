package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.Reports;
import utils.screenshot;

import java.lang.reflect.Method;

public class BaseTest {

    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void setupReport() {
        extent = Reports.createExtentReports();
    }
  
    @BeforeMethod
    public void setup(Method method) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Get the class name dynamically
        String className = method.getDeclaringClass().getSimpleName();
        
        // Determine URL based on the class name
        String url;
        if (className.equals("AdminTest")) {
            url = "https://qaadmin.procurezen.ai/";  // Admin URL 
        } else {
            url = "https://qa.procurezen.ai/";  
          //  url = "https://preprod.procurezen.ai/";         // Default URL for other tests
        }

        // Navigate to the determined URL
        driver.get(url);
        
        
       // driver.get("https://qa.procurezen.ai/");

        test = Reports.createTest(method.getName());
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
        	String screenshotPath = screenshot.takeScreenshot(driver, result.getName());
            test.fail("Test failed: " + result.getThrowable())
                .addScreenCaptureFromPath(screenshotPath);
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test skipped: " + result.getThrowable());
        }
    
    }
    
    
    @AfterClass
    public void quitBrowser() {
        if (driver != null) {
        	driver.manage().deleteAllCookies();
            driver.quit(); // ✅ Quit browser after each test class
        }
    }

    @AfterSuite
    public void tearDownReport() {
        Reports.flushReports();
    }
}

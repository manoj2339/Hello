package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AdminLogin;
import pages.Login;

import java.time.Duration;
import base.BaseTest; // Import the BaseTest class

public class AdminTest extends BaseTest {
   
	@Test
	public void valid_Admin_login() throws InterruptedException {
		Login Lo = new Login(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   
		try {
            // Step 1: Wait explicitly for the "Buyer" username field to become visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(Lo.Username));
            test.pass("STEP 1 - https://qaadmin.procurezen.ai/ URL Launched successfully");
  
            // Step 2: Enter username
            Lo.Enterusername("Admin");
            test.pass("STEP 2 - Entered username: Admin");

            // Step 3: Enter password
            Lo.Enterpassword("Krya@1234");
            test.pass("STEP 3 - Entered password: Krya@1234");

            // Step 4: Click the Login button
            Lo.ClickLogin();
            test.pass("STEP 4 - Clicked on the login button"); 
 
             
            Thread.sleep(3000); 
            
              
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); 
            boolean loginSuccess = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Administrator Portal']"))).isDisplayed();
             
            // Login success or failure handling
            if (loginSuccess) { 
                test.pass("STEP 5 - Login successful and redirected to Administrator Portal");
            } 
            else { 
                test.fail("STEP 5 - Login failed or did not redirect to the expected page.");
            } 
   
        } catch (Exception e) {
            // Log the failure and exception if something goes wrong
            test.fail("Test failed due to exception: " + e.getMessage());
        }
    }
}
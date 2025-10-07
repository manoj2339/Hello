package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login;
import utils.Reports;

public class LoginTest extends BaseTest {

	    
	@Test
	public void valid_Buyer_login() throws InterruptedException {
		Login Lo = new Login(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     
		try {
            // Step 1: Wait explicitly for the "Buyer" username field to become visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(Lo.Username));
            test.pass("STEP 1 - https://qa.procurezen.ai/ URL Launched successfully");
  
            // Step 2: Enter username
            Lo.Enterusername("Buyer1");
            test.pass("STEP 2 - Entered username: Buyer");

            // Step 3: Enter password
            Lo.Enterpassword("Krya@1234");
            test.pass("STEP 3 - Entered password: Krya@1234");

            // Step 4: Click the Login button
            Lo.ClickLogin();
            test.pass("STEP 4 - Clicked on the login button"); 
 
              
            Thread.sleep(3000);
             
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

         // Check if Dashboard is visible
         List<WebElement> dashboardElements = wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
             By.xpath("(//span[text()='Home'])[2]")
         ));

         if (!dashboardElements.isEmpty() && dashboardElements.get(0).isDisplayed()) {
             test.pass("STEP 5 - Login successful and redirected to the Dashboard");
         } else {
             // Check if Invalid Credentials snackbar is visible
             List<WebElement> errorElements = driver.findElements(
                 By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='Invalid credentials']")
             ); 
 
             if (!errorElements.isEmpty() && errorElements.get(0).isDisplayed()) {
                 test.fail("STEP 5 - Login failed due to invalid credentials");
             } else {
                 test.fail("STEP 5 - Login failed: No dashboard or error message appeared");
             }
         }  
        } 
		catch (Exception e) {
            // Log the failure and exception if something goes wrong
            test.fail("Login failed due to exception: " + e.getMessage());
         }
    } 
}
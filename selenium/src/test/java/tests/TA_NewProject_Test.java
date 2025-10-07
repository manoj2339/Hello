package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login;
import pages.TA_NewProject;

public class TA_NewProject_Test extends BaseTest {  

	 
	@Test
	public void transitagency_Project() throws Exception {
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
 
             
            Thread.sleep(1000);
             
            
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); 
            boolean loginSuccess = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Home'])[2]"))).isDisplayed();
             
            // Login success or failure handling
            if (loginSuccess) { 
                test.pass("STEP 5 - Login successful and redirected to the Dashboard");
            } 
            else { 
                test.fail("STEP 5 - Login failed or did not redirect to the expected page");
            }

        } catch (Exception e) {
            // Log the failure and exception if something goes wrong
            test.fail("Test failed due to exception: " + e.getMessage());
        }
		  

		 
	  	TA_NewProject Proj = new TA_NewProject(driver);
	
		Proj.goToDashboard();

		Proj.goTotransagent();  
		Proj.goTonewproject();
		Proj.selectEntity(); 
		Proj.DepartmentL1(); 
		Proj.DepartmentL2(); 
		Proj.DepartmentL3(); 
		Proj.DepartmentL4(); 
	
		  
		
		
	}
}

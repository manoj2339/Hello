package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login;
import pages.New_MR;


public class MR_Test extends BaseTest {

	
	@Test
	public void create_new_MR() throws Exception {
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
		  
	  	New_MR mr = new New_MR(driver);
		
		mr.clickOnMRDashboard(); 
		mr.clickOnMRMenu();
		 
		Thread.sleep(9000); 
		WebElement CreateMR = wait.until(ExpectedConditions.elementToBeClickable(mr.Create_MR));
		 
		if (CreateMR.isDisplayed()) {
			CreateMR.click();
		    test.pass("STEP 6 - Navigated from Sourcing management to New Material requisition");
		} else {
		    test.fail("STEP 6 - Failed to Navigate to Material requisition");
		}
		Thread.sleep(10000);
//		mr.clickOnCreateMR();
		mr.selectEntity();
		mr.DepartmentL1();
		mr.DepartmentL2();
//		mr.DepartmentL3();
//		mr.DepartmentL4();
		
		WebElement Shortname = wait.until(ExpectedConditions.elementToBeClickable(mr.Entershortname));
		 
		if (Shortname.isDisplayed()) {
			Shortname.sendKeys("MR of Office items");
		    test.pass("STEP 7 - Entity and Levels Defined Successfully");
		} else {
		    test.fail("STEP 7 - Failed to Load Entity");
		}
		
		WebElement Header = wait.until(ExpectedConditions.elementToBeClickable(mr.EnterDesp));
		 
		if (Header.isDisplayed()) {
			Header.sendKeys("Office Subsidies");
		    test.pass("STEP 8 - Header details entered successfully");
		} else {
		    test.fail("STEP 8 - Failed to enter header details");
		}
		 
		mr.getDeliveryDateButton();
		Thread.sleep(500); 
		mr.clickAddItemButton(); 
		Thread.sleep(500); 
		mr.checkCheckbox11(); 
		mr.ClickAddbutton(); 
		Thread.sleep(500); 
		WebElement  Qua = wait.until(ExpectedConditions.elementToBeClickable(mr.Quantity));
		 
		if (Qua.isDisplayed()) {
			Qua.sendKeys("25");
		    test.pass("STEP 9 - Items added successfully");
		} else {
		    test.fail("STEP 9 - Failed to add items");
		} 
		  
//		mr.EnterQuantity("25"); 
		
		WebElement  Remarks = wait.until(ExpectedConditions.elementToBeClickable(mr.Addremarks));
		 
		if (Remarks.isDisplayed()) {
			Remarks.sendKeys("Material should be Flawless");
		    test.pass("STEP 10 - Remarks entered successfully");
		} else {
		    test.fail("STEP 10 - Remarks to enter header details");
		}	
// 		mr.Enterremarks("Material should be Flawless");
		
//		mr.Saveasdraft();
//	    
//		 WebElement SaveMR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='successfully stored']")));
//	       
//		   
//	  		if (SaveMR.isDisplayed()) {
//	  			SaveMR.click();
//	  		    test.pass("STEP 11 - New Material requisition saved Successfully ");
//	  		} else {
//	  		    test.fail("STEP 11 - Failed to create New Material requisition");
//	  		} 
		  
	}
}


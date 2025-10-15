package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Inventory;
import pages.Login;
import pages.New_RFQ;
import utils.Excel;

import java.io.IOException;
import java.time.Duration;

public class Inventory_Test extends BaseTest {  
	 
	
	  @Test
      public void create_inventory_items() throws Exception {
	  
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
		   

		Thread.sleep(2000); 
	
	  	Inventory INV = new Inventory(driver);
      
	  	INV.clickInventoryDashboard();
	  	INV.clickInventoryMenu();
		Thread.sleep(2000); 
	  	
	  	 WebElement  ADD = wait.until(ExpectedConditions.elementToBeClickable(INV.Create_INV));
		 
			if (ADD.isDisplayed()) {
				ADD.click();
			    test.pass("STEP 6 - Navigated from Inventory Management to Inventory List");
			} else {
			    test.fail("STEP 6 - Failed to Navigate to Inventory Items");
			}
	  	
//	  	INV.clickCreateNewItem();
	  	 
	   
        INV.enterCode("023");
        INV.enterShortName("Goods");
        INV.enterDescription("Sample description");    // You can replace with test data or add to Excel
        INV.selectItemType();
        Thread.sleep(1000); 
        INV.SelectUOM();
        INV.enterNaturalAccount("1001");  
          
         
        WebElement  ADD1 = wait.until(ExpectedConditions.elementToBeClickable(INV.Subaccount));
		 
		if (ADD1.isDisplayed()) {
			ADD1.sendKeys("25");
		    test.pass("STEP 7 - Items Details added successfully");
		} else {
		    test.fail("STEP 7 - Failed to add item Details");
		}
        
        
        // You can parametrize or add to Excel
//        INV.enterSubaccount("2001");  
                            
        INV.selectParentCategory();
        INV.selectSubcategory();
        INV.selectChildCategory();
 
        // Save item
        INV.clickSave();
 
        WebElement SavePR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='Successfully saved']")));
        
		   
  		if (SavePR.isDisplayed()) {
  			SavePR.click();
  		    test.pass("STEP 8 - Inventory Item Created Successfully ");
  		} else {
  		    test.fail("STEP 9 - Failed to create New Items");
  		} 
 	
    }
  	
}	
  	 
	        


	  	
         
         
     
         
         
         
         
//	  
 
   

package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login;
import pages.New_PO;
import pages.New_PR;

public class PR_Test extends BaseTest {

	@Test
	public void create_new_PR() throws InterruptedException {
		Login Lo = new Login(driver);

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(Lo.Username));
//		Lo.Enterusername("Buyer");
//		Lo.Enterpassword("Krya@1234");
//		Lo.ClickLogin();
//		Thread.sleep(7000);
		
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
		 
 
	
	  	
		Thread.sleep(7000);
		

	
		New_PR pr = new New_PR(driver);
		Thread.sleep(10000);
	
	  
    	pr.goToDashboard();
		Thread.sleep(10000);
		
		  
		WebElement CreatePR = wait.until(ExpectedConditions.elementToBeClickable(pr.Create_PR));
		 
		if (CreatePR.isDisplayed()) {
			CreatePR.click();
		    test.pass("STEP 6 - Navigated from Sourcing management to New Purchase Requisition");
		} else {
		    test.fail("STEP 6 - Failed to Navigate to Purchase Order");
		}
//		pr.clickCreatePR(); 
 
		Thread.sleep(10000);
		pr.selectEntity();
		pr.selectDepartment();
	
 		pr.DepartmentL2();
//		pr.DepartmentL3();
	  
		  
		WebElement Defineentity = wait.until(ExpectedConditions.elementToBeClickable(pr.ShortName));
		 
		if (Defineentity.isDisplayed()) {
			Defineentity.sendKeys("PR for Bags");
		    test.pass("STEP 7 - Entity and Levels Defined Successfully");
		} else {
		    test.fail("STEP 7 - Failed to Define Entity levels");
		}
		
		
		
//		pr.enterShortName("AutoTest PR");
		Thread.sleep(500);
		pr.enterNeedByDate(); 
		Thread.sleep(500);
		pr.FunCurrency();
    	Thread.sleep(500);
 		pr.selectPRClassification();
 		Thread.sleep(500);
		pr.selectSpendType();
     
		
		 Thread.sleep(2000); 
	        pr.clickAddItemButtonPR();
	        Thread.sleep(2000);
	        pr.checkCheckbox1PR();
	        Thread.sleep(2000);
	        
	        WebElement Additems = wait.until(ExpectedConditions.elementToBeClickable(pr.AddButton));
			  
	  		if (Additems.isDisplayed()) {
	  			Additems.click();
	  		    test.pass("STEP 8 - Items added successfully");
	  		} else {
	  		    test.fail("STEP 8 - Failed to Add Items");
	  		} 
	  	    Thread.sleep(2000);
		
	  	
	      pr.EnterQuantityPR("10");
	      Thread.sleep(2000); 
	      pr.EnterunitratePR("1500");
	      Thread.sleep(2000);
	
	      pr.ClickAddicon();
	      Thread.sleep(2000);
	      pr.supplierselect();
	      Thread.sleep(2000);


	      WebElement AddSUP = wait.until(ExpectedConditions.elementToBeClickable(pr.Addsupplierbutton));
		  
	  		if (AddSUP.isDisplayed()) {
	  			AddSUP.click();
	  		    test.pass("STEP 9 - Suppliers added successfully");
	  		} else {
	  		    test.fail("STEP 9 - Failed to Add Suppliers");
	  		} 
	  	    Thread.sleep(2000);
	      
       //   pr.Addsupplier();
	  	    
	        pr.ClicksavePR();
	        
	        WebElement SavePR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='Purchase Requisition saved successfully']")));
	        
			  
	  		if (SavePR.isDisplayed()) {
	  			SavePR.click();
	  		    test.pass("STEP 10 - New Purchase Requisition saved Successfully ");
	  		} else {
	  		    test.fail("STEP 10 - Failed to create New Purchase Requisition");
	  		} 
	  		
     
//	        Purchase Requisition saved successfully
}
}




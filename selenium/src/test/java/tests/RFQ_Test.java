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
import pages.New_RFQ;

public class RFQ_Test extends BaseTest {  

	 
	@Test
	public void create_new_RFQ() throws Exception {
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
		  

		Thread.sleep(10000); 
	  	New_RFQ RFQ = new New_RFQ(driver);
		Thread.sleep(10000);
		 
		  
		RFQ.goToDashboard();
		Thread.sleep(5000);
		RFQ.goToRFQMenu(); 
		Thread.sleep(10000);
		
		WebElement CreateRFQ = wait.until(ExpectedConditions.elementToBeClickable(RFQ.Create_RFQ));
		 
		if (CreateRFQ.isDisplayed()) {
			CreateRFQ.click();
		    test.pass("STEP 6 - Navigated from Sourcing Management to New RFQ");
		} else {
		    test.fail("STEP 6 - Failed to Navigate to RFQ");
		}
		
		Thread.sleep(10000);
		RFQ.selectEntity(); 
		RFQ.DepartmentL1();
		RFQ.DepartmentL2();
//		RFQ.DepartmentL3();
//		RFQ.DepartmentL4();
 
		
		WebElement Entershort = wait.until(ExpectedConditions.elementToBeClickable(RFQ.Entershortname));
		 
		if (Entershort.isDisplayed()) {
			Entershort.sendKeys("New RFQ");
		    test.pass("STEP 7 - Entity Levels Defined Successfully");
		} else {
		    test.fail("STEP 7 - Failed to Define Entity Levels");
		}
		
		 
		RFQ.Classification();
		RFQ.SpendType();
		RFQ.Buyer();
		RFQ.RateType();
		RFQ.SourceType();
		RFQ.PurchaseType();
		RFQ.ParticipationType();
		 
		WebElement EnterDesp = wait.until(ExpectedConditions.elementToBeClickable(RFQ.EnterDesp));
		 
		if (EnterDesp.isDisplayed()) {
			EnterDesp.sendKeys("User Enterable Value");
		    test.pass("STEP 8 - RFQ Header details entered Successfully");
		} else {
		    test.fail("STEP 8 - Failed to Enter RFQ Header Details");
		}
		
		RFQ.enterAddress1("123 Main Street");
		RFQ.enterAddress2("Suite 456");
        RFQ.selectCountryIndia();
        RFQ.selectStateAP();
        
        Thread.sleep(2000); 
        RFQ.clickSameAsAddressCheckbox();
//        RFQ.Approvedate();
//        RFQ.GetPublishdate();
        
        
        WebElement Enterdate = wait.until(ExpectedConditions.elementToBeClickable(RFQ.ExpValidity));
		 
		if (Enterdate.isDisplayed()) {
			Enterdate.sendKeys("5");
		    test.pass("STEP 9 - Address & Timelines details entered Successfully");
		} else {
		    test.fail("STEP 9 - Failed to Enter Address & Timelines details");
		}
		
        RFQ.GetClarificationdate();
        RFQ.GetClarification_Response();
        RFQ.GetSubmission();
        RFQ.GetResponseopen();
 //       RFQ.GetAwardprocessing();
        RFQ.GetAwarddate();
        RFQ.GetNeedbydate();
         
        
          
//        RFQ.GetValidityinput("5");
        RFQ.GetValidityinputLOV();
        RFQ.clickFunctionalCurrency();
        RFQ.selectUSDFromLOV();
        RFQ.clickAddItems();
        Thread.sleep(1000); 
        RFQ.clicksearch();
        Thread.sleep(500); 
        RFQ.checkCheckbox1();
        
        
        WebElement selectadd = wait.until(ExpectedConditions.elementToBeClickable(RFQ.Addbutton));
		 
      		if (selectadd.isDisplayed()) {
      			selectadd.click();
      		    test.pass("STEP 10 - Items added Successfully");
      		} else {
      		    test.fail("STEP 10 - Failed to Add items");
      		}
        
        
        
//        RFQ.ClickAdd(); 
        Thread.sleep(1000); 
        RFQ.QualityEnter("5");
        RFQ.ClickAddicon();
        Thread.sleep(500);
        RFQ.clicksearch();
        Thread.sleep(500);
        RFQ.supplierselect();
        Thread.sleep(500);
        
        WebElement Supplieradd = wait.until(ExpectedConditions.elementToBeClickable(RFQ.Addsupplierbutton));
		 
  		if (Supplieradd.isDisplayed()) {
  			Supplieradd.click();
  		    test.pass("STEP 11 - Supplier added Successfully");
  		} else {
  		    test.fail("STEP 11 - Failed to Add Supplier");
  		}
        
        
        
//        RFQ.Addsupplier();
        Thread.sleep(500);
        RFQ.Adddescp("N/A");
        
        
        RFQ.Declaredoc1("User value 1");
        RFQ.Declaredoc2("User value 2");
        RFQ.Declaredoc3("User value 3");
        
        
        Thread.sleep(500);
        
        
        RFQ.savebtn();
        
        WebElement SaveRFQ = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='Data on the form has been saved successfully']")));
        
		  
  		if (SaveRFQ.isDisplayed()) {
  			SaveRFQ.click();
  		    test.pass("STEP 12 - New RFQ saved Successfully ");
  		} else {
  		    test.fail("STEP 12 - Failed to create New RFQ");
  		} 
          
          
	}
	}       
		 

            
      	
		


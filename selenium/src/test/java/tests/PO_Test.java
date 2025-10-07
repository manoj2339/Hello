package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import base.BaseTest;
import pages.Login;
import pages.New_PO;


public class PO_Test extends BaseTest { 
 
	 
	@Test
	public void create_new_PO() throws Exception {
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
		   

		Thread.sleep(7000); 
	  	New_PO po = new New_PO(driver);
		
		
		
		po.goToDashboard();
		
		Thread.sleep(10000);
		
		WebElement CreatePO = wait.until(ExpectedConditions.elementToBeClickable(po.Create_PO));
		 
		if (CreatePO.isDisplayed()) {
			CreatePO.click();
		    test.pass("STEP 6 - Navigated from Order management to New Purchase Order");
		} else {
		    test.fail("STEP 6 - Failed to Navigate to Purchase Order");
		}
		
		  Thread.sleep(10000);
//		po.clickCreatePO(); 
   
		po.selectEntity();
		po.DepartmentL1(); 
		po.DepartmentL2();
//		po.DepartmentL3();
//	    po.DepartmentL4();
  
	    // Shortname
	    
	    
	    WebElement Shortname = wait.until(ExpectedConditions.elementToBeClickable(po.Shortname));
		 
		if (Shortname.isDisplayed()) {
			Shortname.sendKeys("PO of Office items");
		    test.pass("STEP 7 - Entity and Levels Defined Successfully");
		} else {
		    test.fail("STEP 7 - Failed to Load Entity");
		}
	    
	      
	    
//       po.getShortnameField().sendKeys("PO of Office items");

        // Currency
        po.getPOCurrencyDropdown().click();
        po.getCurrencyLOV().click();

        // PO Value
        po.getPOValueField().sendKeys("10000");

        // Supplier
        po.getSupplierIDDropdown().click();
        po.getSupplierLOV().click();

        // Purchase Type 
        po.getPurchaseTypeField().click();
        po.getPurchasetypeLOV().click();

        // PO Type
        po.getPOTypeDropdown().click();
        po.getPOTypeLOV().click();

        // Classification ID
        po.getClassificationIDDropdown().click();
        po.getClassificationIDLOV().click();

        // Spend Type
        po.getSpendTypeIDDropdown().click();
        po.getSpendTypeIDLOV().click();

        // Select Purchase Source Type
        po.getPurchaseSourceTypeIDDropdown().click();
        po.getPurchaseSourceTypeIDLOV().click();
 
        // Delivery Date
        po.getDeliveryDateButton().click();
        Thread.sleep(1000);
        po.getSelectDateButton().click();

        // Payment Terms
        po.getPaymentTermsIDDropdown().click();
        
         
        
        WebElement Paymenterms = wait.until(ExpectedConditions.elementToBeClickable(po.PaymentLOV));
		 
      		if (Paymenterms.isDisplayed()) {
      			Paymenterms.click();
      		    test.pass("STEP 8 - Header details Entered Successfully");
      		} else {
      		    test.fail("STEP 8 - Failed to Enter Header Details");
      		}
        
      		
        
//        po.getPaymentLOV().click();
        Thread.sleep(2000);
        po.getLine1().sendKeys("OMR Road");
        Thread.sleep(2000);
        // Country & State
        po.getCountryDropdown().click();
        po.getCountryLOV().click();
        Thread.sleep(3000);
        po.getStateDropdown().click();
        Thread.sleep(1000);
        po.getStateLOV().click();
 
       
        Thread.sleep(2000); 
        po.getShipAddressCheckbox().click();
	     
        Thread.sleep(2000); 
        po.clickAddItemButton();
        Thread.sleep(2000);
        po.checkCheckbox1();
        Thread.sleep(2000);
        
        WebElement Additems = wait.until(ExpectedConditions.elementToBeClickable(po.AddButton));
		    
  		if (Additems.isDisplayed()) {
  			Additems.click();
  		    test.pass("STEP 9 - Items added successfully");
  		} else {
  		    test.fail("STEP 9 - Failed to Add Items");
  		} 
  	    Thread.sleep(2000); 
        po.EnterQuantity("10");
        Thread.sleep(2000); 
        po.Enterunitrate("1500"); 

        Thread.sleep(2000);
        
        po.Enterremarks("Enter Remarks");
       
        po.EnterMilestoneitem();
        Thread.sleep(2000);
        
        po.Getmilestonedesp();
        Thread.sleep(2000);
        po.Entermilestonevalue();
        Thread.sleep(2000);
        
        WebElement AddMilestone = wait.until(ExpectedConditions.elementToBeClickable(po.Value));
		  
        
  		if (AddMilestone.isDisplayed()) {
  			AddMilestone.sendKeys("100");
  		    test.pass("STEP 10 - Milestone list added successfully");
  		} else {
  		    test.fail("STEP 10 - Failed to Add Milestone List");
  		} 
        
        
//        po.Entervalue("100");
          po.getCompletionDate();
         
//        po.ClickAddbutton();
    
        Thread.sleep(2000);
        
        po.clicksaveasdraft();
        
       
        
        WebElement SavePO = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='Purchase Order successfully saved']")));
        
		  
  		if (SavePO.isDisplayed()) {
  			SavePO.click();
  		    test.pass("STEP 11 - New Purchase Order saved Successfully ");
  		} else {
  		    test.fail("STEP 11 - Failed to create New Purchase");
  		} 
  		              
}
} 

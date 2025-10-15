package tests;
 
import base.BaseTest;
import pages.Login;
import pages.User_creation;
import utils.AlertUtils;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


import com.aventstack.extentreports.util.Assert;
   
      
public class Account_Creation extends BaseTest {
	@Test
	public void supplier_user_creation() throws InterruptedException, TimeoutException {
		User_creation UC = new User_creation(driver);
//		AlertUtils AU = new AlertUtils(driver);
   
		         
		Thread.sleep(2000); 
		 
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        boolean URLSuccess = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Sign In')]"))).isDisplayed();
         
        // URL Launch success or failure handling
         
        if (URLSuccess) { 
            test.pass("STEP 1 - https://qa.procurezen.ai/ URL Launched successfully");
        } 
        else {   
            test.fail("STEP 1 - Failed to Launch URL");
        }  
           
        Thread.sleep(3000);   
        UC.Click_Checkbox(); 
        Thread.sleep(2000); 
        
           
        WebElement SignupPopup = wait1.until(ExpectedConditions.elementToBeClickable(UC.Click_Supplier_signup));

		if (SignupPopup.isDisplayed()) {
			SignupPopup.click();
		    test.pass("STEP 2 - Supplier Sign up Pop-Up Displayed successfully");
		} else {
		    test.fail("STEP 2 - Failed to open Supplier Sign Up Pop-Up.");
		}
		    
//		UC.New_Supplier_Signup(); 
		Thread.sleep(2000);
		UC.Click_Classification();
		Thread.sleep(1000);  
		UC.Classification_Dropdown();
		UC.Company_Name("Swiggy");  
		Thread.sleep(1000);
		UC.Enter_Native_name("Not applicable");
		UC.Enter_License("PSS3234as4");
		UC.Enter_Tax("TAajhsDFSD11");
		UC.Enter_Site_code("001");
		UC.Enter_Site_Name("Chennai");
		Thread.sleep(1000);
		
		
		WebElement CompanyDetails = wait1.until(ExpectedConditions.elementToBeClickable(UC.Company_Email));

		if (CompanyDetails.isDisplayed()) {
			CompanyDetails.sendKeys("karthick.gopal@kryasolutions.com");
		    test.pass("STEP 3 - Company Details Entered successfully");
		} else {
		    test.fail("STEP 3 - Failed to locate or interact with input field.");
		}
		
	   //UC.Enter_Company_Email("karthick.gopal@kryasolutions.com");
		  
		
		UC.Click_Salute();
		UC.salutation_Dropdown();
		UC.Enter_First_Name("Manoj");
		UC.Enter_Last_Name("B");
		UC.Enter_Designation("QAT");
		UC.Click_Role();
		Thread.sleep(500);
		UC.Role_Dropdown();
		UC.Enter_Email("mboopathy@dssiindia.com");
		UC.Click_Country_Code();
		Thread.sleep(500);
		UC.Country_code_Dropdown();
		
  
		WebElement Primarycontactdetails = wait1.until(ExpectedConditions.elementToBeClickable(UC.Mobile_Number));
 
		if (Primarycontactdetails.isDisplayed()) {
			Primarycontactdetails.sendKeys("9941702339");
		    test.pass("STEP 4 - Primary Contact Details Entered successfully");
		} else {
		    test.fail("STEP 4 - Failed to locate or interact with input field.");
		}
		
//		UC.Enter_Mobile_Number("9941702339");
//      UC.Click_Landline_Code();
//      UC.Landline_code_Dropdown();
//      UC.Enter_landline("27453964");
		Thread.sleep(1000);
		
		UC.Enter_username("Swiggy"); 
		UC.Enter_password("Krya@1234");
		UC.Enter_Confirm_password("Krya@1234");
		Thread.sleep(500);
 
		 
		WebElement PortalLoginCredentials = wait1.until(ExpectedConditions.elementToBeClickable(UC.Click_Submit));
		 
		if (PortalLoginCredentials.isDisplayed()) {
			PortalLoginCredentials.click();
		    test.pass("STEP 5 - Supplier Credentials Entered successfully");
		} else {
		    test.fail("STEP 5 - Failed to locate or interact with input field.");
		}
		  
//		UC.Click_Submit();  
		 WebElement Account = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='Supplier Account created Successfully']")));
	       
		  
	  		if (Account.isDisplayed()) {
	  			Account.click();
	  		    test.pass("STEP 6 - New Supplier account created successfully ");
	  		} else {
	  		    test.fail("STEP 6 - Failed to create New New Supplier account");
	  		} 
	
} 
}
package tests;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Directory;
import pages.Login;
import pages.New_MR;
import pages.PreQualify;
import utils.Reports;

public class PreQualify_Test extends BaseTest {
 
	    
	@Test
	public void Supplier_PreQualification() throws InterruptedException {
		Login Lo = new Login(driver);
		
		try {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(Lo.Username));
		    test.pass("STEP 1 - https://qa.procurezen.ai/ URL Launched successfully");

		    Lo.Enterusername("PQ_REP");
		    test.pass("STEP 2 - Entered username: PQ_REP");

		    Lo.Enterpassword("Krya@1234");
		    test.pass("STEP 3 - Entered password: Krya@1234");

		    Lo.ClickLogin();
		    test.pass("STEP 4 - Clicked on the login button");

		} catch (Exception e) {
		    test.fail("Test failed: " + e.getMessage()); 
           
		}    
		
		Thread.sleep(2000); 
		
		
		PreQualify PreQC = new PreQualify(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		PreQC.GetSupplier();
		Thread.sleep(2000); 
		PreQC.GetpreQualify();
		Thread.sleep(2000); 
		PreQC.Getfirstlink();
		Thread.sleep(2000); 
		PreQC.SelectpreQualify();
		Thread.sleep(2000); 
		
//		PreQC.setCatScore("80");
//	       
//		PreQC.enterGivenScores(Arrays.asList("90", "80", "80", "90", "75", "65", "75", "80", "90"));
//		PreQC.clickgrade();
//		PreQC.gradecat();
//		PreQC.savebutton();
//	
//		WebElement Pre = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='Data on the form has been Save successfully']")));
//        
//		  
//  		if (Pre.isDisplayed()) {
//  			Pre.click();
//  		    test.pass("STEP 12 - New RFQ saved Successfully ");
//  		} else {
//  		    test.fail("STEP 12 - Failed to create New RFQ");
//  		} 
         
}
}
	
            

         
           
 
             
           
             
          
		

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
import pages.Directory;
import pages.Login;
import pages.New_MR;
import utils.Reports;

public class Directory_Test extends BaseTest {

	     
	@Test
	public void Supplier_Directory() throws InterruptedException {
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
		Directory Dir = new Directory(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Dir.GetSupplier();
		
		Thread.sleep(2000); 
		WebElement CreatePR = wait.until(ExpectedConditions.elementToBeClickable(Dir.Sup_Directory));
		 
		if (CreatePR.isDisplayed()) {
			CreatePR.click();
		    test.pass("STEP 5 - Navigated from Supplier management to Supplier Directory List");
		} else {
		    test.fail("STEP 5 - Failed to Navigate to Supplier");
		}
		Thread.sleep(3000); 
		{
			 // Find all links (you can narrow this down with a better selector if needed)
		        List<WebElement> links = driver.findElements(By.tagName("a"));
		        // Loop through links and click the first one that contains "under review"
		        for (WebElement link : links) {
		            if (link.getText().contains("Active")) {
		                link.click();
		                break; // Stop after clicking the first match
		            }
		        }
		 
//		Dir.Getdirectory();
		}
}
}
	
            

         
           
 
             
           
             
          
		

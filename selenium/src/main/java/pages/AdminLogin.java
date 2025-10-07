package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AdminLogin { 

	public WebDriver driver;  
  
    // Locators for username, password, and submit button
    public By Username = By.xpath("//input[@formcontrolname='userName']");
    public By Password = By.xpath("//input[@type='password']");
    public By Signin = By.xpath("//button[@type='submit']");
    
    
    // Constructor 
    public AdminLogin(WebDriver driver) {
        this.driver = driver;
    }
   
      
        public void Enterusername(String username) {
    	driver.findElement(Username).sendKeys(username);
        }
    	 
    	public void Enterpassword(String password) {
    		driver.findElement(Password).sendKeys(password);
    	
    	} 
    	 
    	public void ClickLogin() {
    		driver.findElement(Signin).click();
    		
    	}
}



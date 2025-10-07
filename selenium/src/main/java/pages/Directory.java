package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Directory {

	public WebDriver driver;
	WebDriverWait wait;
	 
	public By Username = By.xpath("//input[@formcontrolname='userName']");
	public By Password = By.xpath("//input[@type='password']"); 
	public By Signin = By.xpath("//button[@type='submit']"); 
	
	public By Sup_Dashboard = By.xpath("(//span[text()='Supplier Management'])[2]");
	public By Sup_Directory = By.xpath("//span[text()='Supplier Directory']");
	
 
	public Directory(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	} 
	
	public void Enterusername(String username) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(Username)).sendKeys(username);
	}
	public void Enterpassword(String password) {
		driver.findElement(Password).sendKeys(password);
	} 
	public void ClickLogin() {
		driver.findElement(Signin).click();
	}
	  public void GetSupplier() {
	        wait.until(ExpectedConditions.elementToBeClickable(Sup_Dashboard)).click();
	    }

	    public void Getdirectory() {
	        wait.until(ExpectedConditions.elementToBeClickable(Sup_Directory)).click();
	    }
	    
	    
	    
	    
}    


	
	  

		

package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public WebDriver driver;
	
	public By Username = By.xpath("//input[@formcontrolname='userName']");
	public By Password = By.xpath("//input[@type='password']");
	public By Signin = By.xpath("//button[@type='submit']");
	
	public Login(WebDriver driver) {
		this.driver=driver;
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
}  
	
	

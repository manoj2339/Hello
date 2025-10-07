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

public class PreQualify {

	public WebDriver driver;
	WebDriverWait wait; 
	 
	public By Username = By.xpath("//input[@formcontrolname='userName']");
	public By Password = By.xpath("//input[@type='password']");
	public By Signin = By.xpath("//button[@type='submit']"); 
	
	public By Sup_Dashboard = By.xpath("(//span[text()='Supplier Management'])[2]");
	public By Sup_PreQualify = By.xpath("//span[text()='Supplier Pre-Qualification']");
	
	public By Click_firstlink = By.xpath("(//a[@class='btn-link'])[1]");
	public By Prequalifypage = By.xpath("//span[contains(@class, 'mdc-tab__text-label')]//div[text()='Pre-Qualification Assessment']");
	
	public By CatScore = By.xpath("//input[@formcontrolname='score']");
	public By Grade = By.xpath("//mat-select[@formcontrolname='supplierGrade']");
	public By Gradeselect =By.xpath("//span[text()='A']");
	
	public By savebtn = By.xpath("//button[.//span[contains(text(), 'Save as Draft')]]");
	
	
	
	public PreQualify(WebDriver driver) {
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

	    public void GetpreQualify() {
	        wait.until(ExpectedConditions.elementToBeClickable(Sup_PreQualify)).click();
	    }
	public void Getfirstlink() {
		driver.findElement(Click_firstlink).click();
	}
	public void SelectpreQualify() {
		driver.findElement(Prequalifypage).click();
	}
	
	 
	// Set the category score
    public void setCatScore(String score) {
        driver.findElement(CatScore).sendKeys(score);
    }
	
    public void enterGivenScores(List<String> values) {
        int limit = Math.min(values.size(), 9); // Only go from 0 to 8 (max 9 items)
        for (int i = 0; i < limit; i++) {
            int index = i + 1; // XPath indices start from 1
            By inputLocator = By.xpath("(//input[@formcontrolname='givenScore'])[" + index + "]");
            driver.findElement(inputLocator).sendKeys(values.get(i));
        }
    }
    
    
    public void clickgrade () {
    	driver.findElement(Grade).click();
    }
    public void gradecat() {
    	driver.findElement(Gradeselect).click();
    }
    public void savebutton () {
    	driver.findElement(savebtn).click();
    }
}
    



	
	  

		

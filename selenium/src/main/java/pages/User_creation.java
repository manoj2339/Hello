package pages;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_creation {
 
	private WebDriver driver;
    private By Select_Checkbox = By.xpath("//*[@id='mat-mdc-checkbox-0-input']");
    
 
	public  By Click_Supplier_signup = By.xpath("/html/body/app-root/app-home-page/div/div/div/div[2]/div/h2/span/a/span");
	private By Select_Classification = By.id("mat-select-value-1"); 
	private By Classification_LOV = By.xpath("//span[text()=' Local Company ']");
	private By Company_Name = By.id("mat-input-2");
    private By Native_Company_Name = By.xpath("//input[@formcontrolname='supplierNameNativeLang']");
    private By License = By.xpath("//input[@formcontrolname='tradeLicense']");
    private By Tax_Reg = By.xpath("//input[@formcontrolname='taxRegistration']");
    private By Site_Code = By.xpath("//input[@formcontrolname='siteCode']"); 
    private By Site_Name = By.xpath("//input[@formcontrolname='siteName']");
    public  By Company_Email = By.xpath("//input[@formcontrolname='companyEmail']");
    private By Select_Salutation = By.id("mat-select-value-2");
    private By Salutation_LOV = By.xpath("//span[text()=' Mr ']");
    private By First_Name = By.id("mat-input-5"); 
    private By Last_Name = By.id("mat-input-7");
    private By Designation = By.id("mat-input-8");
    private By Select_Role = By.id("mat-select-value-3"); 
    private By Role_LOV = By.xpath("//span[text()=' Administrator ']");
    private By Email = By.id("mat-input-9");
    private By Select_Country_Code = By.id("mat-select-value-4");
    private By Code_LOV = By.xpath("//span[text()=' IND +91 ']");
    public  By Mobile_Number = By.id("mat-input-10");
    //private By Select_Landline_Code = By.id("mat-select-value-9");
    //private By Landline_LOV = By.xpath("//span[text()=' IND +91 ']");
   // private By Landline = By.id("mat-input-10");
    private By Username = By.id("mat-input-12");
    private By Password = By.id("mat-input-13");
    private By Confirm_Password = By.id("mat-input-14");
    public  By Click_Submit = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-supplier-registration/div/mat-dialog-actions/div/button[2]");
	
   

      public By Supplier_Account_Created_Success = By.cssSelector("div[matsnackbarlabel].mat-mdc-snack-bar-label.mdc-snackbar__label");
      public By Username_Exists_Error = By.cssSelector("div[matsnackbarlabel].mat-mdc-snack-bar-label.mdc-snackbar__label");
   
      
//    public By Account_Creation_Success = By.xpath("//div[text()=' Supplier Account created Successfully']"); 
//    public By Username_Exists_Error = By.xpath("//div[normalize-space(text())='Username already exists. Please enter a different username.']");
     
      
    
    private WebDriverWait wait;
    public User_creation(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
	}  

    public void Click_Checkbox() {
       driver.findElement(Select_Checkbox).click();
    }
    
    public void New_Supplier_Signup() {
    	driver.findElement(Click_Supplier_signup).click();
    } 
    public void Click_Classification () {
    	driver.findElement(Select_Classification).click();	
    }
    public void Classification_Dropdown () {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(Classification_LOV)).click();
    }
    public void Company_Name (String Company_Field) {
        driver.findElement(Company_Name).sendKeys(Company_Field);
    }
    public void Enter_Native_name (String Native) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(Native_Company_Name)).sendKeys(Native);
    }
    public void Enter_License (String License_Number) {
    	driver.findElement(License).sendKeys(License_Number);
    }
    public void Enter_Tax (String Tax_Number) {
    	driver.findElement(Tax_Reg).sendKeys(Tax_Number);
    }
    public void Enter_Site_code (String Site_code) {
    	driver.findElement(Site_Code).sendKeys(Site_code);
    }
    public void Enter_Site_Name (String Site_Naming) {
    	driver.findElement(Site_Name).sendKeys(Site_Naming);
    }
    public void Enter_Company_Email (String Company_EmailADD) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(Company_Email)).sendKeys(Company_EmailADD);	
    }
    public void Click_Salute () {
        driver.findElement(Select_Salutation).click();
    }
    public void salutation_Dropdown () {
    	driver.findElement(Salutation_LOV).click();
    }
    public void Enter_First_Name (String First_NME) {
    	driver.findElement(First_Name).sendKeys(First_NME);
    }
    public void Enter_Last_Name (String Last_NME) {
    	driver.findElement(Last_Name).sendKeys(Last_NME);
    }
    public void Enter_Designation (String Design) {
    	driver.findElement(Designation).sendKeys(Design);
    }
    public void Click_Role() {
    	driver.findElement(Select_Role).click();
    }
    public void Role_Dropdown () {
    	driver.findElement(Role_LOV).click();
    }
    public void Enter_Email (String User_Email) {
    	driver.findElement(Email).sendKeys(User_Email);
    }
    public void Click_Country_Code () {
    	driver.findElement(Select_Country_Code).click();
    }
    public void Country_code_Dropdown () {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(Code_LOV)).click();
    	//driver.findElement(Code_LOV).click();
    }
    public void Enter_Mobile_Number (String Phone_Number) {
    	driver.findElement(Mobile_Number).sendKeys(Phone_Number);
    }
//    public void Click_Landline_Code() {
//    	driver.findElement(Select_Landline_Code).click();
//    }
//    public void Landline_code_Dropdown() {
//    	driver.findElement(Landline_LOV).click();
//    }
//    public void Enter_landline (String Enter_Landline_number) {
//    	driver.findElement(Landline).sendKeys(Enter_Landline_number);
//    }
    public void Enter_username (String Enter_USERname) {
    	driver.findElement(Username).sendKeys(Enter_USERname);
    }
    public void Enter_password (String Enter_pass) {
    	driver.findElement(Password).sendKeys(Enter_pass);
    }
    public void Enter_Confirm_password (String confirm_pass) {
    	driver.findElement(Confirm_Password).sendKeys(confirm_pass);
    }
    public void Click_Submit () {
    	driver.findElement(Click_Submit).click();
     } 
     
        
}






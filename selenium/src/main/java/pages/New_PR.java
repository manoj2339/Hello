package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_PR {

	public WebDriver driver; 
	
	public By PR_Dashboard = By.xpath("(//span[text()='Sourcing Management'])[2]");
	public By PR_Menu = By.xpath("//span[text()='Purchase Requisition']");
    public By Create_PR = By.xpath("//button[text()='New PR']"); 
    public By EntitySelect = By.xpath("//mat-select[@formcontrolname='entityNameID']");
    public By EntityDropDown = By.xpath("//mat-option[.//span[text()='Krya Enterprise']]"); 
    public By DeptselectL1 = By.xpath("//mat-select[@formcontrolname='level1ID']");
    public By DeptDropDown  = By.xpath("//span[text()='Raj-NewDept-1-001-1']");
    public By DeptL2 = By.xpath("//mat-select[@formcontrolname='level2ID']");
    public By DeptL2Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='test-PR for Bluestone']");
    public By DeptL3 = By.xpath("//mat-select[@formcontrolname='level3ID']");
    public By DeptL3Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='HR-001']");
    public By ShortName = By.xpath("//input[@formcontrolname='shortName']");
    public By Needdate = By.xpath("(//button[@aria-label='Open calendar'])[2]");
    public By Dateclick = By.xpath("//span[normalize-space(text())='30']");
    
   // public By Date_OK = By.xpath("//button[@class='btn-blue' and contains(text(), 'Ok')]");
 
    public By Funcurr = By.xpath("//mat-select[@formcontrolname='currencyID']");
    public By FRcurrLOV = By.xpath("(//span[text()='USD - $'])[1]");
    public By PRclassselect = By.xpath("//*[@formcontrolname='purchaseClassificationID']");
    public By PRclassDropdown = By.xpath("//span[text()='General']");
    public By Spendtype = By.xpath("//mat-select[@formcontrolname='spendTypeID']");
    public By SpendtypeDropdown = By.xpath("//span[text()='CapEx Purchase']");
    public By SelectItems = By.xpath("//button[contains(text(), 'Add Items')]");
    
      
    
    public By AddItems = By.xpath("//button[contains(text(), 'Add Items')]");
     
//  public By Checkbox1 = By.xpath("(//input[@data-ref='eInput' and @type='checkbox'])[7]");
    
    public By Checkbox2 = By.xpath("(//input[@data-ref='eInput' and @type='checkbox'])[7]"); 
    	 	
    public By AddButton = By.xpath("(//button[contains(text(), 'Add')])[2]");
    
    public By Quantity = By.xpath("//input[@formcontrolname='quantity']"); 
    public By Unitrate1 = By.xpath("//input[@formcontrolname='rate']");
    public By Addicon = By.xpath("//button[@mattooltip='Search & Add Suppliers']");
    public By Checkbox11 = By.xpath("(//input[@data-ref='eInput' and @type='checkbox'])[8]");
    
    public By Addsupplierbutton = By.xpath("(//button[contains(@class, 'btn-blue') and contains(text(), 'Add')])[2]");
    
    
    public By savePR = By.xpath("//button[contains(text(), 'Save as Draft ')]");
    
    
 // Constructor
    public New_PR(WebDriver driver) {
        this.driver = driver;
    }
     
    // Methods
    public void goToDashboard() {
        driver.findElement(PR_Dashboard).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(PR_Menu));
        
        driver.findElement(PR_Menu).click();
    }
  
    public void clickCreatePR() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Create_PR)).click();
    }

    public void selectEntity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(EntitySelect)).click();
        wait.until(ExpectedConditions.elementToBeClickable(EntityDropDown)).click();
    }

    
    public void selectDepartment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  // You can adjust the wait time (e.g., 10 seconds)

        
        WebElement deptSelectElement = wait.until(ExpectedConditions.elementToBeClickable(DeptselectL1));
        deptSelectElement.click();

        
        WebElement deptDropDownElement = wait.until(ExpectedConditions.elementToBeClickable(DeptDropDown));
        deptDropDownElement.click();
    }
    
   
    public void DepartmentL2() throws InterruptedException {
        driver.findElement(DeptL2).click();
        Thread.sleep(500);
        driver.findElement(DeptL2Dropdown).click();
    }
    
    public void DepartmentL3() throws InterruptedException {
        driver.findElement(DeptL3).click();
        Thread.sleep(500);
        driver.findElement(DeptL3Dropdown).click();
    }
    
    public void enterShortName(String name) {
        driver.findElement(ShortName).sendKeys(name);
    }

    public void enterNeedByDate() throws InterruptedException {
        driver.findElement(Needdate).click();
        Thread.sleep(500);
        driver.findElement(Dateclick).click();
        Thread.sleep(500);
      //  driver.findElement(Date_OK).click();
    }

    
    public void FunCurrency() throws InterruptedException {
        driver.findElement(Funcurr).click();
        Thread.sleep(500);
        driver.findElement(FRcurrLOV).click();
    }
    

    
    public void selectPRClassification() {
        driver.findElement(PRclassselect).click();
        driver.findElement(PRclassDropdown).click();
    }

    public void selectSpendType() {
        driver.findElement(Spendtype).click();
        driver.findElement(SpendtypeDropdown).click();
    }
    
 // Click on the Add Item button

    public void clickAddItemButtonPR() {
        // Use Duration instead of int for the timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds

        // Wait for the button to be visible
        WebElement addItemButton = wait.until(ExpectedConditions.visibilityOfElementLocated(AddItems));

        // Scroll the element into view if it's off-screen
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addItemButton);

        // Wait for the element to be clickable, then click it
        wait.until(ExpectedConditions.elementToBeClickable(addItemButton)).click();
    }

     


    public void scrollToElement(By AddItems) {
        WebElement element = driver.findElement(AddItems);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

 
    //Check the second checkbox (Checkbox2)
    public void checkCheckbox1PR() {
     WebElement checkbox1 = driver.findElement(Checkbox2);
     if (!checkbox1.isSelected()) {
         checkbox1.click();  // Check the checkbox if not already selected
     }
    }
    
     public void ClickAddbuttonPR() {
    	 driver.findElement(AddButton).click();
     }

     public void EnterQuantityPR(String valueofunit) {
    	 driver.findElement(Quantity).sendKeys(valueofunit);
     }
     
     public void EnterunitratePR (String Enterrate) {
    	 driver.findElement(Unitrate1).sendKeys(Enterrate);
     }
     
     public void ClickAddicon () {
    	 driver.findElement(Addicon).click();
     }
     public void supplierselect() {
    	 driver.findElement(Checkbox11).click();
     }
     public void Addsupplier () {
    	 driver.findElement(Addsupplierbutton).click();
     }
     
     public void ClicksavePR () {
    	 driver.findElement(savePR).click();
     }
     
}


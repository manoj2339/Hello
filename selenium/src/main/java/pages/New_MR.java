package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_MR {

	public WebDriver driver; 
	private WebDriverWait wait;

	  
	public By MR_Dashboard = By.xpath("(//span[text()='Sourcing Management'])[2]");
	public By MR_Menu = By.xpath("//span[text()='Material Requisition']");
    public By Create_MR = By.xpath("//button[text()='New MR']"); 
   
     
    public By EntitySelect = By.xpath("//mat-select[@formcontrolname='entityId']");
    public By EntityDropDown = By.xpath("//mat-option[.//span[text()='Krya Enterprise']]");
    public By DeptselectL1 = By.xpath("//mat-select[@formcontrolname='entityLevel1']");
    public By DeptDropDown  = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Raj-NewDept-1 - 001-1']");
    public By DeptL2 = By.xpath("//mat-select[@formcontrolname='entityLevel2']");
    public By DeptL2Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='test - PR for Bluestone']");
    public By DeptL3 = By.xpath("//mat-select[@formcontrolname='entityLevel3']");
    public By DeptL3Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Section1 - S01']");
    public By DeptL4 = By.xpath("//mat-select[@formcontrolname='entityLevel4']");
    public By DeptL4Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Project1 - P01']"); 

    public By Entershortname = By.xpath("//input[@formcontrolname='shortName']");
    public By EnterDesp = By.xpath("//textarea[@formcontrolname='description']");
    
    public By Needbydate = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[3]"); 
    public By SelectDate = By.xpath("//span[normalize-space(text())='30']");
    
    public By AddItems = By.xpath("//button[contains(text(), 'Add Items')]"); 
    
    public By Checkbox1 = By.xpath("(//input[@type='checkbox' and contains(@class, 'ag-checkbox-input')])[8]"); 
    	 	
    public By AddButton = By.xpath("(//button[contains(text(), 'Add')])[2]");
    
    public By Quantity = By.xpath("//input[@formcontrolname='quantity']");
  
    public By Addremarks = By.xpath("//textarea[@formcontrolname='remarksToStoreKeeper']");
    public By saveasdraft = By.xpath("//button[text()='Save as Draft']");
    
     
    
  //Constructor
    public New_MR(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
    }
  
    public void clickOnMRDashboard() {
        WebElement dashboard = wait.until(ExpectedConditions.elementToBeClickable(MR_Dashboard));
        dashboard.click();
    }

    public void clickOnMRMenu() {
        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(MR_Menu));
        menu.click();
    }

    public void clickOnCreateMR() {
        WebElement createButton = wait.until(ExpectedConditions.elementToBeClickable(Create_MR));
        createButton.click();
//		return createButton;
    }
    
    public void selectEntity() {
        wait.until(ExpectedConditions.elementToBeClickable(EntitySelect)).click();
        wait.until(ExpectedConditions.elementToBeClickable(EntityDropDown)).click();
    }

    public void DepartmentL1() {
        wait.until(ExpectedConditions.elementToBeClickable(DeptselectL1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(DeptDropDown)).click();
    }

    public void DepartmentL2() {
        wait.until(ExpectedConditions.elementToBeClickable(DeptL2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(DeptL2Dropdown)).click();
    }

    public void DepartmentL3() {
        wait.until(ExpectedConditions.elementToBeClickable(DeptL3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(DeptL3Dropdown)).click();
    }

    public void DepartmentL4() {
        wait.until(ExpectedConditions.elementToBeClickable(DeptL4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(DeptL4Dropdown)).click();
    }

    public void getShortName(String shortName) {
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(Entershortname));
        inputField.sendKeys(shortName);
    }
    
    public void getDesp(String Desp) {
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(EnterDesp));
        inputField.sendKeys(Desp);
    }
    
    public void getDeliveryDateButton() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(Needbydate)).click();
        Thread.sleep(1000); 
        wait.until(ExpectedConditions.elementToBeClickable(SelectDate)).click();
    }

    public void clickAddItemButton() {
    	 wait.until(ExpectedConditions.elementToBeClickable(AddItems)).click();
    }
       
    
     
  //Check the second checkbox (Checkbox2)
    public void checkCheckbox11() throws Exception {
    Thread.sleep(5000);
     WebElement checkbox1 = driver.findElement(Checkbox1);
     if (!checkbox1.isSelected()) {
         checkbox1.click();  // Check the checkbox if not already selected
     }
    }
  
    public void ClickAddbutton() {
        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(AddButton));
        addBtn.click();
    }

    public void EnterQuantity(String valueofunit) {
        WebElement quantityField = wait.until(ExpectedConditions.visibilityOfElementLocated(Quantity));
        quantityField.sendKeys(valueofunit);
    }

    public void Enterremarks(String remarks) {
        WebElement remarksField = wait.until(ExpectedConditions.visibilityOfElementLocated(Addremarks));      
        remarksField.sendKeys(remarks);
    }
   
    public void Saveasdraft () {
    	driver.findElement(saveasdraft).click();
    }
    
}

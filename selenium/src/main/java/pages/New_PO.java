package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_PO {

public WebDriver driver;  
	
	public By PO_Dashboard = By.xpath("(//span[text()='Order Management'])[2]");
	public By PO_Menu = By.xpath("//span[text()='Purchase Orders']");
    public By Create_PO = By.xpath("//button[text()='New PO']"); 
       
    public By EntitySelect = By.xpath("//mat-select[@formcontrolname='entityId']");
    public By EntityDropDown = By.xpath("//mat-option[.//span[text()='Krya Enterprise']]");
    public By DeptselectL1 = By.xpath("//mat-select[@formcontrolname='level1Id']"); 
    public By DeptDropDown  = By.xpath("//span[text()='Raj-NewDept-1-001-1']");
    public By DeptL2 = By.xpath("//mat-select[@formcontrolname='level2Id']");
    public By DeptL2Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='test-PR for Bluestone']");
    public By DeptL3 = By.xpath("//mat-select[@formcontrolname='level3Id']");
    public By DeptL3Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Section1-Sec01']");
    public By DeptL4 = By.xpath("//mat-select[@formcontrolname='level4Id']");
    public By DeptL4Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Project1-P01']"); 
 
    public By Shortname = By.xpath("//input[@formcontrolname='shortName']");
    public By PO_Currency = By.xpath("//mat-select[@formcontrolname='currencyId']");
    public By Curr_LOV  = By.xpath("(//span[text()='INR - ₹'])[1]");
    public By PO_Value = By.xpath("//input[@formcontrolname='poValue']");
    public By SupplierID = By.xpath("//mat-select[@formcontrolname='supplierId']");
    public By SupplierLOV = By.xpath("//span[text()='HEXAWARE']");
    public By PurchaseType = By.xpath("//mat-select[@formcontrolname='purchaseTypeId']");
    public By PurchasetypeLOV  = By.xpath("//span[text()='Local']");
    public By POType = By.xpath("//mat-select[@formcontrolname='purchaseOrderTypeId']");
    public By POTypeLOV = By.xpath("//span[text()='Local PO']");
    public By ClassificationID = By.xpath("//mat-select[@formcontrolname='purchaseClassificationId']");
    public By ClassificationIDLOV = By.xpath("//span[text()='General']");
    public By spendTypeId = By.xpath("//mat-select[@formcontrolname='spendTypeId']");
    public By spendTypeIdLOV = By.xpath("//span[text()='Revenue Purchase']");
    public By purchaseSourceTypeId = By.xpath("//mat-select[@formcontrolname='purchaseSourceTypeId']");
    public By purchaseSourceTypeIdLOV = By.xpath("//span[text()='In-Sourcing']");
    public By Deliverydate = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[4]"); 
    public By SelectDate = By.xpath("//span[normalize-space(text())='30']");
    public By paymentTermsId = By.xpath("//mat-select[@formcontrolname='paymentTermsId']");
    public By PaymentLOV = By.xpath("//span[text()='Pay Net 30-Days']");
     
    public By Line1 = By.xpath("//input[@formcontrolname='addressLine1']");
    
    public By Country = By.xpath("//mat-select[@formcontrolname='countryId']");
    public By CountryLOV = By.xpath("//span[text()=' India ']");
    
    public By State = By.xpath("//mat-select[@formcontrolname='stateId']");
    public By StateLOV = By.xpath("//span[text()=' Tamil Nadu ']");
    
    public By Shipaddress = By.xpath("(//input[contains(@class, 'mdc-checkbox__native-control')])[8]");
     
    public By AddItems = By.xpath("//button[@mattooltip='Add Item Table Row']");
    
//  public By Checkbox1 = By.xpath("(//input[@data-ref='eInput' and @type='checkbox'])[7]");
    
    public By Checkbox2 = By.xpath("(//input[@data-ref='eInput' and @type='checkbox'])[7]");         // ADD ITEMS
    	 	
    public By AddButton = By.xpath("(//button[contains(text(), 'Add')])[3]");
     
    public By Quantity = By.xpath("//input[@formcontrolname='quantity']"); 
    public By Unitrate = By.xpath("//input[@formcontrolname='unitRate']");
  
    public By Addremarks = By.xpath("//textarea[@formcontrolname='shippingRemarks']");
   
    
    public By Milestoneitem = By.xpath("//mat-select[@formcontrolname='description']");
    public By MilestoneitemLOV = By.xpath("//span[text()='1001 - RAM-1001']");                    //MCC Change the Data here 
    
     
    
    public By AddDesp = By.xpath("//mat-select[@formcontrolname='milestoneDescription']");
    public By DespLOV =  By.xpath("//span[text()='Upon Collection of Delivery']");
    
    public By Milestonevalue = By.xpath("//mat-select[@formcontrolname='fixedValueType']");
    public By MilestonevalueLOV = By.xpath("//span[text()='%']");
    
     
    public By Value = By.xpath("//input[@formcontrolname='value']");
    
    public By Entervalue = By.xpath("//input[@formcontrolname='value']");
    public By Completiondate = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[8]");
    public By MilestoneSelectDate = By.xpath("//span[normalize-space(text())='30']");
   
    public By Saveasdraft = By.xpath("//button[contains(@class, 'btn-blue') and contains(text(), 'Save as Draft')]");
    
//Constructor
public New_PO(WebDriver driver) {
    this.driver = driver;
}
 
// Methods
public void goToDashboard() {
    driver.findElement(PO_Dashboard).click();
    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(PO_Menu));
    
    driver.findElement(PO_Menu).click();
}
 
public void clickCreatePO() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(Create_PO)).click();
}

public void selectEntity() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.elementToBeClickable(EntitySelect)).click(); 
    wait.until(ExpectedConditions.elementToBeClickable(EntityDropDown)).click();
}


public void DepartmentL1() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // You can adjust the wait time (e.g., 10 seconds)

    
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

public void DepartmentL4() throws InterruptedException {
    driver.findElement(DeptL4).click();
    Thread.sleep(500);
    driver.findElement(DeptL4Dropdown).click();
}


public WebElement getShortnameField() {
    return driver.findElement(Shortname);
}

public WebElement getPOCurrencyDropdown() {
    return driver.findElement(PO_Currency);
}

public WebElement getCurrencyLOV() {
    return driver.findElement(Curr_LOV);
}

public WebElement getPOValueField() {
    return driver.findElement(PO_Value);
}

public WebElement getSupplierIDDropdown() {
    return driver.findElement(SupplierID);
}

public WebElement getSupplierLOV() {
    return driver.findElement(SupplierLOV);
}

public WebElement getPurchaseTypeField() {
    return driver.findElement(PurchaseType);
}
 
public WebElement getPurchasetypeLOV() {
    return driver.findElement(PurchasetypeLOV);
}

public WebElement getPOTypeDropdown() {
    return driver.findElement(POType);
}

public WebElement getPOTypeLOV() {
    return driver.findElement(POTypeLOV);
}

public WebElement getClassificationIDDropdown() {
    return driver.findElement(ClassificationID);
}

public WebElement getClassificationIDLOV() {
    return driver.findElement(ClassificationIDLOV);
}

public WebElement getSpendTypeIDDropdown() {
    return driver.findElement(spendTypeId);
}

public WebElement getSpendTypeIDLOV() {
    return driver.findElement(spendTypeIdLOV);
}

public WebElement getPurchaseSourceTypeIDDropdown() {
    return driver.findElement(purchaseSourceTypeId);
}

public WebElement getPurchaseSourceTypeIDLOV() {
    return driver.findElement(purchaseSourceTypeIdLOV);
}

public WebElement getDeliveryDateButton() {
    return driver.findElement(Deliverydate);
}

public WebElement getSelectDateButton() {
    return driver.findElement(SelectDate);
}

public WebElement getPaymentTermsIDDropdown() {
    return driver.findElement(paymentTermsId);
}

public WebElement getPaymentLOV() {
    return driver.findElement(PaymentLOV);
}

public WebElement getLine1() {
    return driver.findElement(Line1);
}

public WebElement getCountryDropdown() {
    return driver.findElement(Country);
}

public WebElement getCountryLOV() {
    return driver.findElement(CountryLOV);
}

public WebElement getStateDropdown() {
    return driver.findElement(State);
}

public WebElement getStateLOV() { 
    return driver.findElement(StateLOV);
}

public WebElement getShipAddressCheckbox() {
    return driver.findElement(Shipaddress);
}


// Click on the Add Item button

public void clickAddItemButton() {
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
public void checkCheckbox1() {
 WebElement checkbox1 = driver.findElement(Checkbox2);
 if (!checkbox1.isSelected()) {
     checkbox1.click();  // Check the checkbox if not already selected
 }
}



 public void ClickAddbutton() {
	 driver.findElement(AddButton).click();
 }


 public void EnterQuantity(String valueofunit) {
	 driver.findElement(Quantity).sendKeys(valueofunit);
 }
 
 public void Enterunitrate (String Enterrate) {
	 driver.findElement(Unitrate).sendKeys(Enterrate);
 }
 
 public void Enterremarks (String remarks) {
	 driver.findElement(Addremarks).sendKeys(remarks);
 }
 
  
 public void EnterMilestoneitem() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait until the Milestoneitem element is visible and then click 
	    WebElement milestoneItemElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Milestoneitem));
	    milestoneItemElement.click();

	    // Wait until the MilestoneitemLOV element is visible and then click
	    WebElement milestoneItemLOVElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MilestoneitemLOV));
	    milestoneItemLOVElement.click();
	}
 
 
 public void Getmilestonedesp () {
	 driver.findElement(AddDesp).click();
	 driver.findElement(DespLOV).click();
 }
 
 public void Entermilestonevalue() {
	 driver.findElement(Milestonevalue).click();
	 driver.findElement(MilestonevalueLOV).click();
 }
  
 
 public void Entervalue (String getvalue) {
	 driver.findElement(Value).sendKeys(getvalue);
 }
 
 
 public void getCompletionDate() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
	 // Wait until the Completiondate element is visible
	    WebElement completionDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Completiondate));
	    completionDateElement.click();
        
	 // Wait until the MilestoneSelectDate element is visible
	    WebElement milestoneSelectDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MilestoneSelectDate));
	    Thread.sleep(500);
	    milestoneSelectDateElement.click();
	}
 
   
 
 public void clicksaveasdraft() {
	 driver.findElement(Saveasdraft).click();
 }
}
package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_RFQ {

public WebDriver driver; 
	
	public By RFQ_Dashboard = By.xpath("(//span[text()='Sourcing Management'])[2]");
	public By RFQ_Menu = By.xpath("//span[text()='Request for Quotation']");
    public By Create_RFQ = By.xpath("//button[text()='New RFQ ']"); 
    
         
    public By EntitySelect = By.xpath("//mat-select[@formcontrolname='entityid']");
    public By EntityDropDown = By.xpath("//mat-option[.//span[text()='Krya Enterprise']]");
    public By DeptselectL1 = By.xpath("//mat-select[@formcontrolname='level1']");
    public By DeptDropDown  = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Raj-NewDept-1 - 001-1']");
    public By DeptL2 = By.xpath("//mat-select[@formcontrolname='level2']");
    public By DeptL2Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='test - PR for Bluestone']"); 
    public By DeptL3 = By.xpath("//mat-select[@formcontrolname='level3']");
    public By DeptL3Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Section1 - S01']");
    public By DeptL4 = By.xpath("//mat-select[@formcontrolname='level4']");
    public By DeptL4Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Project1 - P01']"); 

    public By Entershortname = By.xpath("//input[@formcontrolname='shortName']");
    
    public By Classification = By.xpath("//mat-select[@formcontrolname='purchaseClarification']");
    public By ClassificationLOV = By.xpath("//span[text()='General']");
    
    public By spendTypeId = By.xpath("//mat-select[@formcontrolname='spendType']");
    public By spendTypeIdLOV = By.xpath("//span[text()='Revenue Purchase']");
     
    public By Buyer = By.xpath("//mat-select[@formcontrolname='buyerId']");
    public By BuyerLOV  = By.xpath("//span[text()='Karthick Gopal']");
    
    public By Ratetype = By.xpath("//mat-select[@formcontrolname='rateType']");
    public By RatetypeLOV  = By.xpath("//span[text()='Corporate']");
    
    public By SourceType = By.xpath("//mat-select[@formcontrolname='sourcingType']");
    public By SourceTypeLOV = By.xpath("//span[text()='In-Sourcing']");
    
    public By purchaseType = By.xpath("//mat-select[@formcontrolname='purchaseType']");
    public By purchaseTypeLOV = By.xpath("//span[text()='Local']");
    
    public By participation = By.xpath("//mat-select[@formcontrolname='participantType']");
    public By participationLOV = By.xpath("//span[text()='Public']");
    
    public By EnterDesp = By.xpath("//textarea[@formcontrolname='description']");
    
    public By Address1 = By.xpath("(//input[@formcontrolname='addressLine1'])[1]");  
    public By Address2 = By.xpath("(//input[@formcontrolname='addressLine2'])[1]");
    public By CountryID = By.xpath("(//mat-select[@formcontrolname='countryId'])[1]");
    public By CountryLOV = By.xpath("//span[text()=' India ']");
    public By stateID = By.xpath("(//mat-select[@formcontrolname='stateId'])[1]");
    public By StateLOV = By.xpath("//span[text()=' Andhra Pradesh ']");
    public By Sameasadd = By.xpath("(//mat-checkbox//input[@type='checkbox'])[10]");
    
    
    public By Selectdate = By.xpath("//span[text()=' 1 ']");
    public By Selectneedbydate = By.xpath("//span[text()=' 30 ']");
    
//    public By ApproveDate = By.xpath("//input[@formcontrolname='approvedDate']");
//    public By Publishdate = By.xpath("//input[@formcontrolname='publishDate']");
    
    
    public By Clarificationdate = By.xpath("//input[@formcontrolname='clarificationDate']");
    public By Clarification_Response = By.xpath("//input[@formcontrolname='responseDate']");
    public By Submission = By.xpath("//input[@formcontrolname='submissionDueDate']");
    public By Responseopen = By.xpath("//input[@formcontrolname='responseOpenDate']");
    public By Awardprocessing = By.xpath("//input[@formcontrolname='awardProcessingDate']");
    public By Awarddate = By.xpath("//input[@formcontrolname='awardDate']");
    public By Needbydate = By.xpath("//input[@formcontrolname='needByDate']");
    public By ExpValidity = By.xpath("//input[@formcontrolname='expectedValidity']");
    public By ExpValid = By.xpath("//mat-select[@formcontrolname='validityValueId']");
    public By ExpValidLOV = By.xpath("//span[text()='Days']");
    
    
    public By FunctionalCurr = By.xpath("//mat-select[@formcontrolname='functionalCurrencyId']");
    public By FunctionalLOV = By.xpath("(//span[text()=' USD - $ '])[1]");
    
    public By Additems = By.xpath("//button[contains(text(), 'Add Items')]");
    
    public By Checkbox22 = By.xpath("(//input[@data-ref='eInput' and @type='checkbox'])[8]");  
    public By Searchbox = By.xpath("//button[normalize-space(text())='Search']");  
    public By Addbutton = By.xpath("(//button[contains(text(), 'Add')])[2]");
    
    public By Quantity = By.xpath("//input[@formcontrolname='quantity']"); 
    public By Addicon = By.xpath("//button[@mattooltip='Search & Add Suppliers']");
    public By Checkbox11 = By.xpath("(//input[@data-ref='eInput' and @type='checkbox'])[8]");
    
    public By Addsupplierbutton = By.xpath("(//button[contains(@class, 'btn-blue') and contains(text(), 'Add')])[2]");
    
    public By Adddesp = By.xpath("(//*[@formcontrolname='description'])[4]");
    
    
    public By Doc1 = By.xpath(("(//input[@formcontrolname='docDescription'])[1]"));
    public By Doc2 = By.xpath(("(//input[@formcontrolname='docDescription'])[2]")); 
    public By Doc3 = By.xpath(("(//input[@formcontrolname='docDescription'])[3]"));
    
    
    public By saveasdraft = By.xpath("//button[contains(text(),'Save as Draft ')]");
    
 
public New_RFQ(WebDriver driver) { 
    this.driver = driver;
   
}
  
// Methods
public void goToDashboard() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(RFQ_Dashboard).click();
}
     
    public void goToRFQMenu() {  
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(RFQ_Menu).click();
}

public void clickCreateRFQ() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(Create_RFQ)).click();
}
 
public void selectEntity() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.elementToBeClickable(EntitySelect)).click(); 
    wait.until(ExpectedConditions.elementToBeClickable(EntityDropDown)).click();
}
 

public void DepartmentL1() {
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

public void DepartmentL4() throws InterruptedException {
    driver.findElement(DeptL4).click();
    Thread.sleep(500);
    driver.findElement(DeptL4Dropdown).click();
}
 
public void getshortname (String Short) {
	driver.findElement(Entershortname).sendKeys(Short);
}


public void Classification() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(Classification)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(ClassificationLOV)).click();
}

public void SpendType() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(spendTypeId)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(spendTypeIdLOV)).click();
}

public void Buyer() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(Buyer)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(BuyerLOV)).click();
}

public void RateType() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(Ratetype)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(RatetypeLOV)).click();
}

public void SourceType() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(SourceType)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(SourceTypeLOV)).click();
}

public void PurchaseType() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(purchaseType)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseTypeLOV)).click();
}

public void ParticipationType() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(participation)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(participationLOV)).click();
}

public void EnterDesp (String EnterValue) {
	driver.findElement(EnterDesp).sendKeys(EnterValue);
}

public void enterAddress1(String address) {
    driver.findElement(Address1).sendKeys(address);
}

public void enterAddress2(String address) {
    driver.findElement(Address2).sendKeys(address);
}

public void selectCountryIndia() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(CountryID).click();
    wait.until(ExpectedConditions.elementToBeClickable(CountryLOV)).click();
}

public void selectStateAP() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(stateID).click();
    wait.until(ExpectedConditions.elementToBeClickable(StateLOV)).click();
}
 
public void clickSameAsAddressCheckbox() {
    driver.findElement(Sameasadd).click();
} 


public void GetClarificationdate() throws Exception  { 
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(Clarificationdate).click();
   wait.until(ExpectedConditions.elementToBeClickable(Selectdate)).click();
}
public void GetClarification_Response() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(Clarification_Response).click();
    Thread.sleep(400);
    wait.until(ExpectedConditions.elementToBeClickable(Selectdate)).click();
} 
public void GetSubmission() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(Submission).click();
    Thread.sleep(400);
    wait.until(ExpectedConditions.elementToBeClickable(Selectdate)).click();
} 
public void GetResponseopen() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(Responseopen).click();
    Thread.sleep(400);
    wait.until(ExpectedConditions.elementToBeClickable(Selectdate)).click();
}
public void GetAwardprocessing() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(Awardprocessing).click();
    Thread.sleep(400);
    wait.until(ExpectedConditions.elementToBeClickable(Selectdate)).click();
}
public void GetAwarddate() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(Awarddate).click();
    Thread.sleep(400);
    wait.until(ExpectedConditions.elementToBeClickable(Selectdate)).click();
}

public void GetNeedbydate() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(Needbydate).click();
    Thread.sleep(400);
    wait.until(ExpectedConditions.elementToBeClickable(Selectneedbydate)).click();
}

public void GetValidityinput (String Add) {
	driver.findElement(ExpValidity).sendKeys(Add);
}

public void GetValidityinputLOV() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(ExpValid).click();
    wait.until(ExpectedConditions.elementToBeClickable(ExpValidLOV)).click();
}



public void clickFunctionalCurrency() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(FunctionalCurr)).click();
}

public void selectUSDFromLOV() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(FunctionalLOV)).click();
}

//public void clickAddItems() {
//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    wait.until(ExpectedConditions.elementToBeClickable(Additems)).click();
//}
// 


public void clickAddItems() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    // Wait until the element is present and clickable
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Additems));

    // Scroll the element into view using JavaScript
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    // Click the element
    element.click();
}


public void clicksearch() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.elementToBeClickable(Searchbox)).click();	
}
//Check the second checkbox (Checkbox2)
public void checkCheckbox1() {
WebElement checkbox1 = driver.findElement(Checkbox22);
if (!checkbox1.isSelected()) {
   checkbox1.click();  // Check the checkbox if not already selected
}
}

public void ClickAdd() { 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(Addbutton)).click();	
}

public void QualityEnter(String Qualityenter) {
    driver.findElement(Quantity).sendKeys(Qualityenter);
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
public void Adddescp (String AddDesption){
	driver.findElement(Adddesp).sendKeys(AddDesption);
}


public void Declaredoc1 (String Docset) {
   driver.findElement(Doc1).sendKeys(Docset);
}
   
public void Declaredoc2 (String Docset) {
	   driver.findElement(Doc2).sendKeys(Docset);
	}

public void Declaredoc3 (String Docset) {
	   driver.findElement(Doc3).sendKeys(Docset);
	}
	   
	     
   
	
public void savebtn () {
	driver.findElement(saveasdraft).click();
}
}
    
    
    
    
    

    
    
    
    


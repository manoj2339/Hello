package pages;

import java.time.Duration;
import java.util.Map;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inventory {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public Inventory(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By INV_Dashboard = By.xpath("(//span[text()='Inventory Management'])[2]");
    private final By INV_Menu = By.xpath("//span[text()='Inventory']");
    public By Create_INV = By.xpath("//button[text()='New Item ']");

    private final By Code = By.xpath("//input[@formcontrolname='code']");
    private final By shortname = By.xpath("//input[@formcontrolname='shortName']");
    private final By Desp = By.xpath("//input[@formcontrolname='description']");
    private final By TypeID = By.xpath("//mat-select[@formcontrolname='itemTypeId']");
    private final By TypeIDLOV = By.xpath("//span[text()='Goods']");
    
    private final By UOM = By.xpath("//mat-select[@formcontrolname='primaryUOMId']");
    private final By SelectUOM = By.xpath("//span[text()='Nos']");   
    
     
    private final By naturalAccount = By.xpath("//input[@formcontrolname='naturalAccountCode']");
    public By Subaccount = By.xpath("//input[@formcontrolname='subAccountCode']");

    private final By Parentcat = By.xpath("//mat-select[@formcontrolname='parentCategoryId']");
    private final By ParentLOV = By.xpath("//span[text()='Finance']");
    private final By Subcat = By.xpath("//mat-select[@formcontrolname='subCategoryId']");
    private final By SubLOV = By.xpath("//span[text()='Services']");
    private final By childcat = By.xpath("//mat-select[@formcontrolname='childCategoryId']");
    private final By ChildLOV = By.xpath("//span[text()='Audit Services']");

    private final By saveButton = By.xpath("//button[text()='Save as Draft']");
    

    // Click Dashboard
    public void clickInventoryDashboard() {
        wait.until(ExpectedConditions.elementToBeClickable(INV_Dashboard)).click();
    }

    // Click Inventory menu
    public void clickInventoryMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(INV_Menu)).click();
    }

    // Click "New Item" to create inventory
    public void clickCreateNewItem() {
        wait.until(ExpectedConditions.elementToBeClickable(Create_INV)).click();
    }

    // Form interactions
    public void enterCode(String code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Code)).sendKeys(code);
    }

    public void enterShortName(String shortName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(shortname)).sendKeys(shortName);
    }

    public void enterDescription(String description) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Desp)).sendKeys(description);
    }

    public void selectItemType() {
        wait.until(ExpectedConditions.elementToBeClickable(TypeID)).click();
        wait.until(ExpectedConditions.elementToBeClickable(TypeIDLOV)).click();
    }

//    public void SelectUOM() {
//        wait.until(ExpectedConditions.elementToBeClickable(UOM)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(SelectUOM)).click();
//    }
    
    public void SelectUOM() {
        WebElement uomElement = wait.until(ExpectedConditions.elementToBeClickable(UOM));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uomElement);
        uomElement.click();

        WebElement selectUomElement = wait.until(ExpectedConditions.elementToBeClickable(SelectUOM));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectUomElement);
        selectUomElement.click();
    }

    
    
    public void enterNaturalAccount(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(naturalAccount)).sendKeys(value);
    }

    public void enterSubaccount(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Subaccount)).sendKeys(value);
    }


    public void selectParentCategory() {
    // Use Duration for the timeout
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds

    // Wait for the Parent category element to be visible
    WebElement parentCategoryButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Parentcat));

    // Scroll the Parent category element into view if it's off-screen
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", parentCategoryButton);

    // Wait for the element to be clickable, then click it
    wait.until(ExpectedConditions.elementToBeClickable(parentCategoryButton)).click();

    // Wait for the Parent LOV element to be clickable and click it
    WebElement parentLOVButton = wait.until(ExpectedConditions.elementToBeClickable(ParentLOV));
    parentLOVButton.click();
    
     }

    public void selectSubcategory() {
        wait.until(ExpectedConditions.elementToBeClickable(Subcat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SubLOV)).click();
    }

    public void selectChildCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(childcat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ChildLOV)).click();
    }

    public void clickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }

   
    }


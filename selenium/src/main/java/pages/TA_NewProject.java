package pages;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TA_NewProject {

public WebDriver driver; 
	
	public By Proj_Dashboard = By.xpath("(//span[text()='Transit Agency'])[2]");
	public By Proj_Menu = By.xpath("//span[text()='Project']");
    public By New_Project = By.xpath("//button[text()='New Project']");
    
    
    public By EntitySelect = By.xpath("//mat-select[@formcontrolname='entityid']");
    public By EntityDropDown = By.xpath("//mat-option[.//span[text()='KRYA CHILD 8']]");
    public By DeptL1 = By.xpath("//mat-select[@formcontrolname='level1']");
    public By DeptL1Dropdown  = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='KRYA-BGV - 623472574']");
    public By DeptL2 = By.xpath("//mat-select[@formcontrolname='level2']");
    public By DeptL2Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='KRYA-EDUCATION - 246274225']"); 
    public By DeptL3 = By.xpath("//mat-select[@formcontrolname='level3']");
    public By DeptL3Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='KRYA-SUBMISSION - 76247627']");
    public By DeptL4 = By.xpath("//mat-select[@formcontrolname='level4']");
    public By DeptL4Dropdown = By.xpath("//span[@class='mdc-list-item__primary-text' and text()='KRYA-PRE QC - 26536253']"); 
	 
	
	public TA_NewProject(WebDriver driver) { 
	    this.driver = driver;
	   
	}
	  
	public void goToDashboard() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(Proj_Dashboard)).click();
	}

	public void goTotransagent() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(Proj_Menu)).click();
	}
	
	public void goTonewproject() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(New_Project)).click();
	}
	
	
	public void selectEntity() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(EntitySelect)).click(); 
	    wait.until(ExpectedConditions.elementToBeClickable(EntityDropDown)).click();
	}
	 
	
	public void DepartmentL1() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(DeptL1)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(DeptL1Dropdown)).click();
	}
	
	
	public void DepartmentL2() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(DeptL2)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(DeptL2Dropdown)).click();
	}

	public void DepartmentL3() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(DeptL3)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(DeptL3Dropdown)).click();
	}

	public void DepartmentL4() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(DeptL4)).click();  
	    wait.until(ExpectedConditions.elementToBeClickable(DeptL4Dropdown)).click();
	}
	
}


package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {  
	
	private WebDriver driver;
	 
	// SUPPLIER INFORMATION LOCATORS [TAB ONE]  
	 
	private By Supplier_Type = By.xpath("//*[@formcontrolname='supplierTypeId']");
	private By Supplier_LOV = By.xpath("//span[text()='Investor']");
	private By Est_Date = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[1]");
	private By Est_Select = By.xpath("//span[normalize-space(text())='1']"); 
	private By Issue_Date = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[2]");
	private By Issue_select = By.xpath("//span[normalize-space(text())='1']");
	private By Issue_By = By.xpath("//input[@formcontrolname='issuedBy']");
	private By Ownership = By.xpath("//mat-select[@formcontrolname='typeOfOwnershipId']");
	private By Ownership_LOV = By.xpath("//span[text()=' Individual ']");
	private By Location = By.xpath("//input[@formcontrolname='location']");
	private By Expiry_Date = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[3]");
    private By Expiry_Select = By.xpath("//span[normalize-space(text())='30']");
    private By Salutation1 = By.xpath("//mat-select[@formcontrolname='salutationId']");
    private By Salutation_DropDown1 = By.xpath("//span[text()=' Mr ']");
	private By First_Name = By.xpath("//input[@formcontrolname='managerFirstName']");
	private By Last_Name = By.xpath("//input[@formcontrolname='managerLastName']");
	private By Role = By.xpath("//mat-select[@formcontrolname='managerRole']");
	private By Role_LOV =By.xpath("//span[text()='Administrator']");
	private By Job_Title = By.xpath("//input[@formcontrolname='managerJobTitle']");
	public By save_as_draft = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
    private By Supplier_Next = By.xpath("//button[contains(text(), 'Next')]");
  
     
   // REGISTERED ADDRESS [TAB TWO]
    
    private By Select_address_type = By.xpath("//mat-select[@formcontrolname='addressTypeId']"); 
    private By Addresstype_LOV = By.xpath("//span[text()=' Billing Site ']"); 
    private By Address_Line1 = By.xpath("//input[@formcontrolname='addressLine1']");
    private By Address_Line2 = By.xpath("//input[@formcontrolname='addressLine2']");
    private By Select_Country = By.xpath("//mat-select[@formcontrolname='countryId']");
    private By Country_LOV = By.xpath("//span[text()=' India ']");
    private By Select_State = By.xpath("//mat-select[@formcontrolname='stateId']");
    private By State_LOV = By.xpath("//span[text()=' Tamil Nadu ']");
    private By Select_City = By.xpath("//mat-select[@formcontrolname='cityId']");
    private By City_LOV = By.xpath("//span[text()=' Chennai ']"); 
    
    private By Tax_Type = By.xpath("//mat-select[@formcontrolname='taxTypeId']");
    private By Tax_LOV = By.xpath("//span[text()=' Pan Registration ']");
    private By Enter_Tax_Number = By.xpath("//input[@formcontrolname='registrationNumber']");
    
    public By ADDRESS_save_button =By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
    private By Address_Next = By.xpath("//button[contains(text(), 'Next')]");
  
    
    //CONTACT DETAILS [TAB THREE]
    
    public By Next_Contact = By.xpath("//button[contains(text(), 'Next')]");
    
    //FINANCIAL & BUSINESS [TAB FOUR] 
    
    private By Exp_His_Dropdown = By.xpath("//mat-select[@formcontrolname='experienceId']");
    private By Exp_LOV = By.xpath("//span[text()='4-6 Years']");
    private By Currency_Dropdown = By.xpath("//mat-select[@formcontrolname='currencyId'][1]");    
    private By Currency_LOV = By.xpath("//mat-option[.//span[contains(text(), 'INR - ₹')]]");
    private By Current_Project = By.xpath("//input[@formcontrolname='aggregateValueProjects']"); 
    private By Value_To_Undertake = By.xpath("//input[@formcontrolname='maxValueOfProjectUndertake']");
    private By Project_Dropdown = By.xpath("//mat-select[@formcontrolname='projectStatusId']");      
    private By Project_LOV_1 = By.xpath("//span[text()='Ongoing Project']");
    private By Customer_Name = By.xpath("//input[@formcontrolname='customerName']");
    private By Start_Date = By.xpath("//input[@formcontrolname='startDate']");
    private By End_Date = By.xpath("//input[@formcontrolname='endDate']");
    private By Project_Country = By.xpath("//mat-select[@formcontrolname='countryId']");
    private By Project_Country_LOV = By.xpath("//span[text()=' India ']");
    private By Currency_Project_Dropdown = By.xpath("//mat-select[@formcontrolname='currencyId']");    
    private By Currenct_Project_LOV = By.xpath("//span[text()=' IND - ₹ ']");
    private By Project_Value = By.xpath("//input[@formcontrolname='value']");
    private By Project_Desp = By.xpath("//textarea[@formcontrolname='projectDescription']");
    private By Asset_Year1_From = By.xpath("//input[@formcontrolname='fromDateYear1'][1]");      // DUP value (1)     
    private By Asset_Year1_To = By.xpath("//input[@formcontrolname='toDateYear1'][1]");          // DUP value (1)
    private By Asset_Amount = By.xpath("//input[@formcontrolname='valueYear1'][1]");             // DUP value (1)
    
    private By Lieb_Year1_From = By.xpath("(//input[@formcontrolname='fromDateYear1'])[2]");       // DUP value (2)
    private By Lieb_Year1_To = By.xpath("(//input[@formcontrolname='toDateYear1'])[2]");           // DUP value (2)
    private By Lieb_Amount = By.xpath("(//input[@formcontrolname='valueYear1'])[2]");              // DUP value (2)
    private By Credit_Limit = By.xpath("//input[@formcontrolname='creditLimit']");
    private By Credit_Expo_limit = By.xpath("//input[@formcontrolname='creditExposureLimit']");
    private By Credit_Pro_Limit = By.xpath("//input[@formcontrolname='projectLimit']");
    public By Fin_save_Button = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
    private By Fin_Next = By.xpath("//button[contains(text(), 'Next')]");
    

    // BANK DETAILS LOCATORS
    
    
    private By Bank_Name = By.xpath("//input[@formcontrolname='bankName']");
    private By Branch_Name = By.xpath("//input[@formcontrolname='branch']"); 
    private By Bank_Currency = By.xpath("//mat-select[@formControlName='currencyId']"); 
    private By Bank_Currency_LOV = By.xpath("//span[text()=' INR - ₹ ']");
    private By Bank_Country = By.xpath("//mat-select[@formControlName='countryId']");
    private By Bank_Country_LOV = By.xpath("//span[text()=' India ']");
    private By Bank_State = By.xpath("//mat-select[@formControlName='stateId']"); 
    private By Bank_State_LOV = By.xpath("//span[text()=' Tamil Nadu ']"); 
    private By Bank_City = By.xpath("//mat-select[@formControlName='cityId']");
    private By Bank_City_LOV = By.xpath("//span[text()=' Chennai ']");
    private By Bank_Account_Number = By.xpath("//input[@formcontrolname='accountNumber']");
    private By Bank_Swift_code =  By.xpath("//input[@formcontrolname='swiftCodeBIC']");
    private By Bank_IBAN = By.xpath("//input[@formcontrolname='iban']");
    private By Bank_BSB = By.xpath("//input[@formcontrolname='bsb']");
    private By Bank_Routing = By.xpath("//input[@formcontrolname='routing']");
    private By Bank_IFSC = By.xpath("//input[@formcontrolname='ifscCode']"); 
    public By Bank_save_Button = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
    private By Bank_Next = By.xpath("//button[contains(text(), 'Next')]");
    
 
    //CATEGORY AND SCOPE 
    
    private By parent_category = By.xpath("//input[@name='parentCategory']");
    private By parent_LOV = By.xpath("//span[text()=' Information Technology ']"); 
    private By sub_category = By.xpath("//input[@id='subCategory']");
    private By sub_LOV = By.xpath("//span[text()=' Application Support Services ']"); 
    private By child_category = By.xpath("//input[@name='childCategory']");
    private By child_LOV = By.xpath("//span[text()=' Oracle Technology Components ']"); 
    private By Support_type = By.xpath("//mat-select[@name='typeval']");
    private By Support_LOV = By.xpath("//span[text()='Specialized Profile']");
    private By Desp_type = By.xpath("//textarea[@name='optTextArea']");
    private By Upload_type = By.xpath("//input[@id='customFileLang']");
    
    public By Cat_save_Button = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
    private By Cat_Next = By.xpath("//button[contains(text(), 'Next')]"); 
    
    
    
    // PQ QUESTIONNIARE 
    
    private By Question1 = By.xpath("(//input[@formcontrolname='userResponse'])[1]");
    private By Question1upload = By.xpath("(//input[@formcontrolname='attachmentPath'])[1]");
    private By Question2 = By.xpath("(//input[@formcontrolname='userResponse'])[2]");
    private By Question3 = By.xpath("(//input[@formcontrolname='userResponse'])[3]");
    private By Question_4 = By.xpath("(//input[@formcontrolname='userResponse'])[4]");
    private By Question_42 = By.xpath("(//input[@type='radio'])[4]");    
    private By Question42Upload = By.xpath("(//input[@formcontrolname='attachmentPath'])[3]");
    private By Extraquestion = By.xpath("(//input[@formcontrolname='userResponse'])[3]");
    
    public By PQ_save_Button = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
  
    private By PQ_Next = By.xpath("//button[contains(text(), 'Next')]");
    
     
    
    // COMPLAINCE SUB TAB 1
    
    private By Activity = By.xpath("//input[@name='activityName']");
    private By Activity_LOV = By.xpath("//span[text()=' Electricity ']");
    private By Sub_activity = By.xpath("//input[@name='subActivityName']");
    private By Sub_Activity_LOV = By.xpath("//span[text()=' EV Cars ']");
    private By Activity_save = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
    public By Activity_Next = By.xpath("//button[contains(text(), 'Next')]");
    
    
    // COMPLAINCE SUB TAB 2 
    
    private By Category_Dropdown = By.xpath("//mat-select[@name='categoryName']");
    private By Category_LOV = By.xpath("//span[text()=' License ']");
    private By Lic_Type = By.xpath("//mat-select[@name='licenseTypeName']");
    private By Lic_Type_LoV = By.xpath("//span[text()=' Software Licensing ']");
    private By Lic_Name = By.xpath("//input[@name='licenseOrCertificatesName']");
    private By Lic_Number = By.xpath("//input[@name='licenseCertificateNumberName']");
    private By Lic_Issue_date = By.xpath("//input[@name='issueDateName']");
    private By Lic_Exp_date = By.xpath("//input[@name='expiryDateName']");
    private By Lic_Issue_auth = By.xpath("//input[@name='issuingAuthorityName']");
    private By Active_Status = By.xpath("//mat-select[@name='statusIdName']");
    private By Status_LOV = By.xpath("//span[text()=' Active ']");  
    
    private By Com2_save = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
    private By Com2_next = By.xpath("//button[contains(text(), 'Next')]");
    
    
    // COMPLAINCE SUB TAB 3 
    
    private By Relatedparty = By.xpath("//input[@name='relatedParty']");
    private By TypeofRelation = By.xpath("//input[@name='relationShip']");
    private By percentofowner = By.xpath("//input[@name='percentOfOwner']");
    private By Startdate = By.xpath("//input[@name='startDate']");
    
    private By save_Sub_tab3 = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
    private By Gonext_Sub_tab3 = By.xpath("//*[@id=\"mat-tab-content-0-7\"]/div/div[3]/div[2]/button[2]");
    
    
    
    // ATTACHMENT TAB 
    
    private By Attach1 = By.xpath("(//mat-select[@formcontrolname='attachmentTypeId'])[1]");
    private By Attach1_LOV = By.xpath("//span[text()=' Owner-Passport ']");
    private By Desp1 = By.xpath("(//textarea[@formcontrolname='description'])[1]");
    private By Attachupload1 = By.xpath("(//input[@class='custom-file-input'])[1]");
    
    private By Attach2 = By.xpath("(//mat-select[@formcontrolname='attachmentTypeId'])[2]");
    private By Attach2_LOV = By.xpath("//span[text()=' Owner-Visa ']");
    private By Desp2 = By.xpath("(//textarea[@formcontrolname='description'])[2]");
    private By Attachupload2 = By.xpath("(//input[@class='custom-file-input'])[2]");
    
    private By Attach3 = By.xpath("(//mat-select[@formcontrolname='attachmentTypeId'])[3]");
    private By Attach3_LOV = By.xpath("//span[text()=' POA-Passport ']");
    private By Desp3 = By.xpath("(//textarea[@formcontrolname='description'])[3]");
    private By Attachupload3 = By.xpath("(//input[@class='custom-file-input'])[3]");
    
    
    public By save_Attachment = By.xpath("/html/body//button[contains(text(), 'Save as Draft')]");
                                           
    private By next_Attachment = By.xpath("//button[contains(text(), 'Next')]");
    
    
    // PREVIEW TAB 
    
    private By previewfooter = By.xpath("//h5[text()=' Mandatory Attachment ']");
    public By Preview_gonext = By.xpath("//button[contains(text(), 'Next')]");
    

    // DECLARATION TAB 
    
    private By Checkbox1 = By.xpath("(//input[@class='mdc-checkbox__native-control'])[1]");
    private By Checkbox2 = By.xpath("(//input[@class='mdc-checkbox__native-control'])[1]"); 
    private By Checkbox3 = By.xpath("(//input[@class='mdc-checkbox__native-control'])[1]");
    public By submitform = By.xpath("//button[contains(@class, 'btn-blue') and contains(., 'Submit')]");
    
    //CONSTRUCTOR  
    
    public Registration(WebDriver driver) {
	 this.driver=driver;
    }
    
     
    // SUPPLIER INFORMATION METHODS [TAB ONE]
    
    public void One_Supplier_type () {
    	driver.findElement(Supplier_Type).click();
    }
    public void One_Supplier_LOV () {
    	driver.findElement(Supplier_LOV).click();
    }
    public void One_Est_date () throws InterruptedException {
        driver.findElement(Est_Date).click();
        Thread.sleep(500);
        driver.findElement(Est_Select).click();
    }
    public void One_Issue_date () throws InterruptedException {
    	driver.findElement(Issue_Date).click();
    	Thread.sleep(500);
    	driver.findElement(Issue_select).click();
    }
    public void One_Issue_By (String Enter_Issue_by) {
    	driver.findElement(Issue_By).sendKeys(Enter_Issue_by);
    }
    public void One_Ownership () {
    	driver.findElement(Ownership).click(); 
    }
    public void One_Ownership_LOV () {
    	driver.findElement(Ownership_LOV).click();
    }
    public void One_Location (String Enter_Location) {
    	driver.findElement(Location).sendKeys(Enter_Location);
    }
    public void One_Exp_date () throws InterruptedException {
    	driver.findElement(Expiry_Date).click();
    	Thread.sleep(500);
    	driver.findElement(Expiry_Select).click();
    }
    
    public void Sal() {
    	driver.findElement(Salutation1).click();
    	driver.findElement(Salutation_DropDown1).click();
    }
    public void One_First_Name(String Enter_First_Name) {
        WebElement firstNameInput = driver.findElement(First_Name);
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstNameInput);
       firstNameInput.sendKeys(Enter_First_Name);
       } 
    
    public void One_Last_Name (String Enter_Last_name) {
    	driver.findElement(Last_Name).sendKeys(Enter_Last_name);
    }
    public void One_Role() {
    	driver.findElement(Role).click();
    }
    public void One_Role_LOV () {
    	driver.findElement(Role_LOV).click();
    }
    public void One_Job_Title (String Enter_job) {
    	driver.findElement(Job_Title).sendKeys(Enter_job);
    }
    public void One_save_Draft () {
    	driver.findElement(save_as_draft).click();
    }   
    public void One_Click_Next() {
    	driver.findElement(Supplier_Next).click();
    }

    
    // ADDRESS INFORMATION METHODS [TAB TWO]

   public void Two_Address_type() {
	   driver.findElement(Select_address_type).click();
   }
   public void Two_Address_LOV() {
	   driver.findElement(Addresstype_LOV).click();
   }
   public void Two_Line_one (String Enter_Line_one) {
	   driver.findElement(Address_Line1).sendKeys(Enter_Line_one);
   }
   public void Two_Line_Two (String Enter_Line_Two) {
	   driver.findElement(Address_Line2).sendKeys(Enter_Line_Two);
   }
   public void Two_Country_Dropdown () {
	   driver.findElement(Select_Country).click();
   }
   public void Two_Country_LOV () {
	   driver.findElement(Country_LOV).click();
   }
   public void Two_State_select () {
	   driver.findElement(Select_State).click();
   }
   public void Two_State_LOV () {
	   driver.findElement(State_LOV).click();
   }
   public void Two_City_Dropdown() {
	   driver.findElement(Select_City).click();
   }
   public void Two_City_LOV() {
	   driver.findElement(City_LOV).click();
   }
   public void Tax_type_Dropdown () { 
	   driver.findElement(Tax_Type).click();
   }
   public void Tax_LOV_Select() {
	   driver.findElement(Tax_LOV).click();
   }
   public void Enter_Tax_number (String Tax_reg_no) {
	   driver.findElement(Enter_Tax_Number).sendKeys(Tax_reg_no);
   }
   public void Two_Save_Address() { 
	   driver.findElement(ADDRESS_save_button).click();
   }
   public void Two_Next () {
	   driver.findElement(Address_Next).click(); 
   }
   
   
  // CONTACT METHODS [TAB THREE]
   
   public void Three_Next_Btn () {
	   driver.findElement(Next_Contact).click();
   }
    
   
 //FINANCIAL & BUSINESS METHODS [TAB FOUR]
   
   public void Three_Click_Exp_Dropdown () {
	   driver.findElement(Exp_His_Dropdown).click();
   }
   public void Three_Select_Exp_LOV () {
	   driver.findElement(Exp_LOV).click();
   }
   public void Three_Click_Currency() {
	   driver.findElement(Currency_Dropdown).click();
   }
   public void Three_Currency_LOV() {
	   driver.findElement(Currency_LOV).click();
   }
   public void Three_Enter_Project(String Project_Value) {
	   driver.findElement(Current_Project).sendKeys(Project_Value);
   }
   public void Three_Enter_project_to_intake(String Intake_Value) {
	   driver.findElement(Value_To_Undertake).sendKeys(Intake_Value);
   }
   public void Three_Project_Dropdown () {
	   driver.findElement(Project_Dropdown).click();
   }
   public void Three_Project_LOV () {
	   driver.findElement(Project_LOV_1).click();
   }
   public void Three_Proj_Name(String Proj_Name) {
	   driver.findElement(Customer_Name).sendKeys(Proj_Name);
   }
   public void Three_Start_date (String Enter_Start_Name) {
	   driver.findElement(Start_Date).sendKeys(Enter_Start_Name);
   }
   public void Three_End_Date (String Enter_End_date) {
	   driver.findElement(End_Date).sendKeys(Enter_End_date);
   }
   public void Three_proj_Country () {
       driver.findElement(Project_Country).click();
   }
   public void Three_Proj_Country_LOV() {
	   driver.findElement(Project_Country_LOV).click();
   }
   public void Three_Curr_Dropdown () {
	   driver.findElement(Currency_Project_Dropdown).click();
   }
   public void Three_Proj_LOV () {
	   driver.findElement(Currenct_Project_LOV).click();
   }
   public void Three_Proj_Value (String Enter_Project_Value) {
	   driver.findElement(Project_Value).sendKeys(Enter_Project_Value);
   }
   public void Three_Proj_Desp (String Enter_Proj_Desp) {
	   driver.findElement(Project_Desp).sendKeys(Enter_Proj_Desp);
   }
   public void Three_Asset1_From (String Enter_From_Date) {
	   driver.findElement(Asset_Year1_From).sendKeys(Enter_From_Date);
   }
   public void Three_Asset1_To (String Enter_To_Date) {
	   driver.findElement(Asset_Year1_To).sendKeys(Enter_To_Date);
   }
   public void Three_Asset_Amount (String Enter_Amount) {
	   driver.findElement(Asset_Amount).sendKeys(Enter_Amount);
   }
   public void Three_Lie_Yr1_From (String Enter_Lie_From_date) {
	   driver.findElement(Lieb_Year1_From).sendKeys(Enter_Lie_From_date);
   }
   public void Three_lie_Yr1_To (String Enter_Lie_To_date) {
	   driver.findElement(Lieb_Year1_To).sendKeys(Enter_Lie_To_date);
   }
   public void Three_Lie_Amount (String Enter_Lie_Amount) {
	   driver.findElement(Lieb_Amount).sendKeys(Enter_Lie_Amount);
   }
   public void Three_Credit_Lt (String Enter_CC_1) {
	   driver.findElement(Credit_Limit).sendKeys(Enter_CC_1);
   }
   public void Three_Credit_Expo (String Enter_CC_2) {
	   driver.findElement(Credit_Expo_limit).sendKeys(Enter_CC_2);
   }
   public void Three_Credit_pro (String Enter_CC_3) {
	   driver.findElement(Credit_Pro_Limit).sendKeys(Enter_CC_3);
   }
   public void Three_FIn_save () {
	   driver.findElement(Fin_save_Button).click();
   }
   public void Three_FIn_Next_Btn() {
	   driver.findElement(Fin_Next).click();
   }

   // BANK DETAILS METHODS [TAB FIVE]
   
   public void Five_1Bank_Name (String Enter_Bank_Name) {
	   driver.findElement(Bank_Name).sendKeys(Enter_Bank_Name);
   }
   public void Five_2Enter_Branch (String Enter_Branch) {
	   driver.findElement(Branch_Name).sendKeys(Enter_Branch);
   }
   public void Five_3Currency_Dropdown () {
	   driver.findElement(Bank_Currency).click();
   }
   public void Five_4Currency_LOV () {
	   driver.findElement(Bank_Currency_LOV).click();
   }
   public void Five_5country_Dropdown () {
	   driver.findElement(Bank_Country).click();
   }
   public void Five_6Country_LOV() {
	   driver.findElement(Bank_Country_LOV).click();
   }
   public void Five_7State_DropDown () {
	   driver.findElement(Bank_State).click();
	   }
   public void Five_8State_LOV () {
	   driver.findElement(Bank_State_LOV).click();
   }
   public void Five_9City_Dropdown () {
	   driver.findElement(Bank_City).click();
   }
   public void Five_10City_LOV () {
	   driver.findElement(Bank_City_LOV).click();
   }
   public void Five_11Account (String Enter_Account_Number) {
	   driver.findElement(Bank_Account_Number).sendKeys(Enter_Account_Number);
   }
   public void Five_12swift (String Enter_Swift) {
	   driver.findElement(Bank_Swift_code).sendKeys(Enter_Swift);
   }
   public void Five_13IBAN (String Enter_IBAN_Number) {
	   driver.findElement(Bank_IBAN).sendKeys(Enter_IBAN_Number);
   }
   public void Five_14BSB (String Enter_BSB) {
	   driver.findElement(Bank_BSB).sendKeys(Enter_BSB);
   }
   public void Five_15Routing (String Enter_Rout) {
	   driver.findElement(Bank_Routing).sendKeys(Enter_Rout);
   }
   public void Five_16IFSC (String Enter_IFSC) {
	   driver.findElement(Bank_IFSC).sendKeys(Enter_IFSC);
   }
   public void Five_17Save () {
	   driver.findElement(Bank_save_Button).click();
   }
   public void Five_18Next() {
	   driver.findElement(Bank_Next).click();
   }
   
   //CATEGORY AND SCOPE METHODS 
   
   public void Six_1parent () {
	   driver.findElement(parent_category).click();
   }
   public void Six_2parent_LOV() {
	   driver.findElement(parent_LOV).click();
   }
   public void Six_3Sub () {
	   driver.findElement(sub_category).click();
   }
   public void Six_4sub_LOV () {
	   driver.findElement(sub_LOV).click();
   }
   public void Six_5child() {
	   driver.findElement(child_category).click();
   }
   public void Six_6child_LOV() {
	   driver.findElement(child_LOV).click();
   }
   public void Six_7sup_type() {
	   driver.findElement(Support_type).click();
   }
   public void Six_8sup_type_LOV() {
	   driver.findElement(Support_LOV).click();
   }
   public void Six_9Desp(String Enter_Desp) {
	   driver.findElement(Desp_type).sendKeys(Enter_Desp);
   }
   public void Six_10Upload(String Upload_file) {
	   driver.findElement(Upload_type).sendKeys(Upload_file);
   }
   public void Six_11cat_save() {
	   driver.findElement(Cat_save_Button).click();
   }
   public void Six_12cat_Next() {
	   driver.findElement(Cat_Next).click();
   }
   
   // PQ QUESTIONAARIE METHODS
     
   public void sev_1 (String Enter_question1) {
	   driver.findElement(Question1).sendKeys(Enter_question1);;
   }
   public void sev_2(String Upload_file1) {
	   driver.findElement(Question1upload).sendKeys(Upload_file1);
   }
   public void sev_3(String Enter_Question2) {
	   driver.findElement(Question2).sendKeys(Enter_Question2);
   }
   public void sev_4 (String Enter_Question3){
	   driver.findElement(Question3).sendKeys(Enter_Question3);
   }
   public void sev_5 (String Enter_Question4) {
	   driver.findElement(Question_4).sendKeys(Enter_Question4);
   }
   public void sev_6 () { 
	   driver.findElement(Question_42).click();
   }
   public void sev_7(String UploadQ2) {
	   driver.findElement(Question42Upload).sendKeys(UploadQ2);
   }
   public void sev_77(String ExtraADDon) {
	   driver.findElement(Extraquestion).sendKeys(ExtraADDon);
   }
   public void sev_8 () {
	   driver.findElement(PQ_save_Button).click();
   }
   public void Sev_9() throws InterruptedException {
	   driver.findElement(PQ_Next).click();
	   Thread.sleep(500);
//	   driver.findElement(PQ_Next).click();
   }
   
   // COMPLAINCE SUB TAB 1
   
   public void Eig_1 () {
	   driver.findElement(Activity).click();
   }
   public void Eig_2() {
	   driver.findElement(Activity_LOV).click();
   }
   public void Eig_3() {
	   driver.findElement(Sub_activity).click();
   }
   public void Eig_4() {
	   driver.findElement(Sub_Activity_LOV).click();
   }
   public void Eig_5() {
	   driver.findElement(Activity_save).click();
   }
   public void Eig_6() {
	   driver.findElement(Activity_Next).click();
   }
   
   
   // COMPLAINCE SUB TAB 2
   
    public void Nin_1(){
    	driver.findElement(Category_Dropdown).click();
    }
    public void Nin_2() {
    	driver.findElement(Category_LOV).click();
    }
   public void Nin_3() {
	   driver.findElement(Lic_Type).click();
   }
   public void Nin_4() {
	   driver.findElement(Lic_Type_LoV).click();
   }
   public void Nin_5(String LIc_name ) {
	   driver.findElement(Lic_Name).sendKeys(LIc_name);
   }
   public void Nin_6(String Lic_number) {
	   driver.findElement(Lic_Number).sendKeys(Lic_number);
   }
   public void Nin_7(String Issue_date_lic) {
	   driver.findElement(Lic_Issue_date).sendKeys(Issue_date_lic);
   }
   public void  Nin_8(String Exp_date_lic) {
	   driver.findElement(Lic_Exp_date).sendKeys(Exp_date_lic);
   }
   public void Nin_9(String Auth_name) {
	   driver.findElement(Lic_Issue_auth).sendKeys(Auth_name);
   }
   public void Nin_10() {
	   driver.findElement(Active_Status).click();
   }
   public void Nin_11() {
	   driver.findElement(Status_LOV).click();
   }
   public void Nin_12clickSaveButton() {
       WebElement saveBtn = driver.findElement(Com2_save);
       saveBtn.click();
   }

   public void Nin_13clickNextButton() {
       WebElement nextBtn = driver.findElement(Com2_next);
       nextBtn.click();
   }
   
   
   public void enterRelatedParty(String value) {
      
       driver.findElement(Relatedparty).sendKeys(value);
   }

   public void enterTypeOfRelation(String value) {
     
       driver.findElement(TypeofRelation).sendKeys(value);
   }

   public void enterPercentOfOwner(String value) {
       
       driver.findElement(percentofowner).sendKeys(value);
   }

   public void enterStartDate(String value) {
      
       driver.findElement(Startdate).sendKeys(value);
   }
   public void PartyDetails(String party, String relation, String percent, String date) {
	    enterRelatedParty(party);
	    enterTypeOfRelation(relation);
	    enterPercentOfOwner(percent);
	    enterStartDate(date);
	}
   
   public void Click_saveasdraft_com3() {
	   driver.findElement(save_Sub_tab3).click();
   }
   public void Click_next_com3() {
	   driver.findElement(Gonext_Sub_tab3).click();
   }
   
  
   
   // ATTACHMENT METHODS 
   
   
   public void Ten1_Attach1 () {
	   driver.findElement(Attach1).click();
   }
   public void Ten2_Attach_LOV1 () {
	   driver.findElement(Attach1_LOV).click();
   }
   public void Ten3_Desp1 (String Enter_Desp1) {
	   driver.findElement(Desp1).sendKeys(Enter_Desp1);
   }
   public void Ten4_Attach1 (String upload_file1) {
	   driver.findElement(Attachupload1).sendKeys(upload_file1);
   }
      
   
   public void Ten5_Attach2 () {
	   driver.findElement(Attach2).click();
   }
   public void Ten6_Attach_LOV2 () {
	   driver.findElement(Attach2_LOV).click();
   }
   public void Ten7_Desp2 (String Enter_Desp2) {
	   driver.findElement(Desp2).sendKeys(Enter_Desp2);
   }
   public void Ten8_Attach2 (String upload_file2) {
	   driver.findElement(Attachupload2).sendKeys(upload_file2);
   }
   

   public void Ten9_Attach3 () {
	   driver.findElement(Attach3).click();
   }
   public void Ten10_Attach_LOV3 () {
	   driver.findElement(Attach3_LOV).click();
   }
   public void Ten11_Desp3 (String Enter_Desp3) {
	   driver.findElement(Desp3).sendKeys(Enter_Desp3);
   }
   public void Ten12_Attach3 (String upload_file3) {
	   driver.findElement(Attachupload3).sendKeys(upload_file3);
   }
   
   public void Ten13_savebutton () {
	   driver.findElement(save_Attachment).click();
   }
   public void Ten14_gonext () {
	   driver.findElement(next_Attachment).click();
   }
 
    
   // PREVIEW METHODS 
   
   public void ClickPreviewHeader() {
	   driver.findElement(previewfooter).click();
   }
   
   public void scrollToPreviewFooter() {
       WebElement footer = driver.findElement(previewfooter);
       Actions act = new Actions(driver);
       act.scrollToElement(footer).perform();
   }
       
     public void preview_next () {
    	 driver.findElement(Preview_gonext).click();
     }
      
     
     public void Clickcheckbox1() {
    	 driver.findElement(Checkbox1).click();
     }
     public void Clickcheckbox2() {
    	 driver.findElement(Checkbox2).click();
     }
     public void Clickcheckbox3() {
    	 driver.findElement(Checkbox3).click();
     }
     public void Submitreg () {
    	 driver.findElement(submitform).click();
     }
}



 




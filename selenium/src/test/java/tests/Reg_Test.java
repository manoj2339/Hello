package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login;
import pages.Registration;
import pages.User_creation;

public class Reg_Test extends BaseTest {
 
	@Test
	public void supplier_registration() throws InterruptedException {
		Registration RE = new Registration(driver);
		Login Lo = new Login(driver);
		Thread.sleep(2000);
   
		// LOGIN  
  
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        boolean URLSuccess = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Sign In')]"))).isDisplayed();
         
        // URL Launch success or failure handling
         
        if (URLSuccess) { 
            test.pass("STEP 1 - https://qa.procurezen.ai/ URL Launched successfully");
        } 
        else { 
            test.fail("STEP 1 - Failed to Launch URL");
        }  
		  
		
		Thread.sleep(2000);
		Lo.Enterusername("BAFO");
		Lo.Enterpassword("Krya@1234");
		
		
		 WebElement Accountlogin = wait1.until(ExpectedConditions.elementToBeClickable(Lo.Signin));

			if (Accountlogin.isDisplayed()) {
				Accountlogin.click();
			    test.pass("STEP 2 - Supplier Sign-up has been successfully completed");
			} else {
			    test.fail("STEP 2 - Failed to Supplier Sign-Up");
			}
		
		
		
//		Lo.ClickLogin();
			
		Thread.sleep(3000);

		
		 
		// SUPPLIER INFORMATION TEST

		Thread.sleep(4000);
		RE.One_Supplier_type(); 
		Thread.sleep(1000);
		RE.One_Supplier_LOV();
		Thread.sleep(2000);
		RE.One_Est_date();   // Validation Issue
		Thread.sleep(2000);
		RE.One_Issue_date(); 
		Thread.sleep(2000);   // Validation Issue
		RE.One_Issue_By("Rajesh");
		Thread.sleep(2000);
		RE.One_Ownership(); 
		Thread.sleep(1000);
		RE.One_Ownership_LOV();
		RE.One_Location("uganda");
		RE.One_Exp_date();   // Validation Issue
		Thread.sleep(1000);
//		RE.Sal();
//		Thread.sleep(1000);
		RE.One_First_Name("Manoj");
		RE.One_Last_Name("Boopathy"); 
		RE.One_Role();
		RE.One_Role_LOV();
		RE.One_Job_Title("Admin");
		Thread.sleep(500);
		
		 
		 WebElement Supplierinformation = wait1.until(ExpectedConditions.elementToBeClickable(RE.save_as_draft));
 
			if (Supplierinformation.isDisplayed()) {
				Supplierinformation.click();
			    test.pass("STEP 3 - Supplier Information has been Saved successfully");
			} else {
			    test.fail("STEP 3 - Failed to Save Supplier Information");
			}
			
//		RE.One_save_Draft();

		Thread.sleep(500);
		
		RE.One_Click_Next();

		// ADDRESS INFORMATION TEST
 
		Thread.sleep(2000);
		RE.Two_Address_type();
		Thread.sleep(1000);
		RE.Two_Address_LOV();
		RE.Two_Line_one("KAMWESI COMPLEX P.O BOX 120378");
		RE.Two_Line_Two("KAMPALA-UGANDA");
		RE.Two_Country_Dropdown();
		Thread.sleep(1000);
		RE.Two_Country_LOV();
		RE.Two_State_select();
		Thread.sleep(1000);
		RE.Two_State_LOV();
		Thread.sleep(1000);
		
//		RE.Two_City_Dropdown();     //City made as User enterable 
//		Thread.sleep(1000); 
//		RE.Two_City_LOV(); 
 
//          RE.Two_Save_Address();
//          RE.Tax_type_Dropdown();                      //Comment for new Address
//          Thread.sleep(500);
//          RE.Tax_LOV_Select();
//          RE.Enter_Tax_number("TAX223344545");

		Thread.sleep(2000);
		
		
		
		WebElement Address = wait1.until(ExpectedConditions.elementToBeClickable(RE.ADDRESS_save_button));
		 
		if (Address.isDisplayed()) {
			Address.click();
		    test.pass("STEP 4 - Address Information has been Saved successfully");
		} else {
		    test.fail("STEP 4 - Failed to Save Address Information");
		}
		
		 
//		RE.Two_Save_Address();
		
		Thread.sleep(3000);
		RE.Two_Next();

		// CONTACT DETAILS TEST

		Thread.sleep(3000);
		
		

		WebElement Contact = wait1.until(ExpectedConditions.elementToBeClickable(RE.Next_Contact));
		 
		if (Contact.isDisplayed()) {
			Contact.click();
		    test.pass("STEP 5 - Contact Information has been Saved successfully");
		} else {
		    test.fail("STEP 5 - Failed to Save Contact Information");
		}
		
//		RE.Three_Next_Btn();

		// FIN & BIN TAB TEST

		Thread.sleep(2000);
		RE.Three_Click_Exp_Dropdown();
		Thread.sleep(1000);
		RE.Three_Select_Exp_LOV();
		RE.Three_Click_Currency();
		Thread.sleep(1000);
		RE.Three_Currency_LOV();
		Thread.sleep(1000);
		RE.Three_Enter_Project("39");
		RE.Three_Enter_project_to_intake("10");
		RE.Three_Project_Dropdown();
		Thread.sleep(1000);
		RE.Three_Project_LOV();
		RE.Three_Proj_Name("Verification Tracking System");
//		RE.Three_Start_date("01-01-2025");
//		RE.Three_End_Date("01-04-2025");
		RE.Three_proj_Country();
		Thread.sleep(1000);
		RE.Three_Proj_Country_LOV();

//      RE.Three_Curr_Dropdown();
//      RE.Three_Proj_LOV(); 

		RE.Three_Proj_Value("100000");
		RE.Three_Proj_Desp("Verification screening, also known as background screening or pre-employment screening, "
				+ "is the process of confirming the accuracy of information provided by an employee or applicant during the hiring process."
				+ " It involves verifying details like education, employment history, references, and potentially criminal and credit history."
				+ " The goal is to ensure the candidate's claims are accurate and to identify any potential risks or disqualifying factors");
//		RE.Three_Asset1_From("01-01-2020"); 
//		RE.Three_Asset1_To("01-01-2025");
//		RE.Three_Asset_Amount("100000");
// 		RE.Three_Lie_Yr1_From("01-01-2020");
//		RE.Three_lie_Yr1_To("01-01-2025");
//		RE.Three_Lie_Amount("500000");
		RE.Three_Credit_Lt("1000");
		RE.Three_Credit_Expo("100");
		RE.Three_Credit_pro("10");
		
		
		WebElement Fin = wait1.until(ExpectedConditions.elementToBeClickable(RE.Fin_save_Button));
		 
		if (Fin.isDisplayed()) {
			Fin.click();
		    test.pass("STEP 6 - Financial and Business Information has been Saved successfully");
		} else {
		    test.fail("STEP 6 - Failed to Save Financial and Business Information");
		}
		
		
		
//		RE.Three_FIn_save();

		Thread.sleep(2000);
		RE.Three_FIn_Next_Btn();

		// BANK TEST

		Thread.sleep(2000);
		RE.Five_1Bank_Name("Centenary Bank");
		RE.Five_2Enter_Branch("Kampala");
		RE.Five_3Currency_Dropdown();
		Thread.sleep(1000); 
		RE.Five_4Currency_LOV();
		Thread.sleep(1000); 
		RE.Five_5country_Dropdown();
		Thread.sleep(1000);
		RE.Five_6Country_LOV();
		RE.Five_7State_DropDown();
		Thread.sleep(1000);
		RE.Five_8State_LOV();
		
//		RE.Five_9City_Dropdown();
		Thread.sleep(1000);
//    	RE.Five_10City_LOV();
		
		RE.Five_11Account("00122300345634223122");
		RE.Five_12swift("445678766");
		RE.Five_13IBAN("7788665544999");
		RE.Five_14BSB("9882388222");
		RE.Five_15Routing("2453564563453453");
		RE.Five_16IFSC("IDB00303467");
		Thread.sleep(2000);
		
		
		WebElement Bank = wait1.until(ExpectedConditions.elementToBeClickable(RE.Bank_save_Button));
		 
		if (Bank.isDisplayed()) {
			Bank.click();
		    test.pass("STEP 7 - Bank Details has been Saved successfully");
		} else {
		    test.fail("STEP 7 - Failed to Save Bank Details");
		}
		 
//		RE.Five_17Save();

		Thread.sleep(2000);
		RE.Five_18Next();

		// CATEGORY & SCOPE MANAGEMENT

		Thread.sleep(2000);
		RE.Six_1parent();
		Thread.sleep(1000);
		RE.Six_2parent_LOV();
		RE.Six_3Sub();
		Thread.sleep(1000);
		RE.Six_4sub_LOV();
		RE.Six_5child();
		Thread.sleep(1000);
     	RE.Six_6child_LOV();
//		RE.Six_7sup_type();
//		Thread.sleep(1000); 
//		RE.Six_8sup_type_LOV();
//		RE.Six_9Desp("A descriptive essay describes an object, person, place, or event that the writer has experienced."
//				+ " Writers use illustrative language to \"show\" the reader that topic that is described in the essay. "
//				+ "Through the use of imagery, figurative language, and precise language, a writer can create effective "
//				+ "descriptions that create images in the reader's mind while also conveying a certain mood, or feeling,"
//				+ " about the essay's subject.");
//		String filePath = "D:\\Upload_files\\Logo.PNG";
//		RE.Six_10Upload(filePath);
     	Thread.sleep(1000);
     	
     	
     	WebElement Scope = wait1.until(ExpectedConditions.elementToBeClickable(RE.Cat_save_Button));
		 
		if (Scope.isDisplayed()) {
			Scope.click();
		    test.pass("STEP 8 - Category & Scope Management has been Saved successfully");
		} else {
		    test.fail("STEP 8 - Failed to Save Category & Scope Management");
		}
     	
     	
//		RE.Six_11cat_save();
		
		Thread.sleep(2000);
		RE.Six_12cat_Next();

		// PQ QUESTIONNIRE

		Thread.sleep(4000);
		RE.sev_1("User enterable value 1");
//		String filePath1 = "D:\\Upload_files\\Procurezen.pdf";
		Thread.sleep(1000);
//		RE.sev_2(filePath1);
		RE.sev_3("User enterable value 2");
		RE.sev_4("User enterable value 3");
		RE.sev_5("User enterable value 4");
		Thread.sleep(1000);
//          RE.sev_6();
//		Thread.sleep(500);
//		String filePath2 = "D:\\Upload_files\\emailable-report.pdf";
//		Thread.sleep(500);
//		RE.sev_7(filePath2);
//		Thread.sleep(500);
//		RE.sev_77("UserEnter");
		
		Thread.sleep(3000);
		
		WebElement PQ = wait1.until(ExpectedConditions.elementToBeClickable(RE.PQ_save_Button));
		 
		if (PQ.isDisplayed()) {
			PQ.click();
		    test.pass("STEP 9 - PQ Questionnaire has been Saved successfully");
		} else {
		    test.fail("STEP 9 - Failed to Save PQ Questionnaire");
		}
//		RE.sev_8();

		Thread.sleep(2000);
		RE.Sev_9();

		// COM TAB 1

//		Thread.sleep(2000);
//		RE.Eig_1();
//		Thread.sleep(500);
//		RE.Eig_2();
//		RE.Eig_3();
//		Thread.sleep(500);
//		RE.Eig_4();
//		RE.Eig_5();
		Thread.sleep(1000);
		
		
		WebElement Comp = wait1.until(ExpectedConditions.elementToBeClickable(RE.Activity_Next));
		 
		if (Comp.isDisplayed()) {
			Comp.click();
		    test.pass("STEP 10 - Compliance has been Saved successfully");
		} else {
		    test.fail("STEP 10 - Failed to Compliance");
		}
		
		
//		RE.Eig_6();

		// COM TAB 2

//          Thread.sleep(2000);
//          RE.Nin_1();
//          Thread.sleep(500);
//          RE.Nin_2();
//          RE.Nin_3();
//          Thread.sleep(500);
//          RE.Nin_4();
//          RE.Nin_5("DS68767");
//          RE.Nin_6("Rajesh");
//          RE.Nin_6("DS68769111");
//          RE.Nin_7("18-04-2025");
//          RE.Nin_8("18-04-2025");
//          RE.Nin_9("IMBS");
//          RE.Nin_10();
//          Thread.sleep(500);
//          RE.Nin_11();
//          RE.Nin_12clickSaveButton();
//          RE.Nin_13clickNextButton();  

		// COM TAB 3

//          String party = "Acme Corp";
//          String relation = "Partner";
//          String percent = "75";
//          String date = "20-04-2025";
//
//          RE.PartyDetails(party, relation, percent, date);
//          
//          RE.Click_saveasdraft_com3();
//          RE.Click_next_com3();

		// ATTACHMENT TAB

		Thread.sleep(7000);
//		RE.Ten1_Attach1(); 
//		RE.Ten2_Attach_LOV1();
		RE.Ten3_Desp1(
				"No fruit have men of all their studied lore,\r\n" + "Save they the 'Purely Wise One's' feet adore.");

		String filePath11 = "D:\\Upload_files\\Procurezen.pdf";
		Thread.sleep(1000);
		RE.Ten4_Attach1(filePath11);

//		RE.Ten5_Attach2();
//		RE.Ten6_Attach_LOV2();
		RE.Ten7_Desp2("As sun's fierce ray dries up the boneless things,\r\n"
				+ "So loveless beings virtue's power to nothing brings.");

		String filePath12 = "D:\\Upload_files\\Procurezen.pdf";
		Thread.sleep(1000);
		RE.Ten8_Attach2(filePath12);

//		RE.Ten9_Attach3();
//		RE.Ten10_Attach_LOV3();
		RE.Ten11_Desp3("Kindness shown by those who weigh not what the return may be:\r\n"
				+ "When you ponder right its merit, 'T is vaster than the sea.");

		String filePath13 = "D:\\Upload_files\\Procurezen.pdf";
		Thread.sleep(1000);
		RE.Ten12_Attach3(filePath13);
		Thread.sleep(2000);
		
		WebElement Attachment = wait1.until(ExpectedConditions.elementToBeClickable(RE.save_Attachment));
		 
		if (Attachment.isDisplayed()) {
			Attachment.click();
		    test.pass("STEP 11 - Attachment has been Saved successfully");
		} else {
		    test.fail("STEP 11 - Failed to Attachment");
		}
		
//		RE.Ten13_savebutton();
		
		
		Thread.sleep(2000);
		RE.Ten14_gonext();

		// PREVIEW

//          RE.ClickPreviewHeader();  
//          Thread.sleep(1000);
//          RE.scrollToPreviewFooter();

		Thread.sleep(2000);
		
		WebElement Preview = wait1.until(ExpectedConditions.elementToBeClickable(RE.Preview_gonext));
		 
		if (Preview.isDisplayed()) {
			Preview.click();
		    test.pass("STEP 12 - Application Preview has been viewed successfully");
		} else {
		    test.fail("STEP 12 - Failed to view Application Preview");
		}
		
		
//		RE.preview_next();

		// DECLARATION FORM

		Thread.sleep(2000);
		RE.Clickcheckbox1();
		Thread.sleep(1000);
		RE.Clickcheckbox2();
		Thread.sleep(1000);
		RE.Clickcheckbox3();
		Thread.sleep(1000);
		
		WebElement Submit = wait1.until(ExpectedConditions.elementToBeClickable(RE.submitform));
		 
		if (Submit.isDisplayed()) {
			Submit.click();
		    test.pass("STEP 13 - Declaration has been completed");
		} else {
		    test.fail("STEP 13 - Failed to Submit Declaration");
		}
		
		WebElement Submit1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'mat-mdc-snack-bar-label') and normalize-space(text())='Final submission saved successfully']")));
        
		  
  		if (Submit1.isDisplayed()) {
  			Submit1.click();
  		    test.pass("STEP 14 - Application form submitted successfully ");
  		} else {
  		    test.fail("STEP 14 - Failed to submit application form");
  		}  
	
//		RE.Submitreg();
		Thread.sleep(2000);
	}
} 

package Patient3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Patient2.Capminds_BaseClass;

public class VijayTask3 extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager3 pom = new Pageobjectmanager3(driver);

//	public static void main(String[] args) throws Throwable {

	@Test(priority = 0)

	public void Schedule_Module() throws Throwable {

		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report4/Schedule.html");

		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		System.out.println("CAPMINDS");
		// Step3: attach the data with physical file
		extent.attachReporter(reporter);

		// Step4: Create a test cases and assign test details
		// testName //testDescription
		ExtentTest test = extent.createTest("capminds", "patient with mandatory information");

		test.assignCategory("VOZO");

		test.assignAuthor("Capminds");

		// Step5: Step level status

		// test.fail("Click Login button");

		// Driver Maximize and Url Launch

		geturl("https://ehr1.vozo.xyz/");

		test.pass("Browser Launched Successfully ");

		System.out.println("Browser Launched Successfully ");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "Test1234");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "Test@1234");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		test.pass("Login Successfully ");

		System.out.println("Login Successfully ");

		System.out.println("Browser Launched Successfully");

		///////// Select Patient moudule //////

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

//		Clickonelement(pom.getschedloc3().getcreate());
//
//		Clickonelement(pom.getschedloc3().getcreatenewclient());
//
//		sendkeys(pom.getschedloc3().gettypefirstname(), "Martin");
//
//		sendkeys(pom.getschedloc3().gettypelastname(), "Edward");
//
//		sendkeys(pom.getschedloc3().sendtypeemail(), "kr222f22ffw@tempr.email");
//
//		sendkeys(pom.getschedloc3().gettypephonenumber(), "229449098");
//
//		sendkeys(pom.getschedloc3().geClicktId(), "22200442222");
//
//		selecttwo(pom.getschedloc3().getClickProvider(), "1");
//
//		Clickonelement(pom.getschedloc3().getsave());
//
//		System.out.println("New Patient Creadetd Successfully");
//
//////////////////New Appointment ////////////
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getschedloc3().getClickSchedule());

// Get Appointment Option

		Clickonelement(pom.getschedloc3().getcreate());

		Clickonelement(pom.getschedloc3().getAppointmentoption());

// Click Create app
//		Thread.sleep(4000);

//		Clickonelement(pom.getschedloc3().getAppointmentclick());
		Thread.sleep(8000);

		String exceldata1 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 3);

		// Enter Patient Name
		sendkeys(pom.getschedloc3().getEnterName(), exceldata1);

		// select patient name
		Thread.sleep(8000);

		Clickonelement(pom.getschedloc3().getSelectpatient1());

		// select date
		String exceldata3 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 6);

		sendkeys(pom.getschedloc3().getenterdate(), exceldata3);

		// Clickonelement(pom.getschedloc3().getSelectpatient1());

		// Select Date
//				sendkeys1(pom.getschedloc3().getClcikpatient(), Keys.TAB);
		// clear(pom.getschedloc3().getSelectdate());

		sendkeys(pom.getschedloc3().getSelectdate(), "01/09/2022");

		// Click Today
		Thread.sleep(8000);
		Clickonelement(pom.getschedloc3().getclcitoda());

		// Click Time

		sendkeys1(pom.getschedloc3().getSelectdate(), Keys.TAB);

		sendkeys(pom.getschedloc3().getSelecttime(), "10:30 AM");

		Thread.sleep(8000);
		Clickonelement(pom.getschedloc3().getSelecttimeok());

//				Clickonelement(pom.getschedloc3().getSelecttime2());
		//
//				Clickonelement(pom.getschedloc3().getSelecttime1());
		Thread.sleep(8000);

		// click until
		// Clickonelement(pom.getschedloc3().getclcitoda());

		String exceldata2 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 9);

		// Enter provider Name
		sendkeys(pom.getschedloc3().getEnterProviderNmae(), exceldata2);

		// select provider name
		Thread.sleep(8000);

		Clickonelement(pom.getschedloc3().getSelectProviderNmae());

		// click Repeats

//		Clickonelement(pom.getschedloc3().getClickRepeats());
//
//		
//		
//		
//		// select every day
//		String exceldata4 = exceldata("C:\\Users\\Admin\\Desktop\\task.xlsx",  7, 12);
//
//		Clickonelement(pom.getschedloc3().getselec());
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getschedloc3().getclickevery());
//
//		// select day
//
//		String exceldata5 = exceldata("C:\\Users\\Admin\\Desktop\\task.xlsx",  7, 13);
//
//		selectone(pom.getschedloc3().getClickDay(),"every");
//
////		Clickonelement(pom.getschedloc3().getselecda());
//		
//
//	//	String exceldata0 = exceldata("C:\\Users\\Admin\\Desktop\\task.xlsx", 7, 5);
//		
//		// calendor cloik
//		driver.findElement(By.xpath("//input[@id='new-app-untildate']")).click();
//		
//		
//		new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='new-app-untildate']")));
//		
//		SelectDate("10","Oct","2026");
//		
//		
//		sendkeys(pom.getschedloc3().getsendUntilDate(),"09/09/2022");

		// Click Profile
		String exceldata6 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 16);

		// Thread.sleep(5000);

		sendkeys(pom.getschedloc3().getClickprofile(), exceldata6);

		// Clickonelement(pom.getschedloc3().getClickprofile());

		Thread.sleep(6000);

		// Select Profile
		Clickonelement(pom.getschedloc3().getSelectprofile());

		// Click Location
		Thread.sleep(6000);

		String exceldata7 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx", 1, 18);

		Thread.sleep(6000);
		sendkeys(pom.getschedloc3().getClickofffice(), exceldata7);

		Thread.sleep(6000);
		Clickonelement(pom.getschedloc3().getselectoffice());

		// Select Loction
		Thread.sleep(6000);

//		//	sendkeys(pom.getschedloc3().getselectoffice(), exceldata8);
//
//		Thread.sleep(2000);
//	//		Clickonelement(pom.getschedloc3().getselectoffice())
//			
		// String exceldata9 = exceldata("C:\\Users\\Admin\\Desktop\\task.xlsx", 1, 20);

//		Thread.sleep(5000);

//		// Clcik Status
		Clickonelement(pom.getschedloc3().getClickstatus());
//
		Thread.sleep(6000);

//		// select status
		Clickonelement(pom.getschedloc3().getSelectstatus());

		// Click Save
		Clickonelement(pom.getschedloc3().getClicksave());

	}

		@Ignore
	@Test(priority = 1)

	public void Servicepage() throws InterruptedException {

		////////////// Payment////////////////

		// click pre

		// Clickonelement(pom.getschedloc3().getclickpre());

		// click appoi

		try {
			Thread.sleep(6000);

			Clickonelement(pom.getschedloc3().getcliccalDay());

		} catch (Exception e) {

		}

		// clic Date

		// Clickonelement(pom.getschedloc3().getclidate());

		// click appoi

		Thread.sleep(6000);
		//
//			Clickonelement(pom.getschedloc3().getclicapp());

//			Clickonelement(pom.getschedloc3().getFacilityclick());
//			
//			Thread.sleep(4000);
//			
//			Clickonelement(pom.getschedloc3().getFacilitySelect());

		
////////////////// Click Appoinement
		
		WebDriverWait pats = new WebDriverWait(driver, 20);
		WebElement patsele = pats
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='sc-hbjaKc iemQOA'])[4]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsele);

		/////////// ICD ///////////

		// Click Sevices

		Thread.sleep(6000);

		WebDriverWait ser = new WebDriverWait(driver, 20);
		WebElement sersel = ser
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='appt_tabs-tab-2']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sersel);

		// Clickonelement(pom.getschedloc3().getClickServices());

		Thread.sleep(6000);

		// click CPT Codes
		Clickonelement(pom.getschedloc3().getClickCPTCode());

		// Enter CPT codes

		Thread.sleep(6000);

		sendkeys(pom.getschedloc3().getEnterCPTCodes(), "v");

		Thread.sleep(6000);

		// click CPT Codes
		Clickonelement(pom.getschedloc3().getSelectCPTCodes());

		Thread.sleep(6000);
		// Clear fees
		clear(pom.getschedloc3().getClearFees());

		// String exceldata6 = exceldata("C:\\Users\\Admin\\Desktop\\Vijay\\Vijay.xlsx",
		// 1, 21);

		// Enter Fees
		sendkeys(pom.getschedloc3().getEnterFees(), "1986");

		// press ok

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getprok());
		try {
			// delet
			Thread.sleep(6000);
			// Clickonelement(pom.getschedloc3().getprdel());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//				e.printStackTrace();
		}

		Thread.sleep(6000);

		WebElement tex = driver.findElement(By.xpath("//span[@id='appt_service_fees']//span[1]"));

		String text = tex.getText();
		System.out.println(text);

		if (text.equals("$ 1986.00")) {
			System.out.println("Correct " + text);

		} else {

			System.out.println("Not Correct");
		}

		// sele Billing

		// Thread.sleep(6000);

		Thread.sleep(6000);

		WebDriverWait bill = new WebDriverWait(driver, 20);
		WebElement selbi = bill
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='appt_tabs-tab-3']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selbi);

		// Clickonelement(pom.getschedloc3().getschedloc3sel());

		// crea invo
		Thread.sleep(6000);

		WebDriverWait sup = new WebDriverWait(driver, 20);
		WebElement supsel = sup
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='appt_superbill_btn'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", supsel);

//			Clickonelement(pom.getschedloc3().getsupbill());

		// super bi

//			gettext(pom.getschedloc3().getsupbillte());

		Thread.sleep(6000);
		WebElement tex1 = driver.findElement(By.className("amouts_val"));

		String text1 = tex1.getText();
		System.out.println(text1);

		if (text1.equals("$ 1986")) {
			System.out.println("Correct " + text1);

		} else {

			System.out.println("Not Correct");
		}

		// clos in

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getclosenvo());
		Thread.sleep(6000);

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getclickbillingstatus());

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getselectbillingstatus());

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getclickinvoice());

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getClickAddAmount());

		Thread.sleep(6000);

		sendkeys(pom.getschedloc3().getEnterAmount(), "1986");

		sendkeys(pom.getschedloc3().getEnterDate(), "10/25/2022");

		Thread.sleep(6000);

		sendkeys1(pom.getschedloc3().getEnterDate(), Keys.TAB);
		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getClickAddpAyment1());

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getclickcloseinvoice());

		// Pat Das
		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getpatdash());

		// Patient Balance

		Thread.sleep(6000);
		WebElement tex2 = driver.findElement(By.xpath("(//div[@class='w-50 bill-right m-color'])[1]"));

		String text2 = tex2.getText();
		System.out.println(text2);

		if (text2.equals("$ 1986.00")) {
			System.out.println("Correct " + text2);

		} else {

			System.out.println("Not Correct");
		}

		// sele Bill

//			// Pat Das
		//
//			Thread.sleep(5000);
		//
//			Clickonelement(pom.getschedloc3().getpatdemo());

//			driver.close();

	}


	@Test(priority = 2)

	public void EOB() throws InterruptedException {
		///////////////// EOB Add Payment ///////////////////

		Thread.sleep(6000);

		// click Billing Module
		Clickonelement(pom.getschedloc3().getClickBillingModule());

		
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		WebElement eobsel = wait10
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='billing-eob_left-nav_title']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", eobsel);

		Thread.sleep(5000);

		// Clickonelement(pom.getschedloc3().getclieob());

		// sel insu

		selectone(pom.getschedloc3().getselein(), "United National");

		// star date

		sendkeys(pom.getschedloc3().getstardat(), "2022-05-01");

		// end date

		sendkeys(pom.getschedloc3().getendat(), "2022-05-07");

		// sear eo

		Clickonelement(pom.getschedloc3().getseareo());
		try {

			// sele eob

			Clickonelement(pom.getschedloc3().getseleeob());

			// sele edit eob

			Clickonelement(pom.getschedloc3().getseleed());

			// sele edit eob

			Thread.sleep(2000);

			Clickonelement(pom.getschedloc3().getclican());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Edit Eob");
		}

		// Click EOB
		// Clickonelement(pom.getschedloc3().getClickEOB());

		// Click Add Payment
		Clickonelement(pom.getschedloc3().getClickAddPyment());

		// Click date

		// ClearText(pom.getschedloc3().getClickDate());

		sendkeys(pom.getschedloc3().getClickDate(), "09/02/2022");

		// Click Select Date
		// Clickonelement(pom.getschedloc3().getSelectDate());

		// Click Payer
		selectone(pom.getschedloc3().getClickPayer(), "United National");

		// Click United Health care
		// Clickonelement(pom.getschedloc3().getSelectUnitedHealth());

		// Click SelectPaymentMethod
		Clickonelement(pom.getschedloc3().getSelectPaymentMethod());

		// Click Authorize.net
		Clickonelement(pom.getschedloc3().getSelectAutorize());

		// Enter Payment Number
		sendkeys(pom.getschedloc3().getEnterPaymentNumber(), "45767888 ");

		// Enter Amount
		sendkeys(pom.getschedloc3().getEnterAmount1(), "1000");

		// Click Save button
		Clickonelement(pom.getschedloc3().getSelectSave());

		// Click Cancel button
		Clickonelement(pom.getschedloc3().getSelectCancel());

		System.out.println("EOB Tested Successfully ");

		// test.pass("EOB Tested Successfully ");

	}
	
	@Test(priority = 3)

	public void Billing() throws InterruptedException {

		// Click On Month Option
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Thread.sleep(6000);

		// click Billing Module
		Clickonelement(pom.getschedloc3().getClickBillingModule());

		// Thread.sleep(4000);
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement patpay = wait3.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Payments'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patpay);

		// Clickonelement(pom.getschedloc3().getpatientpayment());

		// patient search

		sendkeys(pom.getschedloc3().getpateintsear1(), "Martin");

		// Total Balance

		Thread.sleep(6000);

		WebElement tex3 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]"));

		String text3 = tex3.getText();
		System.out.println(text3);

		if (text3.equals("$ 1986")) {
			System.out.println("Correct " + text3);

		} else {

			System.out.println("Not Correct");
		}

		// click patientpayment1

		// Thread.sleep(8000);

		WebDriverWait wait9 = new WebDriverWait(driver, 10);
		WebElement patpay1 = wait9
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Patients Payment']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patpay1);

		// Clickonelement(pom.getschedloc3().getpateintpayment1());

		// search pat

		sendkeys(pom.getschedloc3().getpateintsear2(), "Martin");

		//

		 Clickonelement(pom.getschedloc3().getselepatpay());

		// Total Balance

		Thread.sleep(6000);

		WebElement tex4 = driver.findElement(By.xpath(
				"(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeSmall'])[5]"));

		String text4 = tex4.getText();

		System.out.println(text4);

		if (text4.equals("$ 1986")) {
			System.out.println("Correct " + text4);

		} else {

			System.out.println("Not Correct");
		}

		// gettext(pom.getschedloc3().getselepatpay());

		// click patientpayment1

		Thread.sleep(6000);
		Clickonelement(pom.getschedloc3().getpateintpayment1());

		// search pat

		sendkeys(pom.getschedloc3().getpateintsear2(), "Martin");

		//
		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getselepatpay());

		// Total Balance

		Thread.sleep(6000);
		WebElement tex5 = driver.findElement(By.xpath(
				"(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeSmall'])[5]"));

		String text5 = tex5.getText();
		System.out.println(text4);

		if (text4.equals("$ 1986")) {
			System.out.println("Correct " + text4);

		} else {

			System.out.println("Not Correct");
		}

		// gettext(pom.getschedloc3().getselepatpay());

	}

	 @Ignore
	@Test(priority = 4)

	public void PatientStatements() throws InterruptedException {
		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// click Billing Module
//		Clickonelement(pom.getschedloc3().getClickBillingModule());
		///////// patient statement//////////////////

		// Thread.sleep(4000);
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement patsta = wait4.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Statements'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsta);

		// Clickonelement(pom.getschedloc3().getpatientstate());

		// patient state se

		sendkeys(pom.getschedloc3().getpateintsear3(), "Martin");

		// click patientpayment1
		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getclipateintsear3());

		// clic sear

		Clickonelement(pom.getschedloc3().getclisear1());

		// Total Balance
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Thread.sleep(8000);
		WebElement tex5 = driver.findElement(By.xpath("//table/tbody/tr/td[8]"));

		String text5 = tex5.getText();
		System.out.println(text5);

		if (text5.equals("$ 1986")) {
			System.out.println("Correct " + text5);

		} else {

			System.out.println("Not Correct");
		}

		// cli all pat

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getallpatcl());

		// patient state se

		sendkeys(pom.getschedloc3().getsearchpat4(), "Martin");

		// click patientpayment1
		Thread.sleep(6000);
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getschedloc3().getclipateintsear4());

		// click sera

		Clickonelement(pom.getschedloc3().getclisear5());

		// Total Balance
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Thread.sleep(8000);
		WebElement tex6 = driver.findElement(By.xpath("(//table)[2]/tbody/tr/td[8]"));

		String text6 = tex6.getText();
		System.out.println(text6);

		if (text6.equals("$ 1986")) {
			System.out.println("Correct " + text6);

		} else {

			System.out.println("Not Correct");
		}

		// driver.close();

	}

	// @Ignore
	@Test(priority = 5)

	public void PatientLedger() throws InterruptedException {

		////////////////////// Patient balance /ledger //////////////

		// Thread.sleep(3000);

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		WebElement patled = wait5.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Ledger'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patled);

		// click Patient balance Ledger
		// Clickonelement(pom.getschedloc3().getClickPatientBalanceLedger());

		// Enter client name
		sendkeys(pom.getschedloc3().getEnterClientName(), "Martin");

		// click select john peter

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc3().getSelectJonPeter());

		// click top on Patient balance Ledger details
		Thread.sleep(6000);

		WebDriverWait clipa = new WebDriverWait(driver, 10);
		WebElement selepa = clipa.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr/td[2]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selepa);

		Thread.sleep(6000);

		WebElement tex7 = driver.findElement(By.xpath("//table/tbody/tr/td[7]"));

		String text7 = tex7.getText();
		System.out.println(text7);

		if (text7.equals("$ 1986")) {
			System.out.println("Correct " + text7);

		} else {

			System.out.println("Not Correct");
		}
	}
	
	//////// payment analysis/////////////
	
	@Test(priority = 2)

	public void Analysis() throws InterruptedException {

		Clickonelement(pom.getschedloc3().getClickReportsModule());

		
	// cli pay

	Thread.sleep(2000);
	Clickonelement(pom.getschedloc3().getpayana());

	// cli pay

	Clickonelement(pom.getschedloc3().getpayanasea());

	// cli pay

	sendkeys(pom.getschedloc3().getpayanasea(), "Martin");

	// cli pay

	Clickonelement(pom.getschedloc3().getselepa());

	// cli pay

	Clickonelement(pom.getschedloc3().getseleoff());

	Clickonelement(pom.getschedloc3().getseleoff1());

	// stat da

	sendkeys(pom.getschedloc3().getstarda(), "05/09/2022");

	// stat da

	sendkeys(pom.getschedloc3().getenda(), "05/10/2022");

	// sele pos
	Clickonelement(pom.getschedloc3().getposdat());

	Clickonelement(pom.getschedloc3().getposdat1());

	// cli upd

	Clickonelement(pom.getschedloc3().getcliupp());

	// cli crea

	Clickonelement(pom.getschedloc3().getclicre());

	// cli crea

	Clickonelement(pom.getschedloc3().getclipatpay());

	// cli crea

	Clickonelement(pom.getschedloc3().getclich());

	System.out.println("Payment analysis Verified Succsessfully");

	//test.pass("Payment analysis Verified Succsessfully");
	
	}
}

package Patient3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schedule_Modulelocators3 {

	public WebDriver driver;

	@FindBy(xpath = "//button[@id='cal-btn-month']")
	private WebElement month;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMonth() {
		return month;
	}

////////calendar
	public Schedule_Modulelocators3(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	@FindBy(xpath = "//tbody/tr[1]/td[6]")
	private WebElement monthcalender;

	public WebElement getMonthcalender() {
		return monthcalender;
	}

	@FindBy(xpath = "//button[@id='dropdown-basic cal-btn-crate']")
	private WebElement create;

	public WebElement getcreate() {
		return create;
	}

	@FindBy(xpath = "//a[normalize-space()='Create Client']")
	private WebElement createnewclient;

	public WebElement getcreatenewclient() {
		return createnewclient;
	}

	@FindBy(xpath = "//input[@id='formGridEmail']")
	private WebElement typefirstname;

	public WebElement gettypefirstname() {

		return typefirstname;

	}

	@FindBy(xpath = "//input[@id='formGridPassword']")
	private WebElement typelastname;

	public WebElement gettypelastname() {
		return typelastname;
	}

	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")
	private WebElement typeemail;

	public WebElement sendtypeemail() {
		return typeemail;
	}

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement typephonenumber;

	public WebElement gettypephonenumber() {
		return typephonenumber;
	}

	@FindBy(xpath = "(//input[@name='external_id'])[1]")
	private WebElement ClickId;

	public WebElement geClicktId() {
		return ClickId;
	}

	@FindBy(xpath = "//select[@id='new-app-office']")
	private WebElement ClickProvider;

	public WebElement getClickProvider() {
		return ClickProvider;
	}

	@FindBy(xpath = "//option[contains(text(),'Martin Edward')]")
	private WebElement SelectProvider;

	public WebElement getSelectProvider() {
		return SelectProvider;
	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElement cancel;

	public WebElement getcancel() {
		return cancel;
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement save;

	public WebElement getsave() {
		return save;
	}

/////////// Appointment

	@FindBy(xpath = "//a[normalize-space()='Schedule']")
	private WebElement ClickSchedule;

	public WebElement getClickSchedule() {
		return ClickSchedule;
	}

	@FindBy(xpath = "//a[@id='appt_crt-ico-nav']")
	private WebElement Appointmentoption;

	public WebElement getAppointmentoption() {
		return Appointmentoption;
	}

	@FindBy(xpath = "//a[@id='appt_crt-ico-nav']")
	private WebElement Appointmentclick;

	public WebElement getAppointmentclick() {
		return Appointmentclick;

	}

	@FindBy(xpath = "(//input[@value='1'])[5]")
	private WebElement Appointtyp;

	public WebElement getAppointtyp() {
		return Appointtyp;

	}

	@FindBy(xpath = "//div[@id='new-app-patient_1 appt-inp-patsrch']//input[@type='text']")
	private WebElement EnterName;

	public WebElement getEnterName() {
		return EnterName;

	}

	@FindBy(xpath = "(//span[@class='text'])[1]")
	private WebElement Selectpatient1;

	public WebElement getSelectpatient1() {
		return Selectpatient1;

	}

	@FindBy(xpath = "//div[@id='new-app-provider new-app-provider_1']//input[contains(@type,'text')]")
	private WebElement EnterProviderNmae;

	public WebElement getEnterProviderNmae() {
		return EnterProviderNmae;

	}

	@FindBy(xpath = "//span[contains(text(),'James Marry')]")
	private WebElement SelectProviderNmae;

	public WebElement getSelectProviderNmae() {
		return SelectProviderNmae;

	}

	@FindBy(xpath = "//span[contains(text(),'Martin Edward')]")
	private WebElement SelectProviderNmae1;

	public WebElement getSelectProviderNmae1() {
		return SelectProviderNmae1;

	}

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement enterdate;

	public WebElement getenterdate() {
		return enterdate;

	}

	@FindBy(xpath = "//input[@id='new-app-repeats-check1']")
	private WebElement ClickRepeats;

	public WebElement getClickRepeats() {
		return ClickRepeats;

	}

	@FindBy(xpath = "(//select[@id='new-app-select1'])[1]")
	private WebElement selec;

	public WebElement getselec() {
		return selec;

	}

	@FindBy(xpath = "//select[@id='new-app-select1']")
	private WebElement ClickDay;

	public WebElement getClickDay() {
		return ClickDay;

	}

	@FindBy(xpath = "(//option[@value='0'])[1]")
	private WebElement selecda;

	public WebElement getselecda() {
		return selecda;

	}

	@FindBy(xpath = "//select[@id='new-app-select1']")
	private WebElement clickevery;

	public WebElement getclickevery() {
		return clickevery;

	}

	@FindBy(xpath = "//div[@id='new-app-profile_1 appt-inp-profsrch']//input[@type='text']")
	private WebElement Clickprofile;

	public WebElement getClickprofile() {
		return Clickprofile;

	}

	@FindBy(xpath = "//div[@title='Walk-in']")
	private WebElement Selectprofile;

	public WebElement getSelectprofile() {
		return Selectprofile;

	}

	@FindBy(xpath = "//div[@title='Office Visit']")
	private WebElement Selectprofile1;

	public WebElement getSelectprofile1() {
		return Selectprofile1;

	}

	@FindBy(xpath = "//div[@id='new-app-facility_1']//input[@type='text']")
	private WebElement Clickofffice;

	public WebElement getClickofffice() {
		return Clickofffice;

	}

	@FindBy(xpath = "//span[contains(text(),'John Hospital')]")
	private WebElement selectoffice;

	public WebElement getselectoffice() {
		return selectoffice;

	}

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")
	private WebElement Selectdate;

	public WebElement getSelectdate() {
		return Selectdate;

	}

	@FindBy(xpath = "(//a[normalize-space()='Today'])[1]")
	private WebElement clcitoda;

	public WebElement getclcitoda() {
		return clcitoda;

	}

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")
	private WebElement Selectdate1;

	public WebElement getSelectdate1() {
		return Selectdate1;

	}

	@FindBy(xpath = "(//div[@class='ant-picker-time-panel-cell-inner'][normalize-space()='12'])[1]")
	private WebElement Selecttime2;

	public WebElement getSelecttime2() {
		return Selecttime2;

	}

	@FindBy(xpath = "(//div[normalize-space()='PM'])[1]")
	private WebElement Selecttime1;

	public WebElement getSelecttime1() {
		return Selecttime1;

	}

	@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
	private WebElement Selecttime;

	public WebElement getSelecttime() {
		return Selecttime;

	}

	@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
	private WebElement Selecttimevid;

	public WebElement getSelecttimevid() {
		return Selecttimevid;

	}

	@FindBy(xpath = "(//span[normalize-space()='Ok'])[1]")
	private WebElement Selecttimeok;

	public WebElement getSelecttimeok() {
		return Selecttimeok;

	}

	@FindBy(xpath = "//input[@id='new-app-untildate']")
	private WebElement sendUntilDate;

	public WebElement getsendUntilDate() {
		return sendUntilDate;

	}

	//////////////////

	@FindBy(xpath = "(//button[@id='cal-btn-day'])[1]")
	private WebElement cliccalDay;

	public WebElement getcliccalDay() {
		return cliccalDay;

	}

	@FindBy(xpath = "(//input[@id='appt_service_findcpt'])[1]")
	private WebElement ClickCPTCodes;

	public WebElement getClickCPTCode() {
		return ClickCPTCodes;
	}

	@FindBy(xpath = "//input[@placeholder='Find Diagnosi Codes']")
	private WebElement EnterCPTCodes;

	public WebElement getEnterCPTCodes() {
		return EnterCPTCodes;
	}

	@FindBy(xpath = "//div[contains(text(),'Vkard--fdfdsfds')]")
	private WebElement SelectCPTCodes;

	public WebElement getSelectCPTCodes() {
		return SelectCPTCodes;
	}

	@FindBy(xpath = "(//input[@id='cptfee0'])[1]")
	private WebElement ClearFees;

	public WebElement getClearFees() {
		return ClearFees;
	}

	@FindBy(xpath = "(//input[@id='cptfee0'])[1]")
	private WebElement EnterFees;

	public WebElement getEnterFees() {
		return EnterFees;
	}

	@FindBy(xpath = "//*[name()='path' and contains(@d,'M504 256c0')]")
	private WebElement prok;

	public WebElement getprok() {
		return prok;
	}

	@FindBy(xpath = "//tbody/tr[3]/td[6]/button[1]//*[name()='svg']")
	private WebElement prdel;

	public WebElement getprdel() {
		return prdel;
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'][normalize-space()='×'])[2]")
	private WebElement closenvo;

	public WebElement getclosenvo() {
		return closenvo;

	}

	@FindBy(xpath = "//div[@class='pat-name-demo']//span[contains(text(),'Martin')]")
	private WebElement patdash;

	public WebElement getpatdash() {
		return patdash;

	}

	@FindBy(xpath = "//a[normalize-space()='Billing']")
	private WebElement ClickBillingModule;

	public WebElement getClickBillingModule() {
		return ClickBillingModule;
	}

	@FindBy(xpath = "(//input[@class='ant-input'])[1]")

	private WebElement pateintsear1;

	public WebElement getpateintsear1() {
		return pateintsear1;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")

	private WebElement selepatpay;

	public WebElement getselepatpay() {

		return selepatpay;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")

	private WebElement pateintpayment1;

	public WebElement getpateintpayment1() {

		return pateintpayment1;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement pateintsear2;

	public WebElement getpateintsear2() {
		return pateintsear2;
	}

	@FindBy(xpath = "//button[@id='appt-btn-sve']")
	private WebElement Clicksave;

	public WebElement getClicksave() {
		return Clicksave;

	}

	@FindBy(xpath = "//div[@id='new-app-status_1 appt-inp-stas']//input[@type='text']")
	private WebElement Clickstatus;

	public WebElement getClickstatus() {
		return Clickstatus;

	}

	@FindBy(xpath = "//span[normalize-space()='@ Arrived/Lobby']")
	private WebElement Selectstatus;

	public WebElement getSelectstatus() {
		return Selectstatus;

	}

	@FindBy(xpath = "(//input[@id='billing_pat_stmt_pat_srch-b'])[1]")

	private WebElement pateintsear3;

	public WebElement getpateintsear3() {
		return pateintsear3;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")

	private WebElement clipateintsear3;

	public WebElement getclipateintsear3() {
		return clipateintsear3;
	}

	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

	private WebElement clisear1;

	public WebElement getclisear1() {

		return clisear1;
	}

	@FindBy(xpath = "//div[contains(text(),'All Patients')]")

	private WebElement allpatcl;

	public WebElement getallpatcl() {

		return allpatcl;
	}

	@FindBy(xpath = "(//input[@id='billing_pat_all-stmt_pat_srch-b'])[1]")

	private WebElement searchpat4;

	public WebElement getsearchpat4() {

		return searchpat4;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")

	private WebElement clipateintsear4;

	public WebElement getclipateintsear4() {
		return clipateintsear4;
	}

	@FindBy(xpath = "(//button[@id='billing-pat-all_stmt_srch_btn-b'])[1]")

	private WebElement clisear5;

	public WebElement getclisear5() {

		return clisear5;
	}

	@FindBy(xpath = "(//input[@id='billing_pat_bal-ledger_search-pat'])[1]")
	private WebElement EnterClientName;

	public WebElement getEnterClientName() {
		return EnterClientName;
	}

	@FindBy(xpath = "//div[@class='title']")
	private WebElement SelectJonPeter;

	public WebElement getSelectJonPeter() {
		return SelectJonPeter;
	}
	@FindBy(xpath = "//div[@class='ant-select sc-kTGBUR ddwHvZ ant-select-multiple ant-select-allow-clear ant-select-show-search']//div[@class='ant-select-selection-overflow']")
	private WebElement Facilityclick;

	public WebElement getFacilityclick() {
		return Facilityclick;

	}
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']//div[@class='demo-option-label-item'][normalize-space()='John hospitals']")
	private WebElement FacilitySelect;

	public WebElement getFacilitySelect() {
		return FacilitySelect;

	}
	@FindBy(xpath = "//span[@id='appt_billing_invoice']")
	private WebElement clickinvoice;

	public WebElement getclickinvoice() {
		return clickinvoice;

	}
	@FindBy(xpath = "//div[@id='invoice_addpayment']")
	private WebElement ClickAddAmount;

	public WebElement getClickAddAmount() {
		return ClickAddAmount;

	}
	@FindBy(xpath = "//input[@id='amountval']")
	private WebElement EnterAmount;

	public WebElement getEnterAmount() {
		return EnterAmount;

	}
	@FindBy(xpath = "//input[@id='postdate']")
	private WebElement EnterDate;

	public WebElement getEnterDate() {
		return EnterDate;

	}
	@FindBy(xpath = "//button[@id='invoice_addpayment_btn']")
	private WebElement ClickAddpAyment1;

	public WebElement getClickAddpAyment1() {
		return ClickAddpAyment1;

	}
	
	
	@FindBy(xpath = "//select[@id='getbillingstatus']")
	private WebElement clickbillingstatus;

	public WebElement getclickbillingstatus() {
		return clickbillingstatus;

	}
	
	@FindBy(xpath = "//option[@value='Paid In Full']")
	private WebElement selectbillingstatus;

	public WebElement getselectbillingstatus() {
		return selectbillingstatus;

	}
	
	@FindBy(xpath = "//div[@class='modal-header1 Invoice_Modal_Header modal-header']//span[@aria-hidden='true'][normalize-space()='×']")
	private WebElement clickcloseinvoice;

	public WebElement getclickcloseinvoice() {
		return clickcloseinvoice;

	}
	
/////////////////////// EOB Add Payment ///////////////////

@FindBy(xpath = "(//a[normalize-space()='EOB'])[1]")

private WebElement clieob;

public WebElement getclieob() {

return clieob;
}

@FindBy(xpath = "(//select[@id='EOBInsuranceNameSearch'])[1]")

private WebElement selein;

public WebElement getselein() {

return selein;
}

@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")

private WebElement stardat;

public WebElement getstardat() {

return stardat;
}

@FindBy(xpath = "(//input[@placeholder='End date'])[1]")

private WebElement endat;

public WebElement getendat() {

return endat;
}

@FindBy(xpath = "(//button[@id='billing-eob_srch_btn'])[1]")

private WebElement seareo;

public WebElement getseareo() {

return seareo;
}

@FindBy(xpath = "(//td[normalize-space()='United National'])[1]")

private WebElement seleeob;

public WebElement getseleeob() {

return seleeob;
}

@FindBy(xpath = "(//button[@id='billing_eob-edit-pay_btn'])[1]")

private WebElement seleed;

public WebElement getseleed() {

return seleed;
}

@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

private WebElement clican;

public WebElement getclican() {

return clican;
}

@FindBy(xpath = "//a[normalize-space()='EOB']")
private WebElement ClickEOB;

public WebElement getClickEOB() {
return ClickEOB;
}

@FindBy(xpath = "//button[normalize-space()='Add Payment']")
private WebElement ClickAddPyment;

public WebElement getClickAddPyment() {
return ClickAddPyment;
}

@FindBy(xpath = "(//input[@id='mydate'])[1]")
private WebElement ClickDate;

public WebElement getClickDate() {
return ClickDate;
}

@FindBy(xpath = "(//div[normalize-space()='14'])[1]")
private WebElement SelectDate;

public WebElement getSelectDate() {
return SelectDate;
}

@FindBy(xpath = "(//select[@id='payerid'])[1]")
private WebElement ClickPayer;

public WebElement getClickPayer() {
return ClickPayer;
}

@FindBy(xpath = "//option[@value='2']")
private WebElement SelectUnitedHealh;

public WebElement getSelectUnitedHealth() {
return SelectUnitedHealh;
}

@FindBy(xpath = "//select[@id='pay_method']")
private WebElement SelectPaymentMethod;

public WebElement getSelectPaymentMethod() {
return SelectPaymentMethod;
}

@FindBy(xpath = "//option[@value='Authorize.net']")
private WebElement SelectAutorize;

public WebElement getSelectAutorize() {
return SelectAutorize;
}

@FindBy(xpath = "//div[1]//div[4]//div[1]//div[2]//input[1]")
private WebElement EnterPaymentNumber;

public WebElement getEnterPaymentNumber() {
return EnterPaymentNumber;
}

@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
private WebElement EnterAmount1;

public WebElement getEnterAmount1() {
return EnterAmount1;
}

@FindBy(xpath = "//button[normalize-space()='Save']")
private WebElement SelectSave;

public WebElement getSelectSave() {
return SelectSave;
}

@FindBy(xpath = "//button[normalize-space()='Cancel']")
private WebElement SelectCancel;

public WebElement getSelectCancel() {
return SelectCancel;
}
	



/////// //// ////////// payment analysis    /////////////

	@FindBy(xpath = "(//a[normalize-space()='Payment Analysis'])[1]")
	private WebElement payana;

	public WebElement getpayana() {

		return payana;
	}

	@FindBy(xpath = "(//input[@placeholder='Patient'])[1]")
	private WebElement payanasea;

	public WebElement getpayanasea() {

		return payanasea;
	}

	@FindBy(xpath = "//div[contains(text(),'MartinEdward')]")
	private WebElement selepa;

	public WebElement getselepa() {

		return selepa;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/select[1]")
	private WebElement seleoff;

	public WebElement getseleoff() {

		return seleoff;
	}

	@FindBy(xpath = "//option[contains(text(),'John Hospital')]")
	private WebElement seleoff1;

	public WebElement getseleoff1() {

		return seleoff1;
	}

	@FindBy(xpath = "//input[@placeholder='Start date']")
	private WebElement starda;

	public WebElement getstarda() {

		return starda;
	}

	@FindBy(xpath = "//input[@placeholder='End date']")
	private WebElement enda;

	public WebElement getenda() {

		return enda;
	}

	@FindBy(xpath = "//option[@value='PosDate']")
	private WebElement posdat;

	public WebElement getposdat() {

		return posdat;
	}

	@FindBy(xpath = "//option[contains(@value,'PosDate')]")
	private WebElement posdat1;

	public WebElement getposdat1() {

		return posdat1;
	}

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement cliupp;

	public WebElement getcliupp() {

		return cliupp;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")
	private WebElement clicre;

	public WebElement getclicre() {

		return clicre;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-4'])[1]")
	private WebElement clich;

	public WebElement getclich() {

		return clich;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-3'])[1]")
	private WebElement clipatpay;

	public WebElement getclipatpay() {

		return clipatpay;
	}

	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement ClickReportsModule;

	public WebElement getClickReportsModule() {
		return ClickReportsModule;
	}
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.*;

public class CheckNHSCostsPage {
	public static WebDriver driver;

	public CheckNHSCostsPage() {
		this.driver = Hooks.getDriver();
		PageFactory.initElements(driver, this);
	}

	public String startPTitle = "Check what help you could get to pay for NHS costs - NHSBSA";
	public String countryPTitle = "Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String gpPTitle = "Is your GP practice in Scotland or Wales? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String dentalPTitle = "Which country is your dental practice in? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String dobPTitle ="What is your date of birth? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String partnerPTitle="Do you live with a partner? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String claimPTitle ="Do you claim any benefits or tax credits? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String pregnantPTitle ="Are you pregnant or have you given birth in the last 12 months? - Check what help you could get to pay for NHS costs - NHSBSA"; 
	public String injuryPTitle ="Do you have an injury or illness caused by serving in the armed forces? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String diabatesPTitle = "Do you have diabetes? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String conditionsPTitle ="To check what help you can get with NHS charges, we need to know if you're affected by any of these conditions - Check what help you could get to pay for NHS costs - NHSBSA";
	public String gulcomaPTitle ="Do you have glaucoma? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String careHPTitle ="Do you live permanently in a care home? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String investmentPTitle ="Do you have more than £16,000 in savings, investments or property? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String helpCostsPTitle ="You get help with health costs - Check what help you could get to pay for NHS costs - NHSBSA";
	public String irePTitle ="You cannot use this service because you live in Northern Ireland - Check what help you could get to pay for NHS costs - NHSBSA";
	public String sctPtitle = "Do you live in the Highlands and Islands? - Check what help you could get to pay for NHS costs - NHSBSA";
	public String englandRmsg= "You could get help to pay for your NHS costs";
	public String sctwaleRmsg ="You get help with NHS costs";
	public String ireRmsg = "You cannot use this service because you live in Northern Ireland";
	
	@FindBy(css = "#nhsuk-cookie-banner__link_accept_analytics")
	WebElement acceptCookies;
	@FindBy(css = "#nhsuk-cookie-banner__link_accept")
	WebElement deleteCookies;
	@FindBy(css = "#radio-england")
	WebElement countryEngland;
	@FindBy(css = "#radio-scotland")
	WebElement countryScotland;
	@FindBy(css = "#radio-wales")
	WebElement countryWales;
	@FindBy(css = "#radio-nire")
	WebElement countryIreland;
	@FindBy(css = "#next-button")
	WebElement nxtBtn;
	@FindBy(css = "#radio-yes")
	WebElement yesBtn;
	@FindBy(css = "#radio-no")
	WebElement noBtn;
	@FindBy(css = "#dob-day")
	WebElement day;
	@FindBy(css = "#dob-month")
	WebElement month;
	@FindBy(css = "#dob-year")
	WebElement year;
	@FindBy(css=".form-group-margin")
	WebElement engmessage;
	@FindBy(css=".heading-secondary")
	WebElement sctmessage;
	@FindBy(xpath="//*[@id=\"result-heading\"]/text()")
	WebElement walesmessage;
	@FindBy(css="#result-heading")
	WebElement iremessage;
	
	
	

	public void acptcookies() {
		acceptCookies.click();
	}

	public void deletecookies() {
		deleteCookies.click();
	}

	public void rdbtnengland() {
		countryEngland.click();
	}

	public void rdbtnscotland() {
		countryScotland.click();
	}

	public void rdbtnwales() {
		countryWales.click();
	}

	public void rdbtnireland() {
		countryIreland.click();
	}

	public void nextbtn() {
		nxtBtn.click();
	}

	public void yesbtn() {
		yesBtn.click();
	}

	public void noBtn() {
		noBtn.click();
	}
	
	public String englandmessage() {
		return engmessage.getText();
	}
	public String scotlandmessage() {
		return sctmessage.getText();
	}
	public String walesmessage() {
		return walesmessage.getText();
	}
	public String irelandmessage() {
		return iremessage.getText();
	}
	
	
	
	public void dob(String date, String mnt, String yer) {
		day.sendKeys(date);
		month.sendKeys(mnt);
		year.sendKeys(yer);
		
	}
	
	public String pageTitle() {
		return driver.getTitle();
	}
public void dwait() throws InterruptedException {
	Thread.sleep(3000);
	
}
}

package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import helpers.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CheckNHSCostsPage;

public class NHSCostsSteps extends CommonUtils {
	public WebDriver driver;
	
	
	CheckNHSCostsPage costspage = new CheckNHSCostsPage();

	@Given("Open the browser with url")
	public void open_the_browser_with_url() {
		String actpagetitle = costspage.pageTitle();
		String exppagetitle = costspage.startPTitle;
		System.out.println(actpagetitle);
		System.out.println(exppagetitle);
		Assert.assertEquals(actpagetitle, costspage.startPTitle);
		costspage.acptcookies(); // user accept cookies
		costspage.nextbtn(); // click start now button

	}

	@Given("I am a England recident")
	public void i_am_a_england_recident() throws InterruptedException {
		//costspage.dwait();
		costspage.rdbtnengland(); // select county
		costspage.nextbtn();
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.gpPTitle); // validate page title

	}

	@Given("I am a Scotland recident")
	public void i_am_a_scotland_recident() throws InterruptedException {
		//costspage.dwait();
		costspage.rdbtnscotland(); // select country
		costspage.nextbtn();
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.sctPtitle); // validate page title
	}

	@Given("I am a Wales recident")
	public void i_am_a_wales_recident() throws InterruptedException {
		//costspage.dwait();
		costspage.rdbtnwales(); // select country
		costspage.nextbtn();
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.gpPTitle); // validate page title

	}

	@Given("I am a Ireland recident")
	public void i_am_a_ireland_recident() throws InterruptedException {
		//costspage.dwait();
		costspage.rdbtnireland(); // select country
		costspage.nextbtn();
	}

	@When("England recident put circumstances into the checker tool")
	public void england_recident_put_circumstances_into_the_checker_tool() {
		costspage.noBtn(); // select option in GP page
		costspage.nextbtn();
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.dentalPTitle);

		costspage.rdbtnengland(); // select option in dental practice page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.dob("02", "08", "1995"); // enter DOB
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in partner page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select options in tax benefits page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in pregnant page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in injury page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in diabetes page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in conditions page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in glaucoma page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in care home page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in investments page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

	}

	@When("Scotland recident put circumstances into the checker tool")
	public void scotland_recident_put_circumstances_into_the_checker_tool() {
		costspage.noBtn(); // select option in lands page
		costspage.nextbtn();
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.dentalPTitle);

		costspage.rdbtnscotland(); // select option in dental practice page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.dob("02", "08", "1995"); // enter DOB
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in partner page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select options in tax benefits page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in pregnant page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in injury page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in care home page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in investments page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

	}

	@When("Wales recident put circumstances into the checker tool")
	public void wales_recident_put_circumstances_into_the_checker_tool() {
		costspage.noBtn(); // select option in GP page
		costspage.nextbtn();
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.dentalPTitle);

		costspage.rdbtnwales(); // select option in dental practice page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.dob("02", "08", "1995"); // enter DOB
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in partner page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select options in tax benefits page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in pregnant page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in injury page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in diabetes page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in glaucoma page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in care home page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

		costspage.noBtn(); // select option in investments page
		costspage.nextbtn();
		System.out.println(costspage.pageTitle());

	}

	@When("Ireland recident put circumstances into the checker tool")
	public void ireland_recident_put_circumstances_into_the_checker_tool() {

		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.irePTitle); // validate page title

	}

	@Then("England recident should get a result of whether will get help or not")
	public void england_recident_should_get_a_result_of_whether_will_get_help_or_not() {
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.helpCostsPTitle); // validate page title
		System.out.println(costspage.englandmessage());
		Assert.assertEquals(costspage.englandmessage(), costspage.englandRmsg); // validate message

	}

	@Then("Scotland recident should get a result of whether I will get help or not")
	public void scotland_recident_should_get_a_result_of_whether_I_will_get_help_or_not() {
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.helpCostsPTitle); // validate page title

	}

	@Then("Wales recident I should get a result of whether I will get help or not")
	public void wales_recident_I_should_get_a_result_of_whether_I_will_get_help_or_not() {
		String pagetitle = costspage.pageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, costspage.helpCostsPTitle); // validate page title

	}

	@Then("Ireland recident should get a result of whether I will get help or not")
	public void ireland_recident_should_get_a_result_of_whether_I_will_get_help_or_not() {

		System.out.println(costspage.irelandmessage());
		Assert.assertEquals(costspage.irelandmessage(), costspage.ireRmsg); // validate message
	}

}

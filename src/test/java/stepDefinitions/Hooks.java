package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import helpers.CommonUtils;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void setUp() {
		
		if (CommonUtils.getValue().getProperty("BrowserName").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().window().setSize(new Dimension(1200, 800));
			//driver.get(CommonUtils.getValue().getProperty("url"));
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		if (CommonUtils.getValue().getProperty("BrowserName").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			//driver.manage().window().maximize();
			//driver.manage().window().setSize(new Dimension(1200, 800));
		}
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1200, 800));
		driver.get(CommonUtils.getValue().getProperty("url"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@After
	public void tearDown(Scenario scenario) {

		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.close();
	}
	public static WebDriver getDriver() {
		return driver;
	}

}

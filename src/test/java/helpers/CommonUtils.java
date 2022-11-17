package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	public static WebDriver driver;
	static Properties prop = new Properties();

	public static Properties getValue() {
		InputStream input = null;
		try {
			System.out.println(System.getProperty("user.dir"));
			File propFile = new File(System.getProperty("user.dir") + "/src/test/java/helpers/Resoruce.properties");

			if (!propFile.exists()) {
				prop.load(CommonUtils.class.getResourceAsStream(
						System.getProperty("user.dir") + "/src/test/java/helpers/Resoruce.properties"));
			} else {
				input = new FileInputStream(propFile);
				prop.load(input);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prop;
	}
	
	public void driverwait() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		}
	

}

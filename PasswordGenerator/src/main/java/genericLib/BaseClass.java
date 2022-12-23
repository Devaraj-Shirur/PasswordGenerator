package genericLib;

import java.util.concurrent.TimeUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author devaraj.shirur
 *
 */

public class BaseClass extends Constants{
	public static WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowser() {
		
		System.setProperty(CHROMEKEY, CHROMEPATH);
		driver = new ChromeDriver();
		Reporter.log("Browser launched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized Successfully", true);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void launchTheApplication() {
		driver.get(URL);
		Reporter.log("Application Launched Successfully", true);
	}
	@AfterClass
	public void closeTheApp() {
		driver.quit();
	}


}

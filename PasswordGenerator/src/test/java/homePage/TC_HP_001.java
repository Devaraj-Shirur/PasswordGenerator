package homePage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.HomePage;
import pomRepo.VaultHomePage;
import pomRepo.VaultLoginPage;
/***
 * 
 * @author devaraj.shirur
 *
 */

public class TC_HP_001 extends BaseClass {
	@Test
	public void CreateEightCharPasswordAndSave() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		VaultLoginPage vlp = new VaultLoginPage(driver);
		VaultHomePage vhp = new VaultHomePage(driver);

		WebElement sliderRail = hp.getSliderRail();
		Dimension d = sliderRail.getSize();
		int y = d.height;
		int x = d.width;
		Reporter.log(x + " and " + y, true);
		sliderRail.click();
		String value = hp.getPasswordLengthValue().getText();
		Reporter.log("Center Value of the Slider is : " + value, true);

		/*
		 * Slider Work : Total Length of slider = 944p 
		 * At center = 944/2 = 472p max
		 * length = 50 characters 
		 * min length = 4 characters 
		 * center length = 27
		 * characters for one unit = 472/(27-4) = 20.52p
		 */

		Actions action = new Actions(driver);
		action.moveToElement(sliderRail, -390, 0).click().build().perform();
		String Value2 = hp.getPasswordLengthValue().getText();
		Reporter.log("Selected Length of password is : " + Value2, true);
		hp.getRefreshArrowButton().click();
		String displayedPwd = hp.getPasswordDisplayed().getText();
		Reporter.log("Displayed Password : " + displayedPwd, true);
		hp.getAddPlusButton().click();

		// Navigated to Login Page

		vlp.getEmailTextField().sendKeys(USERNAME);
		vlp.getPasswordTextFiled().sendKeys(PASSWORD);
		vlp.getLoginButton().click();

		// Navigated to Vault Home Page

		String expectedHeader = "Welcome, Devaraj Shirur";
		String actualHeader = vhp.getVaultHeader().getText();
		Assert.assertEquals(actualHeader, expectedHeader, "Login is Failed");
		Reporter.log("Vault Header Says " + actualHeader + ", hence Login is Successfull", true);
		vhp.getHomeIcon().click();

		// Navigated Home Page

		hp.getAddPlusButton().click();

		// Add Pop-Up

		hp.getNameTextfiledOfPopup().sendKeys("Instagram");
		hp.getAddButtonOfPopup().click();
		Thread.sleep(2000);

		// Navigated to Vault Home Page
		// Added Passwords
		List<WebElement> SavedPwd = driver.findElements(By.xpath("//tr[@class=\"MuiTableRow-root css-1q1u3t4-MuiTableRow-root\"]/..//td[contains(@class, 'MuiTableCell-root MuiTableCell-body MuiTableCell')][1]"));
		for (WebElement sp : SavedPwd) {
			String actual = sp.getText();
			Reporter.log(actual, true);
		}

	}

}

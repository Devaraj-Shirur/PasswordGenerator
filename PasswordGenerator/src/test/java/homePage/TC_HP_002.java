package homePage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLib.BaseClass;
import pomRepo.ConfirmAccessPage;
import pomRepo.HomePage;
import pomRepo.VaultHomePage;
import pomRepo.VaultLoginPage;
/***
 * 
 * @author devaraj.shirur
 *
 */

public class TC_HP_002 extends BaseClass {
	@Test
	public void DeleteTheSavedPasswordFromVault() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		VaultLoginPage vlp = new VaultLoginPage(driver);
		VaultHomePage vhp = new VaultHomePage(driver);
		ConfirmAccessPage cap = new ConfirmAccessPage(driver);
		
		//Login to Vault
		hp.getLogInIconOfVault().click();
		vlp.getEmailTextField().sendKeys(USERNAME);
		vlp.getPasswordTextFiled().sendKeys(PASSWORD);
		vlp.getLoginButton().click();
		
		Thread.sleep(2000);
		
		//Navigated to Vault HomePage
		vhp.getPasswordNeedToBeDeleted().click();
		
		//Confirm Access
		cap.getConfirmPasswordTextfield().sendKeys(PASSWORD);
		cap.getConfirmPasswordButton().click();
		
		String Message = vhp.getPasswordDeletionMessage().getText();
		Reporter.log(Message,true);
		Reporter.log("After Deleting Remaining : ",true);
		List<WebElement> SavedPwd = driver.findElements(By.xpath("//tr[@class=\"MuiTableRow-root css-1q1u3t4-MuiTableRow-root\"]/..//td[contains(@class, 'MuiTableCell-root MuiTableCell-body MuiTableCell')][1]"));
		for (WebElement sp : SavedPwd) {
			String actual = sp.getText();
			Reporter.log(actual, true);
		}
		
		

	}
}

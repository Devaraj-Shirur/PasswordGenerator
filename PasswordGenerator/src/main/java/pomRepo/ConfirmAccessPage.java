package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.BaseClass;
/***
 * 
 * @author devaraj.shirur
 *
 */

public class ConfirmAccessPage extends BaseClass {
	public ConfirmAccessPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement ConfirmPasswordTextfield;
	
	@FindBy(xpath = "//button[text()='Confirm Password']")
	private WebElement ConfirmPasswordButton;

	public WebElement getConfirmPasswordTextfield() {
		return ConfirmPasswordTextfield;
	}

	public WebElement getConfirmPasswordButton() {
		return ConfirmPasswordButton;
	}
	
}

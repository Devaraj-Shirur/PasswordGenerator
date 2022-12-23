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

public class VaultLoginPage extends BaseClass {

	public VaultLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "outlined-basic")
	private WebElement EmailTextField;
	
	@FindBy(id = "outlined-adornment-password")
	private WebElement PasswordTextFiled;;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(linkText = "SIGNUP")
	private WebElement SignUPButton;
	
	@FindBy(xpath = "//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root MuiIconButton')]")
	private WebElement PasswordVisiblityButton;
	
	@FindBy(xpath = "//button[text()='Create Password']")
	private WebElement CreatePasswordButton;

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextFiled() {
		return PasswordTextFiled;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getSignUPButton() {
		return SignUPButton;
	}

	public WebElement getPasswordVisiblityButton() {
		return PasswordVisiblityButton;
	}

	public WebElement getCreatePasswordButton() {
		return CreatePasswordButton;
	}
}

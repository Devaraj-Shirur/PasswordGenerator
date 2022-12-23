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

public class SignUPPage extends BaseClass{

	public SignUPPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = ":r3:")
	private WebElement FirstNameTextfield;
	
	@FindBy(id =":r5:")
	private WebElement LastNameTextfield;
	
	@FindBy(id = ":r7:")
	private WebElement EmailTetfiled;
	
	@FindBy(id = "outlined-adornment-password")
	private WebElement PasswordTextfield;
	
	@FindBy(id = ":r9:")
	private WebElement ConfirmPasswordTextfield;
	
	@FindBy(xpath = "//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root MuiIconButto')]")
	private WebElement PasswordVisiblity;
	
	@FindBy(xpath = "//button[contains(@class, 'MuiButton-root MuiButton-contained MuiButton')]")
	private WebElement SignUPButton;
	
	@FindBy(xpath = "//button[contains(@class, 'MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium')]")
	private WebElement CreatePasswordButton;

	public WebElement getFirstNameTextfield() {
		return FirstNameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return LastNameTextfield;
	}

	public WebElement getEmailTetfiled() {
		return EmailTetfiled;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getConfirmPasswordTextfield() {
		return ConfirmPasswordTextfield;
	}

	public WebElement getPasswordVisiblity() {
		return PasswordVisiblity;
	}

	public WebElement getSignUPButton() {
		return SignUPButton;
	}

	public WebElement getCreatePasswordButton() {
		return CreatePasswordButton;
	}
}

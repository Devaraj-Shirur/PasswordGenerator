package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author devaraj.shirur
 *
 */

public class VaultHomePage {

	public VaultHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/home']")
	private WebElement HomeIcon;
	
	@FindBy(xpath = "//a[@href='/vault']")
	private WebElement VaultIcon;
	
	@FindBy(xpath = "//a[@href='/']")
	private WebElement LogoutIconButton;
	
	@FindBy(xpath = "//div[@class='add']")
	private WebElement AddPasswordButton;
	
	@FindBy(id = ":rb:")
	private WebElement SearchTextfiled;
	
	@FindBy(xpath = "//div[@class='vault-header']")
	private WebElement VaultHeader;
	
	//You can just change the name of the password need to be Deleted here in the below Xpath
	@FindBy(xpath = "//td[text()='Instagram']/..//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-13')]")
	private WebElement PasswordNeedToBeDeleted;
	
	@FindBy(xpath = "//div[@class='MuiAlert-message css-1pxa9xg-MuiAlert-message']")
	private WebElement PasswordDeletionMessage;
	

	public WebElement getPasswordDeletionMessage() {
		return PasswordDeletionMessage;
	}

	public WebElement getPasswordNeedToBeDeleted() {
		return PasswordNeedToBeDeleted;
	}

	public WebElement getVaultHeader() {
		return VaultHeader;
	}

	public WebElement getHomeIcon() {
		return HomeIcon;
	}

	public WebElement getVaultIcon() {
		return VaultIcon;
	}

	public WebElement getLogoutIconButton() {
		return LogoutIconButton;
	}

	public WebElement getAddPasswordButton() {
		return AddPasswordButton;
	}

	public WebElement getSearchTextfiled() {
		return SearchTextfiled;
	}
}

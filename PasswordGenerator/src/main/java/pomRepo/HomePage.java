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
public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/home']")
	private WebElement HomeIcon;
	
	@FindBy(xpath = "//a[@href='/vault']")
	private WebElement VaultIcon;
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement LogInIconOfVault;
	
	@FindBy(xpath = "//div[@class='password']")
	private WebElement PasswordDisplayed;
	
	@FindBy(xpath = "//div[@class='pass-status']")
	private WebElement PasswordStrength;
	
	@FindBy(xpath = "//button[@data-testid='add']")
	private WebElement AddPlusButton;
	
	@FindBy(xpath = "//button[@data-testid='refresh']")
	private WebElement RefreshArrowButton;
	
	@FindBy(xpath = "//button[@data-testid='copy']")
	private WebElement CopyButton;
	
	@FindBy(xpath = "//span[contains(@class, 'MuiSlider-thumbColorPrimary MuiSlider')]")
	private WebElement SliderButton;
	
	@FindBy(xpath = "//span[@class='MuiSlider-valueLabelLabel']")
	private WebElement PasswordLengthValue;
	
	@FindBy(xpath = "//span[text() = 'Uppercase']")
	private WebElement UpperCaseCheckbox;
	
	@FindBy(xpath = "//span[text() = 'Lowercase']")
	private WebElement LowerCaseCheckbox;
	
	@FindBy(xpath = "//span[text() = 'Number']")
	private WebElement NumberCaseCheckbox;
	
	@FindBy(xpath = "//span[text() = 'Symbols']")
	private WebElement SymbolsCheckbox;
	
	@FindBy(xpath = "//span[@class='MuiSlider-rail css-14pt78w-MuiSlider-rail']")
	private WebElement SliderRail;
	
	@FindBy(xpath = "//input[@name='pName']")
	private WebElement NameTextfiledOfPopup;
	
	@FindBy(xpath = "//button[text()='Add']")
	private WebElement AddButtonOfPopup;

	public WebElement getAddButtonOfPopup() {
		return AddButtonOfPopup;
	}

	public WebElement getNameTextfiledOfPopup() {
		return NameTextfiledOfPopup;
	}

	public WebElement getSliderRail() {
		return SliderRail;
	}

	public WebElement getHomeIcon() {
		return HomeIcon;
	}

	public WebElement getVaultIcon() {
		return VaultIcon;
	}

	public WebElement getLogInIconOfVault() {
		return LogInIconOfVault;
	}

	public WebElement getPasswordDisplayed() {
		return PasswordDisplayed;
	}

	public WebElement getPasswordStrength() {
		return PasswordStrength;
	}

	public WebElement getAddPlusButton() {
		return AddPlusButton;
	}

	public WebElement getRefreshArrowButton() {
		return RefreshArrowButton;
	}

	public WebElement getCopyButton() {
		return CopyButton;
	}

	public WebElement getSliderButton() {
		return SliderButton;
	}

	public WebElement getPasswordLengthValue() {
		return PasswordLengthValue;
	}

	public WebElement getUpperCaseCheckbox() {
		return UpperCaseCheckbox;
	}

	public WebElement getLowerCaseCheckbox() {
		return LowerCaseCheckbox;
	}

	public WebElement getNumberCaseCheckbox() {
		return NumberCaseCheckbox;
	}

	public WebElement getSymbolsCheckbox() {
		return SymbolsCheckbox;
	}
}

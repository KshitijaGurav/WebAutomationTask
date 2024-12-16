package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;
public class Login extends TestBase 
{
	//object repository
	@FindBy(xpath="//input[@id='user-name']")private WebElement usernameTxtBox;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordTxtBox;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	public Login() {
		PageFactory.initElements(driver, this);
	}
	public String loginToApplication() {
		usernameTxtBox.sendKeys("username");
		passwordTxtBox.sendKeys("password");
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	public String verifyMultiCreds(String un,String password)
	{
		usernameTxtBox.sendKeys(un);
		passwordTxtBox.sendKeys(password);
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	public String verifyURLOfApplication()
	{
		return driver.getCurrentUrl();	
	}
}

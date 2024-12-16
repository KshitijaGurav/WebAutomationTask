package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import base.TestBase;


public class HomePage extends  TestBase {
	//object repository 
	    //Welcome to homepage
	    @FindBy(xpath="//input[@id='welcome_message']")private WebElement welcome;
	    @FindBy(xpath="//input[@id='logout-button']")private WebElement logoutbtn;
		@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLogo;
		
		public HomePage()
		{
			PageFactory.initElements(driver,this);
		} 
		public String getWelcomeMessage()
		{
			return driver.getTitle();
		}
		public boolean verifyTwitterLogo()
		{
			return twitterLogo.isDisplayed();
		}
		
		public void clickonLogout()
		{
			clickonLogout();
		}
}

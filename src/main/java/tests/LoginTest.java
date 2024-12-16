package tests;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;
import pages.Login;

public class LoginTest extends TestBase{
	
		Login login;
		@BeforeMethod
		public void setUp() throws IOException
		{
			initialization();
			login=new Login();
		}
		@Test
		public void verifyURLOfApplicationTest()
		{
			String expURL="sites's url";
			String actURL=login.verifyURLOfApplication();
			Assert.assertEquals(expURL,actURL);
		}
		@AfterMethod
		public void closeBrowser()
		{
			driver.close();
		}
	}




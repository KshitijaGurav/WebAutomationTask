package tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;
import pages.HomePage;
import pages.Login;

public class HomePageTest  extends TestBase
{
	Login login;
    HomePage invent;
@BeforeMethod
public void setUp() throws IOException
{
	initialization();
	login=new Login();
	login.loginToApplication();
	invent=new HomePage();
}
@Test
public void getWelcomeMessage()
{
	String expTitle="Welcome";
	String actTitle=invent.getWelcomeMessage();
	Assert.assertEquals(expTitle,actTitle);
}
@Test 
public void verifyTwitterLogoTest() 
{
	boolean result = invent.verifyTwitterLogo(); 
	Assert.assertEquals(result,true);
}

@AfterMethod
public void closeBrowser()
{
	driver.close();
}
}

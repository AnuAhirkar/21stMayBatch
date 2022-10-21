package KeywordPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethodKeywordPractice 
{
	@Test(priority = 1)
	public void Openurl()
	{
		System.out.println("Url is open");
		Assert.fail();
	}
	
	@Test(priority = 2,dependsOnMethods = "Openurl")
	public void Login()
	{
		System.out.println("Logged in to the application.");
	}
	
	@Test(priority = 3,dependsOnMethods ={"Openurl","Login"})
	public void Logout()
	{
		System.out.println("Logged out from the application.");
	}


}

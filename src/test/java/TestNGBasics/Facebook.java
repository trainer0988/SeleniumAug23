package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook {
	
	
	@Test(priority = 1, groups = {"sanity"})
	public void doLogin()
	{
		
	}
	
	
	@Test(priority = 2)
	public void searchFriend()
	{
		Assert.assertEquals(2, 3);
	}
	
	@Test(priority = 3, dependsOnMethods = {"searchFriend"})
	public void sendFriendRequest()
	{
		
	}
	
	@Test(priority = 4, enabled = false)
	public void updatePost()
	{
		
		
	}
	
	@Test(priority = 5)
	public void updateProfilePic()
	{
		
	}

}

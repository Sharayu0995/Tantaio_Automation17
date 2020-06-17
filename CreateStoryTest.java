package com.tantaio.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tantaio.Library.AppLibrary;
import com.tantaio.Library.TestBase;
import com.tantaio.PageObject.CreateStoryPage;
import com.tantaio.PageObject.LoginPage;


public class CreateStoryTest extends TestBase
{
	@BeforeClass
	public void setup()
	{
		appLibrary=new AppLibrary("SignUp Test");
	}
	
	@Test
	public void CreateStoryTest() throws Exception
	{
		appLibrary.getDriverInstance();
		new LoginPage(appLibrary).Login(testName, testName);
		
		new CreateStoryPage(appLibrary).createStory(testName,testName);
		
		
	}
}

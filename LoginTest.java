package com.tantaio.Regression;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tantaio.Library.AppLibrary;
import com.tantaio.Library.TestBase;
import com.tantaio.PageObject.LoginPage;

public class LoginTest extends TestBase
{
	@BeforeClass
	public void setup()
	{
		appLibrary=new AppLibrary("Login Test");
	}
	
	@Test
	public void LoginTest() throws Exception
	{
		appLibrary.getDriverInstance();
		String username=appLibrary.getConfiguration().getUser1();
		String pass=appLibrary.getConfiguration().getUser1Pass();
		new LoginPage(appLibrary).Login(username,pass);
		appLibrary.getDriverInstance();
	}
	
}

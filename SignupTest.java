package com.tantaio.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tantaio.Library.AppLibrary;
import com.tantaio.Library.TestBase;

import com.tantaio.PageObject.SignInPage;

public class SignupTest extends TestBase
{
	@BeforeClass
	public void setup()
	{
		appLibrary=new AppLibrary("SignUp Test");
	}
	
	@Test
	public void SignupTest() throws Exception
	{
		appLibrary.getDriverInstance();
		
		new SignInPage(appLibrary).Signin(testName,testName,testName);
		appLibrary.getDriverInstance();
	}
}

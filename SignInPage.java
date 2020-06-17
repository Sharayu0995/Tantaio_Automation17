package com.tantaio.PageObject;

import com.tantaio.Library.AppLibrary;

public class SignInPage 
{
	private AppLibrary appLibrary;
	public static String skip = "xpath://android.widget.TextView[@text='Skip >>']";
	public static String signupbtn="id:btnShowRegister";
	public static String username1="id:edtNameAdvanced";
	public static String password="id:edtNewPass";
	public static String cpassword="id:edtNewPassConfirm";
	public static String signupbtnenter="xpath://android.widget.Button[@text='Register Account']";
	
	public SignInPage(AppLibrary appLibrary) 
	{
		this.appLibrary = appLibrary;
	}
	
	public SignInPage Signin(String username,String pwd,String cpwd) throws Exception
	{
		appLibrary.clickMobileElement(skip);
		appLibrary.clickMobileElement(signupbtn);
		appLibrary.findElementForMobile(username1).sendKeys("alex11");
		appLibrary.findElementForMobile(password).sendKeys("test@123");
		appLibrary.findElementForMobile(cpassword).sendKeys("test@123");
		appLibrary.clickMobileElement(signupbtnenter);
		
		return new SignInPage(appLibrary);
	}
}

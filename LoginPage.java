package com.tantaio.PageObject;

import com.tantaio.Library.AppLibrary;

public class LoginPage {
	private AppLibrary appLibrary;
	public static String skip = "xpath://android.widget.TextView[@text='Skip >>']";
	public static String login = "xpath://android.widget.Button[@text='Log In']";
	public static String usernminput = "xpath://android.widget.EditText[@text='username']";
	public static String password = "xpath://android.widget.EditText[@text='password']";
	public static String loginbtn = "xpath://android.widget.Button[@text='Sign in']";

	public LoginPage(AppLibrary appLibrary) 
	{
		this.appLibrary = appLibrary;
	}

	public LoginPage Login(String username, String pwd) throws Exception {
		appLibrary.clickMobileElement(skip);
		appLibrary.clickMobileElement(login);
		appLibrary.findElementForMobile(usernminput).sendKeys("nijaqe");
		appLibrary.findElementForMobile(password).sendKeys("Pass@123!@#");
		appLibrary.clickMobileElement(loginbtn);

		return new LoginPage(appLibrary);
	}

}

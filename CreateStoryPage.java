package com.tantaio.PageObject;

import com.tantaio.Library.AppLibrary;

public class CreateStoryPage 
{
	private AppLibrary appLibrary;
	public static String clickadd="xpath:(//android.widget.TextView[@content-desc=\"Create Channel\"])[1]";
	public static String entername="xpath://android.widget.EditText[@text='Name it…']";
	public static String clickdone="id:menu_done";
	public static String backbtn="xpath://android.widget.ImageButton[@content-desc='Navigate up']";
	public static String clickaddfriend="xpath://android.widget.TextView[@text='Add friend']";
	public static String searchfriend="id:email";
	public static String addfriend="xpath://android.widget.Button[@resource-id='app.tantiao:id/btnAddFriend']";
	
	public CreateStoryPage(AppLibrary appLibrary) 
	{
		this.appLibrary = appLibrary;
	}
	public CreateStoryPage createStory(String roomname,String searchname) throws Exception
	{
		
		appLibrary.clickMobileElement(clickadd);
		appLibrary.findElementForMobile(entername).sendKeys("Qty101");
		appLibrary.clickMobileElement(clickdone);
		appLibrary.clickMobileElement(backbtn);
		appLibrary.clickMobileElement(clickaddfriend);
		appLibrary.findElementForMobile(searchfriend).sendKeys("andy11");
		appLibrary.clickMobileElement("addfriend");
		
		return new CreateStoryPage(appLibrary);
	}
}

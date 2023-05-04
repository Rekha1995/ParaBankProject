package com.PB.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PB_Upadate_contact_infopageTest extends PB_BaseSetup {
	
	@BeforeClass
	public void navigateTo_UpadateContactinfoTest() {
		lp.successfullLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		hp.navigateTo_UpadateContactinfo();
	}
	@Test(priority=1)
	public void getpageurl() {
		String act=UCI.getpageurl();
		Assert.assertEquals(act, "https://parabank.parasoft.com/parabank/updateprofile.htm");
	}
	@Test(priority=2)
	public void Page_headerTest() {
		String act=UCI.Page_header();
		Assert.assertEquals(act, "Update Profile");
	}
	@Test(priority=3)
	public void updatedSuccesfullyTest() {
		String act=UCI.updatedSuccesfully();
		Assert.assertEquals(act, "Profile Updated");
	}

}

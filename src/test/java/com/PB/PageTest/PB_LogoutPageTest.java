package com.PB.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.utils.PB_ConstantUtil;

public class PB_LogoutPageTest extends PB_BaseSetup {
	@BeforeClass
	public void dologoutTest() {
		lp.successfullLogin("john", "demo");
		hp.dologout();
	}
	
	
	@Test(priority=1)
	public void getloginpageURLTest() {
		String act=PLO.getloginpageURL();
		Assert.assertEquals(act, PB_ConstantUtil.PB_LOGIN_URL);
	}
	@Test(priority=2)
	public void getpageTitleTest() {
		String act_title=PLO.getpageTitle();
		Assert.assertEquals(act_title, PB_ConstantUtil.PB_LOGIN_TITLE);
	}
	
}
	

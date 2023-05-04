package com.PB.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.utils.PB_ConstantUtil;

public class PB_OpenNewAccountPageTest extends PB_BaseSetup {
	
	@BeforeClass
	public void navigateTo_OpenNewAccountTest() {
		lp.successfullLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		hp.navigateTo_OpenNewAccount();
	}
	@Test(priority=1)
	public void currenurlTest() {
		String Act=OAP.currenurl();
		Assert.assertEquals(Act, PB_ConstantUtil.PB_OPEN_ACC_URL);
	}
	@Test(priority=2)
	public void headertextTest() {
		String Act_text=OAP.headertext();
		Assert.assertEquals(Act_text, PB_ConstantUtil.PB_OPEN_ACC_HEADER);
	}
	@Test(priority=3)
	public void createAccountTest() {
		String Act_msg=OAP.createAccount("SAVINGS", "13344");
		Assert.assertEquals(Act_msg,PB_ConstantUtil.PB_CREATE_ACC_CONF_MSG);
	}

}

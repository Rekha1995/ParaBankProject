package com.PB.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.utils.PB_ConstantUtil;

public class PB_AccountOverviewPageTest extends PB_BaseSetup {
	
	@BeforeClass
	public void navigatetoAccountOverviewTest() {
		lp.successfullLogin(prop.getProperty("Username"), prop.getProperty("Password"));//----------->homepage
		hp.navigatetoAccountOverview();
	}
	@Test(priority=1)
	public void currenturlTest() {
		String ACT_url=AOP.currenturl();
		Assert.assertEquals(ACT_url, "https://parabank.parasoft.com/parabank/overview.htm");
	}
	@Test(priority=2)
	public void headertextTest() {
		String Act_header=AOP.headertext();
		Assert.assertEquals(Act_header, PB_ConstantUtil.PB_ACCOUNTOVERVIEW_HEADER);
	}
	@Test(priority=3)
	public void Tablecol_countTest() {
		int act_count=AOP.Tablecol_count();
		//Assert.assertEquals(act_count, 3);
		boolean count=(act_count==3);
		Assert.assertTrue(count);
	}
	@Test(priority=4)
	public void Tablecol_TextTest() {
		String Act_text=AOP.Tablecol_Text(1);
		Assert.assertEquals(Act_text, "Balance*");	
	}
	@Test(priority=5)
	public void Table_col_textTest() {//false
		boolean act=AOP.Table_col_text("13344");
		Assert.assertFalse(act);
		//Assert.assertTrue(act);
	}
	@Test(priority=6)
	public void check_balanceTest() {
		boolean act=AOP.check_balance("$5022.93");//5022.93
		Assert.assertFalse(act);
		//Assert.assertTrue(act);
	}
	@Test(priority=7)
	public void AccountverifyTest() {
		String Avt_url=AOP.Accountverify();
		Assert.assertEquals(Avt_url, "https://parabank.parasoft.com/parabank/activity.htm?id=13344");
	}
	@Test(priority=8)
	public void Acc_headerTest() {
		String text=AOP.Acc_header();
		Assert.assertEquals(text, PB_ConstantUtil.PB_ACCOUNT_HEADER);	
	}
	@Test(priority=9)
	public void AccountTypeverifyTest() {
		String Act=AOP.AccountTypeverify();
		Assert.assertEquals(Act, "CHECKING");//CHECKING	//SAVINGS
	}
	@Test(priority=10)
	public void acc_activityTest() {
		String Act_msg=AOP.acc_activity("August", "Debit");
		Assert.assertEquals(Act_msg, PB_ConstantUtil.PB_ACCOUNTOVERVIEW_TRANS_MSG);	
	}


}

package com.PB.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.utils.PB_ConstantUtil;

public class PB_FindTransactionPageTest extends PB_BaseSetup{
	
	@BeforeClass
	public void navigateTo_PB_FindTransaction() {
		lp.successfullLogin("john", "demo");
		hp.navigateTo_PB_FindTransaction();
		
		
	}
	@Test(priority=1)
	public void geturlTest() {
		String act_url=FTP.geturl();
		Assert.assertEquals(act_url,"https://parabank.parasoft.com/parabank/findtrans.htm");
		
	}
	@Test(priority=2)
	public void Find_headerPagetextTest() {
	String Act_header =FTP.Find_headerPagetext();
	Assert.assertEquals(Act_header,"Find Transactions");
	}
	@Test(priority=3)
	public void drop_optTest() {
		FTP.drop_opt();
	}

}

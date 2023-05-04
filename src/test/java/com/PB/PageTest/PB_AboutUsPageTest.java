package com.PB.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PB_AboutUsPageTest extends PB_BaseSetup {
	
	@BeforeClass
	public void navigateTo_PB_AboutUsPage() {
		lp.successfullLogin("john", "demo");
		hp.navigateTo_PB_AboutUsPage();
		
		}
	@Test(priority=1)
	public void geturlTest() {
		String Act_url=AUP.geturl();
		Assert.assertEquals(Act_url, "https://parabank.parasoft.com/parabank/about.htm");
	}
	@Test(priority=2)
	public void headerTest() {
		String Act_header=AUP.header();
		Assert.assertEquals(Act_header, "ParaSoft Demo Website");
	}
	@Test(priority=3)
	public void linkTest() {
		int Act_link=AUP.link();
		Assert.assertEquals(Act_link, 2);
	}
	@Test(priority=4)
	 public void aboutus_textTest() {
		String Act_text= AUP.aboutus_text();
		boolean Act=Act_text.contains("For more information about Parasoft solutions please visit us at:");
		Assert.assertTrue(Act);
	 }
	@Test(priority=5)
	public void customer_noTest() {
		String act_no=AUP.customer_no();
		boolean Act=act_no.contains("www.parasoft.com or call 888-305-0041");
		Assert.assertTrue(Act);
		
	}

}

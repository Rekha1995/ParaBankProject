package com.PB.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.utils.PB_ConstantUtil;

public class PB_HomePageTest  extends PB_BaseSetup{
	
	@BeforeClass
	public void navigateToHomepageTest() {
	lp.navigateToHomepage(prop.getProperty("Username"), prop.getProperty("Password"));
	}
	
	@Test(priority=1)
	public void currenturlTest() {
		String Act_url=hp.currenturl();
		Assert.assertEquals(Act_url, PB_ConstantUtil.PB_HOMEPAGE_URL);
	}
	@Test(priority=2)
	public void headertextTest() {
		String Act_text=hp.headertext();
		Assert.assertEquals(Act_text, PB_ConstantUtil.PB_HOMEPAGE_HEADER);
	}
	@Test(priority=3)
	public void totallinkscountTest() {
		int act_count=hp.totallinkscount();
		Assert.assertEquals(act_count,PB_ConstantUtil.PB_HOMEPAGE_TOTAL_LINKS);
	}
	@Test(priority=4)
	public void headerlinkscountTest() {
		int act_count=hp.headerlinkscount();
		Assert.assertEquals(act_count,PB_ConstantUtil.PB_HOMEPAGE_HEADER_LINKS);
	}
	@Test(priority=5)
	public void welcomelinkstextTest() {
	String text=hp.welcomelinkstext(4);
	Assert.assertEquals(text, "Admin Page");

	}

	

}

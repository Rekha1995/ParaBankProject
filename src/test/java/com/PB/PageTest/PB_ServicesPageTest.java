package com.PB.PageTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.utils.PB_ConstantUtil;


public class PB_ServicesPageTest extends PB_BaseSetup {

	@BeforeClass
	public void navigateToServicesPageTest() {
		lp.successfullLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		hp.navigateToServicesPage();
	}
	@Test(priority=1)
	public void getcurrent_urlTest() {
		String act_url=PSR.getcurrent_url();
		Assert.assertEquals(act_url, PB_ConstantUtil.PB_SERVICES_PAGE_URL);
	}
	@Test(priority=2)
	public void last_table_headingTest() {
		String act_text=PSR.last_table_heading();
		Assert.assertEquals(act_text, PB_ConstantUtil.PB_SERVICES_TABLE_LAST_HEADING);
	}
	@Test(priority=3)
	public void tablecountTest() {
		int act_count=PSR.tablecount();
		Assert.assertEquals(act_count, PB_ConstantUtil.PB_SERVICES_TABLE_COUNT);
	}
	@Test(priority=4)
	public void Table1textTest() {
		boolean act=PSR.Table1text("Bookstore");
		Assert.assertTrue(act);
	}	

}

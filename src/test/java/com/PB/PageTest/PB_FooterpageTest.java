package com.PB.PageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PB_FooterpageTest  extends PB_BaseSetup{
	@Test(priority=1)
	public void footer_link_countTest() {
		int act=PFP.footer_link_count();
		Assert.assertEquals(act, 8);
	}
	@Test(priority=2)
	public void footer_textTest() {
		String act=PFP.footer_text(3);
		Assert.assertEquals(act, "Products|");
	}
	@Test(priority=3)
	public void services_linksTest() {
		int act_count=PFP.services_links();
		Assert.assertEquals(act_count, 10);
	}
	@Test(priority=4)
	public void customer_careTest() {
		String act=PFP.customer_care();
		Assert.assertEquals(act, "Customer Care");
	}
	@Test(priority=5)
	public void customer_care_requestTest() {
		String act_text=PFP.customer_care_request();
		boolean text=act_text.contains("will be contacting you.");
		Assert.assertTrue(text);
	}
		


}

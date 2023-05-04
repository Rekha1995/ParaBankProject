package com.PB.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.utils.PB_ConstantUtil;

public class PB_BillPayTest  extends PB_BaseSetup{
  @BeforeClass
  public void navigateTo_PB_BillPay() {
	  lp.successfullLogin("john", "demo");
	  hp.navigateTo_PB_BillPay();
  }
  @Test(priority=1)
	public void geturlTest() {
		String act_url=bp.geturl();
		Assert.assertEquals(act_url, PB_ConstantUtil.PB_BILLPAGE_URL);
	}
	@Test(priority=2)
	public void PageheaderTest() {
		String act=bp.Pageheader();
		Assert.assertEquals(act, PB_ConstantUtil.PB_BILLPAGE_HEADER);
	}
	@Test(priority=3)
	public void inform_textTest() {
		String act_url=bp.inform_text();
		Assert.assertEquals(act_url, "Enter payee information");
	}
	@Test(priority=4)
	public void requiredfieldsTest() {
		int act_count=bp.requiredfields();
		Assert.assertEquals(act_count, 9);
	}
	@Test(priority=5)
	public void requiredfieldsTextTest() {
		boolean act=bp.requiredfieldsText("Phone number is required.");
		Assert.assertTrue(act);
	}
	@Test(priority=6)
	public void PaymentcompleteTest() {
		String act=bp.Paymentcomplete();
		boolean act_contains=act.contains("Bill Payment");
		Assert.assertTrue(act_contains);
		//Assert.assertEquals(act, "Bill Payment Complete");
	}
}

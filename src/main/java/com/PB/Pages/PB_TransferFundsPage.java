package com.PB.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.utils.Element_util;

public class PB_TransferFundsPage {
	private WebDriver driver;
	private Element_util eu;
	
	public PB_TransferFundsPage(WebDriver driver) {
		this.driver=driver;
		eu=new Element_util(driver);
	}
	
	public String getpageurl() {
		return eu.geturl();
	}
	
	private By page_header=By.tagName("h1");
	
	public String pageheadertext() {
		return eu.getelement_text(page_header);
	}
	
	
	private By amount=By.id("amount");
	private By from_acc=By.id("fromAccountId");
	private By To_acc=By.id("toAccountId");
	private By click_transfer=By.xpath("//form//input[@type='submit']");
	private By succ_header=By.tagName("h1");
	
//	public String Transfer_completed(String amt, String To_no) {
//		el.dosendskeys(amount, amt);
//		//el.WebDriver_Wait(driver, 5, from_acc);
//		el.Select_drop_drown_Value(from_acc, "13344");
//		//el.Select_drop_drown(from_acc, from_no);
//		el.Select_drop_drown(To_acc, To_no);
//		el.doclick(click_transfer);
//		el.WebDriver_Wait(driver, 10, succ_header);
//		return el.getelement_text(succ_header);
//				
//	}
	private By error_msg=By.id("amount.errors");
	
	public String errormsg() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		eu.doclick(click_transfer);
		eu.WebDriver_Wait(driver, 10, error_msg);
		return eu.getelement_text(error_msg);
		
	}
	
}



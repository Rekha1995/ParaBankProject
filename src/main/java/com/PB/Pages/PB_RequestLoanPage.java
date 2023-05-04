package com.PB.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.utils.Element_util;

public class PB_RequestLoanPage {
	private WebDriver driver;
	private Element_util eu;
	
	public PB_RequestLoanPage(WebDriver driver) {
		this.driver=driver;
		eu=new Element_util(driver);
	}
	public String geturl() {
		 return eu.geturl();
	}
	private By Header=By.tagName("h1");
	
	public String Headertext() {
		return eu.getelement_text(Header);
	}

	private By loanamount=By.id("amount");
	private By downpayment=By.id("downPayment");
	private By fromaccount=By.id("fromAccountId");
	private By loginbutton=By.xpath("//input[@type='submit']");
	private By loanProcess=By.xpath("//h1[text()='Loan Request Processed']");
	
	public String LoanRequestProcess() {
		eu.dosendskeys(loanamount, "50000");
		eu.dosendskeys(downpayment, "1000");
		eu.Select_drop_drown(fromaccount, "13344");
		eu.doclick(loginbutton);
		eu.WebDriver_Wait(driver, 10, loanProcess);
		return eu.getelement_text(loanProcess);
	}
	private By errormsg=By.xpath("//p[@class='error ng-scope']");
	public String LoanErrorMsg() {
		return eu.getelement_text(errormsg);
	}

}

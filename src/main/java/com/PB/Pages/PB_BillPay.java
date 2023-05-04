package com.PB.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.utils.Element_util;

public class PB_BillPay {
	private  WebDriver driver;
	 private Element_util eu;
	public  PB_BillPay(WebDriver driver) {
		this.driver=driver;
		eu=new Element_util(driver);
		
	}
	public String geturl() {
		return eu.geturl();
	}
	
	private By header=By.tagName("h1");
	
	public String Pageheader() {
		return eu.getelement_text(header);
	}
	private By information_text=By.xpath("//div[@ng-show=\"showForm\"]/p");
	
	public String inform_text() {
		return eu.getelement_text(information_text);
	}
	
	private By submit=By.xpath("//input[@type=\"submit\"]");
	private By required_inform=By.xpath("//table//tr/td[3]");
	
	public int requiredfields() {
		eu.doclick(submit);
		return eu.GetCount_elements(required_inform);
	}
	public boolean requiredfieldsText(String text) {
		return eu.Text_contains(required_inform, text);
	}
	private By payee_name=By.name("payee.name");
	private By add=By.name("payee.address.street");
	private By city=By.name("payee.address.city");
	private By state=By.name("payee.address.state");
	private By zip_code=By.name("payee.address.zipCode");
	private By ph_no=By.name("payee.phoneNumber");
	private By acc_no=By.name("payee.accountNumber");
	private By verify_acc=By.name("verifyAccount");
	private By amt=By.name("amount");
	private By from_acc=By.name("fromAccountId");
	private By successfull_sent_msg=By.tagName("h1");
	
	public String  Paymentcomplete() {
		 eu.dosendskeys(payee_name,"Messi");
		 eu.dosendskeys(add, "Jayakrishna Pg,Whitefield");
		 eu.dosendskeys(city, "Bangalore");
		 eu.dosendskeys(state, "Karnataka");
		 eu.dosendskeys(zip_code, "560066");
		 eu.dosendskeys(ph_no, "8489272203");
		 eu.dosendskeys(acc_no, "13344");
		 eu.dosendskeys(verify_acc, "13344");
		 eu.dosendskeys(amt, "100");
		 eu.Select_drop_drown(from_acc, "13344");
		 eu.doclick(submit);
		return eu.getelement_text(successfull_sent_msg);
	}

	
	
}

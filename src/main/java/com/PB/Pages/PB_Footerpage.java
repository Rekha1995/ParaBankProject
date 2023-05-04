package com.PB.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.utils.Element_util;




public class PB_Footerpage {
	private WebDriver driver;
	private Element_util eu;
	
	public PB_Footerpage(WebDriver driver) {
		this.driver=driver;
		eu=new Element_util(driver);
	}
	private By footer=By.xpath("//div[@id=\"footerPanel\"]/ul[1]/li");
	
	public int footer_link_count() {
		return eu.GetCount_elements(footer);
		//driver.findElements(footer).size();	
	}
	public String footer_text(int index) {//Products
		return eu.Gettext_Webelements(footer, index);
	}
	
	private By click_home=By.xpath("(//div[@id=\"footermainPanel\"]//li)[1]");
	private By ser_links=By.xpath("//ul[@class=\"services\" or @class=\"servicestwo\" or @class=\"events\"]//a");
	
	public int services_links() {
		eu.WebDriver_Wait(driver, 5, click_home);
		eu.doclick(click_home);
		eu.WebDriver_Wait(driver, 10, ser_links);
		return eu.GetCount_elements(ser_links);
	}
	
	private By customer_care=By.xpath("//ul[@class=\"button\"]//a[@href=\"contact.htm\"]");
	private By cus_header=By.tagName("h1");
	
	public String customer_care() {
		eu.doclick(customer_care);
		eu.WebDriver_Wait(driver, 5, cus_header);
		return eu.getelement_text(cus_header);		
	}
	
	private By name=By.id("name");
	private By e_mail=By.id("email");
	private By ph=By.id("phone");
	private By msg=By.id("message");
	private By clik_sub=By.xpath("//td/input[@type=\"submit\"]");
	
	private By customer_msg=By.xpath("//div[@id=\"rightPanel\"]/p[contains(text(),'will be contacting you.')]");
	
	
	public String customer_care_request() {
		eu.dosendskeys(name, "Messi");
		eu.dosendskeys(e_mail, "Messi10@gmail.com");
		eu.dosendskeys(ph, "8489272203");
		eu.dosendskeys(msg, "Messi is innocent");
		
		eu.WebDriver_Wait(driver, 5, clik_sub);
		
		eu.doclick(clik_sub);
		
		return eu.getelement_text(customer_msg);

		
	}
	
	
	
	

}

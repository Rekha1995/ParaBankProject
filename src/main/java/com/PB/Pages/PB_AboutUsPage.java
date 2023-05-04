package com.PB.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.utils.Element_util;

public class PB_AboutUsPage  {
	
	private WebDriver driver;
	Element_util eu;
	 public PB_AboutUsPage(WebDriver driver) {
		 this.driver=driver;
		 eu=new Element_util(driver);
		 
	 }
	public String geturl() {
		return eu.geturl();
	}
	private By page_header=By.tagName("h1");
	
	public String header() {
	return	eu.getelement_text(page_header);
	}
	private By link=By.xpath("//a[@href=\"http://www.parasoft.com/\"]");
	public int link() {
		eu.WebDriver_Wait(driver, 10, link);
		return eu.GetCount_elements(link);
	}
	private By aboutustext=By.xpath("//p[contains(text(),  '  For more information about Parasoft solutions please visit us at:')  ]");
	
	public String aboutus_text() {
		return eu.getelement_text(aboutustext);
	}
	private By customerno=By.xpath("(//br)[2]");
	
	public String customer_no() {
		return eu.getelement_text(customerno);
	}
}

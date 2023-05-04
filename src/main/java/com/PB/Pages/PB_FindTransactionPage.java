package com.PB.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.PB.utils.Element_util;

public class PB_FindTransactionPage {
	private WebDriver driver;
	private Element_util eu;
	
	public PB_FindTransactionPage(WebDriver driver) {
		this.driver=driver;
		eu=new Element_util(driver);
		
}
	public String geturl() {
		return eu.geturl();
	}
	private By Header=By.tagName("h1");
	
	public String Find_headerPagetext() {
		return eu.getelement_text(Header);
	}
	
	private By drop=By.id("accountId");
	
	
	public Select drop_opt() {
		//return eu.getelement_text(drop);
		return eu.Select_drop_drown(drop,  "13344");
		
	}
	
}
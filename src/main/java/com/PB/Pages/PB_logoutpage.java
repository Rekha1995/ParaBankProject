package com.PB.Pages;

import org.openqa.selenium.WebDriver;

public class PB_logoutpage {
private WebDriver driver;
	
	public PB_logoutpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getloginpageURL() {
		return driver.getCurrentUrl();
	}
	public String getpageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

}

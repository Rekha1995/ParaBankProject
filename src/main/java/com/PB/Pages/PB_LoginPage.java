package com.PB.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.utils.Element_util;

public class PB_LoginPage {
	private WebDriver driver;
	private Element_util eu;
	
	public   PB_LoginPage(WebDriver driver) {
		this.driver=driver;
		eu=new Element_util(driver);
		
	}


	
	
	
	private By header=By.tagName("h2");
	private By uname=By.name("username");
	private By pwd=By.name("password");
	private By submit=By.xpath("//input[@class='button']");
	private By error=By.tagName("h1");
	private By err_msg=By.xpath("//div[@id='rightPanel']/p");
	
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	
	public String headertext() {
		return driver.findElement(header).getText()	;
	}
	
	public String successfullLogin(String username, String password) {
		eu.WebDriver_Wait(driver, 10, uname);
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(submit).click();
		return driver.getCurrentUrl();
	}
	public String invalidlogin(String username, String password) {
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(submit).click();
		return driver.getCurrentUrl();
	}
	public String errormsg() {
		return driver.findElement(error).getText();
	}
	public String errtext() {
		return driver.findElement(err_msg).getText();
	}
	
	public PB_HomePage navigateToHomepage(String username, String password) {
		successfullLogin(username, password);
		return new PB_HomePage(driver);
	}

}


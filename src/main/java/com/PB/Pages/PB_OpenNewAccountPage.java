package com.PB.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PB_OpenNewAccountPage {
	
	private  WebDriver driver;
	 
	 public  PB_OpenNewAccountPage( WebDriver driver) {
		 this.driver=driver;
		 
		 
	 }
	 private By header=By.tagName("h1");
		private By typrofacc=By.id("type");
		private By from_acc=By.id("fromAccountId");
		private By click=By.xpath("//input[@type=\"submit\"]");
		private By msg=By.xpath("(//div[@class=\"ng-scope\"]/p)[1]");
		
		public String currenurl() {
			return driver.getCurrentUrl();
		}
		
		public String headertext() {
			return driver.findElement(header).getText();
		}
		
		public String createAccount(String value,String value2) {
			WebElement drop_down=driver.findElement(typrofacc);
			Select select=new Select(drop_down);
			select.selectByVisibleText(value);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			WebElement dropdrown=driver.findElement(from_acc);
			Select select1=new Select(dropdrown);
			select1.selectByVisibleText(value2);
			
			driver.findElement(click).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return driver.findElement(msg).getText();
		}
		
		
}

package com.PB.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.PB.utils.Element_util;


public class PB_AccountOverviewPage {
	private  WebDriver driver;
	private Element_util eu;
	 
	 public  PB_AccountOverviewPage( WebDriver driver) {
		 this.driver=driver;
		 eu=new Element_util(driver);
		 

}
	
		private By header=By.tagName("h1");
		private By table_col=By.xpath("//table//tr/th");
		private By balance=By.xpath("//table//tr/td[2]");
		private By click_acc=By.xpath("//a[@href=\"activity.htm?id=13344\"]");
		private By acc_no_verify=By.xpath("//table//tr/td[@id='accountType']");
		private By acc_header=By.xpath("//h1[text()='Account Details']");	
		private By acc_col=By.xpath("//table//tr/td/a");////table//tr/td[1]
		
		//private By acc_col=By.xpath("//table//tr[@ng-repeat=\"account in accounts\"]//a");
		
		
		
		public String currenturl() {//pass
			return driver.getCurrentUrl();
		}
		public String headertext() {//pass
			return driver.findElement(header).getText();
		}
		public int Tablecol_count() {//3//pass
			List <WebElement> tablcol_cou=driver.findElements(table_col);
			ArrayList<String> head_links=new ArrayList<String>();
			for(WebElement e:tablcol_cou) {
				String Act_count=e.getText();
				head_links.add(Act_count);
			}
			System.out.println(head_links.size());
			return head_links.size();	
		}
		public String Tablecol_Text(int index) {//Balance*//pass
			List <WebElement> tablcol_text=driver.findElements(table_col);
			ArrayList<String> text=new ArrayList<String>();
			for(WebElement e:tablcol_text) {
				String Act_text=e.getText();
				text.add(Act_text);
			}
			System.out.println(text.get(1));
			return text.get(index);
		}
		public boolean Table_col_text(String texts) {
			return eu.Text_contains(acc_col, texts);		 
		}	
			
		public boolean check_balance(String amount) {
			return eu.Text_contains(balance, amount);
		}
		
		public String Accountverify() {
			//driver.findElement(click_acc).click();;
			eu.WebDriver_Wait(driver, 5, click_acc);
			eu.doclick(click_acc);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return driver.getCurrentUrl();
			
		}
		public String Acc_header() {
			return driver.findElement(acc_header).getText();
		}
		public String AccountTypeverify() {//SAVINGS
			return driver.findElement(acc_no_verify).getText();
		}
		private By Mon_option=By.xpath("(//table)[2]//select[@id='month']");
		private By type=By.xpath("(//table)[2]//select[@id=\"transactionType\"]");
		private By click=By.xpath("(//table)[2]//input");
		private By acc_msg=By.xpath("//p[@class=\"ng-scope\"]/b");
		
		public String acc_activity(String _month, String typ) {//August //Debit
//			WebElement month=driver.findElement(Mon_option);
//			Select select=new Select(month);
//			select.selectByVisibleText(_month);
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			WebElement Type=driver.findElement(type);
//			Select select1=new Select(Type);//Debit
//			select1.selectByVisibleText(typ);
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			driver.findElement(click).click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return driver.findElement(acc_msg).getText();
			
			eu.Select_drop_drown(Mon_option, _month);
			eu.Select_drop_drown(type, typ);
			eu.doclick(click);
			eu.WebDriver_Wait(driver, 5, acc_msg);
			return eu.getelement_text(acc_msg);
			
		}
		
		//return driver.findElement(acc_no_verify).getText();

	}

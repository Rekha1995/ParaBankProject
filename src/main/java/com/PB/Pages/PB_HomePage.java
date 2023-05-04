package com.PB.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PB.utils.Element_util;

public class PB_HomePage {
	private WebDriver driver;
	private Element_util eu;

	public PB_HomePage(WebDriver driver) {
		this.driver = driver;
       eu=new Element_util(driver); 
	}
	

	private By header = By.tagName("h2");
	private By total_links = By.xpath("//ul/li");
	private By header_links = By.xpath("//div[@id='leftPanel']/ul/li");
	private By Welcome_links = By.xpath("//div[@id='headerPanel']/ul[@class=\"leftmenu\"]/li/a");
	private By Open_new_acc = By.xpath("//a[text()='Open New Account']");
	private By acc_overview = By.xpath("(//div[@id='leftPanel']//li)[2]");

	public String currenturl() {
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}

	public String headertext() {
		return driver.findElement(header).getText();
	}

	public int totallinkscount() {// 27
		List<WebElement> total_cou = driver.findElements(total_links);
		ArrayList<String> links = new ArrayList<String>();
		for (WebElement e : total_cou) {
			String Act_text = e.getText();
			links.add(Act_text);
		}
		return links.size();

	}

	public int headerlinkscount() {// 8
		List<WebElement> header_cou = driver.findElements(header_links);
		ArrayList<String> head_links = new ArrayList<String>();
		for (WebElement e : header_cou) {
			String Act_count = e.getText();
			head_links.add(Act_count);
		}
		System.out.println(head_links.size());
		return head_links.size();

	}

	public String welcomelinkstext(int index) {
		List<WebElement> Wel_link_text = driver.findElements(Welcome_links);
		ArrayList<String> Wel_links = new ArrayList<String>();
		for (WebElement e : Wel_link_text) {
			String Act_text = e.getText();
			Wel_links.add(Act_text);
		}
		System.out.println(Wel_links.size());
		// return Wel_links.indexOf(index);
		return Wel_links.get(index);
	}

	
		//Navigation pages	
		public PB_OpenNewAccountPage navigateTo_OpenNewAccount() {
			driver.findElement(Open_new_acc).click();
			return new PB_OpenNewAccountPage(driver);
		}
		public PB_AccountOverviewPage navigatetoAccountOverview() {
			driver.findElement(acc_overview).click();
			return new PB_AccountOverviewPage(driver);
		}
		private By transfer_fund=By.xpath("//a[@href=\"/parabank/transfer.htm\"]");
		
		public PB_TransferFundsPage navigateTo_Transferfund() {
			eu.doclick(transfer_fund);
			return new PB_TransferFundsPage(driver);
		}
		
		private By click_billpay=By.xpath("//a[@href=\"/parabank/billpay.htm\"]");
		
		public PB_BillPay navigateTo_PB_BillPay() {
			eu.doclick(click_billpay);
			return new PB_BillPay(driver);
		}
      private By Find_trans=By.xpath("//a[@href=\"/parabank/findtrans.htm\"]");
		
		public PB_FindTransactionPage navigateTo_PB_FindTransaction() {
			eu.doclick(Find_trans);
			return new PB_FindTransactionPage(driver);
		}
		private By request_loan=By.xpath("//a[@href=\"/parabank/requestloan.htm\"]");
		
		public PB_RequestLoanPage navigateTo_PB_RequestLoan() {
			eu.doclick(request_loan);
			return new PB_RequestLoanPage(driver);
		}
		private By Upadte_contact=By.xpath("//a[@href=\"/parabank/updateprofile.htm\"]");
		
		public PB_Upadate_contact_infopage navigateTo_UpadateContactinfo() {
			eu.doclick(Upadte_contact);
			return new PB_Upadate_contact_infopage(driver);
		}
		
		private By logout=By.xpath("//a[@href=\"/parabank/logout.htm\"]");
		
		public PB_logoutpage dologout() {
			eu.WebDriver_Wait(driver, 10, logout);
			eu.doclick(logout);
			return new PB_logoutpage(driver);
			
			
		}
		private By aboutus=By.xpath("(//div[@id='headerPanel']//li//a[@href=\"about.htm\"])[1]");
		public  PB_AboutUsPage navigateTo_PB_AboutUsPage() {
			eu.doclick(aboutus);
			return new PB_AboutUsPage(driver);
		}
		private By services=By.xpath("//ul[@class=\"leftmenu\"]//a[@href=\"services.htm\"]");
		
		public PB_ServicesPage navigateToServicesPage() {
			eu.doclick(services);
			return new PB_ServicesPage(driver);
		}
		private By admin_page=By.xpath("//ul[@class=\"leftmenu\"]//a[@href=\"admin.htm\"]");
		
		public PB_Adminpage navigateToAdminpage() {
			eu.doclick(admin_page);
			return new PB_Adminpage(driver);
		}
	}
	


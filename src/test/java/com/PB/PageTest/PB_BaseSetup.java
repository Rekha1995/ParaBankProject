package com.PB.PageTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.PB.Driverfactory.PB_DriverFactory;
import com.PB.Pages.PB_AboutUsPage;
import com.PB.Pages.PB_AccountOverviewPage;
import com.PB.Pages.PB_Adminpage;
import com.PB.Pages.PB_BillPay;
import com.PB.Pages.PB_FindTransactionPage;
import com.PB.Pages.PB_Footerpage;
import com.PB.Pages.PB_HomePage;
import com.PB.Pages.PB_LoginPage;
import com.PB.Pages.PB_OpenNewAccountPage;
import com.PB.Pages.PB_RequestLoanPage;
import com.PB.Pages.PB_ServicesPage;
import com.PB.Pages.PB_TransferFundsPage;
import com.PB.Pages.PB_Upadate_contact_infopage;
import com.PB.Pages.PB_logoutpage;

public class PB_BaseSetup {
	PB_DriverFactory df;
	WebDriver driver;
	Properties prop;
	FileInputStream fl;
	PB_LoginPage lp;
	PB_HomePage hp;
	PB_OpenNewAccountPage OAP;
	PB_AccountOverviewPage AOP;
	PB_TransferFundsPage TFP;
	PB_BillPay bp;
	PB_FindTransactionPage FTP;
	PB_RequestLoanPage RLP;
	PB_logoutpage PLO;
	PB_Upadate_contact_infopage UCI;
	PB_AboutUsPage AUP;
	PB_ServicesPage PSR;
	PB_Adminpage PAP;
	PB_Footerpage PFP;
	@BeforeTest
	public void setup() {
		
		df=new PB_DriverFactory();
		prop=df.Initial_prop();
		driver=df.launchbrowser(prop);
		lp=new PB_LoginPage(driver);
		hp=new PB_HomePage(driver);
		OAP=new PB_OpenNewAccountPage(driver);
		AOP=new PB_AccountOverviewPage(driver);
		TFP=new PB_TransferFundsPage(driver);
		bp=new PB_BillPay(driver); 
		FTP=new PB_FindTransactionPage(driver);
		RLP=new PB_RequestLoanPage(driver);
		PLO=new PB_logoutpage(driver);
		UCI=new PB_Upadate_contact_infopage(driver);
		AUP=new PB_AboutUsPage(driver);
		PSR=new PB_ServicesPage(driver);
		PAP=new PB_Adminpage(driver);
		PFP=new PB_Footerpage(driver);
	}
	
	@AfterTest
	public void closebrowser() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
	}
	


	
	

}

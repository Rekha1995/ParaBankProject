package com.PB.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.PB.utils.Element_util;

public class PB_Adminpage {
	private WebDriver driver;
	Element_util eu;
	 public PB_Adminpage(WebDriver driver) {
		 this.driver=driver;
		 eu=new Element_util(driver);

}
	 public String getadminpage_url(){
			return eu.geturl();
		}
		
		private By admin_header=By.tagName("h1");
		
		public String admin_paheheader() {
			return eu.getelement_text(admin_header);
		}
		
		private By admin_table_heading=By.tagName("h3");
		
		public boolean admintableheading_text(String textContains) {
			return eu.Text_contains(admin_table_heading, textContains);
		}
		
		private By admin_tables=By.tagName("table");
		public int tablecount() {
			return eu.GetCount_elements(admin_tables);
		}
		
		private By clean=By.xpath("//table//button[contains(text(),'Clean')]");
		private By DB=By.xpath("//b[text()='Database Cleaned']");
		
		public String databaseText() {
			eu.doclick(clean);
			eu.WebDriver_Wait(driver, 5, DB);
			return eu.getelement_text(DB);	
		}
		
}
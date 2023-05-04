package com.PB.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.utils.Element_util;

public class PB_ServicesPage {
	private WebDriver driver;
	Element_util eu;
	 public PB_ServicesPage(WebDriver driver) {
		 this.driver=driver;
		 eu=new Element_util(driver);

}
	 
	 public String getcurrent_url() {
			return eu.geturl();
		}
		
		private By table_heading=By.xpath("//span[@class='heading'][last()]");
		
		public String last_table_heading() {
			return eu.getelement_text(table_heading);
		}
		private By no_of_tables=By.tagName("table");
		
		public int tablecount() {
			return eu.GetCount_elements(no_of_tables);
			//driver.findElements(no_of_tables).size();			
		}
		private By table1_text=By.xpath("//table[1]//tr//td[1]");
		
		public boolean Table1text(String txt) {
			return eu.Text_contains(table1_text, txt);
		}
		
		
}
package com.PB.utils;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


   public class Element_util {
   private WebDriver driver;
	
	public   Element_util(WebDriver driver) {
		this.driver=driver;
	}
	
	public String gettitletext() {
		return driver.getTitle();
	}
	public WebElement Getelement(By loactor) {
		return driver.findElement(loactor);
	}	
	public String getelement_text(By locator) {
		System.out.println(Getelement(locator).getText());
		return Getelement(locator).getText();//method chain
		
		//driver.findelement(locator).gettext();
	}
	public WebElement dosendskeys(By loactor, String value) {
		
		WebElement keys= Getelement(loactor);//driver.findelement(locator)		
		keys.sendKeys(value);
		return keys;
	}
	public WebElement doclick(By loactor) {
		WebElement do_click=Getelement(loactor);
		do_click.click();
		return do_click;
	}
	public WebElement doclear(By locator,String value) {
		WebElement clr= Getelement(locator);
		clr.clear();
		clr.sendKeys(value);
		return clr;
	}
	public String geturl() {
		return driver.getCurrentUrl();
	}
	public WebDriverWait WebDriver_Wait(WebDriver driver, int sec, By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return wait;
	}

	public int GetCount_elements(By loactor) {
		List<WebElement> count=driver.findElements(loactor);
		return count.size();
		//return count;
		//driver.findElements(loactor).size();
	}
	public String Gettext_Webelements(By locator, int index) {
		List<WebElement> ele=driver.findElements(locator);
		ArrayList<String> text=new ArrayList<String>();
		for(WebElement e:ele) {
			String act_text=e.getText();
			text.add(act_text);
		}
		
		return text.get(index);
	}			
	public boolean Text_contains(By locator, String texts) {
	List<WebElement> list=driver.findElements(locator);
	ArrayList <String> empty=new ArrayList <String>();
	
	for(WebElement e:list) {
		String act_text=e.getText();
		System.out.println(act_text);
		empty.add(act_text);	
	}
	return empty.contains(texts);
}

	public Select Select_drop_drown(By locator, String text) {
		//WebElement ele=driver.findElement(locator);
		WebElement ele=Getelement(locator);
		Select select=new Select(ele);
		select.selectByVisibleText(text);
		return select;		
	}
	public Select Select_drop_drown_Value(By locator, String text) {
		//WebElement ele=driver.findElement(locator);
		WebElement ele=Getelement(locator);
		Select select=new Select(ele);
		select.selectByValue(text);
		return select;
		
	}

}

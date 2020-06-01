package org.adacting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseLogin {
	 static WebDriver driver;
	 
	 
		public  void launch(String s){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PattonAdmin\\eclipse-workspce selenium task\\MavenProject\\div\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(s);}
	 	
	 public  void fill(WebElement w,String s){
			w.sendKeys(s);
		}
	 
		public  void klick(WebElement w) {
			w.click();}
	 
		public  void select(WebElement w,String s) {
			Select a = new Select(w);
			 List<WebElement> all = a.getOptions();
			 for (int i=0;i<all.size();i++) {
				 WebElement each = all.get(i);
				 String name = each.getText();
			if(name.equals(s)) {
				a.selectByVisibleText(s);
				}}}
	 
		public   String getvalue(WebElement w){
			
			String n = w.getAttribute("value");
			return n;
			
		}
		}



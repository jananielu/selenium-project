package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Execution{
	 static WebDriver driver;
	@BeforeMethod
	public void tear() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PattonAdmin\\eclipse-workspce selenium task\\MavenProject\\div\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    	
	}
	@Test
	public void Test1(){
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
    }
	@Test
	public void Test2() throws InterruptedException {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
	Thread.sleep(2000);
	Assert.assertTrue(false);
	
	}
	@Test

	public void Test3() throws InterruptedException {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
	driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
		Thread.sleep(2000);
		Assert.assertTrue(false);}
}

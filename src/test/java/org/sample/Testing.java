package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
	@Test
public void test() {		
System.out.println("test");}
	@BeforeClass
public  void beforeclass() {
System.out.println("beforeclass");}
    @AfterClass
public  void afterclasst() {
System.out.println("afterclass");}
    @AfterMethod
				
public void after() {
System.out.println("aftermethod");}
    @BeforeMethod
 public void before() {
 System.out.println("beforemethod");
    }

}

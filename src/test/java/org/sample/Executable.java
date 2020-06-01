package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Executable {
	@Test
public void test() {		
System.out.println("test");}
	@BeforeClass
public static void beforeclass() {
System.out.println("beforeclass");}
    @AfterClass
public static void afterclasst() {
System.out.println("afterclass");}
    @After
				
public void after() {
System.out.println("after");}
    @Before
 public void before() {
 System.out.println("before");
    }
				
	}



package org.sample;

import org.testng.annotations.Test;

public class ClassA {
	@Test(priority=0)
	public void test1() {
		System.out.println("test5");
	}
	@Test()
	public void test3() {
		System.out.println("test2");
	}
}

package TestNGPractice;

import org.testng.Reporter;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TNG5 {
	@AfterSuite
	public void method1()
	{
		System.out.println("Method1");
	}
	@BeforeSuite
	public void method2()
	{
		System.out.println("Method2");
	}
	@Test
	public void method3()
	{
		System.out.println("Method3");
		Reporter.log("TestNG Framework");
	}
	@Test
	public void method4()
	{
		System.out.println("Method4");
		Reporter.log("TestNG Framework");
	}


}

package TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG2 {
	@BeforeMethod
	public void method() {
		System.out.println("hai the before method");
	}
	@Test
	public void method1() {
		System.out.println("hai these first test");
	}
	@AfterMethod
	public void method2() {
		System.out.println("hai the after Method");
		
	}

}

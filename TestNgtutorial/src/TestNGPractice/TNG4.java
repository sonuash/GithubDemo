package TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG4 {
	@BeforeMethod
	public void M4() {
		System.out.println("this is before m4 method");
		
	}
	@Test(groups={"smoke"})
	public void M5() {
		System.out.println("this is Test m5 method");
		
	}
	@AfterMethod
	public void M6() {
		System.out.println("this is After m6 method");
		
	}

}

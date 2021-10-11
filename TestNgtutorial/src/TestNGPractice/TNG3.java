package TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG3 {
	@BeforeMethod
	public void M1() {
		System.out.println("this is before m1 method");
		
	}
	@Test(groups={"smoke"})
	public void M2() {
		System.out.println("this is Test m2 method");
		
	}
	@AfterMethod
	public void M3() {
		System.out.println("this is After m3 method");
		
	}

}

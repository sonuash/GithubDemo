package TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG1 {
	
	@Test
	@Parameters({"URL"})
	
	public void method1(String urlname) {
		System.out.println("the first TestCase");
		System.out.println(urlname);
	}
	@Test
	public void method2() {
		System.out.println("The Second Testcase");
	}

}

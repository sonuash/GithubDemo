package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase6 {
	WebDriver Brow;
	WebDriverWait wait;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.Brow", "C:\\Users\\tnvmk\\OneDrive\\Desktop\\chromewebdriveratest\\chromedriver.exe");
		Brow=new ChromeDriver();
		wait=new WebDriverWait(Brow, 60);
		Brow.manage().window().maximize();
	
		
	}
	@AfterClass
	public void Shutdown() {
		Brow.close();
		Brow.quit();
	}
	@Test
	public void verifyorangeHrm() {
		Brow.get("http://apps.qaplanet.in/hrm/login.php");
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify home page
		if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			Reporter.log("Home Page displayed");
		}
		//create object for UN,PWD
		WebElement UN=Brow.findElement(By.name("txtUserName"));
		WebElement PWD=Brow.findElement(By.name("txtPassword"));
		//verify UN,PWD
		if(UN.isDisplayed()&&PWD.isDisplayed())
		{
			Reporter.log("UN,PWD are exists");
		}
		//type UN,PWD
		String username="qaplanet1";
		UN.sendKeys(username);
		PWD.sendKeys("lab1");
		//click on Login
		Brow.findElement(By.name("Submit")).click();
		wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		//verify home page
		if (Brow.getTitle().equals("OrangeHRM"))
		{
			Reporter.log("OrangeHRM Page displayed");
		}
		//Get welcome Text
				String WelText=Brow.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
				//Verify welcome text
				if (WelText.equals("Welcome "+username))
				{
					Reporter.log("Welcome "+username+" displayed");
				}
				//click on Logout
				Brow.findElement(By.linkText("Logout")).click();
				wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
				//verify home page
				if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management"))
				{
					Reporter.log("Signoff sucessfull and Home Page displayed");
				}


	}
	

}

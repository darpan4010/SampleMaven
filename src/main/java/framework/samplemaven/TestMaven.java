package framework.samplemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagefactory.HomePage;
import pagefactory.LoginPage;
import pagefactory.Pages;
import pagefactory.Register;

public class TestMaven {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void loadSelenium() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
	  	driver = new ChromeDriver();
	}
	
	@Test
	public void loadBroser() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/newtours/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Welcome: Mercury Tours";
		Assert.assertEquals(actualTitle, expectedTitle);
		Pages pages = new Pages(driver);
		pages.ele.click();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void registerTours() {
		
		
	}
	
	@AfterTest
	public void closeDriver() {
		
		driver.close();
	}
	

}

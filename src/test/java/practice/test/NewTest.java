package practice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 

public class NewTest {
	
	public String baseUrl = "https://www.google.com";
	//String driverPath = "F://chromedriver.exe";
	public WebDriver driver ; 

	@Test
	public void verifyHomepageTitle() {

		System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.print("passed");
		driver.close();
	}
}



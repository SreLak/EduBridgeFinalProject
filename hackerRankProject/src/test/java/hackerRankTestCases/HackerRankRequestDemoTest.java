package hackerRankTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import hackerRankPages.HackerRankRequestDemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HackerRankRequestDemoTest {
	WebDriver driver;
	HackerRankRequestDemo hackerRankRequestDemo;


	@Test (priority=1)
	public void test() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		hackerRankRequestDemo= new HackerRankRequestDemo(driver);
		hackerRankRequestDemo.navigateToRequestDemo();
		hackerRankRequestDemo.enterFirstName("Pallavi");
		hackerRankRequestDemo.enterLastName("Prajwal");
		hackerRankRequestDemo.enterEmail("pallavi.prajwal09@gocreate.com");
		hackerRankRequestDemo.enterCompany("Go Create");
		hackerRankRequestDemo.enterTitle("Graphic Designer");
		hackerRankRequestDemo.enterSize();
		hackerRankRequestDemo.enterPhone("9876543210");
		hackerRankRequestDemo.enterCountry();
		hackerRankRequestDemo.clickButton();
	}
	
	@Test (priority=2)
	public void assertWithTitle() {
		WebElement title =  driver.findElement(By.xpath("//*[@id=\"post-1355\"]/div/div/div[1]/div/div/div/div/div/div[1]/div/h2/span"));
		String actualResult = title.getText();
		String expectedResult = "Thank you for requesting a demo!";
		
		Assert.assertEquals(actualResult, expectedResult);
	}
}

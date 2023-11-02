package hackerRankTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import hackerRankPages.HackerRankLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HackerRankLoginTest {

	WebDriver driver;
	HackerRankLogin hackerRankLogin;


	@Test (priority = 1)
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		hackerRankLogin = new HackerRankLogin(driver);
		hackerRankLogin.navigateToLogin();
		hackerRankLogin.enterLoginEmail("pallavi.prajwal09@gmail.com");
		hackerRankLogin.enterLoginPassword("Pallavi123");
		hackerRankLogin.tickRememberMeCheckbox();
		hackerRankLogin.clickLogin();
	}
	
	@Test (priority = 2)
	public void assertWithTitle() {
		WebElement h3Title =  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[3]/div/section[1]/div[2]/div/div/div[1]/div/h3"));
		String actualResult = h3Title.getText();
		String expectedResult = "1 Month Preparation Kit";
		
		Assert.assertEquals(actualResult, expectedResult);
	}
}

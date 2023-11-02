package hackerRankTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import hackerRankPages.HackerRankSignup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HackerRankSignupTest {

	WebDriver driver;
	HackerRankSignup hackerRankSignup;


	@Test (priority=1)
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		hackerRankSignup = new HackerRankSignup(driver);
		hackerRankSignup.navigateToSignup();
		hackerRankSignup.enterUsername("Pallavi Prajwal");
		hackerRankSignup.enterEmail("pallavi.prajwal09@gmail.com");
		hackerRankSignup.enterPassword("Pallavi123");
		hackerRankSignup.tickCheckbox();
		hackerRankSignup.clickSignup();
	}
	
	@Test (priority=2)
	public void assertWithTitle() {
		String actualResult = driver.getTitle();
		String expectedResult = "Dashboard | HackerRank";

		Assert.assertEquals(actualResult, expectedResult);
	}

}

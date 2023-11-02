package hackerRankTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import hackerRankPages.HackerRankStartPrep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HackerRankStartPrepTest {

	WebDriver driver;
	HackerRankStartPrep hackerRankStartPrep;

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		hackerRankStartPrep = new HackerRankStartPrep(driver);
		hackerRankStartPrep.navigateToDashboard();
		hackerRankStartPrep.clickSolveChallenge();
		hackerRankStartPrep.moveToLogin();
		hackerRankStartPrep.enterLoginEmail("pallavi.prajwal09@gmail.com");
		hackerRankStartPrep.enterLoginPassword("Pallavi123");
		hackerRankStartPrep.clickLogin();
		hackerRankStartPrep.clickLeaderBoard();
	}
	
	@Test (priority=2)
	public void assertWithTitle() {
		WebElement title =  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/header/div/div/div[1]/div/h1/div/h1"));
		String actualResult = title.getText();
		String expectedResult = "Plus Minus";
		
		Assert.assertEquals(actualResult, expectedResult);
	}

}

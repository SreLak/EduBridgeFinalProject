package hackerRankPages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HackerRankStartPrep {
	WebDriver driver;

	public HackerRankStartPrep(WebDriver driver) { 
		this.driver=driver;
	}

	public void navigateToDashboard() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hackerrank.com/interview/preparation-kits/one-month-preparation-kit/one-month-week-one/challenges");
	}

	By solveChallenge = By.id("one-month-preparation-kit-plus-minus-cta");
	By clickLoginTab = By.id("tab-2-item-1");
	By email = By.id("input-4");
	By password = By.id("input-5");
	By loginButton = By.xpath("//*[@id=\"tab-2-content-1\"]/div[1]/form/div[4]/button/div/span");
	By leaderBoard = By.xpath("//*[@id=\"content\"]/div/div/div/div/div[4]/div/section/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/ul/li[3]/a/span");

	public void clickSolveChallenge() {
		driver.findElement(solveChallenge).click();
	}

	public void moveToLogin() {
		driver.findElement(clickLoginTab).click();
	}

	public void enterLoginEmail(String lemail) {
		driver.findElement(email).sendKeys(lemail);
	}

	public void enterLoginPassword(String lpswd) {
		driver.findElement(password).sendKeys(lpswd);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public void clickLeaderBoard() {
		driver.findElement(leaderBoard).click();
	}
}

package hackerRankPages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HackerRankLogin {

	WebDriver driver;

	public HackerRankLogin(WebDriver driver) { 
		this.driver=driver;
	}

	public void navigateToLogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hackerrank.com/auth/login");
	}

	By emailLogin = By.name("username");
	By loginPassword = By.name("password");
	By rmCheckbox = By.className("checkbox-input");
	By loginButton = By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]");

	public void enterLoginEmail(String lemail) {
		driver.findElement(emailLogin).sendKeys(lemail);
	}

	public void enterLoginPassword(String lpswd) {
		driver.findElement(loginPassword).sendKeys(lpswd);
	}

	public void tickRememberMeCheckbox() {
		driver.findElement(rmCheckbox).click();
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
}

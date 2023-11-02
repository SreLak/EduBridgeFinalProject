package hackerRankPages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HackerRankSignup {

	WebDriver driver;

	public HackerRankSignup(WebDriver driver) { 
		this.driver=driver;
	}

	public void navigateToSignup() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hackerrank.com/auth/signup");
	}

	By username = By.id("input-1");
	By email = By.id("input-2");
	By password = By.id("input-3");
	By tncCheckbox = By.name("tos_accepted");
	By signupButton = By.xpath("//*[@id=\"tab-1-content-0\"]/div[1]/form/div[5]/button");

	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}

	public void enterEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}

	public void enterPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}

	public void tickCheckbox() {
		driver.findElement(tncCheckbox).click();
	}

	public void clickSignup() {
		driver.findElement(signupButton).click();
	}
}

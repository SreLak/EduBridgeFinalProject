package hackerRankPages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HackerRankRequestDemo {
	WebDriver driver;

	public HackerRankRequestDemo(WebDriver driver) { 
		this.driver=driver;
	}

	By firstName = By.id("FirstName");
	By lastname = By.id("LastName");
	By email = By.id("Email");
	By company = By.id("Company");
	By title = By.id("Title");
	By size = By.id("Company_Size__c");
	By phone = By.id("Phone");
	By country = By.id("Country");
	By button = By.className("mktoButton");

	public void navigateToRequestDemo() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hackerrank.com/products/developer-skills-platform/interview/");
	}

	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}

	public void enterLastName(String lname) {
		driver.findElement(lastname).sendKeys(lname);
	}

	public void enterEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}

	public void enterCompany(String cname) {
		driver.findElement(company).sendKeys(cname);
	}

	public void enterTitle(String jtitle) {
		driver.findElement(title).sendKeys(jtitle);
	}

	public void enterSize() {
		Select select = new Select(driver.findElement(size));
		select.selectByIndex(1);
	}

	public void enterPhone(String phoneno) {
		driver.findElement(phone).sendKeys(phoneno);
	}

	public void enterCountry() {
		Select select = new Select(driver.findElement(country));
		select.selectByVisibleText("India");
	}

	public void clickButton() {
		driver.findElement(button).click();
	}
}

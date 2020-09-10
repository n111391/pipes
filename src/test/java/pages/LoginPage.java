package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	private By locator1 = By.name("q");

	private By locator2 = By.id("result-stats");

	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	
	}

	public void loc1() {

		driver.findElement(locator1).isDisplayed();
	}

	public void loc2() {

		driver.findElement(By.id("result-stats")).isDisplayed();
	}

}

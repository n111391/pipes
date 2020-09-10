package StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {

	WebDriver driver=null;
	WebElement searchBox=null;

	/*
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}


	@Given("User is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		driver.get("http://www.google.com/");
		Thread.sleep(5000);  // Let the user actually see something!
		driver.manage().window().maximize();
		assertTrue("page opened", driver.findElement(By.name("q")).isDisplayed());
	}

	@When("^user enters a (.*) in searchbox$")
	public void user_enters_a_text_in_searchbox(String arg1) {
		searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(arg1);
		System.out.println("user enters a text in searchbox");
	}

	@When("user hits enter")
	public void user_hits_enter() throws InterruptedException {
		System.out.println("user hits enter");
		searchBox.submit();
		Thread.sleep(5000);  // Let the user actually see something!
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
		System.out.println("user is navigated to search results page");
		assertTrue("search results displayed", driver.findElement(By.id("result-stats")).isDisplayed());
		driver.close();
	}
*/
}

package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;


public class mynthra {

	WebDriver driver;

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\e005056\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://j2store.net/demo/index.php/shop");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println("jih");
	}

	@Given("some other precondition (.*) ")
	public void some_other_precondition(String text) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys(text);
		System.out.println("jih");
	}

	@When("I complete action")
	public void i_complete_action() {
		
		System.out.println("jih");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("jih");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("jih");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		
		System.out.println("jih");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("jih");
	}


}

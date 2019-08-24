package fis.del;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GeneratingId {
	public static WebDriver driver;
	@Given("User should launch the Browser")
	public void user_should_launch_the_Browser() {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\CucumberProect\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("User should click add Customer link")
	public void user_should_click_add_Customer_link() {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
   
	}

	@When("User should fill the valid details")
	public void user_should_fill_the_valid_details() {

		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Maha");
		driver.findElement(By.id("lname")).sendKeys("Chandran");
		driver.findElement(By.id("email")).sendKeys("Riya@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("SNDjHDzDGd");
		driver.findElement(By.id("telephoneno")).sendKeys("9123456789");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	   
	}

	@Then("User should verify whether the id is generated or not")
	public void user_should_verify_whether_the_id_is_generated_or_not() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());

	   
	}



}

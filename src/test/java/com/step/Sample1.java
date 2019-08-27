package com.step;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample1 {
	static WebDriver driver;
	@Given("User should launch browser")
	public void user_should_launch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raju\\Downloads\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\samatha\\Sele1\\driver\\chromedriver.exe");
		   driver= new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	    	}

	@Given("User click add customer link")
	public void user_click_add_customer_link() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

	   	}

	@When("user provide valid details {string},{string},{string},{string},{string}")
	public void user_provide_valid_details(String string, String string2, String string3, String string4, String string5) {
		System.out.println("when-1");
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("samatha");
		driver.findElement(By.id("lname")).sendKeys("ram");
		driver.findElement(By.id("email")).sendKeys("panjalasamatha21@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("telangana");
		driver.findElement(By.id("telephoneno")).sendKeys("9642752712");
		driver.findElement(By.xpath("//input[@name='submit']")).click();


	   	}

	@Then("To verify the customer id is displayed")
	public void to_verify_the_customer_id_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']")).isDisplayed());

	}


}

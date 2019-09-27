package CaseStudy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudy_2 {
	WebDriver driver=null;
	@Given("The Login page is opened")
	public void the_Login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User Enters the username{string}")
	public void user_Enters_the_username(String string) {
	    driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("User Enters the password{string}")
	public void user_Enters_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("The home page is opened")
	public void the_home_page_is_opened() {
	    driver.findElement(By.name("Login")).click();
		System.out.println(driver.getTitle());
	}

}

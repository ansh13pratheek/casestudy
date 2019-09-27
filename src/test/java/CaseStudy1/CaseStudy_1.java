package CaseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudy_1 {
	WebDriver driver=null;
	@Given("Clicks SignUp to Register")
	public void clicks_SignUp_to_Register() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@When("Enters username {string}")
	public void enters_username(String string) {
	    driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("Enters firstname {string}")
	public void enters_firstname(String string) {
	    driver.findElement(By.id("firstName")).sendKeys(string);
	}

	@When("Enters lastname {string}")
	public void enters_lastname(String string) {
		driver.findElement(By.id("lastName")).sendKeys(string);
	}

	@When("Enters password {string}")
	public void enters_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("Enters con_password {string}")
	public void enters_con_password(String string) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	}
	
	@When("Select radio male")
	public void select_radio_male() {
		WebElement rb=driver.findElement(By.xpath("//input[@value='Male']"));
		rb.click();
	}

	@When("Enters email {string}")
	public void enters_email(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys(string);
	}

	@When("Enters mobile {string}")
	public void enters_mobile(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}

	@When("Enters dob {string}")
	public void enters_dob(String string) {
		driver.findElement(By.id("dob")).sendKeys(string);
	}

	@When("Enters address {string}")
	public void enters_address(String string) {
		driver.findElement(By.id("address")).sendKeys(string);
	}
	
	@When("Select a secque")
	public void select_a_secque() {
	    Select db=new Select(driver.findElement(By.name("securityQuestion")));
	    db.selectByValue("411011");
	}

	@When("Enters answer {string}")
	public void enters_answer(String string) {
		driver.findElement(By.id("answer")).sendKeys(string);
	}
	@When("Clicks on Register")
	public void clicks_on_Register() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("Registers Succesfully message")
	public void registers_Succesfully_message() {
	    System.out.println(driver.getTitle());
	}
}

package CaseStudy3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudy_3 {
	WebDriver driver=null;
	@Given("User Logins")
	public void user_Logins() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.name("Login")).click();
	}

	@When("Types Head")
	public void types_Head() throws InterruptedException {
		//driver.findElement(By.name("products")).click();
		//driver.findElement(By.name("products")).sendKeys("Head ");
		//Actions action=new Actions(driver);
		//action.sendKeys(search, "Head").perform();
		//Select db=new Select(driver.findElement(By.name("products")));
	    //Thread.sleep(5000);
		//db.selectByIndex(3);
		WebElement search=driver.findElement(By.name("products"));
	    Actions action=new Actions(driver);
	    Thread.sleep(5000);
	    action.sendKeys(search, "bag").perform();
	    Thread.sleep(5000);
	    action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(5000);
	}

	@Then("The products suggestion is displayed")
	public void the_products_suggestion_is_displayed() {
	   //driver.findElement(By.xpath("//input[@type='submit']")).click();
	   //System.out.println(driver.getTitle());
	   
	}

}

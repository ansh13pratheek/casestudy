package CaseStudy4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudy_4 {
	WebDriver driver=null;
	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.name("Login")).click();
	}

	@When("Alex search a particular product")
	public void alex_search_a_particular_product() throws InterruptedException {
		WebElement search=driver.findElement(By.name("products"));
	    Actions action=new Actions(driver);
	    Thread.sleep(5000);
	    action.sendKeys(search, "bag").perform();
	    Thread.sleep(5000);
	    action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(5000);
	}

	@When("Try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		 try {
		    	if(driver.findElement(By.xpath("//a[@href='displayCart.htm']")).isDisplayed()) {
		    		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		    	}
		    }
		    catch(Exception e){
		    	System.out.println("No cart icon displayed");
		    }
	}

	@Then("TestMeApp doesn't dispaly the cart icon")
	public void testmeapp_doesn_t_dispaly_the_cart_icon() {
		 System.out.println(driver.getTitle());
	}

}

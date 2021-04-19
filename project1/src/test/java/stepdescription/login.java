package stepdescription;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import framework.KeyWordDriven;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends KeyWordDriven {
	@Given("user is in website")
	public void user_is_in_website() {
		OpenBrowser("https://example.testproject.io/web/");
	}

	@When("User enter valid {string} and {int}" )
	public void user_enter_valid_username_and_password(String un,Integer p) {
	String pp=Integer.toString(p) ;
	System.out.println(pp);
	try {
	Thread.sleep(3000);
		SendValues(loginOR.username, un);
		SendValues(loginOR.password, pp);
		Thread.sleep(3000);
		ClickOn(loginOR.loginbutton);}catch(Exception e) {
			
		}
		
	}

	@Then("User lands in home page")
	public void user_lands_in_home_page() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver.findElement(By.xpath("//*[@id=\"greetings\"]")).isDisplayed())
			System.out.println("Page is succesfully logged in ");
		else
			System.out.println(" not successfull");
	}

}

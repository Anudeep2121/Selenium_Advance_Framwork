package stepdefinitions;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends DriverFactory{

    @Given("User launches the application")
    public void user_launches_the_application() {
       driver.get("https://demo.automationtesting.in/Register.html");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String user, String pass) {
        DriverFactory.driver.findElement(By.name("username")).sendKeys(user);
        DriverFactory.driver.findElement(By.name("password")).sendKeys(pass);
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        DriverFactory.driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        boolean isDisplayed = DriverFactory.driver.findElement(By.xpath("//h6")).isDisplayed();
        SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(isDisplayed);
    }

    @Then("User should see error message")
    public void user_should_see_error_message() {
        boolean error = DriverFactory.driver.findElement(By.className("oxd-alert")).isDisplayed();
        SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(error);
    }
}
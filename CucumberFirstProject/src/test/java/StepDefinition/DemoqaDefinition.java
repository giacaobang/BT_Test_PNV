package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Created by PC on 11/04/2017.
 */
public class DemoqaDefinition {
    WebDriver driver = null;
    @Given("^I navigate to the website (.+)$")
    public void i_navigate_to_the_website(String website) throws Throwable {
       Setup setup = new Setup();
       driver = setup.openBrowser();
       driver.get("http://demoqa.com/");
    }

    @When("^I check the website$")
    public void i_check_the_website() throws Throwable {
        String home= driver.findElement(By.className("entry-title")).getText();
        Assert.assertEquals("Home",home);
    }

    @Then("^I see about the website$")
    public void i_see_about_the_website() throws Throwable {
        System.out.println("Hello");
        driver.close();
    }
}

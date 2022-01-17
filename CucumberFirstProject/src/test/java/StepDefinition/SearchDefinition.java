package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

/**
 * Created by PC on 15/04/2017.
 */
public class SearchDefinition {
    WebDriver driver  = null;
    String wordSearch = null;
    @Given("^I open the website (.+)$")
    public void i_open_the_website(String website) throws Throwable {
        Setup setup = new Setup();
        driver = setup.openBrowser();
        driver.get(website);
    }

    @When("^I search (.+)$")
    public void i_search(String keyword) throws Throwable {
        driver.findElement(By.id("keyword")).sendKeys(keyword);
        Thread.sleep(1000);
        wordSearch = keyword;
    }

    @Then("^I check the correct website$")
    public void i_check_the_correct_website() throws Throwable {
       String titile = "Real Estate";
       String actualTitle = driver.getTitle();
       Assert.assertTrue(actualTitle.contains(titile));


    }

    @Then("^I check data returns (.+)$")
    public void i_check_data_returns(String records) throws Throwable {
       WebElement rootDiv = driver.findElement(By.id("keyword_suggest"));
        List<WebElement> listDiv = rootDiv.findElements(By.tagName("div"));
       // int length = listDiv.size();
        System.out.println("List Div:" + listDiv.size());
        for (WebElement divElement: listDiv
             ) {
           WebElement element = divElement.findElement(By.tagName("span"));
            System.out.println(element.getText());
//*[@id="keyword_suggest"]/div[6]/span
        }
        Thread.sleep(1000);
        driver.close();






    }

}

package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);


    @Given("User already on Heroku App Home Page")
    public void userAlreadyOnHerokuAppHomePage(){
        Assert.assertTrue(homePage.verifyHomeTitleIsDisplayed());
    }

    @Then("User click file upload option")
    public void userClickFileUploadOption() {
        homePage.clickFileUploadOptionBtn();
    }

    @When("User click checkbox option")
    public void userClickCheckboxOption() {
        homePage.clickCheckboxOptionBtn();
    }
}
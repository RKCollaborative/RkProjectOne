package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    private final WebDriver driver = Hooks.driver;

    HomePage homePage = new HomePage(driver);


    @Given("User already on Heroku App Home Page")
    public void userAlreadyOnHerokuAppHomePage(){
        homePage.verifyHomeTitleIsDisplayed();
    }

}
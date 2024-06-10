package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CheckboxPage;
import org.openqa.selenium.WebDriver;

public class CheckboxSteps {

    private final WebDriver driver = Hooks.driver;
    CheckboxPage checkboxPage = new CheckboxPage(driver);

    @Then("User click checkbox 1 if checkbox 1 is unchecked")
    public void userClickCheckbox1IfCheckbox1IsUnchecked(){
        checkboxPage.verifyCheckbox1IsUncheck();
    }

    @And("User click checkbox 2 if checkbox 2 is checked")
    public void userClickCheckboxIfCheckboxIsChecked() throws InterruptedException {
        checkboxPage.verifyCheckbox2IsChecked();
        Thread.sleep(1500);
    }
}

package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.FileUploadPage;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FileUploadSteps {

    private final WebDriver driver = Hooks.driver;
    FileUploadPage fileUploadPage = new FileUploadPage(driver);

    @And("User upload chosen file")
    public void userUploadChosenFile() {
        fileUploadPage.uploadFile();
    }

    @Then("User success to upload file")
    public void userSuccessToUploadFile() {
        Assert.assertTrue(fileUploadPage.verifyImageUploadSuccess());
    }
}

package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.example.pageObject.DragAndDropPage;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DragAndDropSteps {
    private final WebDriver driver = Hooks.driver;
    DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
    HomePage homePage = new HomePage(driver);

    @And("Verify drag and drop title is display and click")
    public void verifyDragAndDropTitleIsDisplayAndClick() {
        homePage.clickBtnDragAndDrop();
    }

    @And("Verify drag and drop title is display on page")
    public void verifyDragAndDropTitleIsDisplayOnPage() {
    }

    @And("Drag and drop element a to element b")
    public void dragAndDropElementAToElementB() {
    }
}

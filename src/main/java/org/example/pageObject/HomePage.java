package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    public static WebDriver driver;
    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@class='heading']")
    private WebElement homePageTitle;

    @FindBy(xpath = "//li//a[@href='/upload']")
    private WebElement fileUploadOptionBtn;

    @FindBy(xpath ="//a[.='Drag and Drop']")
    private WebElement btnDragAndDrop;

    public boolean verifyHomeTitleIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(homePageTitle));
        return homePageTitle.isDisplayed();
    }

    public void clickFileUploadOptionBtn(){
        fileUploadOptionBtn.click();
    }
    public void clickBtnDragAndDrop(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(btnDragAndDrop));
        wait.until(ExpectedConditions.elementToBeClickable(btnDragAndDrop));
        btnDragAndDrop.click();


    }
}

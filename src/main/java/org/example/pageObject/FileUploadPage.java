package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class FileUploadPage {

    public static WebDriver driver;
    public FileUploadPage(WebDriver driver) {
        FileUploadPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/input[@type='file']")
    private WebElement fileUpload;

    @FindBy(xpath = "//div[@id='drag-drop-upload']/div[@class='dz-preview dz-processing dz-image-preview dz-success dz-complete'][1]/div[@class='dz-success-mark']")
    private WebElement imageCheckMark;

    public void uploadFile(){
        File file = new File("src/test/Assets/Image.png");
        fileUpload.sendKeys(file.getAbsolutePath());
    }

    public boolean verifyImageUploadSuccess(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(imageCheckMark));
        return imageCheckMark.isDisplayed();
    }

}

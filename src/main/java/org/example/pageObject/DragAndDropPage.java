package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class DragAndDropPage {
    public static WebDriver driver;
    public DragAndDropPage(WebDriver driver){
        DragAndDropPage.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//h3[.='Drag and Drop']")
    private WebElement dragAndDropTitle;

    @FindBy(id = "column-a")
    private WebElement columnA;

    @FindBy(id = "column-b")
    private WebElement columnB;

    public boolean verifyDragAndDropTitleIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(dragAndDropTitle));
        return dragAndDropTitle.isDisplayed();
    }
    public void dragElementAtoElementB(WebElement elementStart, WebElement elementFinish){
        new DragAndDropPage(driver).dragElementAtoElementB(columnA,columnB);
    }

}

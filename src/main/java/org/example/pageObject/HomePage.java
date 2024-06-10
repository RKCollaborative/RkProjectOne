package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public static WebDriver driver;
    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@class='heading']")
    private WebElement homePageTitle;

    public boolean verifyHomeTitleIsDisplayed(){
        return homePageTitle.isDisplayed();
    }

}

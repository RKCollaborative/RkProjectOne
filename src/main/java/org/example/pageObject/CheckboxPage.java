package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {

    public static WebDriver driver;
    public CheckboxPage(WebDriver driver) {
        CheckboxPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//form[@id='checkboxes']/input[@type='checkbox'][1]")
    private WebElement checkbox1;

    @FindBy(xpath = "//form[@id='checkboxes']/input[@type='checkbox'][2]")
    private WebElement checkbox2;

    public void verifyCheckbox1IsUncheck(){
        boolean checkbox1IsUncheck = checkbox1.isSelected();
        if (!checkbox1IsUncheck){
            System.out.println("Checkbox 1 is Unchecked");
            checkbox1.click();
            System.out.println("Checkbox 1 is Now Checked");
        } else {
            System.out.println("Checkbox 1 is Checked");
        }
    }

    public void verifyCheckbox2IsChecked(){
        boolean checkbox2IsChecked = checkbox2.isSelected();
        if (checkbox2IsChecked){
            System.out.println("Checkbox 2 is Checked");
            checkbox2.click();
            System.out.println("Now Checkbox 2 is Now Uncheck");
        } else {
            System.out.println("Checkbox 2 is Unchecked");
        }
    }

}

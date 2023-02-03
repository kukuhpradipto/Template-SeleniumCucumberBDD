package org.example.pageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {

    public static WebDriver driver;
    public CompletePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;
    public void clickBtnFinish (){
        btnFinish.click();
    }

    @FindBy(xpath = "//div[@class='complete-text']")
    private WebElement verifyCheckOutPage;
    public boolean checkOutCompletePage(){
        verifyCheckOutPage.isDisplayed();
        return true;
    };

}

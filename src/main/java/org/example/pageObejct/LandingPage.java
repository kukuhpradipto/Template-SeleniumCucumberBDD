package org.example.pageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public static WebDriver driver;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath ="//span[@class='title']")
    private WebElement vrfyLandingPage;

    public boolean verifyLandingPage(){
        vrfyLandingPage.isDisplayed();
        return true;
    }

}

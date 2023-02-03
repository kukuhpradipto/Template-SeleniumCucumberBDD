package org.example.pageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutForm {

    public static WebDriver driver;
    public CheckOutForm(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public void inputFirstName(String fn){
        firstName.sendKeys(fn);
    }


    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public void inputLastName(String ln){
        lastName.sendKeys(ln);
    }

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement portalCode;
    public void inputPortalCode(String pc){
        portalCode.sendKeys(pc);
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;
    public void clickBtnContinue(){
        btnContinue.click();
    }

    @FindBy(xpath = "//h3")
    private WebElement errorFormCheckout;
    public String verifyErrorFormCheckout(){
        return errorFormCheckout.getText();
    }

}

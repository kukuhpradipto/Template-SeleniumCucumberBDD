package org.example.pageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver driver;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = ".shopping_cart_link")
    private WebElement iconsCart;

    public void clickCart (){
        iconsCart.click();
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOut;

    public void clickBtnCheckOut(){
        btnCheckOut.click();
    }
}

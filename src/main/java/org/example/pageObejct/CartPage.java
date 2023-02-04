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


    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement deleteProduct;
    public void clickDeleteProduct(){
        deleteProduct.click();
    }


    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemTotal;
    public Float numberItemTotal(){
        String text = itemTotal.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        return numbers;
    }

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement taxLabel;
    public Float numberSTaxLabel(){
        String text = taxLabel.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        return numbers;
    }

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;
    public Float nominalTotal(){
        String text = total.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        return numbers;
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOut;
    public void clickBtnCheckOut(){
        btnCheckOut.click();
    }

}

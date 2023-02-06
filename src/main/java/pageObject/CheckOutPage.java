package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;

public class CheckOutPage {

    public static WebDriver driver;
    public CheckOutPage(WebDriver driver){
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
    public double numberItemTotal(){
        String text = itemTotal.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        double angkaTax = Double.parseDouble(new DecimalFormat("##.##").format(numbers));
        return angkaTax;
    }

    public double setNominalTax(){
        String text = itemTotal.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        double x = numbers * 0.08;
        double angkaTax = Double.parseDouble(new DecimalFormat("##.##").format(x));
        return angkaTax;
    }

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement taxLabel;
    public double numberSTaxLabel(){
        String text = taxLabel.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        double angkaTax = Double.parseDouble(new DecimalFormat("##.##").format(numbers));
        return angkaTax;
    }

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;
    public double nominalTotal(){
        String text = total.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        double angkaTax = Double.parseDouble(new DecimalFormat("##.##").format(numbers));
        return angkaTax;
    }


    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOut;
    public void clickBtnCheckOut(){
        btnCheckOut.click();
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

    // COMPLETED ORDER
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

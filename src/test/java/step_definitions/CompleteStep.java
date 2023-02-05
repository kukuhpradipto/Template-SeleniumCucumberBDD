package step_definitions;

import cucumber.api.java.en.And;
import org.example.pageObejct.CartPage;
import org.example.pageObejct.CompletePage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CompleteStep {

    private WebDriver webDriver;

    public CompleteStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User verify nominal taxt")
    public void verifyNominalTax(){
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertEquals(cartPage.numberSTaxLabel(),cartPage.setNominalTax(),0);
    }

    @And("User verify Summary total Checkout")
    public void verifyNominalTotal(){
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertEquals(cartPage.numberSTaxLabel()+cartPage.numberItemTotal(), cartPage.nominalTotal(),0);
    }

    @And("User click button finish")
    public void clickOnBtnFinish() throws InterruptedException {
        CompletePage completePage = new CompletePage(webDriver);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        completePage.clickBtnFinish();
        Thread.sleep(2000);
    }

    @And("User complete order")
    public boolean verifyOnCheckOutCompletePage() throws InterruptedException {
        CompletePage completePage = new CompletePage(webDriver);
        Thread.sleep(1000);
        return true;
    }
}

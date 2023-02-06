package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.CheckOutPage;
import pageObject.CompletePage;

public class CheckoutStep {

    private WebDriver webDriver;
    public CheckoutStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User delete product \"(.*)\"")
    public void deleteProduct(String product) throws InterruptedException {
        WebElement setDeleteProduct = webDriver.findElement(By.xpath("//div[text()='"+product+"']/ancestor::div[@class='cart_item_label']/child::div/button"));
        setDeleteProduct.click();
        Thread.sleep(1000);
    }

    @And("User click button checkout")
    public void clickOnCheckOut() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickBtnCheckOut();
        Thread.sleep(1000);
    }


    // FILLED
    @When("User input Check Out Form in Firs Name \"(.*)\", Last Name \"(.*)\" and Partial Code \"(.*)\".")
    public void inputCheckOutForm(String fn, String ln, String pc) throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.inputFirstName(fn);
        checkOutPage.inputLastName(ln);
        checkOutPage.inputPortalCode(pc);
        Thread.sleep(1000);
        checkOutPage.clickBtnContinue();
        Thread.sleep(1000);

    }

    @And("User see error massage \"(.*)\"")
    public void popUpErrorCheckoutForm(String errorFormCheckout){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertEquals(errorFormCheckout, checkOutPage.verifyErrorFormCheckout());
    }

    //COMPLETED STEP
    @And("User verify nominal taxt")
    public void verifyNominalTax(){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertEquals(checkOutPage.numberSTaxLabel(),checkOutPage.setNominalTax(),0);
    }

    @And("User verify Summary total Checkout")
    public void verifyNominalTotal(){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertEquals(checkOutPage.numberSTaxLabel()+checkOutPage.numberItemTotal(), checkOutPage.nominalTotal(),0);
    }

    @And("User click button finish")
    public void clickOnBtnFinish() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        checkOutPage.clickBtnFinish();
        Thread.sleep(2000);
    }

    @Then("User complete order")
    public boolean verifyOnCheckOutCompletePage() throws InterruptedException {
        CompletePage completePage = new CompletePage(webDriver);
        Thread.sleep(1000);
        return true;
    }
}

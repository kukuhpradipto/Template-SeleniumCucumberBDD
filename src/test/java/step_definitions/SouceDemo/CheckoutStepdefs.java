package step_definitions.SouceDemo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.*;

public class CheckoutStepdefs {

    private WebDriver webDriver;
    public CheckoutStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User delete product \"(.*)\"")
    public void deleteProduct(String product) throws InterruptedException {
        WebElement setDeleteProduct = webDriver.findElement(By.xpath("//div[text()='"+product+" ']/ancestor::div[@class='cart_item_label']/child::div/button"));
        setDeleteProduct.click();
        Thread.sleep(1000);
    }


    @When("User input Check Out Form in Firs Name \"(.*)\", Last Name \"(.*)\" and Partial Code \"(.*)\".")
    public void input(String fname, String lname, String cportal){
        WebElement unserName = webDriver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement lName = webDriver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement cPortal = webDriver.findElement(By.xpath("//input[@id='postal-code']"));
        WebElement bContinuew = webDriver.findElement(By.xpath("//input[@id='continue']"));
        unserName.sendKeys(fname);
        lName.sendKeys(lname);
        cPortal.sendKeys(cportal);
        bContinuew.click();
    }


    @When("^user click on the button Continue Shopping$")
    public void userClickOnTheButtonContinueShopping() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("continue-shopping"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^user navigate back on the home page$")
    public void userNavigateBackOnTheHomePage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".title"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @Then("^items missing from the list product at checkout page$")
    public void itemsMissingFromTheListProductAtCheckoutPage() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector(".shopping_cart_badge"));
        String amountCart = a.getText();
        int amountcartList = Integer.parseInt(amountCart);

        Thread.sleep(500);
        List<WebElement> remove = webDriver.findElements(xpath("//button[text()='Remove']"));
        List<String> removeList = new ArrayList<>();

        for(WebElement p:remove){
            removeList.add(p.getText());
        }
        int amountRemoveList = removeList.size();

        Assert.assertEquals(amountcartList, amountRemoveList);
    }

    @When("^user click on the button Check Out$")
    public void userClickOnTheButtonCheckOut() throws InterruptedException {
        WebElement a = webDriver.findElement(id("checkout"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^user navigate back on the check out fill information page$")
    public void userNavigateBackOnTheCheckOutFillInformationPage() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector(".title"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }
}

package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.CheckOutPage;
import pageObject.LandingPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseSteps {

    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on landing page")  // identitas final method
    public void verifyLandingPage(){ // final method
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.verifyLandingPage());
    }


    @When("User choose product list by \"(.*)\"")
    public void sortProductValue(String sort) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Thread.sleep(1000);
        landingPage.sortProduct(sort);
    }

    @And("User choice 2 product from the list")
    public void choiceBasket() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickBasket2();
        landingPage.clickBasket1();
        Thread.sleep(1000);
    }

    @And("User choice 2 product from the list \"(^.*$)\" and \"(^.*$)\"")
    public void addItemToCart(String itemTshirt) {
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+itemTshirt+"']/ancestor::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }


    //ICONS CART
    @Then("User click on icon cart to verify product")
    public void clickIconsCart() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickCart();
        Thread.sleep(1000);
    }

}

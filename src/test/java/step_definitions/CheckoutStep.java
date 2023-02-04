package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObejct.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutStep {

    private WebDriver webDriver;
    public CheckoutStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click on icon cart to verify product")
    public void clickIconsCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCart();
        Thread.sleep(1000);
    }

    @Then("User delete product Test.allTheThings")
    public void clickOnDeleteProduct() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickDeleteProduct();
        Thread.sleep(1000);
    }

    @And("User click button checkout")
    public void clickOnCheckOut() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickBtnCheckOut();
        Thread.sleep(1000);
    }

}

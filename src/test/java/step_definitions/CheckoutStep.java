package step_definitions;

import cucumber.api.java.en.And;
import org.example.pageObejct.CartPage;
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

    @And("User click button checkout")
    public void clickOnCheckOut() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickBtnCheckOut();
        Thread.sleep(1000);
    }


}

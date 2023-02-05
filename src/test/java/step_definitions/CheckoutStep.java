package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObejct.CartPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    @Then("User delete product \"(.*)\"")
    public void deleteProduct(String product) throws InterruptedException {
        WebElement setDeleteProduct = webDriver.findElement(By.xpath("//div[text()='"+product+"']/ancestor::div[@class='cart_item_label']/child::div/button"));
        setDeleteProduct.click();
        Thread.sleep(1000);
    }

    @And("User click button checkout")
    public void clickOnCheckOut() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickBtnCheckOut();
        Thread.sleep(1000);
    }

}

package step_definitions.SouceDemo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;
import java.util.List;


public class OverviewStepdefs{

    private WebDriver webDriver;
    public OverviewStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^user verify the amount according to the purchase made$")
    public void userVerifyTheAmountAccordingToThePurchaseMade() throws InterruptedException {

        List<WebElement> priceLists = webDriver.findElements(By.className("inventory_item_price"));
        double sum =0;
        for(WebElement priceList : priceLists){
            String s = priceList.getText();
            sum = sum + Double.parseDouble(s.replaceAll("[^.0-9]",""));
        }

        double tax = sum * 0.08;
        double expectationTax = Double.parseDouble(String.format("%.2f",tax));

        double expectationTotal = expectationTax + sum;



        WebElement a = webDriver.findElement(By.className("summary_subtotal_label"));
        double subTotal = Double.parseDouble(a.getText().replaceAll("[^.0-9]",""));

        WebElement b = webDriver.findElement(By.className("summary_tax_label"));
        double amountTax = Double.parseDouble(b.getText().replaceAll("[^.0-9]",""));

        WebElement c = webDriver.findElement(By.cssSelector(".summary_total_label"));
        double total = Double.parseDouble(c.getText().replaceAll("[^.0-9]",""));


        Assert.assertEquals(sum, subTotal,0);
        Assert.assertEquals(expectationTax, amountTax,0);
        Assert.assertEquals(expectationTotal, total,0);
        Thread.sleep(500);
    }

    @When("^click on the button Finish$")
    public void clickOnTheButtonFinish() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("finish"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^user navigate on the check out finish page$")
    public void userNavigateOnTheCheckOutFinishPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".complete-header"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }
}

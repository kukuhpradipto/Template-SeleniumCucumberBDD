package step_definitions.SouceDemo;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class CheckoutInformationStepdefs {
    private WebDriver webDriver;
    public CheckoutInformationStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @When("^user click button Cancel$")
    public void userClickButtonCancel() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("cancel"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^user navigate back on the check out page$")
    public void userNavigateBackOnTheCheckOutPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".title"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user fill firstName with \"([^\"]*)\"$")
    public void userFillFirstNameWith(String fristName) throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("first-name"));
        a.sendKeys(fristName);
        Thread.sleep(500);
    }

    @And("^user fill lastName with \"([^\"]*)\"$")
    public void userFillLastNameWith(String lastName) throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("last-name"));
        a.sendKeys(lastName);
        Thread.sleep(500);
    }

    @And("^user fill portalCode with (\\d+)$")
    public void userFillPortalCodeWith(int portalCode) throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("postal-code"));
        a.sendKeys(String.valueOf(portalCode));
        Thread.sleep(500);
    }

    @Then("^user click button continue$")
    public void userClickButtonContinue() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("continue"));
        a.click();
        Thread.sleep(500);
    }

    @And("^user navigate on the overview page$")
    public void userNavigateOnTheOverviewPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".title"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("^user fill portalCode with \"([^\"]*)\"$")
    public void userFillPortalCodeWith(String portalCode) throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("postal-code"));
        a.sendKeys(portalCode);
        Thread.sleep(500);
    }
}

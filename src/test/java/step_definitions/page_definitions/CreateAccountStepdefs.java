package step_definitions.page_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.main.Hooks;

public class CreateAccountStepdefs {

    private final WebDriver webDriver;

    public CreateAccountStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @Given("^User already on home page LUMA$")
    public void userAlreadyOnHomePageLUMA() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/static/version1695896754/frontend/Magento/luma/en_US/images/logo.svg']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(300);
    }

    @When("^User click button create account on the navbar home page$")
    public void userClickButtonCreateAccountOnTheNavbarHomePage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='panel header']//a[contains(.,'Sign In')]"));
        a.click();
        Thread.sleep(300);
    }

    @And("^User already on Create Account Page$")
    public void userAlreadyOnCreateAccountPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//span[@class='base']"));
        Thread.sleep(300);
    }
}

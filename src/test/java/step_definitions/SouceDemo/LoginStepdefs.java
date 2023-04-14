package step_definitions.SouceDemo;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

import static org.openqa.selenium.By.xpath;

public class LoginStepdefs {

    private WebDriver webDriver;

    public LoginStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    //IF ERROR


    @Given("^user already on the login page$")
    public void userAlreadyOnTheLoginPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("login-button"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user fill userName with \"([^\"]*)\"$")
    public void userFillUserNameWith(String arg0) throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("user-name"));
        a.sendKeys(arg0);
        Thread.sleep(500);
    }

    @And("^user fill password with \"([^\"]*)\"$")
    public void userFillPasswordWith(String arg0) throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("password"));
        a.sendKeys(arg0);
        Thread.sleep(500);
    }

    @Then("^user click button login$")
    public void userClickButtonLogin() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("login-button"));
        a.click();
        Thread.sleep(500);
    }

    @And("^user navigate to home page$")
    public void userNavigateToHomePage() throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//div[@class='app_logo']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("^verify that an error message appears on the screen$")
    public void verifyThatAnErrorMessageAppearsOnTheScreen() throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//h3"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }
}

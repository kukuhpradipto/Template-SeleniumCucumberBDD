package step_definitions.SouceDemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class LoginStepdefs {

    private WebDriver webDriver;

    public LoginStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the website sauce demo") // verifiy tulisan Username
    public void verifyLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("User input \"(.*)\" as userName and Input \"(.*)\" as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
        Thread.sleep(1000);
    }

    //IF ERROR
    @Then("User see error \"(.*)\" on login page" )
    public void verifyErrorText( String errorText){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginPage.verifyErrorText());
    }
}

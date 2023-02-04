package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObejct.CheckOutForm;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutFromStep {

    private WebDriver webDriver;
    public CheckOutFromStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User input Check Out Form in Firs Name \"(.*)\", Last Name \"(.*)\" and Partial Code \"(.*)\".")
    public void inputCheckOutForm(String fn, String ln, String pc) throws InterruptedException {
        CheckOutForm checkOutForm = new CheckOutForm(webDriver);
        checkOutForm.inputFirstName(fn);
        checkOutForm.inputLastName(ln);
        checkOutForm.inputPortalCode(pc);
        Thread.sleep(1000);
        checkOutForm.clickBtnContinue();
        Thread.sleep(1000);

    }

    @And("User see error massage \"(.*)\"")
    public void popUpErrorCheckoutForm(String errorFormCheckout){
        CheckOutForm checkOutForm = new CheckOutForm(webDriver);
        Assert.assertEquals(errorFormCheckout, checkOutForm.verifyErrorFormCheckout());
    }
}

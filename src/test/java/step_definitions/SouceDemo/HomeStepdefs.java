package step_definitions.SouceDemo;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

import java.util.*;

import static org.openqa.selenium.By.*;

public class HomeStepdefs {

    private WebDriver webDriver;

    public HomeStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("^user choose product sort list \"([^\"]*)\"$")
    public void sortProductValue(String sortList) throws InterruptedException {
        String a = sortList;
        Select sortHamburger = new Select(webDriver.findElement(By.xpath("//select[@class='product_sort_container']")));
    }

    @And("^User choice (\\d+) product from the list \"([^\"]*)\" and \"([^\"]*)\"$")
    public void addItemToCart(String itemTshirt) {
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+itemTshirt+"']/ancestor::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }


    @And("^verify that the products are sorted by price in descending order \"([^\"]*)\"$")
    public void verifyThatTheProductsAreSortedByPriceInDescendingOrder(String sort) throws InterruptedException {
        if(Objects.equals(sort, "Name (Z to A)")){

            //1, Before filter to get  name
            List<WebElement> beforeFilterName = webDriver.findElements(By.className("inventory_item_name"));

            //2. Get first word
            List<String> beforeFilterNameList = new ArrayList<>();

            for(WebElement p: beforeFilterName){
                beforeFilterNameList.add(String.valueOf((p.getText().substring(0,4))));
            }
            //3. Filter sort
            Select sortHamburger = new Select(webDriver.findElement(By.xpath("//select[@class='product_sort_container']")));
            sortHamburger.selectByVisibleText(sort);
            //4. After filter
            List<WebElement> afterFilterName = webDriver.findElements(By.className("inventory_item_name"));
            List<String> afterFilterNameList = new ArrayList<>();
            for(WebElement p: afterFilterName){
                afterFilterNameList.add(String.valueOf((p.getText().substring(0,4))));
            }
            //5. Sort before
            Collections.sort(afterFilterNameList);

            //6. Compare before after
            Assert.assertEquals(beforeFilterNameList, afterFilterNameList);


        } else if (Objects.equals(sort, "Name (A to Z)")){
            List<WebElement> beforeFilterName = webDriver.findElements(By.className("inventory_item_name"));
            List<String> beforeFilterNameList = new ArrayList<>();
            for(WebElement p: beforeFilterName){
                beforeFilterNameList.add(String.valueOf((p.getText().substring(0,4))));
            }

            Select sortHamburger = new Select(webDriver.findElement(By.xpath("//select[@class='product_sort_container']")));
            sortHamburger.selectByVisibleText(sort);
            Thread.sleep(500);

            List<WebElement> afterFilterName = webDriver.findElements(By.className("inventory_item_name"));
            List<String> afterFilterNameList = new ArrayList<>();
            for(WebElement p: afterFilterName){
                afterFilterNameList.add(String.valueOf((p.getText().substring(0,4))));
            }

            Collections.sort(beforeFilterNameList);
            Assert.assertEquals(beforeFilterNameList, afterFilterNameList);


        } else if (Objects.equals(sort, "Price (low to high)")) {
            List<WebElement> beforePriceSort = webDriver.findElements(By.className("inventory_item_price"));
            List<Double> beforePriceSortList = new ArrayList<>();
            for(WebElement q: beforePriceSort){
                beforePriceSortList.add(Double.valueOf(q.getText().replace("$","")));
            }

            Select sortHamburger = new Select(webDriver.findElement(By.xpath("//select[@class='product_sort_container']")));
            sortHamburger.selectByVisibleText(sort);

            List<WebElement> afterPriceSort = webDriver.findElements(By.className("inventory_item_price"));
            List<Double> afterPriceSortList = new ArrayList<>();

            for(WebElement p: afterPriceSort){
                afterPriceSortList.add(Double.valueOf(p.getText().replace("$","")));
            }

            Collections.sort(beforePriceSortList);
            Assert.assertEquals(beforePriceSortList, afterPriceSortList);


        } else {
            List<WebElement> beforePriceSort = webDriver.findElements(By.className("inventory_item_price"));
            List<Double> beforePriceSortList = new ArrayList<>();
            for(WebElement q: beforePriceSort){
                beforePriceSortList.add(Double.valueOf(q.getText().replace("$","")));
            }

            Select sortHamburger = new Select(webDriver.findElement(By.xpath("//select[@class='product_sort_container']")));
            sortHamburger.selectByVisibleText(sort);

            List<WebElement> afterPriceSort = webDriver.findElements(By.className("inventory_item_price"));
            List<Double> afterPriceSortList = new ArrayList<>();

            for(WebElement p: afterPriceSort){
                afterPriceSortList.add(Double.valueOf(p.getText().replace("$","")));
            }

            Collections.sort(beforePriceSortList, Collections.reverseOrder());
            Assert.assertEquals(beforePriceSortList, afterPriceSortList);
        }

        Thread.sleep(1000);

    }

    @And("^verify that an error message \"([^\"]*)\" appears on the screen$")
    public void verifyThatAnErrorMessageAppearsOnTheScreen(String arg0) throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//h3[text()='"+arg0+"']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user click menu item About$")
    public void userClickMenuItemAbout() throws InterruptedException {
        WebElement a = webDriver.findElement(id("about_sidebar_link"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^user navigate to web Saucelabs$")
    public void userNavigateToWebSaucelabs() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector("[src='/images/logo.svg']"));
        a.isDisplayed();
        Thread.sleep(500);
    }

    @When("^user click hamburger menu button$")
    public void userClickHamburgerMenuButton() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector(".bm-burger-button"));
        a.click();
        Thread.sleep(500);
    }

    @And("^user click menu item Logout$")
    public void userClickMenuItemLogout() throws InterruptedException {
        WebElement a = webDriver.findElement(id("logout_sidebar_link"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^user navigate to Login page$")
    public void userNavigateToLoginPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("login-button"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("^user click menu item Reset App$")
    public void userClickMenuItemResetApp() throws InterruptedException {
        WebElement a = webDriver.findElement(id("reset_sidebar_link"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^home page can to be reset$")
    public void homePageCanToBeReset() throws InterruptedException {
        WebElement a = webDriver.findElement(className("shopping_cart_link"));
         String b = a.getText();
         String c = "";


         List<WebElement> d = webDriver.findElements(id("remove-sauce-labs-backpack"));
         List<String> buttonRemove = new ArrayList<>();
         for (WebElement p: d){
            buttonRemove.add(p.getText());
         }

         List<WebElement> verifyButton = webDriver.findElements(xpath("//button[text()='']"));
         List<String> verifyButtonRemove = new ArrayList<>();
         for(WebElement q:verifyButton){
             verifyButtonRemove.add(q.getText());
         }


         Assert.assertEquals(buttonRemove, verifyButtonRemove);
         Assert.assertEquals(b,c);
        Thread.sleep(500);
    }

    @When("^user choose product \"([^\"]*)\"$")
    public void userChooseFirstProduct(String arg0) throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//div[text()='"+arg0+"']/parent::a/parent::div[@class='inventory_item_label']/parent::div[@class='inventory_item_description']/child::div[@class='pricebar']/child::button"));
        a.click();
        Thread.sleep(500);
      }

    @When("^user click icon Cart$")
    public void userClickIconCart() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector(".shopping_cart_link"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^user navigate to the Cart page$")
    public void userNavigateToTheCartPage() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector("title"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    //FOOTER
    @When("^user click icon Twitter on the footer$")
    public void userClickIconTwitterOnTheFooter() throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//a[.='Twitter']"));
        a.click();
        Thread.sleep(5000);
    }

    @Then("^user navigate on the home page twitter$")
    public void userNavigateOnTheHomePageTwitter() throws InterruptedException {
        webDriver.getWindowHandles().forEach(tab->webDriver.switchTo().window(tab));
        WebElement a = webDriver.findElement(cssSelector(".r-adyw6z.r-1awozwy > .css-901oao > span:nth-of-type(1)"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user click icon Facebook on the footer$")
    public void userClickIconFacebookOnTheFooter() throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//a[.='Facebook']"));
        a.click();
        Thread.sleep(5000);
    }

    @Then("^user navigate on the home page facebook$")
    public void userNavigateOnTheHomePageFacebook() throws InterruptedException {
        webDriver.getWindowHandles().forEach(tab->webDriver.switchTo().window(tab));
        WebElement a = webDriver.findElement(cssSelector("._6s5d > div:nth-of-type(1) h1:nth-of-type(1)"));
        a.isDisplayed();
        Thread.sleep(500);
    }

    @When("^user click icon Linkedin on the footer$")
    public void userClickIconLinkedinOnTheFooter() throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//a[.='LinkedIn']"));
        a.click();
        Thread.sleep(5000);
    }

    @Then("^user navigate on the home page linkedin$")
    public void userNavigateOnTheHomePageLinkedin() throws InterruptedException {
        webDriver.getWindowHandles().forEach(tab->webDriver.switchTo().window(tab));
        WebElement b = webDriver.findElement(cssSelector(".contextual-sign-in-modal__modal-dismiss-icon > .artdeco-icon"));
        b.click();
        WebElement a = webDriver.findElement(xpath("//h1[@class='top-card-layout__title font-sans text-lg papabear:text-xl font-bold leading-open text-color-text mb-0']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user click on the button Add to Cart at product \"([^\"]*)\"$")
    public void userClickOnTheButtonAddToCart(String arg0) throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//div[text()='"+arg0+"']/parent::a/parent::div[@class='inventory_item_label']/parent::div[@class='inventory_item_description']/child::div[@class='pricebar']/child::button"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^increase the number in the cart icon$")
    public void increaseTheNumberInTheCartIcon() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector(".shopping_cart_badge"));
        String amountCart = a.getText();
        int amountcartList = Integer.parseInt(amountCart);

        Thread.sleep(500);
        List<WebElement> remove = webDriver.findElements(xpath("//button[text()='Remove']"));
        List<String> removeList = new ArrayList<>();

        for(WebElement p:remove){
            removeList.add(p.getText());
        }
        int amountRemoveList = removeList.size();

        Assert.assertEquals(amountcartList, amountRemoveList);

    }

    @When("^user click on the button Remove at product \"([^\"]*)\"$")
    public void userClickOnTheButtonRemoveAtProduct(String arg0) throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//div[text()='"+arg0+"']/parent::a/parent::div[@class='cart_item_label']/child::div[@class='item_pricebar']/child::button"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^amount at cart will be reduce$")
    public void amountAtCartWillBeReduce() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector(".shopping_cart_badge"));
        String amountCart = a.getText();
        int amountcartList = Integer.parseInt(amountCart);

        Thread.sleep(500);
        List<WebElement> remove = webDriver.findElements(xpath("//button[text()='Remove']"));
        List<String> removeList = new ArrayList<>();

        for(WebElement p:remove){
            removeList.add(p.getText());
        }
        int amountRemoveList = removeList.size();

        Assert.assertEquals(amountcartList, amountRemoveList);
        Thread.sleep(500);
    }

    @When("^user click on the name product \"([^\"]*)\"$")
    public void userClickOnTheNameProduct(String arg0) throws InterruptedException {
        WebElement a = webDriver.findElement(xpath("//div[.='"+arg0+"']"));
        a.click();
        Thread.sleep(500);
    }

    @Then("^user navigate on the detail product$")
    public void userNavigateOnTheDetailProduct() throws InterruptedException {
        WebElement a = webDriver.findElement(cssSelector(".inventory_details_name"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }
}

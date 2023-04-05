package step_definitions.SouceDemo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pageObject.CheckOutPage;
import pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

import java.util.*;

public class HomeStepdefs {

    private WebDriver webDriver;

    public HomeStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on landing page")  // identitas final method
    public void verifyLandingPage(){ // final method
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.verifyLandingPage());
    }


    @Then("User choose product list by \"(.*)\"")
    public void sortProductValue(String sort) throws InterruptedException {
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

    @And("User choice 2 product from the list")
    public void choiceBasket() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickBasket2();
        homePage.clickBasket1();
        Thread.sleep(1000);
    }

    @And("^User choice (\\d+) product from the list \"([^\"]*)\" and \"([^\"]*)\"$")
    public void addItemToCart(String itemTshirt) {
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+itemTshirt+"']/ancestor::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }


    //ICONS CART
    @Then("User click on icon cart to verify product")
    public void clickIconsCart() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickCart();
        Thread.sleep(1000);
    }
}

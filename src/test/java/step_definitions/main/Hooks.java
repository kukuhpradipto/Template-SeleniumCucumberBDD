package step_definitions.main;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Hooks {
    public static WebDriver webDriver;
    @Before
    public void openBrowser() throws InterruptedException {
        ChromeOptions a = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        webDriver= new ChromeDriver(a);
        String URL = "https://magento.softwaretestingboard.com/what-is-new.html";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);

    }
    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        webDriver.quit();
    }
}


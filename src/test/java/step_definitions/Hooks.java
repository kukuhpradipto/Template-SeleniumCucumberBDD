package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    // untuk starting awal dan ahir automation

 public static WebDriver webDriver;

 @Before
    public void openBrowser(){
     System.setProperty("webdriver.chrome.driver","/home/kukuh/AlteraAcademy/Automation/BDDSourceDemo/driver/chromedriver");

     webDriver = new ChromeDriver();
     String appUrl = "https://www.saucedemo.com/";
     webDriver.get(appUrl);
     webDriver.manage().window().maximize();
 }
// untuk closing automation
@After
    public void closeBrowser(){
     webDriver.quit();
}

}

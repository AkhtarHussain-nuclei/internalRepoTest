package testVagrant;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

import static org.junit.Assert.*;

public class StepDefinitions {
public WebDriver driver;
    private Properties properties;
    Utils util = new Utils();

    @Before(order = 1)
    public void setProperties() {

        properties = util.fetchFromPropertiesFile();
    }

    @Given("^Launch (.*?) browser$")
    public void launch_desired_browser(String browser) throws InterruptedException {
        if(browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(properties.getProperty("url"));
        }

    }

    @Then("^quite the browser$")
    public void quite_browser(){
        driver.quit();
    }

}

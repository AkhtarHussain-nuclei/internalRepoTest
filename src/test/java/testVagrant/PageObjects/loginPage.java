package testVagrant.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public WebDriver localDriver;

    public loginPage(WebDriver rdriver){
        localDriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


}

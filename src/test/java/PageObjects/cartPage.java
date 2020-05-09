package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class cartPage {
    public WebDriver localDriver;

    public cartPage(WebDriver rdriver){
        localDriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "SingleOptionSelector-0")
    @CacheLookup
    WebElement colorOption;

    @FindBy(css = "[id='SingleOptionSelector-0'] option")
    @CacheLookup
    List<WebElement> colourDowpDown;

    @FindBy(id = "SingleOptionSelector-1")
    WebElement sizeOption;

    @FindBy(css = "[id= 'SingleOptionSelector-1'] option")
    List<WebElement>  sizeDropDown;

    @FindBy(name = "add")
    WebElement AddTocartBtn;


    public void switchToCartPopUp(){
        AddTocartBtn.click();

    }

}

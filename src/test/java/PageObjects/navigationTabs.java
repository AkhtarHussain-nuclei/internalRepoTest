package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class navigationTabs {
    public WebDriver localDriver;

    public navigationTabs(WebDriver rdriver){
        localDriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(css = "[id = 'SiteNav'] span")
    WebElement navigationTabText;

    @FindBy(css = "[id = 'SiteNav'] li:nth-child(2) span")
    WebElement secondNavigationTab;

    @FindBy(css = "[id = 'Collection'] ul li:nth-child(1) a")
    WebElement firstItem;


    public void clickOnFirstItem(){
        firstItem.click();
    }

    public void ClickOnTheSecondNavTab(){
        secondNavigationTab.click();
    }

}

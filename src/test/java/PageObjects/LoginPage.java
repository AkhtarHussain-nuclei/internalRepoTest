package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver localDriver;

    public LoginPage(WebDriver rdriver){
        localDriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

  @FindBy(css = ".password-login a")
    @CacheLookup
    WebElement passwordfield;

  @FindBy(id = "Password")
    @CacheLookup
    WebElement passwordTextField;

  @FindBy(name = "commit")
    @CacheLookup
    WebElement SubmitPassword;

  public void loginWithPassWord(String pass){
      passwordfield.click();
      passwordTextField.sendKeys(pass);
      SubmitPassword.click();
  }

}

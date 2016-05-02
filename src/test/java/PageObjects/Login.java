package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 01.05.2016.
 */
public class Login {

    @FindBy(id = "username")
    WebElement loginInput;

    @FindBy(id = "password")
    WebElement passInput;

    @FindBy(css = "button.radius")
    WebElement loginButton;

    public WebDriver _driver;

    public Login (WebDriver driver){
        _driver = driver;
        PageFactory.initElements(_driver, this);
    }

    public Login setLogin(String login){
        loginInput.sendKeys(login);
        return this;
    }

    public Login setPassword(String Password){
        passInput.sendKeys(Password);
        return this;
    }

    public Login clickLogin(){
        loginButton.click();
        return this;
    }
}

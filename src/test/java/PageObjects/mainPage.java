package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage {

    @FindBy(id = "flash")
    WebElement greenMessage;

    public WebDriver _driver;

    public mainPage (WebDriver driver){
        _driver = driver;
        PageFactory.initElements(_driver, this);
    }

    public boolean isLoggedIn(){
        return greenMessage.isDisplayed();
    }
}

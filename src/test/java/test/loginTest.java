package test;

import PageObjects.Login;
import PageObjects.mainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by User on 01.05.2016.
 */
public class loginTest {

    WebDriver driver;


    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/login");
    }

    @Test
    public void loginTest(){
        Login loginPage = new Login(driver);
        mainPage mainPage = new mainPage(driver);

        loginPage.setLogin("tomsmith").setPassword("SuperSecretPassword!").clickLogin();
        Assert.assertTrue(mainPage.isLoggedIn());

    }

    @AfterTest
    public void closeWindow() {
        if (driver != null) {
            driver.close();
        }
    }

}

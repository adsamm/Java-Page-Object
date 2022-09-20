package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test (priority = 1)
    public void validLogIn () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        //*************PAGE METHODS********************
        homePage.goToHomepage()
                .acceptCookies()
                .goToLoginPage();

        loginPage.logIn("test2580@yopmail.com", "Test2580")
                 .loggedUser();
    }

    @Test (priority = 0)
    public void invalidLogIn () {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        //*************PAGE METHODS********************
        homePage.goToHomepage()
                .acceptCookies()
                .goToLoginPage();

        loginPage.logIn("Invalid", "invalid")
                 .badCredentials();
    }

    @Test (priority = 0)
    public void emptyLogIn () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        //*************PAGE METHODS********************
        homePage.goToHomepage()
                .acceptCookies()
                .goToLoginPage();

        loginPage.logIn("", "")
                 .badCredentials();
    }
}
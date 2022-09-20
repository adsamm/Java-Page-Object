package tests;

import org.testng.annotations.Test;
import pages.BasketPage;
import pages.HomePage;
import pages.LoginPage;


public class BasketTests extends BaseTest {

    @Test(priority = 1)
    public void randomCategory () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        BasketPage basketPage = new BasketPage(driver);

        //*************PAGE METHODS********************
        homePage.goToHomepage()
                .acceptCookies()
                .goToLoginPage();

        loginPage.logIn("test2580@yopmail.com", "Test2580");
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
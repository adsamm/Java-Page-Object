package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //*********Web Elements*********
    By usernameBy = By.id("customer-auth-email");
    By passwordBy = By.id("customer-auth-password");
    By loginButtonBy = By.xpath("//*[text()='Přihlásit se']");
    By badCredentialsBy = By.xpath("//*[text()='Zadali jste nesprávný e-mail nebo heslo.']");
    By loggedUserBy = By.xpath("//*[text()='Můj účet\"']");

    //*********Page Methods*********

    public LoginPage logIn(String username, String password){
        //Enter Username(Email)
        writeText(usernameBy,username);
        //Enter Password
        writeText(passwordBy, password);
        //Click Login Button
        click(loginButtonBy);

        return this;
    }

    public LoginPage badCredentials () {
        super.assertEquals(badCredentialsBy, "Zadali jste nesprávný e-mail nebo heslo.");
        return this;
    }

    public LoginPage loggedUser () {
        super.assertEquals(loggedUserBy, "Můj účet");
        return this;
    }


}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "https://www.mall.cz/";

    //*********Web Elements*********
    By signInButtonBy = By.cssSelector("[data-id='login']");
    By acceptButtonBy = By.xpath("//*[text()='Rozumím']");


    //*********Page Methods*********
    //Go to Homepage
    public HomePage goToHomepage(){
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage (){
        click(signInButtonBy);
        return new LoginPage(driver);
    }

    //Accept cookies
    public HomePage acceptCookies (){
        try{
            click(acceptButtonBy);
        }
        catch(Exception NoSuchElementException) {
            return this;
        }
        return this;
    }


}

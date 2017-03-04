package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by varunas on 10/02/2017.
 */
public class HomePage extends BasePage{
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    By searchBox=By.id("query");
    By searchButton=By.className("search__btn");
    By pageHeader=By.className("page-header");
    By signIn=By.linkText("Sign in");

    public void enterSearchTerm(String searchTerm) throws Throwable {
        driver.findElement(searchBox).sendKeys(searchTerm);
        driver.findElement(searchButton).click();
    }

    public boolean isSearchTermPageDisplayed(String searchTerm) {
        return (driver.findElement(pageHeader).getText().equals("Results for "+"\""+searchTerm+"\""));
    }



    public void navigateToSignInPage() {
        driver.findElement(signIn).click();
    }

}

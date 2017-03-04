package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import util.DriverFactory;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by varunas on 10/02/2017.
 */
public class HomePageSteps extends DriverFactory {


    @And("^user provides the search term as ([^\"]*)$")
    public void userProvidesTheSearchTermAsBusinessCards(String searchTerm) throws Throwable {
        new HomePage(driver).enterSearchTerm(searchTerm);
    }

    @Then("^user should navigate to respective page of ([^\"]*)$")
    public void userShouldNavigateToRespectivePageOfBusinessCards(String searchTerm) throws Throwable {
        assertTrue(new HomePage(driver).isSearchTermPageDisplayed(searchTerm));
    }

    @And("^user clicks the Sign in on HomePage$")
    public void userClicksTheSignInOnHomePage() throws Throwable {
        new HomePage(driver).navigateToSignInPage();
    }
}

package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.SignInPage;
import util.DriverFactory;

import java.util.UUID;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by varunas on 10/02/2017.
 */
public class SignInSteps extends DriverFactory {


    @And("^user selects I don't have account$")
    public void userSelectsIDonTHaveAccount() throws Throwable {
       new SignInPage(driver).selectIDontHaveAccount();
    }

    @Then("^user should view SignUpPage$")
    public void userShouldViewSignUpPage() throws Throwable {
        assertTrue(new SignInPage(driver).isSignUpPageDisplayed());
    }

    @And("^user provides firstName as ([^\"]*)$")
    public void userProvidesFirstNameAs(String firstName) throws Throwable {
        new SignInPage(driver).enterFirstName(firstName);
    }

    @And("^user provides lastName as ([^\"]*)$")
    public void userProvidesLastNameAs(String lastName) throws Throwable {
        new SignInPage(driver).enterLastName(lastName);
    }

    @And("^user provides email as$")
    public void userProvidesEmailAs() throws Throwable {
        String emailAddress = "random-" + UUID.randomUUID().toString() + "@gmail.com";
        new SignInPage(driver).enterEmail(emailAddress);
    }

    @And("^user provides password as ([^\"]*)$")
    public void userProvidesPasswordAs(String password) throws Throwable {
        new SignInPage(driver).enterPassword(password);
    }

    @And("^user provides confirm password as ([^\"]*)$")
    public void userProvidesConfirmPasswordAs(String confirmPassword) throws Throwable {
        new SignInPage(driver).enterConfirmPassword(confirmPassword);
    }

    @And("^user selects industry as ([^\"]*)$")
    public void userSelectsIndustryAs(String industry) throws Throwable {
        new SignInPage(driver).selectIndustry(industry);

    }

    @And("^user selects businessType as ([^\"]*)$")
    public void userSelectsBusinessTypeAs(String businessType) throws Throwable {
        new SignInPage(driver).selectBusinessType(businessType);
    }
    @And("^user selects businessSize as ([^\"]*)$")
    public void userSelectsBusinessSizeAs(String businessSize) throws Throwable {
        new SignInPage(driver).selectBusinessSize(businessSize);
    }

    @And("^user click CreateAccount$")
    public void userClickCreateAccount() throws Throwable {
        new SignInPage(driver).createAccount();
    }

    @Then("^user should be naviagted to MyAccount as ([^\"]*)$")
    public void userShouldBeNaviagtedToMyAccount(String identity) throws Throwable {
       new SignInPage(driver).navigateToMyAccount(identity);
    }

}

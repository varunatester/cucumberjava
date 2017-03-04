package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

/**
 * Created by varunas on 10/02/2017.
 */

public class BaseSteps {

    private WebDriver driver;


    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
        System.out.println("Before Scenario");
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
        System.out.println("After Scenario");
    }

    @Given("^the user is on home page$")
    public void theUserIsOnHomePage() throws Throwable {
        driver.get("https://www.moo.com/uk");
        driver.manage().window().maximize();

    }
}

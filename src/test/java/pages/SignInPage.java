package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by varunas on 10/02/2017.
 */
public class SignInPage {

    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver=driver;
    }

    By signUpLabel=By.id("lblSignup");
    By signUpTitle=By.className("signUpFormContainer");
    By txtfirstName=By.id("txtFirstName");
    By txtlastName=By.id("txtLastName");
    By txtemailSignUp=By.id("txtEmailSignUp");
    By txtpasswordSignUp=By.id("txtPasswordSignUp");
    By txtconfirmPasswordSignUp=By.id("txtPassword2SignUp");
    By ddlIdentityIndustry = By.id("ddlIdentityIndustry");
    By ddlIdentityProfession = By.id("ddlIdentityProfession33");
    By ddlIdentityCompanySize = By.id("ddlIdentityCompanySize");
    By signUp = By.id("btnSignup");




    public void selectIDontHaveAccount() {
        if(!driver.findElement(signUpLabel).isSelected()){
            driver.findElement(signUpLabel).click();
        }

    }

    public boolean isSignUpPageDisplayed() {
        return (driver.findElement(signUpTitle).getText().contains("Create an account"));

    }

    public void enterFirstName(String firstName) {
        driver.findElement(txtfirstName).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(txtlastName).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(txtemailSignUp).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(txtpasswordSignUp).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(txtconfirmPasswordSignUp).sendKeys(confirmPassword);
    }

    public void selectIndustry(String industry) {
        new Select(driver.findElement(ddlIdentityIndustry)).selectByValue(industry);
    }

    public void selectBusinessType(String businessType) {
        new Select(driver.findElement(ddlIdentityProfession)).selectByVisibleText(businessType);
    }

    public void selectBusinessSize(String businessSize) {
        new Select(driver.findElement(ddlIdentityCompanySize)).selectByVisibleText(businessSize);

    }

    public void createAccount() {
     driver.findElement(signUp).click();
    }

    public void navigateToMyAccount(String identity) {
        driver.findElement(By.id("spnIdentityFirstName")).getText().equals(identity);
    }
}

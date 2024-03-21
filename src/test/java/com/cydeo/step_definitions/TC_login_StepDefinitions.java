package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TC_login_StepDefinitions extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("User on the login page of the Trycloud application")
    public void user_on_the_login_page_of_the_trycloud_application() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        BrowserUtils.sleep(2);
    }
    @When("User enters correct username")
    public void user_enters_correct_username() {
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
    }
    @When("User enters correct password")
    public void user_enters_correct_password() {
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        BrowserUtils.sleep(1);
    }
    @When("User click on the Login button")
    public void user_click_on_the_login_button() {
        loginPage.loginButton.click();
        BrowserUtils.sleep(1);
    }
    @Then("User should see the dashboard page")
    public void user_should_see_the_dashboard_page() {
        BrowserUtils.waitForTitleContains("Trycloud");
        BrowserUtils.verifyTitle("Dashboard - Trycloud");
    }

    @When("User hits the Enter key")
    public void user_hits_the_enter_key() {
        loginPage.passwordInput.sendKeys(Keys.ENTER);
    }

    DashboardPage dashboardPage = new DashboardPage();
    @When("User is logged in")
    public void user_is_logged_in() {
        loginPage.login();
    }
    @When("User click on the profile icon")
    public void user_click_on_the_profile_icon() {
        dashboardPage.profileIcon.click();
    }
    @Then("User should be able to see user's name {string}")
    public void user_should_be_able_to_see_user_s_name(String expectedProfileName) {
        String actualProfileName = dashboardPage.profileUserName.getText();
        Assert.assertEquals(actualProfileName,expectedProfileName);

    }

    @When("User enters wrong username {string}")
    public void userEntersWrongUsername(String name) {
        loginPage.usernameInput.sendKeys(name);
    }

    @And("User enters wrong password {string}")
    public void userEntersWrongPassword(String password) {
        loginPage.passwordInput.sendKeys(password + Keys.ENTER);

    }

    @Then("User should see error message {string}")
    public void userShouldSeErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }

    @When("User sees the Forgot password? Link")
    public void userSeesTheForgotPasswordLink() {
        loginPage.forgotPasswordLink.isDisplayed();

    }

    @And("User clicks on the Forgot password? Link")
    public void userClicksOnTheForgotPasswordLink() {
        loginPage.forgotPasswordLink.click();
    }

    @Then("User sees the Reset Password button")
    public void userSeesTheResetPasswordButton() {
        loginPage.resetPasswordButton.isDisplayed();
    }

    @Then("User can see valid placeholders on Username and Password fields")
    public void userCanSeeValidPlaceholdersOnUsernameAndPasswordFields() {
        loginPage.usernamePlaceHolder.isDisplayed();
        loginPage.passwordPlaceHolder.isDisplayed();
    }

    @When("User enters password {string}")
    public void userEntersPassword(String passwordValue) {
        loginPage.passwordInput.sendKeys(passwordValue);
    }

    @And("User chooses to show the password")
    public void userChoosesToShowThePassword() {
        loginPage.eyeIcon.click();
        BrowserUtils.sleep(2);
    }

    @Then("User should see the password {string} displayed in plain text")
    public void userShouldSeeThePasswordDisplayedInPlainText(String expectedPasswordText) {
        String actualPasswordText = passwordInput.getAttribute("value");
        Assert.assertTrue(actualPasswordText.equals(expectedPasswordText));
    }

    @Then("User should see the password displayed as dots")
    public void userShouldSeeThePasswordDisplayedAsDots() {
        String actualPasswordType = passwordInput.getAttribute("type");
        Assert.assertEquals("password", actualPasswordType);
    }

    @When("Username is blank")
    public void usernameIsBlank() {
        usernameInput.clear();
    }

    @Then("User should be able to see the message {string} in the username input box")
    public void userShouldBeAbleToSeeTheMessageInTheUsernameInputBox(String expectedMessage) {
        loginPage.passwordInput.sendKeys(Keys.ENTER);
        String message = usernameInput.getAttribute("validationMessage");
        System.out.println("message = " + message);
        Assert.assertEquals(message,expectedMessage);
    }
    @When("password is blank")
    public void passwordIsBlank() {
        passwordInput.clear();
    }

    @Then("User should be able to see the message {string} in the password input box")
    public void userShouldBeAbleToSeeTheMessageInThePasswordInputBox(String expectedMessage) {
        loginPage.passwordInput.sendKeys(Keys.ENTER);
        String message = passwordInput.getAttribute("validationMessage");
        System.out.println("message = " + message);
        Assert.assertEquals(message,expectedMessage);
    }


}

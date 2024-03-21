package com.cydeo.step_definitions;

import com.cydeo.pages.LogoutPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Logout_StepDefs {


    LogoutPage logoutPage = new LogoutPage();



    @And("user clicks account name dropdown")
    public void userClicksAccountNameDropdown() {

        BrowserUtils.sleep(3);
       logoutPage.accountNameDropdown.click();

    }

    @And("user clicks the log out button")
    public void userClicksTheLogOutButton() {

        BrowserUtils.sleep(3);
        logoutPage.logoutButton.click();

    }

    @Then("user can end up on log in page")
    public void userCanEndUpOnLogInPage() {
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="Trycloud";
        Assert.assertEquals(expectedTitle,actualTitle);

    }







    @Given("user is logged out page")
    public void userIsLoggedOutPage() {

        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login");
    }

    @When("user clicks the browser's back button")
    public void userClicksTheBrowserSBackButton() {

        BrowserUtils.sleep(5);
        Driver.getDriver().navigate().back();

    }

    @Then("user should not be able to access the dashboard page")
    public void userShouldNotBeAbleToAccessTheDashboardPage(){
        String expectedURL = "http://qa2.trycloud.net/index.php/login?redirect_url=/index.php/apps/dashboard/";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertFalse("http://qa2.trycloud.net/index.php/login?redirect_url=/index.php/apps/dashboard/", false);



    }


}


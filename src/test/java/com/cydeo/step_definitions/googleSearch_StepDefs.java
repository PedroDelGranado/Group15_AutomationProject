package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class googleSearch_StepDefs {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on google search page")
    public void userIsOnGoogleSearchPage() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("user types in {string} in searchbox")
    public void userTypesInInSearchbox(String searchItem) {
        googleSearchPage.SearchBar.sendKeys(searchItem+ Keys.ENTER);
    }

    @Then("user should see {string} contained in title")
    public void userShouldSeeContainedInTitle(String searchItem) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchItem));

        Driver.closeDriver();
    }

}

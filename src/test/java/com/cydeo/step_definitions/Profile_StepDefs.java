package com.cydeo.step_definitions;

import com.cydeo.pages.SettingsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Profile_StepDefs {


    SettingsPage settingsPage = new SettingsPage();


    @When("user clicks on Settings under Profile section")
    public void user_clicks_on_settings_under_profile_section() {

        BrowserUtils.waitForClickablility(settingsPage.profileMenuToggle, 5);
        settingsPage.profileMenuToggle.click();
        BrowserUtils.waitForClickablility(settingsPage.settingsLink, 5);
        settingsPage.settingsLink.click();


    }

    @Then("the Full name displayed should be the same as the Username")
    public void the_full_name_displayed_should_be_the_same_as_the_username() {

        String expectedDisplayName = ConfigReader.getProperty("username");
        String actualDisplayName = settingsPage.inputDisplayName.getAttribute("value");

        Assert.assertEquals(expectedDisplayName, actualDisplayName);

    }

    @When("user inputs valid email address {string}")
    public void user_inputs_valid_email_address(String email) {

        settingsPage.inputEmail.clear();
        settingsPage.inputEmail.sendKeys(email + Keys.ENTER);
        Driver.getDriver().navigate().refresh();


    }


    @Then("Email address {string} is successfully inputted")
    public void email_address_is_successfully_inputted(String expectedEmail) {

        String actualEmailInput = settingsPage.inputEmail.getAttribute("value");
        Assert.assertEquals(expectedEmail, actualEmailInput);


    }


    @When("user selects {string} from dropdown")
    public void user_selects_from_dropdown(String language) {


        BrowserUtils.waitForClickablility(settingsPage.languageDropdown, 5);
        Select langDropdown = new Select(settingsPage.languageDropdown);
        langDropdown.selectByVisibleText(language);


    }

    @Then("the selected {string} should be displayed")
    public void the_selected_should_be_displayed(String expectedLanguage) {

        Select langDropdown = new Select(settingsPage.languageDropdown);
        String actualLanguage = langDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedLanguage, actualLanguage);

    }


}

package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Dashboard_StepDefs {


    DashboardPage dashboardPage = new DashboardPage();


    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

        BrowserUtils.waitForTitleContains("Dashboard");

        List<String> actualModules = new ArrayList<>();
        for (WebElement eachModule : dashboardPage.appMenu) {
            actualModules.add(eachModule.getAttribute("aria-label"));

        }

        Assert.assertEquals(expectedModules,actualModules);

    }

    @Then("user should be able to see username in settings menu")
    public void user_should_be_able_to_see_username_in_settings_menu() {

        dashboardPage.settingsToggle.click();

        String actualUserName = dashboardPage.settingsMenuUserName.getText();

        Assert.assertEquals(ConfigReader.getProperty("username"), actualUserName);

    }

    @Then("user clicks customize button")
    public void user_clicks_customize_button() {

        dashboardPage.customizeButton.click();

    }

    @Then("user can see following widgets")
    public void user_can_see_following_widgets(List<String> expectedWidgets) {

        BrowserUtils.waitForVisibility(dashboardPage.widgets.get(0), 10);

        List<String> actualWidgets = new ArrayList<>();

        for (WebElement eachWidget : dashboardPage.widgets) {
            actualWidgets.add(eachWidget.getText());

        }

        //Expected widgets assign to local variable to avoid exceptions When sorting.
        ArrayList<String> localExpectedWidgets = new ArrayList<>(expectedWidgets);

        // Widgets order in actual result is always changing When selecting any of Widgets
        // For that reason actual and expected List of Strings are sorted to compare properly.
        Collections.sort(actualWidgets);
        Collections.sort(localExpectedWidgets);

        Assert.assertEquals(localExpectedWidgets, actualWidgets);

    }


    @Then("user selects any of widgets")
    public void user_selects_any_of_widgets() {

        for (WebElement eachWidget : dashboardPage.widgets) {
            eachWidget.click();
        }

    }


    @Then("user clicks on set status button")
    public void user_clicks_on_set_status_button() {
        dashboardPage.settingsToggle.click();
        dashboardPage.settingsMenuStatus.click();

    }

    @Then("user should be able to see following status options")
    public void user_should_be_able_to_see_following_status_options(List<String> expectedStatusOptions) {

        BrowserUtils.waitForVisibility(dashboardPage.statusOptions.get(0),10);

        List<String> actualStatusOptions = new ArrayList<>();

        for (WebElement eachStatusOptions : dashboardPage.statusOptions) {
            actualStatusOptions.add(eachStatusOptions.getText());

        }

        Assert.assertEquals(expectedStatusOptions, actualStatusOptions);

    }

    @Then("user can select any of the status options")
    public void user_can_select_any_of_the_status_options() {

        for (WebElement eachStatusOptions : dashboardPage.statusOptions) {
            eachStatusOptions.click();

        }

    }

}










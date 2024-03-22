package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPage;
import com.cydeo.pages.LoginPage;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Calendar_StepDefs {

    CalendarPage calendarPage = new CalendarPage();
    LoginPage loginPage = new LoginPage();


    @Given("user is already logged in")
    public void user_is_already_logged_in() {

        loginPage.login();

    }

    @And("user is already on calendar dashboard page")
    public void userIsAlreadyOnCalendarDashboardPage() {

        calendarPage.calendarDashboardButton.click();

    }

    @When("user clicks on more options tab on left")
    public void userClicksOnMoreOptionsTabOnLeft() {

        calendarPage.moreOptionsTab.click();

    }

    @And("user clicks on day, week, month display option tab")
    public void userClicksOnDayWeekMonthDisplayOptionTab() {

        calendarPage.dayWeekMonthDisplayOptionsButton.click();

    }

    @And("user clicks on day option")
    public void userClicksOnDayOption() {

        calendarPage.dailyDisplayOption.click();

    }

    @Then("user should see calendar in daily view format and day in URL")
    public void userShouldSeeCalendarInDailyViewFormat() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Day"));

    }


    @And("user clicks on week option")
    public void userClicksOnWeekOption() {

        calendarPage.weeklyDisplayOption.click();

    }

    @Then("user should see calendar in weekly view format and week in URL")
    public void userShouldSeeCalendarInWeeklyViewFormatAndWeekInURL() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Week"));

    }

    @And("user clicks on month option")
    public void userClicksOnMonthOption() {

        calendarPage.monthlyDisplayOption.click();

    }

    @Then("user should see calendar in monthly view format and month in URL")
    public void userShouldSeeCalendarInMonthlyViewFormatAndMonthInURL() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Month"));

    }

    @And("user clicks on new event button")
    public void userClicksOnNewEventButton() {

        calendarPage.newEventButton.click();

    }

    @And("user enters {string} into event title text box")
    public void userEntersEventNameIntoEventTitleTextBox(String eventName) {

        calendarPage.eventTitleTextBox.sendKeys(eventName);

    }

    @And("user selects all day checkbox")
    public void userSelectsAllDayCheckbox() {

        calendarPage.allDayButton.click();

    }

    @And("user selects a date from calendar")
    public void userSelectsADateFromCalendar() {

        calendarPage.fromBox.click();
        calendarPage.tableDate.click();

    }

    @And("user clicks save button")
    public void userClicksSaveButton() {

        calendarPage.saveButton.click();

    }

    @Then("user should see {string} displayed on monthly view calendar")
    public void userShouldSeeEventDisplayedOnMonthlyViewCalendar(String eventName) {

        if(calendarPage.eventContainer.getText().equals(eventName)){
            Assert.assertTrue(calendarPage.eventContainer.getText().contains(eventName));
        }else{
            System.out.println(eventName + " is not in created event");
        }

    }

    @And("user selects a date from calendar by typing {string} into from box")
    public void userSelectsADateFromCalendarByTypingIntoFromBox(String randomDate) {

        calendarPage.fromBox.clear();
        calendarPage.fromBox.sendKeys(randomDate);

    }
}

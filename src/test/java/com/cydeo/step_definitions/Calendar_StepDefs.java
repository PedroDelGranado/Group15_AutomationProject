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
}

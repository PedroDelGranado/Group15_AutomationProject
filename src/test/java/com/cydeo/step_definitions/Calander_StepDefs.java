package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPage;
import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.Given;

public class Calander_StepDefs {

    CalendarPage calendarPage = new CalendarPage();

    @Given("user is already logged in")
    public void user_is_already_logged_in() {

      new LoginPage().login();


    }

}

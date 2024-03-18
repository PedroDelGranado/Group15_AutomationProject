package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.CalanderPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;

public class Calander_StepDefs {

    CalanderPage calanderPage = new CalanderPage();

    @Given("user is already logged in")
    public void user_is_already_logged_in() {

      new LoginPage().login();


    }

}

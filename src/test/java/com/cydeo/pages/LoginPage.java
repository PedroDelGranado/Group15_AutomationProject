package com.cydeo.pages;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;

public class LoginPage extends BasePage{

    public void login(){

        CalendarPage calendarPage = new CalendarPage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        calendarPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
        calendarPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        calendarPage.loginButton.click();
    }








}

package com.cydeo.pages;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;

public class LoginPage extends BasePage{

    public void login(){

        CalanderPage calanderPage = new CalanderPage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        calanderPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
        calanderPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        calanderPage.loginButton.click();
    }








}

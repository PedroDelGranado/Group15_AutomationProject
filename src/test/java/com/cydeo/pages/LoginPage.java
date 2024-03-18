package com.cydeo.pages;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;

public class LoginPage extends BasePage{

    public void login(){

        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        usernameInput.sendKeys(ConfigReader.getProperty("username"));
        passwordInput.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();
    }








}

package com.cydeo.pages;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public void login(){

        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        usernameInput.sendKeys(ConfigReader.getProperty("username"));
        passwordInput.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();
    }

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
        public WebElement errorMessage;

    @FindBy(xpath = "//a[@class='toggle-password']")
    public WebElement eyeIcon;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(id = "reset-password-submit")
    public WebElement resetPasswordButton;

    @FindBy(xpath = "//input[@placeholder='Username or email']")
    public WebElement usernamePlaceHolder;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordPlaceHolder;











}

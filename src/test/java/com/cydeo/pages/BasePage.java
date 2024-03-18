package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


 @FindBy(id = "user")
 public WebElement usernameInput;

 @FindBy(id = "password")
    public WebElement passwordInput;

 @FindBy(id="submit-form")
    public WebElement loginButton;




}

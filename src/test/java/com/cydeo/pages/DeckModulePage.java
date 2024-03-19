package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckModulePage {
    public DeckModulePage(){
        //1 Create Constructor
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // Find elements
    //1. Username or email
    @FindBy(xpath = "//input[@placeholder = 'Username or email']")
    public WebElement usernameBox;

    //2 Password
    @FindBy(id = "password")
    public WebElement password;

    //3.Login Button
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;


}

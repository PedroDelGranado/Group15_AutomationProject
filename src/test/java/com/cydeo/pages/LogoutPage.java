package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage {

    public LogoutPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = " //*[@id='settings']")
    public WebElement accountNameDropdown;

    @FindBy(xpath = "//*[@*='logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[text()='Trycloud']")
    public WebElement titleHeader;


}

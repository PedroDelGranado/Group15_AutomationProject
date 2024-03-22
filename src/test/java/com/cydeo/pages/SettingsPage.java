package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SettingsPage extends BasePage {

    public SettingsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "expand")
    public WebElement profileMenuToggle;

    @FindBy(xpath = "//a[@href=\"/index.php/settings/user\"]")
    public WebElement settingsLink;

    @FindBy(id = "displayname")
    public WebElement inputDisplayName;

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "languageinput")
    public WebElement languageDropdown;





}

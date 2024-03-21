package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage extends BasePage {

    public SettingsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "expand")
    public WebElement profileMenuToggle;

    @FindBy(xpath = "//a[@href=\"/index.php/settings/user\"]")
    public WebElement settingsLink;





}

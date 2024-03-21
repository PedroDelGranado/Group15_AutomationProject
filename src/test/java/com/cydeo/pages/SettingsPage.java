package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage extends BasePage{

    public SettingsPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


}

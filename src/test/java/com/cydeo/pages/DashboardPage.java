package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BasePage {

    public DashboardPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id]/a")
    public List<WebElement> appMenu;

    @FindBy(id="settings")
    public WebElement settingsToggle;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement settingsMenuUserName;

    @FindBy(linkText = "Customize")
    public WebElement customizeButton;

    @FindBy(xpath = "//input[@type='checkbox']/following-sibling::label")
    public List<WebElement> widgets;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement settingsMenuStatus;

    @FindBy(xpath = "//label[starts-with(@class, 'user-status')]")
    public List<WebElement> statusOptions;















}

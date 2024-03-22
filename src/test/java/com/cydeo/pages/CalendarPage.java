package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.format.DateTimeFormatter;

public class CalendarPage extends BasePage{

//page classes extend base page
public CalendarPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//ul[@id='appmenu']//li[8]")
public WebElement calendarDashboardButton;

@FindBy(xpath = "//header[@class='app-navigation-header']")
public WebElement moreOptionsTab;

@FindBy(xpath = "//button[@aria-label='Actions'][1]")
public WebElement dayWeekMonthDisplayOptionsButton;

@FindBy(xpath = "//span[.='Day']")
public WebElement dailyDisplayOption;

@FindBy(xpath = "//span[.='Week']")
public WebElement weeklyDisplayOption;

@FindBy(xpath = "//span[.='Month']")
public WebElement monthlyDisplayOption;

@FindBy(xpath = "//button[@class='button primary new-event']")
public WebElement newEventButton;

@FindBy(xpath = "//input[@placeholder='Event title']")
public WebElement eventTitleTextBox;

@FindBy(xpath = "//label[@for='allDay']")
public WebElement allDayButton;

@FindBy(xpath = "(//input[@name='date'])[2]")
public WebElement fromBox;

@FindBy(xpath = "//td[@data-day='27']")
public  WebElement tableDate;

@FindBy(xpath = "//div[@class='fc-event-title fc-sticky']")
public WebElement eventContainer;

@FindBy(xpath = "//button[@class='primary']")
public WebElement saveButton;

}

package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactPage extends BasePage {

    @FindBy(xpath = "(//a[@href='/index.php/apps/contacts/'])[1]")
    public WebElement contactModule ;

    @FindBy(id = "new-contact-button")
    public WebElement newContact;

    @FindBy(id ="contact-fullname")
    public WebElement contactFullName;

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContactPage;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> actualContact;

    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    public WebElement numberOfContacts;

//    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']")
//    public WebElement middleColum;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement uploadIcon;

//    @FindBy(xpath = "(//span[@class='action-button__text'])[1]")
//    public WebElement uploadBtn;

    @FindBy(xpath = "//span[.='Choose from Files']")
    public WebElement chooseFromFileBtn;

    @FindBy(xpath = "//table[@id='picker-filestable']//span[.='bird.jpeg']")
    public WebElement img;

    @FindBy(xpath = "//button[.='Choose']")
    public WebElement chooseBtn;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one'][1]")
    public WebElement chooseContact;

    @FindBy(xpath = "//div[contains(@class,'action-item header-menu')]")
    public WebElement selectBtn;

    @FindBy(xpath = "//div[@class='popover__wrapper']//span[.='Delete']")
    public WebElement deleteBtn;




}

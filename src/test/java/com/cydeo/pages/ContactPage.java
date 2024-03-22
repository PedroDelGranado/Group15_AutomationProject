package com.cydeo.pages;

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

    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']")
    public List<WebElement> middleColum;


}

package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkPage extends BasePage {


    public int countOldConversation;
    public int countNewConversation;


    public TalkPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement newGroupConversationButton;

    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationNameInputBox;

    @FindBy(xpath = "//label[@for='checkbox']")
    public WebElement allowGuestsCheckBox;

    @FindBy(xpath = "//button[contains(text(),'Add participants')]")
    public WebElement addParticipantsButton;

    @FindBy(xpath = "//input[@placeholder='Search participants']")
    public WebElement searchParticipants;

    @FindBy(xpath = "//ul/li//span[.='Employee10']")
    public WebElement userName;

    @FindBy(xpath = "//button[contains(text(),'Create conversation')]")
    public WebElement createConversationButton;

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    public WebElement closeButton;

    @FindBy(xpath = "//ul[@class='conversations']/li")
    public List<WebElement> conversationItems;

    @FindBy(xpath = "(//button[@aria-label='Conversation settings'])[1]")
    public WebElement itemOptionButton;

    @FindBy(xpath = "//button//*[contains(text(),'Delete conversation')]")
    public WebElement deleteConversationButton;

    @FindBy(xpath = "//button[(text()='Yes')]")
    public WebElement yesButton;




    public void setCountConversationBeforeSave(){

        countOldConversation = conversationItems.size();


    }

    public void setCountConversationAfterSave(){

        countNewConversation = conversationItems.size();

    }













}

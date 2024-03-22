package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingRenameCommentPage extends BasePage{


    public AddingRenameCommentPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement files;


    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusSignBtn;

    @FindBy(xpath = "//span[text()='Upload file']")
    public WebElement uploadFile;

    @FindBy(xpath = "(//span[contains(@class,'icon-more')])[3]")
    public WebElement threeDotsMenu;

    @FindBy(xpath = "//*[text()='Add to favorites']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//*[text()='Favorites']")
    public WebElement favorites;

    @FindBy(xpath = "(//span[text()='SampleData'])[2]")
    public WebElement addedFile;

    @FindBy(xpath = "(//*[text()='Remove from favorites'])[2]")
    public WebElement removeFromFavorites;


    @FindBy(xpath = "//*[contains(@class,' action-rename-container')][1]")
    public WebElement renameBtn;

    @FindBy(xpath = "(//*[@class='nametext'])[2]/span[@class='innernametext']")
    public WebElement renameFile;



    @FindBy(xpath = "//span[text()='Details']")
    public WebElement details;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement comment;

    @FindBy(xpath = "(//span[text()='SampleData'])[2]")
    public WebElement addedFileToFavorite;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement leaveComment;







}

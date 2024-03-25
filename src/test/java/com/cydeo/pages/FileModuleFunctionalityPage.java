package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FileModuleFunctionalityPage {

    public FileModuleFunctionalityPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='actions creatable']/a")
    public WebElement plusSign;


//    @FindBy(xpath = "//span[.='Upload file']") //span[@class='svg icon icon-upload']
//    public WebElement uploadFile;

    @FindBy(css = "#file_upload_start")
    public WebElement uploadFile;

//    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
//    public WebElement uploadFile;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolder;

//    @FindBy(xpath = "//input[@id='view17-input-folder']")
//    public WebElement inputNameNewFolder;

    @FindBy(xpath = "//input[contains(@id, '-input-folder')]")
    public WebElement inputNameNewFolder;

    @FindBy(xpath = "//tbody[@id='fileList']/tr")
    public List<WebElement> filesAttribute;

    public List<String> getFilesNames() {

        List<String> filesNames = new ArrayList<>();
        for (WebElement each : filesAttribute) {
            filesNames.add(each.getAttribute("data-file"));    //this attribute return files name
        }

        return filesNames;
    }


    @FindBy(xpath = "//tbody[@id='fileList']//td[@class='selection']")
    public WebElement checkBox;

    @FindBy(xpath = "(//span[contains(@class, 'icon-more')])[2]")
    public WebElement  selectedThreeDot;



    @FindBy(xpath = "//a[@href='#']/span[.='Delete folder']")
    public WebElement deleteOption;

    @FindBy(xpath = "//table[@id='filestable']//tfoot//span[@class='dirinfo']")
    public WebElement folderSummary;

    @FindBy(xpath = "//table[@id='filestable']//tfoot//span[@class='fileinfo']")
    public WebElement fileSummary;


}

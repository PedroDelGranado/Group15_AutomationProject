package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FolderViewFunctionalityPage extends BasePage {

    public FolderViewFunctionalityPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesIcon;

    @FindBy(xpath = "//table[@id='filestable']//a[@data-sort='name']/span[.='Name']")
    public WebElement nameIcon;

    @FindBy(xpath = "//table[@id='filestable']//span[.='Size']")
    public WebElement sizeIcon;

    @FindBy(xpath = "//table[@id='filestable']//span[.='Modified']")
    public WebElement modifiedIcon;


    //=========================PART2=========================================
    @FindBy(xpath = "//tbody[@id='fileList']/tr")
    public List<WebElement> filesAttribute;

    public List<String> getFilesNames() {

        List<String> filesNames = new ArrayList<>();
        for (WebElement each : filesAttribute) {
            filesNames.add(each.getAttribute("data-file"));    //this attribute return files name
        }

        return filesNames;
    }


    public List<Integer> getFilesSizes() {

        List<Integer> filesSizes = new ArrayList<>();
        for (WebElement each : filesAttribute) {
            filesSizes.add(Integer.valueOf(each.getAttribute("data-size")));    //this attribute return files name
        }

        return filesSizes;
    }


    public List<Long> getFilesModifiedDate() {

        List<Long> getFilesModifiedDate = new ArrayList<>();
        for (WebElement each : filesAttribute) {
            getFilesModifiedDate.add(Long.valueOf(each.getAttribute("data-mtime")));    //this attribute return files name
        }

        return getFilesModifiedDate;
    }


    //=========================PART3=========================================

    @FindBy(id = "headerSelection")
    public WebElement selectAllCheckBox;

    @FindBy(xpath = "//table[@id='filestable']//a[@data-sort='name']")
    public WebElement selectedFilesInformation;

}

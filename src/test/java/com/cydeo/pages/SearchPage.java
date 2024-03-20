package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//span[@aria-label='Magnify icon']")
    public WebElement searchIcon;

    @FindBy(xpath ="//input[@type='search']" )
    public WebElement searchInput;

    @FindBy(xpath = "(//h3[@class ='unified-search__result-line-one'])[1]")
    public WebElement searchItem;

    @FindBy(xpath = "//header[contains(@class,'app-sidebar-header')]//h2")
    public WebElement resultItemName;



    public void enterItemNameInSearchField(String itemName) {
        BrowserUtils.waitForVisibility(searchInput,10);
        searchInput.sendKeys(itemName + Keys.ENTER);


    }

    public void clickOnSpecificItem(String itemName) {
        searchItem.click();

    }




}

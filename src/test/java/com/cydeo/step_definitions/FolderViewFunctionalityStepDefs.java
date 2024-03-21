package com.cydeo.step_definitions;

import com.cydeo.pages.FolderViewFunctionalityPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class FolderViewFunctionalityStepDefs {


    LoginPage loginPage = new LoginPage();
    FolderViewFunctionalityPage folderViewFunctionalityPage = new FolderViewFunctionalityPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @Given("user is already logged in")
    public void user_is_already_logged_in() {
        loginPage.login();
    }

    @Then("user click Files icon")
    public void user_click_files_icon() {
        folderViewFunctionalityPage.filesIcon.click();
    }

    @Then("user click the Name icon")
    public void user_click_the_name_icon() {
        folderViewFunctionalityPage.nameIcon.click();

    }

    @Then("user verify changing folder view by clicking Name icon")
    public void user_verify_changing_folder_view_by_clicking_name_icon() {

        List<String> filesNamesOrderAfterFirstClick = folderViewFunctionalityPage.getFilesNames();

        user_click_the_name_icon();
        //folderViewFunctionalityPage.nameIcon.click();

        List<String> filesNamesOrderAfterSecondClick = folderViewFunctionalityPage.getFilesNames();

        System.out.println("filesNamesOrderAfterFirstClick = " + filesNamesOrderAfterFirstClick);
        System.out.println("filesNamesOrderAfterSecondClick = " + filesNamesOrderAfterSecondClick);

        Assert.assertEquals(filesNamesOrderAfterFirstClick.size(), filesNamesOrderAfterSecondClick.size());
        Assert.assertNotEquals(filesNamesOrderAfterFirstClick, filesNamesOrderAfterSecondClick);


    }

    @Then("user click the Size icon")
    public void user_click_the_size_icon() {
        folderViewFunctionalityPage.sizeIcon.click();
    }

    @Then("user verify changing folder view by clicking Size icon")
    public void user_verify_changing_folder_view_by_clicking_size_icon() {

            List<Integer> filesSizesAfterFirstClick = folderViewFunctionalityPage.getFilesSizes();

            user_click_the_size_icon();

            List<Integer> filesSizesAfterSecondClick = folderViewFunctionalityPage.getFilesSizes();

            Assert.assertEquals(filesSizesAfterFirstClick.size(), filesSizesAfterSecondClick.size());
            Assert.assertNotEquals(filesSizesAfterFirstClick, filesSizesAfterSecondClick);
    }


    @Then("user click the Modified icon")
    public void user_click_the_modified_icon() {
        folderViewFunctionalityPage.modifiedIcon.click();

    }

    @Then("user verify changing folder view by clicking Modified icon")
    public void user_verify_changing_folder_view_by_clicking_modified_icon() {

        List<Long>  filesModifiedDateAfterFirstClick    = folderViewFunctionalityPage.getFilesModifiedDate();

        user_click_the_modified_icon();
        //wait.until(ExpectedConditions.invisibilityOf(folderViewFunctionalityPage.modifiedIcon));

        List<Long>  filesModifiedDateAfterSecondClick    = folderViewFunctionalityPage.getFilesModifiedDate();

        Assert.assertEquals(filesModifiedDateAfterFirstClick.size(), filesModifiedDateAfterSecondClick.size());
        Assert.assertNotEquals(filesModifiedDateAfterFirstClick, filesModifiedDateAfterSecondClick);

        System.out.println("filesModifiedDateAfterFirstClick = " + filesModifiedDateAfterFirstClick);
        System.out.println("filesModifiedDateAfterSecondClick = " + filesModifiedDateAfterSecondClick);
        for (Long each : filesModifiedDateAfterFirstClick) {
            Date date = new Date(each);
            System.out.println(date);
        }
    }




    @Then("user click the “select all” checkbox at the left top corner of the list")
    public void userClickTheSelectAllCheckboxAtTheLeftTopCornerOfTheList() {
        folderViewFunctionalityPage.selectAllCheckBox.click();
    }

    @And("user verify seeing the total values of all files in the first line")
    public void userVerifySeeingTheTotalValuesOfAllFilesInTheFirstLine() {
        System.out.println("folderViewFunctionalityPage.selectedFilesInformation = " + folderViewFunctionalityPage.selectedFilesInformation.getText());
        Assert.assertTrue(!folderViewFunctionalityPage.selectedFilesInformation.getText().isEmpty());
    }
}

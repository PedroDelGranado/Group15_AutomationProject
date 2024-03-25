package com.cydeo.step_definitions;

import com.cydeo.pages.FileModuleFunctionalityPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class FileModuleFunctionalityStepDefs {


    FileModuleFunctionalityPage fileModuleFunctionalityPage = new FileModuleFunctionalityPage();
    //String path = "C:/Users/Ali Demir/Desktop/3.feature";
    String projectPath = System.getProperty("user.dir");
    String path = "src/test/resources/uploadedFiles/test002.txt";
    String fullPath = projectPath + "/" + path;
    //String selectedFileName = fileModuleFunctionalityPage.getFilesNames().get(0);   //as a default selenium delete the first file



    //==============Scenario1===============================

    @When("the user clicks plus sign")
    public void theUserClicksPlusSign() {

        fileModuleFunctionalityPage.plusSign.click();
        BrowserUtils.sleep(2);


    }

    @And("the user upload a file by using Upload file")
    public void theUserUploadAFileByUsingUploadFile() {
        fileModuleFunctionalityPage.uploadFile.sendKeys(fullPath);
        BrowserUtils.sleep(3);

    }


    @Then("the uploaded file should be visible in the files list")
    public void the_uploaded_file_should_be_visible_in_the_files_list() {
        String uploadedFileName = "test002.txt";

        Assert.assertTrue(fileModuleFunctionalityPage.getFilesNames().contains("test002.txt"));
    }

    //==============Scenario2===============================
    
    @When("the user clicks plus sign and New Folder button")
    public void theUserClicksPlusSignAndNewFolderButton() {

        fileModuleFunctionalityPage.plusSign.click();
        BrowserUtils.sleep(3);
        fileModuleFunctionalityPage.newFolder.click();

    }


    @And("the user enters a folder {string} and confirms the creation")
    public void theUserEntersAFolderAndConfirmsTheCreation(String folderName) {
        fileModuleFunctionalityPage.inputNameNewFolder.sendKeys(folderName + Keys.ENTER);
        BrowserUtils.sleep(3);
    }


    @Then("the new folder name {string} should be visible in the files list")
    public void theNewFolderNameShouldBeVisibleInTheFilesList(String expectedFolderName) {

        //System.out.println("fileModuleFunctionalityPage.getFilesNames() = " + fileModuleFunctionalityPage.getFilesNames());
        Assert.assertTrue(fileModuleFunctionalityPage.getFilesNames().contains(expectedFolderName));
    }


    //==============Scenario3===============================
    @When("the user clicks the three dots menu for the selected item")
    public void theUserClicksTheThreeDotsMenuForTheSelectedItem() {
        BrowserUtils.sleep(2);
        fileModuleFunctionalityPage.selectedThreeDot.click();
        BrowserUtils.sleep(2);
    }

    @And("the user click Delete option")
    public void theUserClickDeleteOption() {
        fileModuleFunctionalityPage.deleteOption.click();
        BrowserUtils.sleep(1);
    }

    @Then("the selected item {string} should no longer be visible in the files list")
    public void theSelectedItemShouldNoLongerBeVisibleInTheFilesList(String deletedFolder) {

        Assert.assertFalse(fileModuleFunctionalityPage.getFilesNames().contains(deletedFolder));
    }


    //==============Scenario4===============================

    @Then("the user should see the total number of files and folders displayed")
    public void the_user_should_see_the_total_number_of_files_and_folders_displayed() {
        BrowserUtils.sleep(1);
        int numberOfFile = Integer.parseInt(String.valueOf(fileModuleFunctionalityPage.fileSummary.getText().charAt(0)));
        int numberOfFolder = Integer.parseInt(String.valueOf(fileModuleFunctionalityPage.folderSummary.getText().charAt(0)));
        int totalNumberOfFileAndFolder = numberOfFolder + numberOfFile;

        System.out.println("fileModuleFunctionalityPage.getFilesNames().size() = " + fileModuleFunctionalityPage.getFilesNames().size());

        System.out.println("fileModuleFunctionalityPage.fileSummary = " + fileModuleFunctionalityPage.fileSummary.getText());
        System.out.println("fileModuleFunctionalityPage.folderSummary.getText() = " + fileModuleFunctionalityPage.folderSummary.getText());

        Assert.assertEquals(fileModuleFunctionalityPage.getFilesNames().size(), totalNumberOfFileAndFolder);
    }



}

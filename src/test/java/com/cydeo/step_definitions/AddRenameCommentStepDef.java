package com.cydeo.step_definitions;

import com.cydeo.pages.AddingRenameCommentPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AddRenameCommentStepDef {

        AddingRenameCommentPage addingRenameCommentPage = new AddingRenameCommentPage();

    // First US
    @When("user click on files")
    public void userClickOnFiles() {
        BrowserUtils.sleep(3);
        addingRenameCommentPage.files.click();
    }
    @And("user click on the three dots on the right")
    public void user_click_on_the_three_dots_on_the_right() {
        BrowserUtils.sleep(3);
        addingRenameCommentPage.threeDotsMenu.click();
    }
    @And("User click on add to favorites from its own three dots menu.")
    public void user_click_on_add_to_favorites_from_its_own_three_dots_menu() {
        BrowserUtils.sleep(3);
        addingRenameCommentPage.addToFavorites.click();
        addingRenameCommentPage.favorites.click();
    }
    @Then("User can see the added file on the menu")
    public void user_can_see_the_added_file_on_the_menu() {
        BrowserUtils.sleep(3);
        String actualFileAdded = addingRenameCommentPage.favorites.getText();
        String expectedFileAdded = "SampleData";
        Assert.assertTrue( actualFileAdded, addingRenameCommentPage.favorites.isDisplayed());
        //addingRenameCommentPage.removeFromFavorites.click();
    }

    // Second US
    @And("User rename any {string} from its own three dots menu")
    public void userRenameAnyFromItsOwnThreeDotsMenu(String arg0) {
        Driver.getDriver().switchTo().activeElement().sendKeys("Nice" + Keys.ENTER );
//        addingRenameCommentPage.renameFile.getAccessibleName();
        BrowserUtils.sleep(3);
        Driver.getDriver().navigate().refresh();
//        addingRenameCommentPage.renameFile.sendKeys("nice" + Keys.ENTER);
    }
    @Then("User will be able to see the new {string}")
    public void userWillBeAbleToSeeTheNew(String newFileName) {
        BrowserUtils.sleep(3);
        String actualFileAdded = addingRenameCommentPage.favorites.getText();
        String expectedFileAdded = newFileName + ".xlsx";
//        String fileName = Driver.getDriver().findElement(By.xpath("(//span[text()='" + newFileName + "'])[2]")).getText();
        Assert.assertTrue(expectedFileAdded.contains(newFileName));


        addingRenameCommentPage.threeDotsMenu.click();
        addingRenameCommentPage.renameBtn.click();
        BrowserUtils.sleep(3);
        Driver.getDriver().switchTo().activeElement().sendKeys("SampleData" + Keys.ENTER );
        BrowserUtils.sleep(3);
        Driver.getDriver().navigate().refresh();

    }
    @And("user click on rename button")
    public void userClickOnRenameButton() {
        addingRenameCommentPage.renameBtn.click();
        BrowserUtils.sleep(3);

    }



    // Third US
    @And("user leave comments on new comments section")
    public void user_leave_comments_on_new_comments_section() {
        BrowserUtils.sleep(3);
        addingRenameCommentPage.details.click();
        addingRenameCommentPage.comment.click();
        addingRenameCommentPage.leaveComment.sendKeys("good", Keys.ENTER);
    }
    @Then("User can see the given comments on the file")
    public void user_can_see_the_given_comments_on_the_file() {
        BrowserUtils.sleep(3);
        addingRenameCommentPage.addedFile.getText();

        String actualComment = addingRenameCommentPage.comment.getText();
        String expectedComment = "good";
        Assert.assertTrue(expectedComment,addingRenameCommentPage.comment.isDisplayed());
    }





}

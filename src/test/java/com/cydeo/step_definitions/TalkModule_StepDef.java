package com.cydeo.step_definitions;

import com.cydeo.pages.TalkPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalkModule_StepDef {

    TalkPage talkPage = new TalkPage();

    // It passes module name given in the parameter and click on this module icon
    @When("click {string} module on app menu")
    public void click_module_on_app_menu(String moduleName) {

        BrowserUtils.waitForTitleContains("Dashboard");

        talkPage.clickModuleOnAppMenu(moduleName);

    }

    @Then("Click create a new group conversation button")
    public void click_create_a_new_group_conversation_button() {
        talkPage.newGroupConversationButton.click();


    }

    @Then("Enter conversation name {string} in input box")
    public void enter_conversation_name_in_input_box(String conversationName) {

        talkPage.conversationNameInputBox.sendKeys(conversationName);


    }


    @Then("Select allow guests to join via link checkbox")
    public void select_allow_guests_to_join_via_link_checkbox() {

        talkPage.allowGuestsCheckBox.click();


    }

    @Then("Click add participants button")
    public void click_add_participants_button() {


        talkPage.addParticipantsButton.click();

    }

    @Then("Enter user {string} in Search participants input box")
    public void enter_user_in_search_participants_input_box(String user) {

        talkPage.searchParticipants.sendKeys(user);

    }

    @Then("Select user from the list in pop-up")
    public void select_user_from_the_list_in_pop_up() {

        talkPage.userName.click();

    }

    @Then("Click Create conversation button")
    public void click_create_conversation_button() {

        talkPage.setCountConversationBeforeSave();
        talkPage.createConversationButton.click();

    }

    @Then("Click close button in the pop-up")
    public void click_close_button_in_the_pop_up() {

        talkPage.closeButton.click();


    }

    @Then("Check if the new conversation {string} displays in the list")
    public void check_if_the_new_conversation_displays_in_the_list(String conversationName) {

        boolean isNewConversationCreated = false;

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            talkPage.setCountConversationAfterSave();
            isNewConversationCreated = talkPage.countNewConversation > talkPage.countOldConversation;

            if (isNewConversationCreated) {
                break;
            }
        }

        Assert.assertTrue(isNewConversationCreated);

        Assert.assertEquals(conversationName, talkPage.conversationItems.get(0).getText());


    }

    @When("user click option button on the conversation items")
    public void user_click_option_button_on_the_conversation_items() {

        talkPage.itemOptionButton.click();

    }

    @Then("select Delete conversation option")
    public void select_delete_conversation_option() {

        talkPage.setCountConversationBeforeSave();

        talkPage.deleteConversationButton.click();

    }

    @Then("Click yes button in the pop-up")
    public void click_yes_button_in_the_pop_up() {

        talkPage.yesButton.click();
    }

    @Then("check if the conversation is deleted")
    public void check_if_the_conversation_is_deleted() {


        boolean isConversationDeleted = false;

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            talkPage.setCountConversationAfterSave();
            isConversationDeleted = talkPage.countNewConversation < talkPage.countOldConversation;

            if (isConversationDeleted) {
                break;
            }
        }

        Assert.assertTrue(isConversationDeleted);

    }

}

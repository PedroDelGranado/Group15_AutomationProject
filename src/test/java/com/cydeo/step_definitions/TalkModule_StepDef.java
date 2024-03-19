package com.cydeo.step_definitions;

import com.cydeo.pages.TalkPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TalkModule_StepDef {

    TalkPage talkPage = new TalkPage();

    @When("click {string} module on app menu")
    public void click_module_on_app_menu(String moduleName) {

        talkPage.clickModuleOnAppMenu(moduleName);

    }

    @Then("Click create conversation button")
    public void click_create_conversation_button() {


    }





}

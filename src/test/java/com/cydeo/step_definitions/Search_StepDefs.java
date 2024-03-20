package com.cydeo.step_definitions;

import com.cydeo.pages.SearchPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_StepDefs {
    SearchPage searchPage = new SearchPage();

    @Given("the user clicks on the magnifying glass icon in {string}")
    public void the_user_clicks_on_the_magnifying_glass_icon_in(String module) {

        searchPage.clickModuleOnAppMenu(module);
        BrowserUtils.sleep(1);
        searchPage.searchIcon.click();

    }
    @Given("enter the name of the the search field {string}")
    public void enter_the_name_of_the_the_search_field(String itemName) {
        searchPage.enterItemNameInSearchField(itemName);


    }
    @When("the user clicks on a specific {string} from the search results")
    public void the_user_clicks_on_a_specific_from_the_search_results(String itemName) {

        searchPage.clickOnSpecificItem(itemName);


    }
    @Then("the user should be redirected to the details page of the {string}")
    public void the_user_should_be_redirected_to_the_details_page_of_the(String itemName) {
        BrowserUtils.sleep(1);
        System.out.println("searchPage.resultItemName.getText() = " + searchPage.resultItemName.getText());
        BrowserUtils.verifyElementDisplayed(searchPage.resultItemName);


    }

}

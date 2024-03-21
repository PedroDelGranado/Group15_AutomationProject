package com.cydeo.step_definitions;

import com.cydeo.pages.SearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
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
    //========= 2 part ============

    @When("the user clicks on the App icon at the top left corner of the page")
    public void the_user_clicks_on_the_app_icon_at_the_top_left_corner_of_the_page() {
        searchPage.logoIconElement.click();

    }

    @Then("the user should be redirected to the Dashboard page")
    public void the_user_should_be_redirected_to_the_dashboard_page() {
        Driver.getDriver().getCurrentUrl().contains("dashboard");


    }







}

package com.cydeo.step_definitions;

import com.cydeo.pages.SettingsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Profile_StepDefs {


    SettingsPage settingsPage = new SettingsPage();

    @When("user clicks on Settings under Profile section")
    public void user_clicks_on_settings_under_profile_section() {

        BrowserUtils.waitForClickablility(settingsPage.profileMenuToggle, 5);
        settingsPage.profileMenuToggle.click();
        BrowserUtils.waitForClickablility(settingsPage.settingsLink, 5);
        settingsPage.settingsLink.click();


    }

    @Then("the Full name displayed should be the same as the Username")
    public void the_full_name_displayed_should_be_the_same_as_the_username() {

        String expectedDisplayName = ConfigReader.getProperty("username");
        String actualDisplayName = settingsPage.displayName.getAttribute("value");

        Assert.assertEquals(expectedDisplayName, actualDisplayName);

    }

    @Then("user should be able to input a valid Email Address")
    public void user_should_be_able_to_input_a_valid_email_address(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects {string} from dropdown")
    public void user_selects_from_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the selected {string} should be displayed")
    public void the_selected_should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

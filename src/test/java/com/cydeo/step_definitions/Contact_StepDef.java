package com.cydeo.step_definitions;

import com.cydeo.pages.ContactPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Contact_StepDef {
    LoginPage loginPage = new LoginPage();
    ContactPage contactPage = new ContactPage();
    @Given("user already loged into the dachboard page")
    public void user_already_loged_into_the_dachboard_page() {
        loginPage.login();
    }
    @When("user click on contact module")
    public void user_click_on_contact_module() {
        //BrowserUtils.sleep(3);
        contactPage.contactModule.click();
    }
    @When("user click on New contact")
    public void user_click_on_new_contact() {
        //BrowserUtils.sleep(3);
        contactPage.newContact.click();
    }
    @And("user type the {string} and the {string} of the new contact")
    public void userTypeTheAndTheOfTheNewContact(String name, String lastName) {
        contactPage.contactFullName.click();
        contactPage.contactFullName.clear();
        BrowserUtils.sleep(3);
        contactPage.contactFullName.sendKeys(name+" "+lastName);
    }

    @When("user click on all contact page")
    public void user_click_on_all_contact_page() {
        contactPage.allContactPage.click();
    }


    @Then("user should see {string} the contact appear in all the contact list")
    public void userShouldSeeTheContactAppearInAllTheContactList(String expectedContacts) {

        List<String> actualContacts = new ArrayList<>();
        for (WebElement eachContact : contactPage.actualContact){
            actualContacts.add(eachContact.getText());
        }
//        System.out.println("expectedContacts = " + expectedContacts);
//        System.out.println("actualContacts = " + actualContacts);
        System.out.println("actualContacts = " + actualContacts);
        Assert.assertTrue(actualContacts.contains(expectedContacts));
    }


    @Then("user can see all the contacts as a list inside the middle column And total number of the contacts near the “All Contacts” tab")
    public void userCanSeeAllTheContactsAsAListInsideTheMiddleColumnAndTotalNumberOfTheContactsNearTheAllContactsTab() {
        int numberOfContacts = Integer.parseInt(contactPage.numberOfContacts.getText());
        Assert.assertTrue(numberOfContacts==contactPage.actualContact.size());
    }

    @Then("user canchange the profile picture of any contact")
    public void userCanchangeTheProfilePictureOfAnyContact() {

        for (WebElement eachContact : contactPage.actualContact){
            eachContact.click();
            contactPage.uploadIcon.click();
            contactPage.chooseFromFileBtn.click();
            //BrowserUtils.sleep(3);
            contactPage.img.click();
            contactPage.chooseBtn.click();
            Assert.assertTrue(contactPage.img.isDisplayed());


        }
    }
    @When("user select a contact")
    public void user_select_a_contact() {
        contactPage.chooseContact.click();
        BrowserUtils.sleep(1);
    }
    @Then("user can delet the contact")
    public void user_can_delet_the_contact() {
        contactPage.selectBtn.click();
        BrowserUtils.sleep(1);
        contactPage.deleteBtn.click();
        BrowserUtils.sleep(1);
        Driver.getDriver().navigate().refresh();
        Assert.assertFalse(contactPage.chooseContact.isDisplayed());
    }







}


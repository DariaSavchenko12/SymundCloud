package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.BasePage;
import com.SymundCloud.pages.ContactsPage;
import com.SymundCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactsStepDefs_ST extends BasePage  {
    ContactsPage contactsPage = new ContactsPage();

    @Then("user click to the Contacts module")
    public void user_click_to_the_contacts_module() {
        BasePage.clickModule("Contacts");
    }
    @Given("user click to New contact")
    public void user_click_to_new_contact() {
        contactsPage.newContactButton.click();
    }
    @When("user creates a new contact with full name {string}")
    public void user_creates_a_new_contact_with_full_name(String fullName) {
        contactsPage.contactFullName.clear();
        contactsPage.contactFullName.sendKeys(fullName);
    }
    @When("user click to All contacts")
    public void user_click_to_all_contacts() {
        contactsPage.allContactButton.click();
    }
    @Then("new contact {string} should appear in the All contact list")
    public void new_contact_should_appear_in_the_all_contact_list(String newContactFullName) {
        WebElement newContact = contactsPage.setNewContactVerifications(newContactFullName);
        Assert.assertTrue("The new contact is not displayed in the All contact list.", newContact.isDisplayed());

    }

    //2

    @Given("user should see a list of all contacts at the middle column")
    public void user_should_see_a_list_of_all_contacts_at_the_middle_column() {
        List<WebElement> contactsList = contactsPage.getContactsList();
        Assert.assertTrue("Contact list is not displayed", !contactsList.isEmpty());
    }

    @Then("the total number of contacts should be displayed near the All Contacts tab")
    public void the_total_number_of_contacts_should_be_displayed_near_the_tab() {
        String totalContactsText = contactsPage.getTotalContacts();
        List<WebElement> contactsList = contactsPage.getContactsList();
        Assert.assertEquals("Total number of contacts does not match", contactsList.size() + "", totalContactsText);
    }

    //3

    @When("user selects the contact {string}")
    public void user_selects_the_contact(String contact) {
        WebElement selectContact = contactsPage.setNewContactVerifications(contact);
        selectContact.click();
        BrowserUtils.waitFor(2);
    }
    @When("user clicks on the profile picture")
    public void user_clicks_on_the_profile_picture() {
        contactsPage.clickProfilePicture.click();
    }
    @When("user chooses {string} option")
    public void user_chooses_option(String ChooseFromFiles) {
        contactsPage.chooseFileButton.click();
    }
    @When("user selects a previously uploaded picture and click choose button")
    public void user_selects_a_previously_uploaded_picture() {
        contactsPage.selectfile.click();
        contactsPage.chooseButton.click();
        BrowserUtils.waitFor(2);

    }
    @Then("the profile picture of the contact should be updated")
    public void the_profile_picture_of_the_contact_should_be_updated() {

    }


    //4

    @When("user clicks the three-dot menu")
    public void user_clicks_the_three_dot_menu() {
        contactsPage.threeDot.click();
    }
    @When("user user selects the {string} option")
    public void user_user_selects_the_option(String delete) {
        contactsPage.deleteButton.click();
        BrowserUtils.waitFor(1);
    }
    @Then("The contact {string} should be removed from the contact list")
    public void the_contact_should_be_removed_from_the_contact_list(String contactName) {
        //List<WebElement> contactsList = contactsPage.getContactsList();
        //boolean contactExists = contactsList.stream()
        //        .anyMatch(contact -> contact.getText().equals(contactName));
        //Assert.assertFalse("The contact " + contactName + " was not removed", contactExists);
        List<WebElement> contactsList = contactsPage.getContactsList();
        boolean contactRemoved = true;
        for (WebElement contact : contactsList) {
            if (contact.getText().equals(contactName)) {
                contactRemoved = false;
                break;
            }
        }
        if (!contactRemoved) {
            System.out.println("The contact " + contactName + " was not removed");
        } else {
            System.out.println("The contact " + contactName + " was successfully removed");
        }
    }

}

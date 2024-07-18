package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.ContactsGroupPage_Daria;
import com.SymundCloud.pages.ContactsModulePage_Daria;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.List;

public class ContactsModuleGroupViewStepDefs_Daria {

    ContactsModulePage_Daria contactsModule = new ContactsModulePage_Daria();
    ContactsGroupPage_Daria groupPage = new ContactsGroupPage_Daria();

    @Given("the user is viewing a contact's information")
    public void the_user_is_viewing_a_contact_s_information() {

        contactsModule.newContactButton.click();

    }

    @When("the user clicks on the group dropdown menu")
    public void the_user_clicks_on_the_group_dropdown_menu() {
        contactsModule.dropDownGroupContactMenu.click();


    }

    @Then("all available groups should be listed")
    public void all_available_groups_should_be_listed() {

        List<String> actualGroups = groupPage.getAllAvailableGroups();
        List<String> expectedGroups = Arrays.asList(contactsModule.dropDownGroupContactMenu.getText());

        Assert.assertEquals("Mismatch in available groups", expectedGroups, actualGroups);
        System.out.println("actualGroups = " + actualGroups);
        System.out.println("expectedGroups = " + expectedGroups);


    }

}

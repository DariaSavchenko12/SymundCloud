package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.AnniversaryPage_Daria;
import com.SymundCloud.pages.ContactsModulePage_Daria;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class ContactsInfoPropertyStepDefs_Daria {
    ContactsModulePage_Daria contactsModule = new ContactsModulePage_Daria();
    AnniversaryPage_Daria anniversaryDate = new AnniversaryPage_Daria();


    @When("the user clicks on {string} dropdown menu")
    public void the_user_clicks_on_dropdown_menu(String string) {
        contactsModule.propertyMenu.click();


    }

    @When("selects {string}")
    public void selects(String property) {
        contactsModule.anniversaryProperty.click();
        System.out.println(property);

    }

    @When("enters the anniversary date {string}")
    public void enters_the_anniversary_date(String data) {
        anniversaryDate.enterAnniversaryDate(data);


    }

    @When("saves the contact information")
    public void saves_the_contact_information() {
        contactsModule.OkButton.click();

    }

    @Then("the anniversary property should be added to the contact's info page")
    public void the_anniversary_property_should_be_added_to_the_contact_s_info_page() {

    }

    @Then("the anniversary date should be displayed as {string}")
    public void the_anniversary_date_should_be_displayed_as(String string) {

    }

}

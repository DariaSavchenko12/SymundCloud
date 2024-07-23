package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.AnniversaryPage_Daria;
import com.SymundCloud.pages.ContactsModulePage_Daria;
import com.SymundCloud.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class ContactsInfoPropertyStepDefs_Daria {
    ContactsModulePage_Daria contactsModule = new ContactsModulePage_Daria();
    AnniversaryPage_Daria anniversaryDate = new AnniversaryPage_Daria();


    @When("the user clicks on {string} dropdown menu")
    public void the_user_clicks_on_dropdown_menu(String string) {
        contactsModule.propertyDropDown.click();


    }

    @When("selects {string}")
    public void selects(String text) {
        contactsModule.selectAllProperties(text);


    }

    @And("user clicks to input box")
    public void userClicksToInputBox() {
        contactsModule.anniversaryInputBox.click();

    }

    @And("enters the anniversary {string}")
    public void entersTheAnniversary(String data) {
        contactsModule.selectAllDates(data);


    }


    @Then("the anniversary date should be displayed as {string}")
    public void the_anniversary_date_should_be_displayed_as(String data) {
        Assert.assertTrue(contactsModule.selectAllDates(data).isDisplayed());
        System.out.println(contactsModule.selectAllDates(data).getText());


    }


}

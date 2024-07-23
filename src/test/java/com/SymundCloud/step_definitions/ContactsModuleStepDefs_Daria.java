package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.ContactsGroupPage_Daria;
import com.SymundCloud.pages.ContactsModulePage_Daria;
import com.SymundCloud.pages.LoginPage;
import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.ConfigurationReader;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContactsModuleStepDefs_Daria {
    LoginPage loginPage = new LoginPage();
    ContactsModulePage_Daria contactsModule = new ContactsModulePage_Daria();



    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.login(ConfigurationReader.getProperty("users_username"), ConfigurationReader.getProperty("users_password"));

        BrowserUtils.verifyTitleContains("Dashboard");
    }


    @When("the user navigates to the Contacts module")
    public void the_user_navigates_to_the_contacts_module() {
        contactsModule.contactsModuleLink.click();
        BrowserUtils.verifyTitle("Contacts - Symund - QA");


    }

    @When("selects to create a new group")
    public void selects_to_create_a_new_group() {
        contactsModule.createNewGroupIcon.click();


    }

    @When("enters a group name {string}")
    public void enters_a_group_name(String stringName) {
        contactsModule.inputBox.sendKeys(stringName);

    }

    @When("saves the new group")
    public void saves_the_new_group() {
        BrowserUtils.sleep(2);

        contactsModule.inputBox.sendKeys(Keys.ENTER);


    }

    @Then("the group {string} should be created successfully")
    public void the_group_should_be_created_successfully(String groupName) {

        contactsModule.getDynamicElementByTitle(groupName);


    }
}


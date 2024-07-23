package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.ProfileSettingsPage_IB;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfileSettingsStepDefinition_IB {
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    ProfileSettingsPage_IB profileSettingsPageIb = new ProfileSettingsPage_IB();

    @When("User clicks name icon")
    public void user_clicks_name_icon() {
        profileSettingsPageIb.nameIcon.click();
    }

    @When("User clicks settings button")
    public void user_clicks_settings_button() {
        profileSettingsPageIb.settingsButton.click();
    }

    @Then("User can see provided titles")
    public void user_can_see_provided_titles() {
        List<String> expectedTitles = new ArrayList<>(Arrays.asList("Full name", "Email", "Phone number"));
        List<String> currentTitles = new ArrayList<>();
        for (WebElement eachName : profileSettingsPageIb.titleNames) {
            currentTitles.add(eachName.getText());
        }

        Assert.assertTrue(currentTitles.containsAll(expectedTitles));
    }

    @When("User clicks name icon and records the name")
    public void userClicksNameIconAndRecordsTheName() {
        profileSettingsPageIb.nameIcon.click();

    }

    @Then("User compares specified names")
    public void userComparesSpecifiedNames() {
        profileSettingsPageIb.nameIcon.click();
        Assert.assertEquals(profileSettingsPageIb.nameInTheIconMenu.getText(), profileSettingsPageIb.nameInTheSettingsMenu.getAttribute("value"));

    }

    @And("User enters required data")
    public void userEntersRequiredData() {
        profileSettingsPageIb.phoneInputBox.clear();
        profileSettingsPageIb.phoneInputBox.sendKeys("+17734579898");

    }

    @Then("User asserts the input box only accepts numbers")
    public void userAssertsTheInputBoxOnlyAcceptsNumbers() {
        profileSettingsPageIb.phoneInputBox.clear();
        profileSettingsPageIb.phoneInputBox.sendKeys("Adoe52--23");

        Assert.assertTrue(profileSettingsPageIb.invalidPhoneNumberMessage.isDisplayed());

    }
}

package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.ProfileSettingPage_ST;
import com.SymundCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileSettingStepDefs_ST {
    ProfileSettingPage_ST profileSettingPage = new ProfileSettingPage_ST();

    @When("user click to profile")
    public void user_click_to_profile() {
        profileSettingPage.locateprofile.click();
    }

    @When("user click setting")
    public void user_click_setting() {
        profileSettingPage.locateSetting.click();

    }

    @Then("Full name and username should be the same.")
    public void full_name_and_username_should_be_the_same() {
        String fullname = profileSettingPage.fullName.getText();
        String username = profileSettingPage.userName.getText();
        Assert.assertEquals(fullname, username);
    }

    @Then("User enter a {string} to Email input box.")
    public void user_enter_a_proper_e_mail_to_email_input_box(String userEmail) {
        profileSettingPage.emailInput.sendKeys(userEmail);
        profileSettingPage.emailInput.clear();
    }

    @Then("User can change Language.")
    public void user_can_change_language() {
        profileSettingPage.selectByValue("es");
        BrowserUtils.waitFor(2);
        profileSettingPage.selectByValue("en");
    }


}

package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.US001_CustomizePage;
import com.SymundCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US001_CustomizeStepDefs {

US001_CustomizePage us01_customizePage = new US001_CustomizePage();

    @When("Users click on Customize button")
    public void users_click_on_customize_button() throws InterruptedException {
        BrowserUtils.sleep(2);
        us01_customizePage.customizeBtn.click();
    }
    @Then("Users click to select Widgets")
    public void users_click_to_select_widgets() throws InterruptedException {
        BrowserUtils.sleep(2);
        Assert.assertTrue(us01_customizePage.widgetsBtn.isDisplayed());


    }

    @When("users click statusLink")
    public void usersClickStatusLink() {
        us01_customizePage.statusLink.click();

    }
}

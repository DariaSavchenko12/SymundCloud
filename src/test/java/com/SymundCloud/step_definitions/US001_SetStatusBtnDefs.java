package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.US001_SetStatusBtnPage;
import com.SymundCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US001_SetStatusBtnDefs {

    US001_SetStatusBtnPage us01SetStatusBtnPage = new US001_SetStatusBtnPage();

    @When("Users click on Set status button")
    public void users_click_on_set_status_button() {
        BrowserUtils.sleep(10);
        us01SetStatusBtnPage.settingBtn.click();//initial sittingBtn

    }

    @Then("Users see Employee name all modules")
    public void usersSeeEmployeeNameAllModules() {
        BrowserUtils.sleep(5);

        Assert.assertTrue(us01SetStatusBtnPage.EmployeeName.isEnabled());

    }

    @When("Users click on Set status option  button")
    public void usersClickOnSetStatusOptionButton() {
        BrowserUtils.sleep(10);
        us01SetStatusBtnPage.settingBtn.click(); // initial StatusOptionsBtn

    }

    @Then("Users choose any Status option")
    public void usersChooseAnyStatusOption() {
        us01SetStatusBtnPage.StatusOptionBtn.click();
    }

    //  @Then("Users choose any Status option")
      // public void users_choose_any_status_option() throws InterruptedException {
     //  BrowserUtils.sleep(5);
     //  us01SetStatusBtnPage.StatusOptionBtn.click();


}


//}

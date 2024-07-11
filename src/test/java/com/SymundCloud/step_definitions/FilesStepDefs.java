package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.BasePage;
import com.SymundCloud.pages.FilesPage;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class FilesStepDefs extends BasePage {

    FilesPage filesPage = new FilesPage();


    @When("user clicks {string} module")
    public void user_clicks_module(String argFiles) {
        clickModule(argFiles);

    }

    @Then("user successfully lands to the {string} page")
    public void user_successfully_lands_to_the_page(String argFiles) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(argFiles));
    }

    @When("user clicks plus sign module")
    public void user_clicks_plus_sign_module() {
        filesPage.addModule.click();
    }

    @Then("user sees and clicks {string} option")
    public void user_sees_and_clicks_option(String argUploadFile) {
        filesPage.selectAddOption(argUploadFile);                   // I THINK I DO NOT NEED TO CLICK, JUST SEND
    }


    @Then("user uploads a file")
    public void user_uploads_a_file() {

    }
    @Then("user can see uploaded file in the list")
    public void user_can_see_uploaded_file_in_the_list() {

    }

}

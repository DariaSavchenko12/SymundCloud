package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.BasePage;
import com.SymundCloud.pages.FilesPage;
import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


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
        filesPage.selectAddOption(argUploadFile);
    }


    @Then("user uploads a file")
    public void user_uploads_a_file() {
        filesPage.uploadFileOption.sendKeys("/Users/robertajovaisa/Desktop/UI Test Automation/Project Automation Sprint/uploadFile" + Keys.ENTER);
        BrowserUtils.sleep(10);
    }
    @Then("user can see uploaded file in the list")
    public void user_can_see_uploaded_file_in_the_list() {

    }

    // 2 SCENARIO

    @Then("user enters New folder name")
    public void userEntersNewFolderName() {
        filesPage.folderNameInput.sendKeys("B34");
    }

    @And("user clicks Enter to save new folder")
    public void userClicksEnterToSaveNewFolder() {
        filesPage.folderNameInput.sendKeys(Keys.ENTER);
    }

    @And("user can see new folder in the list")
    public void userCanSeeNewFolderInTheList() {
        filesPage.verifyFileExistence("B34");
    }



    // 3 SCENARIO

    @When("user clicks three dots menu next to the file")
    public void userClicksThreeDotsMenuNextToTheFile() {
    }

    @Then("user sees and clicks delete option")
    public void userSeesAndClicksDeleteOption() {
    }

    @And("user sees file is no longer on the list")
    public void userSeesFileIsNoLongerOnTheList() {
    }

    @And("user should see total number of files and folders displayed under the files list")
    public void userShouldSeeTotalNumberOfFilesAndFoldersDisplayedUnderTheFilesList() {
    }
}

package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.BasePage;
import com.SymundCloud.pages.FilesPage;
import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


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


    @Then("user uploads a file")
    public void user_uploads_a_file() {
        filesPage.uploadFile("uploadFile.txt");
        BrowserUtils.sleep(1);
    }


    @Then("user can see uploaded file in the list")
    public void user_can_see_uploaded_file_in_the_list() {
        filesPage.verifyFileExistence("uploadFile");
    }


    @Then("user clicks {string} file delete option")
    public void userClicksFileDeleteOption(String arg0) {
        filesPage.deletingFiles(arg0);
    }


    // 2 SCENARIO

    @When("user clicks plus sign module")
    public void user_clicks_plus_sign_module() {
        filesPage.addModule.click();
    }


    @Then("user sees and clicks {string} option")
    public void user_sees_and_clicks_option(String argUploadFile) {
        filesPage.selectAddOption(argUploadFile);
    }

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
        WebElement createdFolder = Driver.getDriver().findElement(By.xpath("(//span[.='B34'])[2]"));
        BrowserUtils.waitForVisibility(createdFolder, 5);

        filesPage.verifyFileExistence("B34");
    }



    // 3 SCENARIO

    @When("user clicks three dots menu next to the first file")
    public void userClicksThreeDotsMenuNextToTheFirstFile() {
        filesPage.threeDotMenu.click();
    }

    @Then("user deletes that file and verifies it no longer exist")
    public void userDeletesThatFileAndVerifiesItNoLongerExist() {
        String nameOfFirstFileOnTheList = filesPage.firstFileOnTheList.getText(); // in this line I am saving name of the line I am deleting
        filesPage.deleteFolderOption.click();

        BrowserUtils.waitForInvisibilityOf(Driver.getDriver().findElement(By.xpath("(//span[.='" + nameOfFirstFileOnTheList + "'])[3]")));
        Assert.assertNotEquals(nameOfFirstFileOnTheList,filesPage.firstFileOnTheList.getText());   // verifying new files new is different
    }



    // 4 SCENARIO

    @And("user should see total number of files and folders displayed under the files list")
    public void userShouldSeeTotalNumberOfFilesAndFoldersDisplayedUnderTheFilesList() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement allFilesSummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='info']")));
        Assert.assertTrue(allFilesSummary + " : ",allFilesSummary.isDisplayed());
    }



}

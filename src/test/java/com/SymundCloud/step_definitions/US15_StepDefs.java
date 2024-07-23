package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.LoginPage;
import com.SymundCloud.pages.NotesModulePage_Feyza;
import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.ConfigurationReader;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US15_StepDefs {

    LoginPage loginPage = new LoginPage();
    NotesModulePage_Feyza notesModulePageFeyza = new NotesModulePage_Feyza();

    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        loginPage.login(ConfigurationReader.getProperty("users_username"), ConfigurationReader.getProperty("users_password"));
    }

    @When("the user click {string} module")
    public void the_user_click_module(String notesModule) {
        notesModulePageFeyza.notesModule.click();
    }

    @When("the user click New Note")
    public void the_user_click_new_note() {
        notesModulePageFeyza.newNoteButton.click();
        BrowserUtils.waitFor(1);
    }

    @When("the user write {string}")
    public void the_user_write(String note) {
        BrowserUtils.hover(notesModulePageFeyza.textArea);
        notesModulePageFeyza.textArea.click();
        notesModulePageFeyza.textAreaInside.sendKeys(note);
        BrowserUtils.waitFor(15);
    }

    @Then("note title should match with first words of {string}")
    public void note_title_should_match_with_first_words_of(String note) {
        String actualNoteTitle = notesModulePageFeyza.lastNote.getAttribute("title").substring(0, 10);
        System.out.println("actualNoteTitle = " + actualNoteTitle);
        System.out.println("note = " + note);

        Assert.assertTrue(note.contains(actualNoteTitle));
        BrowserUtils.waitFor(2);

    }

    @Then("the user click three dot on {string} title")
    public void the_user_click_three_dot_on_title(String note) {
        notesModulePageFeyza.clickTextThreeDots(note);
    }

    @Then("the user clicks on delete button")
    public void the_user_clicks_on_delete_button() {
        notesModulePageFeyza.deleteNoteButton.click();

    }

    @Then("User sees the {string} is disappeared")
    public void userSeesTheIsDisappeared(String note) {
        Assert.assertTrue(!notesModulePageFeyza.lastNote.isDisplayed());
    }

    @When("User clicks to three dots on {string} title")
    public void user_clicks_to_three_dots_on_title(String note) {
        notesModulePageFeyza.newNoteButton.click();
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(notesModulePageFeyza.textArea);
        notesModulePageFeyza.textArea.click();
        notesModulePageFeyza.textAreaInside.sendKeys(note);
        BrowserUtils.waitFor(10);
        notesModulePageFeyza.clickTextThreeDots(note);
    }

    @Then("User selects Add to favorites option")
    public void user_selects_add_to_favorites_option() {
        notesModulePageFeyza.addToFavoritesButton.click();
    }

    @Then("User clicks to Files module")
    public void user_clicks_to_files_module() {
        notesModulePageFeyza.filesModule.click();
    }

    @Then("User clicks Favorites")
    public void user_clicks_favorites() {
        notesModulePageFeyza.favoritesButton.click();
    }

    @Then("User sees the file newly added to favorites under Favorites tab inside Files module")
    public void user_sees_the_file_newly_added_to_favorites_under_favorites_tab_inside_files_module() {
        String favoriteText = notesModulePageFeyza.favoriteText.getText();
        System.out.println("favoriteText = " + favoriteText);
        Assert.assertTrue(notesModulePageFeyza.favoriteText.isDisplayed());
    }

    @When("User clicks to three dots icon on the right side")
    public void user_clicks_to_three_dots_icon_on_the_right_side() {
        notesModulePageFeyza.rightSideThreeDots.click();

    }

    @Then("User clicks to Details")
    public void user_clicks_to_details() {
        notesModulePageFeyza.detailsButton.click();
    }

    @Then("User sees the number of letters and words that the note includes under the note title")
    public void user_sees_the_number_of_letters_and_words_that_the_note_includes_under_the_note_title() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)); // Wait up to 10 seconds
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/p[@class='app-sidebar-header__subtitle']")));
        String actualWordCharText = notesModulePageFeyza.wordsAndChars.getText();
        System.out.println("actualWordCharText = " + actualWordCharText);
        Assert.assertTrue(actualWordCharText.contains("words"));


    }
}




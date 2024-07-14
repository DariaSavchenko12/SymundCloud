package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.AddingToFavoritePage;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToFavoriteStepDef {
    AddingToFavoritePage addingToFavoritePage=new AddingToFavoritePage();
    @Then("user click on the Files button")
    public void user_click_on_the_files_button(){
        try {
            WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(50));
            wait.until(ExpectedConditions.visibilityOf(addingToFavoritePage.filesButton));
            addingToFavoritePage.filesButton.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Given("the user click on the three dots of the file {string}")
    public void the_user_click_on_the_three_dots_of_the_file(String Notes) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(addingToFavoritePage.nameInList));
        WebElement threeDots = Driver.getDriver().findElement(By.xpath("(//*[@id=\"fileList\"]//span[.='"+Notes+"'])/parent::span/following-sibling::span/a[2]"));
        threeDots.click();
    }
    @When("the user adds the file {string} to favorites")
    public void the_user_adds_the_file_to_favorites(String Notes) {
        addingToFavoritePage.favoriteButton.click();

    }
    @Then("user click on the rename button of the file")
    public void user_click_on_the_rename_button_of_the_file() {
        addingToFavoritePage.renameButton.click();
    }
    @When("the user renames the file to {string}")
    public void the_user_renames_the_file_to(String newName) {
        addingToFavoritePage.inputName.sendKeys(newName+ Keys.ENTER);

    }
    @Then("user click on the details button of the file")
    public void user_click_on_the_details_button_of_the_file() {
        addingToFavoritePage.detailsButton.click();
    }
    @Then("user click on the comment button")
    public void user_click_on_the_comment_button() {
        addingToFavoritePage.commentButton.click();
    }
    @Then("user enters the {string}")
    public void user_enters_the(String comment) {
        addingToFavoritePage.commentBox.sendKeys(comment+Keys.ENTER);
    }

}

package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.ActivityModulePage_Annia;
import com.SymundCloud.pages.LoginPage;
import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class ActivityModule_StepDefinitions {

    LoginStepDefs loginStepDefs = new LoginStepDefs();
    ActivityModulePage_Annia activityModulePage = new ActivityModulePage_Annia();

    @Given("{string} is logged in")
    public void is_logged_in(String usertype) {

        loginStepDefs.the_user_logged_in_as(usertype);
        BrowserUtils.waitFor(2);

    }

    @Then("user clicks on the Activity module")
    public void user_clicks_on_the_activity_module() {

        activityModulePage.activityLink.click();

    }

    @Then("user lands on Activities page")
    public void user_lands_activities_page() {

        BrowserUtils.verifyTitleContains("Activity ");

    }

    @Then("user is able to see all items links displayed")
    public void user_is_able_to_see_all_items_links_displayed() {

        activityModulePage.allItemsLinksDisplayed();

    }

    @Then("user can see all items list ordered by newest to oldest.")
    public void userCanSeeAllItemsListOrderedByNewestToOldest() {

        activityModulePage.orderedItems();

    }
//        List<String> itemsText = new ArrayList<>();
//        for (WebElement eachOrderedItem : orderedItems) {
//            itemsText.add(eachOrderedItem.getText());
//            System.out.println(itemsText);
//            /*boolean isOrdered = itemsText.equals()*/
//        }

    @Then("user can see No more events to load message at the end of the All Activities tab.")
    public void userCanSeeNoMoreEventsToLoadMessageAtTheEndOfTheAllActivitiesTab() {

        activityModulePage.noMoreEvents.isDisplayed();
    }


}



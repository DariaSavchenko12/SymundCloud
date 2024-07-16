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

public class ActivityModule_StepDefinitions{

    LoginStepDefs loginStepDefs = new LoginStepDefs();
    ActivityModulePage_Annia activityModulePage = new ActivityModulePage_Annia();

    @Given("{string} is logged in")
    public void is_logged_in(String usertype) {

        loginStepDefs.the_user_logged_in_as(usertype);

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

        Set<WebElement> links = new LinkedHashSet<>(Arrays.asList(
                activityModulePage.allActivitiesLink,
                activityModulePage.byYouLink,
                activityModulePage.byOthersLink,
                activityModulePage.circlesLink,
                activityModulePage.favoritesLink,
                activityModulePage.fileChangesLink,
                activityModulePage.fileSharesLink,
                activityModulePage.calendarLink,
                activityModulePage.todosLink,
                activityModulePage.commentsLink,
                activityModulePage.deckLink
        ));
        for (WebElement eachLink : links) {
            BrowserUtils.verifyElementDisplayed(eachLink);
        }

    }

    @Then("user can see all items list ordered by newest to oldest.")
    public void userCanSeeAllItemsListOrderedByNewestToOldest() {

        List<WebElement> orderedItems = Arrays.asList(
                activityModulePage.newestItem,
                activityModulePage.middleNewestItem,
                activityModulePage.oldestItem
        );

        List<LocalDateTime> timestamps = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");

        for (WebElement eachOrderedItem : orderedItems) {
            String timeText = eachOrderedItem.getAttribute("data-original-title").trim();
            try {
                LocalDateTime time = LocalDateTime.parse(timeText, formatter);
                timestamps.add(time);
            } catch (DateTimeParseException e) {
                System.out.println("Failed to parse date: " + timeText);
                e.printStackTrace();
            }
        }

        boolean isOrderCorrect = true;
        for (int i = 0; i < timestamps.size() - 1; i++) {
            if (!timestamps.get(i).isAfter(timestamps.get(i + 1))) {
                isOrderCorrect = false;
                break;
            }
        }

        if (isOrderCorrect) {
            System.out.println("Activities are in the correct order (newest to oldest).");
        } else {
            System.out.println("Activities are NOT in the correct order.");
        }
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



package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.LoginPage;
import com.SymundCloud.pages.TalkPage_IB;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class TalkModuleStepDefinitions_IB {
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    TalkPage_IB talkPageIb = new TalkPage_IB();
    @Given("{string} is on the Symond home page")
    public void is_on_the_symond_home_page(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
    }
    @When("User clicks talk button")
    public void user_clicks_talk_button() {
        talkPageIb.talkModule.click();
    }
    @When("User clicks create new conversation button")
    public void user_clicks_create_new_conversation_button() {
        talkPageIb.addNewConversation.click();
    }
   @When("User types My Conversation in conversation name")
    public void user_types_my_conversation_in_conversation_name() {

        talkPageIb.inputConversationName.sendKeys("My conversation");

    }
    @When("User checks join via link checkbox")
    public void user_checks_join_via_link_checkbox() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(talkPageIb.viaLinkCheckbox).click().perform();

    }


    @And("User clicks on add participants button")
    public void userClicksOnAddParticipantsButton() {

        talkPageIb.addParticipantsButton.click();
    }

    @When("User clicks on a random participant")
    public void userClicksOnARandomParticipant() {
        talkPageIb.randomUser.click();
    }

    @And("User clicks on create conversation button")
    public void userClicksOnCreateConversationButton() {
        talkPageIb.createConversationButton.click();
    }

    @And("User clicks close on the pop up window")
    public void userClicksCloseOnThePopUpWindow() {
        talkPageIb.closeButton.click();
    }

    @Then("User can see created conversation on the list")
    public void userCanSeeCreatedConversationOnTheList() {
        Assert.assertTrue(talkPageIb.newlyCreatedConversation.isDisplayed());
    }
}

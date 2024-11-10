package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.CalendarModulePage_Mace;
import com.SymundCloud.pages.LoginPage;
import com.SymundCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_StepDefs {

    LoginPage loginPage = new LoginPage();
    CalendarModulePage_Mace calendarModulePageMace = new CalendarModulePage_Mace();

    @Given("User is on Symund home page")
    public void user_is_on_symund_home_page() {
        loginPage.login(ConfigurationReader.getProperty("users_username"),ConfigurationReader.getProperty("users_password"));
    }

    @When("User clicks on the Calendar button")
    public void user_clicks_on_the_calendar_button() {

        calendarModulePageMace.calendarModule.click();
    }

    @When("User click on the icon right next to the Today + New Event button")
    public void user_click_on_the_icon_right_next_to_the_today_new_event_button() {

        calendarModulePageMace.calendarIcon.click();
    }

    @Then("User Select Day button")
    public void user_select_day_button() {

        calendarModulePageMace.dayIcon.click();
    }

    @Then("the Daily calender will is displayed")
    public void the_daily_calender_will_is_displayed() {

        Assert.assertTrue(calendarModulePageMace.dayTableIcon.isDisplayed());
    }

    @Then("User Select Week button")
    public void user_select_week_button()  {
        calendarModulePageMace.weekIcon.click();
    }

    @Then("the Weekly calender will is displayed")
    public void the_weekly_calender_will_is_displayed() {
        Assert.assertTrue(calendarModulePageMace.weekTableIcon.isDisplayed());
    }

    @Then("User Select Month button")
    public void user_select_month_button()  {
        calendarModulePageMace.monthIcon.click();
    }

    @Then("the Monthly calender will is displayed")
    public void the_monthly_calender_will_is_displayed() {
        Assert.assertTrue(calendarModulePageMace.monthTableIcon.isDisplayed());
    }

    @When("User click on the New Event button")
    public void user_click_on_the_new_event_button() {
        calendarModulePageMace
    }

    @Then("User Adds an Even Title name")
    public void user_adds_an_even_title_name() {
    }

    @Then("User Selects From date & time AND To date & time")
    public void user_selects_from_date_time_and_to_date_time() {
    }

    @Then("User select All Day")
    public void user_select_all_day() {
    }

    @Then("User Saves the Event")
    public void user_saves_the_event() {
    }

    @Then("User Select personal button")
    public void user_select_personal_button() {
    }

    @Then("User selects the Monthly view")
    public void user_selects_the_monthly_view() {
    }

    @Then("User should be able to see the Event on the Monthly view on the related day")
    public void user_should_be_able_to_see_the_event_on_the_monthly_view_on_the_related_day() {
    }

}

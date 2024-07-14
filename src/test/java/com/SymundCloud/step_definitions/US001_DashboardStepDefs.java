package com.SymundCloud.step_definitions;

import com.SymundCloud.pages.LoginPage;
import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US001_DashboardStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("Users login into the page")
    public void users_login_into_the_page() {
        Driver.getDriver().get("https://qa.symund.com/");

    }

    @Then("user click login button")
    public void userClickLoginButton() {

        loginPage.submit.click();
    }

    @When("users enter username and password")
    public void usersEnterUsernameAndPassword() {
        loginPage.userName.sendKeys("User1");
        loginPage.password.sendKeys("Userpass123");



    }



}

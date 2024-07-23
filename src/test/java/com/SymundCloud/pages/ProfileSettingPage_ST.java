package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfileSettingPage_ST {

    public ProfileSettingPage_ST() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "expand")
    public WebElement locateprofile;
    @FindBy (linkText = "Settings")
    public WebElement locateSetting;
    @FindBy (id = "displayname")
    public WebElement fullName;
    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement userName;
    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailInput;
    @FindBy(id = "languageinput")
    public WebElement dropdownElement;
    public void selectByValue(String value) {
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }
}

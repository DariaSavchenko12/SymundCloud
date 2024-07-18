package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfileSettingsPage_IB {
    public ProfileSettingsPage_IB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "expand")
    public WebElement nameIcon;
    @FindBy(xpath = "//li[@data-id='settings']/a")
    public WebElement settingsButton;
    @FindBy(xpath = "//div[@class='personal-settings-container']/div//label")
    public List<WebElement> titleNames;
    @FindBy(xpath = "//div[@class='user-status-menu-item']/span")
    public WebElement nameInTheIconMenu;
    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement nameInTheSettingsMenu;

}

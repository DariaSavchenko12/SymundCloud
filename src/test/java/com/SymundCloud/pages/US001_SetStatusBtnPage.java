package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US001_SetStatusBtnPage {

    public US001_SetStatusBtnPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy(xpath = "//div[@id='settings']")  ////div[@class='footer']//a//id="settings" //id="settings"
    public WebElement settingBtn;//id="expand"

    @FindBy(xpath = "//div[@id='settings']//div//span[1]") //(//div[@class='user-status-menu-item'])//span
    public WebElement EmployeeName;

    @FindBy(xpath = "//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']") //a[@class='user-status-menu-item__toggle']
   public WebElement StatusOptionBtn; ////div[@class='user-status-menu-item']//a

    // Set status next Set location for weather (//div[@class='user-status-menu-item'])[2]
    // Set status under Employee100 = (//div[@class='user-status-menu-item'])//a or //a[@class='user-status-menu-item__toggle']
    // Employee (//div[@class='user-status-menu-item'])//span
    // one of modules //li[2]



   @FindBy(xpath = "(//div[@class='user-status-menu-item'])//a")
  public WebElement setStatusBtn1;// new UsersatatusBtn//div[@id='settings']//div//span[1]a


   @FindBy(xpath = "//div[@class='user-status-online-select'][3]")// moved Customixepage
  public WebElement doNotDisturbBtn;

    @FindBy(id="status-status")
    public WebElement setSettingBtn;

    // @FindBy(xpath = "//div[@id='settings']//div//span[1]a")
    // public WebElement StatusOptionBtn;   // moved from GitHub

}

package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US001_CustomizePage {

    public US001_CustomizePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@class='user-status-menu-item__toggle'])//span")  ////div[@class='footer']//a//id="settings"// id="setting"
    public WebElement settingBtn;


    //@FindBy(xpath = "//a[.='Customize']")
    @FindBy(xpath = "(//div[@class='footer'])//a")
    public WebElement customizeBtn;

 //   @FindBy(xpath = "(//li)[32]")
  //  public WebElement widgetsBtn;

    @FindBy(xpath = "//li")
    public WebElement widgetsBtn;



}

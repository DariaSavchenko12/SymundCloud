package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage {

    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='app-navigation-new']")
    public WebElement newContactButton;
    @FindBy(id = "everyone")
    public WebElement allContactButton;
    @FindBy (id = "contact-fullname")
    public WebElement contactFullName;
    //@FindBy(xpath = "//div[contains(text(),'Sureyya Turkmen' )]")
    //public WebElement newContactVerifications;
    //I tried to make dynamic
    public WebElement setNewContactVerifications(String contactFullName) {
        return Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + contactFullName + "')]"));
    }

    //---2---
    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    public WebElement totalContacts;
    @FindBy (xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> contactList;
    public List<WebElement> getContactsList() {
        return contactList;
    }
    public String getTotalContacts() {
        return totalContacts.getText();
    }
    //---3----
    @FindBy (xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement clickProfilePicture;
    @FindBy (xpath = "//span[.='Choose from Files']")
    public WebElement chooseFileButton;
    @FindBy (xpath = "//tr[@data-entryname='PROFILE-Photography-112.jpeg']")
    public WebElement selectfile;
    @FindBy(xpath = "//button[@class='primary']")
    public WebElement chooseButton;

    //---4---
    @FindBy (xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[5]")
    public WebElement threeDot;
    @FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement deleteButton;
}

package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingToFavoritePage {
    public AddingToFavoritePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesButton;

    @FindBy(xpath = "(//span[.='Name'])[1]")
    public WebElement nameInList;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement favoriteButton;

    @FindBy(xpath = "//span[.='Rename']")
    public WebElement renameButton;

    @FindBy(xpath = "//input[@class='filename']")
    public WebElement inputName;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsButton;

    @FindBy(xpath = "//a[@id='comments']")
    public WebElement commentButton;

    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement commentBox;
}

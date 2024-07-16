package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityModulePage_Annia {

    // Not finished yet

    public ActivityModulePage_Annia() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/index.php/apps/activity/'])[1]")
    public WebElement activityLink;

    @FindBy(xpath = "//a[@data-navigation='all']")
    public WebElement allActivitiesLink;

    @FindBy(xpath = "//a[@data-navigation='self']")
    public WebElement byYouLink;

    @FindBy(xpath = "//a[@data-navigation='by']")
    public WebElement byOthersLink;

    @FindBy(xpath = "//a[@data-navigation='circles']")
    public WebElement circlesLink;

    @FindBy(xpath = "//a[@data-navigation='files_favorites']")
    public WebElement favoritesLink;

    @FindBy(xpath = "//a[@data-navigation='files']")
    public WebElement fileChangesLink;

    @FindBy(xpath = " //a[@data-navigation='files_sharing']")
    public WebElement fileSharesLink;

    @FindBy(xpath = " //a[@data-navigation='calendar']")
    public WebElement calendarLink;

    @FindBy(xpath = "//a[@data-navigation='calendar_todo']")
    public WebElement todosLink;

    @FindBy(xpath = " //a[@data-navigation='comments']")
    public WebElement commentsLink;


    @FindBy(xpath = " //a[@data-navigation='deck']")
    public WebElement deckLink;

    @FindBy(xpath = "(//span[@class='activitytime has-tooltip live-relative-timestamp'])[1]")
    public WebElement newestItem;

    @FindBy(xpath = "(//span[@class='activitytime has-tooltip live-relative-timestamp'])[6]")
    public WebElement middleNewestItem;

    @FindBy(xpath = "(//span[@class='activitytime has-tooltip live-relative-timestamp'])[13]")
    public WebElement oldestItem;

    @FindBy(xpath = "//div[@id='no_more_activities']")
    public WebElement noMoreEvents;


}



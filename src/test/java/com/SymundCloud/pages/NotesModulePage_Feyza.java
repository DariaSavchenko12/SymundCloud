package com.SymundCloud.pages;

import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesModulePage_Feyza extends BasePage {

    WebDriver driver;

    public NotesModulePage_Feyza() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//li[@data-id='notes'])[1]")
    public WebElement notesModule;
    @FindBy(id = "notes_new_note")
    public WebElement newNoteButton;

    //@FindBy(xpath = "//div[@class='CodeMirror-scroll']")
    @FindBy(xpath = "//pre[@role='presentation']")
    public WebElement textArea;

    @FindBy(xpath = "(//textarea)[2]")
    public WebElement textAreaInside;

    @FindBy(xpath = "//ul[@class='app-navigation__list']//li[3]//span")
    public WebElement lastNote;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[3]")
    public WebElement deleteNoteButton;

    @FindBy(xpath = "//html/body/div[3]/main/div/span/div/div/div/button")
    public WebElement rightSideThreeDots;
    @FindBy(xpath = "(//button[@class='action-button focusable'])[1]")
    public WebElement detailsButton;

    @FindBy(xpath = "//div/p[@class='app-sidebar-header__subtitle']")
    public WebElement wordsAndChars;
    @FindBy(xpath = "(//button[@class='action-button focusable'])[2]")
    public WebElement addToFavoritesButton;

    @FindBy(linkText = "Favorites")
    public WebElement favoritesButton;

    @FindBy(xpath = "(//span[@class='innernametext'])[5]")
    //(//
    public WebElement favoriteText;


    public void clickTextThreeDots(String text) {
        WebElement threeDots = Driver.getDriver().findElement(By.xpath("(//div[@id='app-navigation-vue']//ul)[1]//li//span[contains(@title,'" + (text.substring(0, 10)) + "')]/../..//button"));
        BrowserUtils.hover(threeDots);
        BrowserUtils.clickWithJS(threeDots);
    }






}

package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage_IB {
    public TalkPage_IB(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talkModule;
    @FindBy(xpath ="//button[@slot='trigger']")
    public WebElement addNewConversation;
    @FindBy(xpath = "//div[@class='set-conversation-name']/input")
    public WebElement inputConversationName;
    @FindBy(xpath = "//label[@for='checkbox']")
    public WebElement viaLinkCheckbox;
    @FindBy(xpath = "//div[@class='navigation']/button")
    public WebElement addParticipantsButton;
    @FindBy(xpath = "//span[@class='participant-row__user-name']")
    public WebElement randomUser;
    @FindBy(xpath = "//div[@class='navigation']/button[2]")
    public WebElement createConversationButton;
    @FindBy(xpath = "//div[@class='navigation']/button")
    public WebElement closeButton;
    @FindBy(xpath = "//span[normalize-space(text())='My conversation']")
    public WebElement newlyCreatedConversation;
    @FindBy(xpath = "//div[@class='trigger']/button[1]")
    public WebElement threeDotsButton;
    @FindBy(xpath = "//span[text()='Delete conversation']")
    public WebElement deleteConversationButton;
    @FindBy(xpath = "//button[@class='primary']")
    public WebElement yesDeleteConversationButton;

}

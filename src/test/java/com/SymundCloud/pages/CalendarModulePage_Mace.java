package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarModulePage_Mace {
    public CalendarModulePage_Mace() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendarModule;

    @FindBy(xpath = "(//button[contains(@aria-controls,'menu')])[1]")
    public WebElement calendarIcon;


    @FindBy(xpath = "//span[text()='Day']//ancestor::button")
    public WebElement dayIcon;

    @FindBy(xpath = "//span[text()='Week']//ancestor::button")
    public WebElement weekIcon;

    @FindBy(xpath = "//span[text()='Month']//ancestor::button")
    public WebElement monthIcon;

    @FindBy(xpath = "//div[contains(@class,'timeGridDay')]")
    public WebElement dayTableIcon;

    @FindBy(xpath = "//div[contains(@class,'timeGridWeek')]")
    public WebElement weekTableIcon;

    @FindBy(xpath = "//div[contains(@class,'dayGridMonth')]")
    public WebElement monthTableIcon;




}


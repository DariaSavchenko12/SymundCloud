package com.SymundCloud.pages;

import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsModulePage_Daria {

    public ContactsModulePage_Daria() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Contacts'][1]")
    public WebElement contactsModuleLink;


    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-add']")
    public WebElement createNewGroupIcon;

    @FindBy(xpath = "//form[@class='action-input__form']/input[2]")
    public WebElement inputBox;

    // Define WebElement for the dynamic element (span with title)
    @FindBy(xpath = "//span[contains(@class, 'app-navigation-entry__title')]")
    public WebElement dynamicElement;

    // Method to get text of the dynamic element
    private String getDynamicElementText() {
        return dynamicElement.getText().trim();
    }

    // Method to dynamically locate the element by title
    public WebElement getDynamicElementByTitle(String title) {
        String xpathExpression = "//span[@title='" + title + "' and contains(@class, 'app-navigation-entry__title')]";
        return Driver.getDriver().findElement(By.xpath(xpathExpression));


    }

    @FindBy(xpath = "//*[@id=\"new-contact-button\"]")
    public WebElement newContactButton;

    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[5]/div/div[2]/div[2]/div[1]/span/span")
    public WebElement dropDownGroupContactMenu;

    @FindBy(xpath = "//input[@placeholder ='Choose property type']")
    public WebElement propertyMenu;

    @FindBy(xpath = "//div[@title = 'Anniversary']")
    public WebElement anniversaryProperty;


    public List<WebElement> getAllProperties() {
        return Driver.getDriver().findElements(By.xpath("(//ul[@class ='multiselect__content'])[7]"));
    }


    public WebElement selectAnniversary(String property) {
        List<WebElement> anniversaryElements = getAllProperties();
        for (WebElement element : anniversaryElements) {
            if (element.getText().equalsIgnoreCase(property)) {
                element.click();

            }
        }
        throw new IllegalArgumentException("Anniversary not found in the list: " + property);

    }

    @FindBy(xpath = "//input[@name = 'date']")
    public WebElement anniversaryInputDate;

    @FindBy(xpath = "(//button[@type = 'button'])[8]")
    public WebElement OkButton;

    @FindBy(xpath = "(//ul[@class ='multiselect__content'])[7]")
    public WebElement unorderedList;


    public WebElement selectAllProperties(String property) {

        List<WebElement> listElements = unorderedList.findElements(By.tagName("li"));
        System.out.println(property);
        for (WebElement element : listElements) {
            System.out.println("element = " + element.getAttribute("title") + ", property " + property);
            if (element.getText().equalsIgnoreCase(property)) {
                System.out.println("Hello");
                BrowserUtils.sleep(10);
                element.click();
                return element;

            }

        }


        return null;

    }
}










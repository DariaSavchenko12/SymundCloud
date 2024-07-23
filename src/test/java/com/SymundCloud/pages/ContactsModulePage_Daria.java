package com.SymundCloud.pages;

import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
    public WebElement propertyDropDown;

    @FindBy(xpath = "//div[@title = 'Anniversary']")
    public WebElement anniversaryProperty;


//    public List<WebElement> getAllProperties() {
//        return Driver.getDriver().findElements(By.xpath("(//ul[@class ='multiselect__content'])[7]"));
//    }
//
//
//    public WebElement selectAnniversary(String property) {
//        List<WebElement> anniversaryElements = getAllProperties();
//        for (WebElement element : anniversaryElements) {
//            if (element.getText().equalsIgnoreCase(property)) {
//                element.click();
//
//            }
//        }
//        throw new IllegalArgumentException("Anniversary not found in the list: " + property);
//
//    }


    @FindBy(xpath = "(//ul[@class ='multiselect__content'])[7]")
    public WebElement unorderedList;


    public WebElement selectAllProperties(String property) {

        List<WebElement> listElements = unorderedList.findElements(By.tagName("div"));
        System.out.println(property);
        for (WebElement element : listElements) {
            System.out.println("element = " + element.getAttribute("title") + ", property " + property);
            if (element.getAttribute("title").equalsIgnoreCase(property)) {
                System.out.println("Hello");
                BrowserUtils.sleep(2);
                element.click();
                return element;

            }

        }
        throw new IllegalArgumentException("Anniversary not found in the list: " + property);
//        return null;

    }

//    @FindBy(tagName = "li")
//    public WebElement listElements;


    @FindBy(xpath = "//div[@class ='property__value mx-datepicker']")
    public WebElement anniversaryInputBox;

    @FindBy(xpath = "//table")
    public WebElement calendarTable;

    public WebElement selectAllDates(String data) {
        data = dataConverter(data);
      //  System.out.println(data);


        List<WebElement> listElements = calendarTable.findElements(By.tagName("td"));
        System.out.println("!" + data + "!");
        for (WebElement element : listElements) {
            System.out.println("element = " + element.getAttribute("title") + ", property " + data);
            if (element.getAttribute("title").equalsIgnoreCase(data)) {
                System.out.println("Data");
                BrowserUtils.sleep(2);
                element.click();
                return element;

            }

        }


        return null;

    }
    public static String dataConverter(String data) {

        // String data = "";
        // 2024-07-21 expected format
        // August 21, 2024 actual format

        String month = data.substring(0, 3).trim().toLowerCase();
        String day = data.substring(data.indexOf(' '), data.indexOf(',')).trim();
        String year = data.substring(data.indexOf(',')+ 1).trim();

        switch (month){
            case "jan":
                month = "01";
                break;
            case "feb":
                month = "02";
                break;
            case "mar":
                month = "03";
                break;
            case "apr":
                month = "04";
                break;
            case "may":
                month = "05";
                break;
            case "jun":
                month = "06";
                break;
            case "jul":
                month = "07";
                break;
            case "aug":
                month = "08";
                break;
            case "sep":
                month = "09";
                break;
            case "oct":
                month = "10";
                break;
            case "nov":
                month = "11";
                break;
            case "dec":
                month = "12";
                break;
            default:
                month = "unknown";


        }

        // System.out.printf("year is %s month is %s, day is %s",year, month, day);



        return  year + "-" + month + "-" + day;



    }





}















package com.SymundCloud.pages;

import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AnniversaryPage_Daria {


    public AnniversaryPage_Daria() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    public void enterAnniversaryDate(String date) {
//        String[] parts = date.split("/");
//
//        WebElement monthInput = Driver.getDriver().findElement(By.xpath("//button[@class ='mx-btn mx-btn-text mx-btn-current-month']"));
//        monthInput.sendKeys(parts[0]);
//
//        WebElement dayInput = Driver.getDriver().findElement(By.xpath(".//tbody//td[@class ='cell']"));
//        dayInput.sendKeys(parts[1]);
//
//
//        WebElement yearInput = Driver.getDriver().findElement(By.xpath("//button[@class ='mx-btn mx-btn-text mx-btn-current-year']"));
//        yearInput.sendKeys(parts[2]);
//    }


    @FindBy(xpath = "(//button[@type = 'button'])[8]")
    public WebElement OkButton;


    @FindBy(xpath = "(//table[@class ='mx-table mx-table-date']//tbody//tr)[1]")
    public WebElement calendar;

//    public WebElement selectAllDays(String data) {
//
//        List<WebElement> listElements = calendar.findElements(By.tagName("td"));
//        System.out.println(data);
//        for (WebElement element : listElements) {
//            System.out.println("element = " + element.getAttribute("title") + ", property " + data);
//            if (element.getText().equalsIgnoreCase(data)) {
//                System.out.println("Hello");
//                BrowserUtils.sleep(2);
//                element.click();
//                return element;
//
//            }
//
//        }
//
//
//        return null;
//
//    }




}

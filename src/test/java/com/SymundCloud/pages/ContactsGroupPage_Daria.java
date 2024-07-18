package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ContactsGroupPage_Daria {

    public ContactsGroupPage_Daria() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public List<String> getAllAvailableGroups() {

        List<String> groupNames = new ArrayList<>();

        List<WebElement> groupElements = Driver.getDriver().findElements(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/div[5]/div/div[2]/div[2]/div[1]"));
        for (WebElement element : groupElements) {
            groupNames.add(element.getText().trim());
        }
        return groupNames;
    }
}

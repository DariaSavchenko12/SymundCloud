package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AnniversaryPage_Daria {

    public AnniversaryPage_Daria(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void enterAnniversaryDate(String date) {
        String[] parts = date.split("/");

        WebElement dayInput = Driver.getDriver().findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/div[4]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[2]"));
        dayInput.sendKeys(parts[0]);

        WebElement monthInput = Driver.getDriver().findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/div[4]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/span/span[1]"));
        monthInput.sendKeys(parts[1]);

        WebElement yearInput = Driver.getDriver().findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/div[4]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/span/button"));
        yearInput.sendKeys(parts[2]);
    }
}

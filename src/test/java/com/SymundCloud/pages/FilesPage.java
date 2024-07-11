package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {

    public FilesPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // to add new file/folder
    public void selectAddOption (String optionName ){
       WebElement option = Driver.getDriver().findElement(By.xpath("//span[.='" + optionName + "']"));
       option.click();
    }

    // verifies if file exist in the list
    public void verifyFileExistence (String fileName) {

        List<WebElement> allUploadedFiles = Driver.getDriver().findElements(By.cssSelector("span.innernametext"));
        boolean result = false;
        for (WebElement eachUploadedFile : allUploadedFiles) {
            if (eachUploadedFile.getText().equals(fileName));
            result=true;
        }
        Assert.assertTrue(result);

    }




    @FindBy (css = "a.button.new")
    public WebElement addModule;

    @FindBy (xpath = "//span[.='Upload file']")
    public WebElement uploadFileOption;

    @FindBy (id = "view12-input-folder")
    public WebElement folderNameInput;

    @FindBy (xpath = "(//input[@type='submit'])[1]")
    public WebElement folderInputArrow;


    @FindBy (xpath = "(//a[@data-action='menu'])[1]")
    public WebElement threeDotMenu;

    @FindBy (xpath = "//a[@data-action='Delete']")
    public WebElement deleteFolderOption;




    @FindBy (xpath = "//span[@class='info']")
    public WebElement allFilesSummary;


    @FindBy (xpath = "//span[@class='dirinfo']")
    public WebElement folderSummary;

    @FindBy (xpath = "//span[@class='fileinfo']")
    public WebElement filesSummary;

}

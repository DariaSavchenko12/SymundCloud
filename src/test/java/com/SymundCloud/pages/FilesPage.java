package com.SymundCloud.pages;

import com.SymundCloud.utilities.BrowserUtils;
import com.SymundCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
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
             if (eachUploadedFile.getText().equals(fileName)){
                 result=true;
             break; // exits the loop once matching file is found
             }
        }
     //   Driver.getDriver().navigate().refresh();
        Assert.assertTrue("File not found: " + fileName,result);
    }


    @FindBy(css = "#file_upload_start")
    public WebElement hiddenUploadFile;

    @FindBy(css = "#uploadprogressbar")
    public WebElement progressbar;

    public void waitUntilProgressbarDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(progressbar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // UPLOAD FILE METHOD
    public void uploadFile (String fileName){
        addModule.click();
        //uploadFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/uploadedFiles/"+fileName);
        BrowserUtils.waitFor(1);
       // uploadFileOption.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(hiddenUploadFile,System.getProperty("user.dir") + "/src/test/resources/uploadedFiles/"+fileName);
        hiddenUploadFile.sendKeys((System.getProperty("user.dir") + "/src/test/resources/uploadedFiles/"+fileName));
        waitUntilProgressbarDisappear();
        BrowserUtils.waitFor(3);
    }



    @FindBy (css = "a.button.new")
    public WebElement addModule;

    @FindBy (id = "view12-input-folder")
    public WebElement folderNameInput;

    @FindBy (xpath = "(//span[@class='innernametext'])[1]")
    public WebElement firstFileOnTheList;

    @FindBy (xpath = "(//a[@data-action='menu'])[1]")
    public WebElement threeDotMenu;

    @FindBy (xpath = "//a[@data-action='Delete']")
    public WebElement deleteFolderOption;




    // old method, will delete soon
    /*
    public void deletingFiles0 (String fileName){
       List<WebElement> allThreeDots = Driver.getDriver().findElements(By.xpath("//span[.='" + fileName + "']/../span/a[2]"));

        for (WebElement eachThreeDot : allThreeDots) {
            if (eachThreeDot.toString().contains(fileName)){
                eachThreeDot.click();
            }
        }
        deleteFolderOption.click();

    }
     */

    // DYNAMIC METHOD TO DELETE FILES BASED ON THEIR NAME
    public void deletingFiles (String fileName){
        WebElement threeDotMenu = Driver.getDriver().findElement(By.xpath("//span[.='" + fileName + "']/../span/a[2]"));
        threeDotMenu.click();
        deleteFolderOption.click();
    }



}

package com.SymundCloud.pages;

import com.SymundCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {

    public FilesPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // MOVED TO BASE PAGE FOR EVERYBODY TO USE
  /*
       public void clickModule (String moduleName){
       WebElement module = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='" + moduleName + "'])[1]"));
       module.click();
    }

   */

    // to add new file/folder
    public void selectAddOption (String optionName ){
       WebElement option = Driver.getDriver().findElement(By.xpath("//span[.='" + optionName + "']"));
      // option.click();
    }

    // NOT COMPLETED
    public void setAddModuleOptions (String optionName) {
        List<WebElement> addModuleOptions = Driver.getDriver().findElements(By.xpath("//span[.='" + optionName + "']"));
        for (WebElement eachAddModuleOption : addModuleOptions) {
            if (optionName.equals(eachAddModuleOption)){

            }
        }

    }



    @FindBy (css = "a.button.new")
    public WebElement addModule;

    @FindBy (xpath = "(//a[@data-action='menu'])[1]")
    public WebElement threeDotMenu;

    @FindBy (xpath = "//a[@data-action='Delete']")
    public WebElement deleteFolderOption;

    @FindBy (xpath = "(//div[@class='thumbnail'])[1]")
    public WebElement firstFileInTheList;




    @FindBy (xpath = "//span[@class='info']")
    public WebElement allFilesSummary;


    @FindBy (xpath = "//span[@class='dirinfo']")
    public WebElement folderSummary;

    @FindBy (xpath = "//span[@class='fileinfo']")
    public WebElement filesSummary;

}

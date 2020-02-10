package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {

    public FilesPage (){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//*[@id='app-content-files']/div/div[2]/a")
    public WebElement add;

    @FindBy(id ="view29-input-folder")
    public WebElement fileName;

    @FindBy(className = "icon-confirm")
    public WebElement submit;
    public void plus(String file){
        add.click();
        BrowserUtils.waitFor(3);
        List<WebElement> list= Driver.get().findElements(By.xpath("//div[contains(@class,'newFileMenu ')]/ul//li//a"));
        list.get(0).click();
        BrowserUtils.waitFor(3);
        fileName.sendKeys(file);
        BrowserUtils.waitFor(3);
        submit.click();
        BrowserUtils.waitFor(3);
    }


}
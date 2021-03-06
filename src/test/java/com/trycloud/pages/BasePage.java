package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id='appmenu']/li[1]/a")
    public WebElement filesLink;
    @FindBy(xpath = "//*[@id='appmenu']/li[2]/a")
    public WebElement activityLink;
    @FindBy(xpath = "//*[@id='appmenu']/li[3]/a")
    public WebElement galleryLink;
    @FindBy(xpath = "//*[@id='appmenu']/li[4]/a")
    public WebElement talkLink;
    @FindBy(xpath = "//*[@id='appmenu']/li[5]/a")
    public WebElement calendarLink;
    @FindBy(xpath = "//*[@id='appmenu']/li[6]/a")
    public WebElement deckLink;
    @FindBy(xpath = "//*[@id='appmenu']/li[7]/a")
    public WebElement announceLink;

    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendar;

    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);
        }
    }
}

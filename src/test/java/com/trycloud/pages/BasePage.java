package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
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


}

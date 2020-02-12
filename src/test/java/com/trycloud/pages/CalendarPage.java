package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {
    public CalendarPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "new-calendar-button")
    public WebElement newCalenderButton;

    @FindBy(xpath = "(//input)[4]")
    public WebElement sendNameButton;

    @FindBy (css = "a.action.permanent.ng-binding")
    public List<WebElement> EventsList;

    @FindBy(xpath = "(//a[@class='action permanent ng-binding'])[3]")
    public WebElement Event;

    @FindBy(css = "button.button.last.ng-pristine")
    public WebElement monthIcon;

    @FindBy(css = "button.button.middle.ng-pristine")
    public WebElement weekIcon;

    @FindBy(css = "button.button.first.ng-pristine")
    public WebElement dayIcon;

}

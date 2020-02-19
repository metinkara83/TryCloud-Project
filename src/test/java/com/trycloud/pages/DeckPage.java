package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage {
    public DeckPage(){
        PageFactory.initElements(Driver.get(), this);}

  @FindBy(css = ".board-create.ng-scope>td~td")
    public WebElement createNewBoard;

  @FindBy(xpath = "//input[@placeholder='New board title']")
    public WebElement newBoardTitle;

  @FindBy(xpath = "//form[@ng-submit='boardCreate()']/div/div[3]")
    public WebElement chooseGreen;

  @FindBy(xpath = "//*[@title='Create board']")
    public WebElement confirmCreate;

  @FindBy(xpath = "//td[contains(div,'Cybersharks')]")
    public WebElement cyberSharks;



}

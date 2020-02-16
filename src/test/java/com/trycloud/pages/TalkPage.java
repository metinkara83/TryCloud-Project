package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage extends BasePage {
    public TalkPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h2")
    public WebElement joinConversation;

// 2. msg

}

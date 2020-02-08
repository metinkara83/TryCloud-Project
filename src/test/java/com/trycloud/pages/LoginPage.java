package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){PageFactory.initElements(Driver.get(), this);}

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    public void login(String usernameStr, String passwordStr){

        username.sendKeys(usernameStr);
        password.sendKeys(passwordStr+ Keys.ENTER);

    }



}

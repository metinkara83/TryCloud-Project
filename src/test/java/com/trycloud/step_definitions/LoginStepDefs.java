package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("User should navigate the website")
    public void user_should_navigate_the_website() {
    Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("User use the valid credentials")
    public void user_use_the_valid_credentials() {
        System.out.println("true = " + true);
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        new LoginPage().login(username,password);
    }

    @Then("User should see the following tittle{string}")
    public void user_should_see_the_following_tittle(String expectedTitle) {

        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle  );
    }



}

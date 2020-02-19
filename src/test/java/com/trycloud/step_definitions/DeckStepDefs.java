package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DeckPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DeckStepDefs {
    DeckPage deckPage = new DeckPage();
    @Given("User should navigate to {string} page")
    public void user_should_navigate_to_page(String string) {
        new BasePage().deckLink.click();
    }

    @When("User clicks the create new board text")
    public void user_clicks_the_create_new_board_text() throws Exception {

        WebDriverWait wait = new WebDriverWait(Driver.get(), 3);
        wait.until(ExpectedConditions.elementToBeClickable(deckPage.createNewBoard));
         deckPage.createNewBoard.click();

    }

    @Then("User enters a title in the box")
    public void user_enters_a_title_in_the_box() throws Exception {
       deckPage.newBoardTitle.sendKeys("Cybersharks");

    }

    @Then("User selects green color and click the ok sign")
    public void user_selects_green_color_and_click_the_ok_sign() throws Exception{
        deckPage.chooseGreen.click();
        deckPage.confirmCreate.click();

        Assert.assertEquals("Cybersharks",deckPage.cyberSharks.getText());
    }

}

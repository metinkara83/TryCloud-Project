package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.CalendarPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class CalendarStepDefs {

    String nameOfEvent;

    @Given("User should navigate to {string}page")
    public void user_should_navigate_to_page(String string) {
       new BasePage().calendar.click();
    }


    @When("User wants to create an event presses newCalender Button")
    public void user_wants_to_create_an_event_presses_newCalender_Button() {
        new CalendarPage().newCalenderButton.click();
    }

    @Then("User gives name for the event and submits")
    public void user_gives_name_for_the_event_and_submits() {

        Random rn=new Random();
        int n = rn.nextInt(50);
        nameOfEvent="Demo"+n;
        new CalendarPage().sendNameButton.sendKeys(nameOfEvent+ Keys.ENTER);
    }

    @Then("new event appears on the page")
    public void new_event_appears_on_the_page() {
        BrowserUtils.waitFor(3);

        CalendarPage calendarPage=new CalendarPage();
        List<String> expectedEventList=BrowserUtils.getElementsText(calendarPage.EventsList);
        System.out.println("expectedEventList = " + expectedEventList);

        String expectedName=nameOfEvent;
        String actualName=expectedEventList.get(expectedEventList.size()-1);
        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);

        Assert.assertEquals(actualName,expectedName);
    }

}

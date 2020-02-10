package com.trycloud.step_definitions;

import com.trycloud.pages.TalkPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TalkPageStepDefs {
    @Given("user connect to talk page")
    public void user_connect_to_talk_page() {
        TalkPage talkPage=new TalkPage();
        talkPage.talkLink.click();
    }

    @Then("verify that Join a conversation or start a new one message shows")
    public void verify_that_Join_a_conversation_or_start_a_new_one_message_shows() {
        String expectedMessage="Join a conversation or start a new one";
        TalkPage talkPage=new TalkPage();
        Assert.assertEquals(talkPage.joinConversation.getText(),expectedMessage);
    }
}

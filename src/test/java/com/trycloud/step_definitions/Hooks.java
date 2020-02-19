package com.trycloud.step_definitions;

import com.trycloud.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void start(){
        System.out.println("Connected to Database");
        Driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void connection(){
        System.out.println("Connected to Database");
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @After //from Cucumber Library
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[]screenshot= ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }
}

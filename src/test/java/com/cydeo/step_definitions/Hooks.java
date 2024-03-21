package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import @Before annotation from io.cucumber.java NOT junit
    @Before
    public void setUpMethod(){
        System.out.println("RUNNING SCENARIO...");
    }

    @After
   public void tearDownMethod(Scenario scenario){

        if (scenario.isFailed()) {

            System.out.println(scenario.getName() + " has failed and screenshot taken");

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        System.out.println("SCENARIO: "+ scenario.getName() + " = DONE!)");
        Driver.closeDriver();
   }

}

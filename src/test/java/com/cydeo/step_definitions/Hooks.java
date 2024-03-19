package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    //import @Before annotation from io.cucumber.java NOT junit
    @Before
    public void setUpMethod(){
        System.out.println("@Before runs before each scenario");
    }

    @After
   public void tearDownMethod(Scenario scenario){

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


       System.out.println("@After runs after each scenario");
        Driver.closeDriver();
   }

   @BeforeStep
   public void setUpStep(){
       System.out.println("@BeforeStep runs before each step");
   }


   @AfterStep
    public void teardownStep(){
       System.out.println("@AfterStep runs after each step");
   }


}

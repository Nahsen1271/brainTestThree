package com.unicoGames.brainTest3.runners;


import com.unicoGames.brainTest3.utilities.DriverManager;
import com.unicoGames.brainTest3.utilities.GlobalParams;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import com.unicoGames.brainTest3.utilities.ServerManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/html-reports/cucumber.html",},
        features = "src/test/resources/features",
        glue = "com/unicoGames/brainTest3/stepDefinitions",
        tags = "@nahsen",
        dryRun = false


)
public class RunnersBT3 extends AbstractTestNGCucumberTests {

    @Parameters({"platformName", "driverType"})
    @BeforeClass
    public void setUp(@Optional("Android") String platformName, @Optional("appiumAndAltDriver") String driverType) throws IOException, InterruptedException {//, @Optional("googleplay") String marketName) throws IOException, InterruptedException { //, @Optional("DE21D") String environment) {
      //  GlobalParams.setMarketName(marketName);
       // GlobalParams.setEnvironment(environment);
        //  ReusableMethods.clientLoginRequest();
       // System.out.println(GlobalParams.getActiveOffers());
        if (driverType.equals("appiumAndAltDriver")) {
            //ReusableMethods.installAndRunZulaMobile();
           //ReusableMethods.runBrainTest3();

            new DriverManager().initializeDriver(platformName, driverType);
      } else {
          new ServerManager().startServer();
          new DriverManager().initializeDriver(platformName, driverType);
       }
    }
}

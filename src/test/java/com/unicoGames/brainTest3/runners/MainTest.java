package com.unicoGames.brainTest3.runners;


import com.unicoGames.brainTest3.utilities.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;


@CucumberOptions(
            plugin = {"pretty",
                    "html:target/html-reports/cucumber.html",},
            features = "src/test/resources/features",
            glue = "stepDefinitions",
            tags = "@wip345",
            dryRun = false,
            publish = false
    )
    public class MainTest extends AbstractTestNGCucumberTests {


        @Parameters({"platformName", "driverType", "marketName", "environment"})
        @BeforeClass
        public void setUp(@Optional("Android") String platformName, @Optional("altUnity") String driverType, @Optional("googleplay") String marketName, @Optional("DE21D") String environment) throws MalformedURLException {
            GlobalParams.setMarketName(marketName);
            GlobalParams.setEnvironment(environment);
          //  ReusableMethods.clientLoginRequest();
            System.out.println(GlobalParams.getActiveOffers());
            if (driverType.equals("altUnity")) {
                //ReusableMethods.installAndRunZulaMobile();
                new DriverManager().initializeDriver(platformName, driverType);
            } else {
                new ServerManager().startServer();
                new DriverManager().initializeDriver(platformName, driverType);
            }
        }
    }

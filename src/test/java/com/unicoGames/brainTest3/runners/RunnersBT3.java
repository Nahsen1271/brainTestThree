package com.unicoGames.brainTest3.runners;


import com.unicoGames.brainTest3.utilities.DriverManager;
import com.unicoGames.brainTest3.utilities.GlobalParams;
import com.unicoGames.brainTest3.utilities.ServerManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

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
    public void setUp(@Optional("Android") String platformName, @Optional("altDriver") String driverType) { //@Optional("googleplay") String marketName, @Optional("DE21D") String environment) {
       // GlobalParams.setMarketName(marketName);
       // GlobalParams.setEnvironment(environment);
        //  ReusableMethods.clientLoginRequest();
       // System.out.println(GlobalParams.getActiveOffers());
        if (driverType.equals("altDriver")) {
            //ReusableMethods.installAndRunZulaMobile();
            new DriverManager().initializeDriver(platformName, driverType);
        } else {
            new ServerManager().startServer();
            new DriverManager().initializeDriver(platformName, driverType);
        }
    }
}

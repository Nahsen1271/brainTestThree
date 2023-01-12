package com.unicoGames.brainTest3.runners;
import com.unicoGames.brainTest3.utilities.DriverManager;
import com.unicoGames.brainTest3.utilities.GlobalParams;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import com.unicoGames.brainTest3.utilities.ServerManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


@CucumberOptions(
        plugin = {"pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/FailedReRun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features="src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@nahsen",
        dryRun = false,
       publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Parameters({"platformName","driverType","marketName","environment"})
    @BeforeClass
    public void setUp(@Optional("Android") String platformName, @Optional("altUnity") String driverType, @Optional("googleplay") String marketName,@Optional("DE21D") String environment) throws Exception {
        GlobalParams.setMarketName(marketName);
        GlobalParams.setEnvironment(environment);
        GlobalParams.setSystemOS(System.getProperty("os.name"));
        ReusableMethods.uninstallZulaMobile();
        if (driverType.equals("altUnity")){
            ReusableMethods.installAndRunZulaMobile();
            new DriverManager().initializeDriver(platformName,driverType);
        }else {
            new ServerManager().startServer();
            new DriverManager().initializeDriver(platformName,driverType);
        }
    }

//    @AfterClass
//    public void tearDown() throws Exception{
//        ReusableMethods.unlinkAccountFromDevice();
//        ReusableMethods.killZulaMobile();
//        ReusableMethods.uninstallZulaMobile();
//    }
}

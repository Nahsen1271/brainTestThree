package com.unicoGames.brainTest3.utilities;

import com.alttester.AltDriver;
import com.alttester.AltPortForwarding;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DriverManager {
    private static Logger LOG = LogManager.getLogger("DriverManager.class");
    private static ThreadLocal<AltDriver> altDriver = new ThreadLocal<>();
    private static AppiumDriver appiumDriver;

    public AltDriver getAltDriver() {
        return altDriver.get();
    }

    public void initializeDriver(String platformName,String driverType){
        AltDriver altDriver = null;

        if(appiumDriver==null && driverType.equals("appiumAndAltUnity")) {
            LOG.info("Initializing appium & altDriver");
            switch (platformName){
                case "Android":
                //    appiumDriver = new AndroidDriver<MobileElement>(new ServerManager().getServer().getUrl(),new CapabilitiesManager().getCaps(platformName));
                    AltPortForwarding.forwardAndroid();
                    altDriver = new AltDriver();
                    break;
                case "iOS":
            }
            LOG.info("Driver is initialized with AppiumDriver");
            this.altDriver.set(altDriver);

        } else if(driverType.equals("altDriver")){
            LOG.info("Initializing driver with altDriver");
            switch (platformName){
                case "Android":
                    AltPortForwarding.forwardAndroid();
                    altDriver = new AltDriver("127.0.0.1",13000,true);
                    break;
                case "iOS":
            }
            LOG.info("Driver is initialized with AltDriver");
            this.altDriver.set(altDriver);
        }
    }
}

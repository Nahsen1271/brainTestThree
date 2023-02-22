package com.unicoGames.brainTest3.utilities;

import com.alttester.AltDriver;
import com.alttester.AltPortForwarding;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {
    private static Logger LOG = LogManager.getLogger("DriverManager.class");
    private static ThreadLocal<AltDriver> altDriver = new ThreadLocal<>();
    public static AppiumDriver appiumDriver;

    public AltDriver getAltDriver() {
        return altDriver.get();
    }


    public void initializeDriver(String platformName,String driverType) throws MalformedURLException {
        AltDriver altDriver = null;

        if(appiumDriver==null && driverType.equals("appiumAndAltDriver")) {
            LOG.info("Initializing appium & altDriver");
            switch (platformName){
                case "Android":
                    appiumDriver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),new CapabilitiesManager().getCaps(platformName));
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
                    altDriver = new AltDriver();
                    break;
                case "iOS":
            }
            LOG.info("Driver is initialized with AltDriver");
            this.altDriver.set(altDriver);
        }
    }
}

package com.unicoGames.brainTest3.utilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesManager {

    private static Logger LOG = LogManager.getLogger("CapabilitiesManager.class");
    public DesiredCapabilities getCaps(String platformName){

        try{
            LOG.info("getting capabilities");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

            switch(platformName){
                case "Android":
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SNE LX1");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
                    desiredCapabilities.setCapability(MobileCapabilityType.APP, ConfigReader.getProperty("appPath"));
                    desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                    desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25000");
                    desiredCapabilities.setCapability("autoGrantPermissions", true);
                    //        desiredCapabilities.setCapability("appPackage","com.LokumGames.ZulaMobile");
//        desiredCapabilities.setCapability("appActivity","com.google.firebase.MessagingUnityPlayerActivity");
                    break;
                case "iOS":

                    break;
            }
            return desiredCapabilities;
        } catch(Exception e){
            e.printStackTrace();
            LOG.fatal("Failed to load capabilities. ABORT!!" + e.toString());
            throw e;
        }

    }

}

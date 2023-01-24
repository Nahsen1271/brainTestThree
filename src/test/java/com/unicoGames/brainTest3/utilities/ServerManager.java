package com.unicoGames.brainTest3.utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class ServerManager {

    private static Logger LOG = LogManager.getLogger("ServerManager.class");
    private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
    public AppiumDriverLocalService getServer(){
        return server.get();
    }

    public void startServer(){
        LOG.info("starting appium server");
        AppiumDriverLocalService server = MacGetAppiumService();
        server.start();
        if(server == null || !server.isRunning()){
            LOG.fatal("Appium server not started. ABORT!!!");
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!!!");
        }
//        server.clearOutPutStreams();
        this.server.set(server);
        LOG.info("Appium server started");
    }

    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }

    public AppiumDriverLocalService MacGetAppiumService() {

        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("/usr/local/bin/node"))
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withLogFile(new File("MacOS12.6" + "_"
                        + "MacBookAir" + File.separator + "Server.log")));
    }

}

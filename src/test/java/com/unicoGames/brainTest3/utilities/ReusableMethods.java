package com.unicoGames.brainTest3.utilities;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class ReusableMethods //extends CMSBasePage
         {
    private static final Logger LOG = LogManager.getLogger(ReusableMethods.class);


    /**
     * Returns apkPath according to systemOS
     * */
    public static String apkPath(){
        if (GlobalParams.getMarketName().equalsIgnoreCase("googleplay")) {
            return System.getProperty("user.dir") + File.separator + "androidBuild" + File.separator + "googlePlay-0.29.1.336.apk";
        }else{
            return System.getProperty("user.dir") + File.separator + "androidBuild" + File.separator + "cafeBazaar-0.29.1.338.apk";
        }
    }
    /**
     * Runs zulaMobile with adbCommand
     * */
    public static void runBrainTest3() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
//        if (GlobalParams.getSystemOS().contains("Windows")){
//            if(GlobalParams.getMarketName().equalsIgnoreCase("googleplay")){
                processBuilder.command("cmd.exe","/c", ConfigReader.getProperty("runCommandGooglePlay"));
//            }else{
//                processBuilder.command("cmd.exe","/c", ConfigReader.getProperty("runCommandCafebazaar"));
//            }
//        } else{
//            if(GlobalParams.getMarketName().equalsIgnoreCase("googleplay")){
//                processBuilder.command("bash", "-c", ConfigReader.getProperty("runCommandGooglePlay"));
//            }else{
//                processBuilder.command("bash", "-c", ConfigReader.getProperty("runCommandCafebazaar"));
//            }
//        }
        Process process = processBuilder.start();
        process.waitFor();
    }
    /**
     * Installs & Runs zulaMobile at the beginning of the test
     * */
    public static void installAndRunZulaMobile() throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (GlobalParams.getSystemOS().contains("Windows")){
            processBuilder.command("cmd.exe","/c", ConfigReader.getProperty("installCommand").concat(" " + apkPath()));
        }else{
            processBuilder.command("bash", "-c", ConfigReader.getProperty("installCommand").concat(" " + apkPath()));
        }
        Process process = processBuilder.start();
        process.waitFor();
        //runZulaMobile();
    }

    /**
     * Uninstalls zulaMobile with adb command
     * */
    public static void uninstallZulaMobile() throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (GlobalParams.getSystemOS().contains("Windows")){
            if(GlobalParams.getMarketName().equalsIgnoreCase("googleplay")){
                processBuilder.command("cmd.exe","/c", ConfigReader.getProperty("uninstallCommandGooglePlay"));
            }else{
                processBuilder.command("cmd.exe","/c", ConfigReader.getProperty("uninstallCommandCafebazaar"));
            }
        } else{
            if(GlobalParams.getMarketName().equalsIgnoreCase("googleplay")){
                processBuilder.command("bash","-c", ConfigReader.getProperty("uninstallCommandGooglePlay"));
            }else{
                processBuilder.command("bash","-c", ConfigReader.getProperty("uninstallCommandCafebazaar"));
            }
        }
        Process process = processBuilder.start();
        process.waitFor();
        //runZulaMobile();
    }
    /**
     * Force closes zulaMobile with adb command
     * */
    public static void killBrainTest3() throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder();
//        if(GlobalParams.getSystemOS().contains("Windows")){
//            if(GlobalParams.getMarketName().equalsIgnoreCase("googleplay")){
                processBuilder.command("cmd.exe","/c", ConfigReader.getProperty("killCommandGooglePlay"));
//            }else{
//                processBuilder.command("cmd.exe","/c", ConfigReader.getProperty("killCommandCafebazaar"));
//            }
//        }else{
//            if(GlobalParams.getMarketName().equalsIgnoreCase("googleplay")){
//                processBuilder.command("bash","-c", ConfigReader.getProperty("killCommandGooglePlay"));
//            }else{
//                processBuilder.command("bash","-c", ConfigReader.getProperty("killCommandCafebazaar"));
//            }
//        }
        Process process = processBuilder.start();
        process.waitFor();
    }

//    /**
//     * Generic function, checks if player is already logged in as guest
//     * */
//    public static Boolean checkguestLoginCompleted(){
//        AllPages allPages = new AllPages();
//        boolean flag = true;
//        try{
//            allPages.landingPage().guestButton().getText();
//        }catch (Exception e){
//            flag = false;
//        }
//        return flag;
//    }
//    /**
//     * Helps to skip initial launch phase and login as guest
//     * */
//    public static void skipInitialLaunchAndLoginAsGuest(){
//        AllPages allPages = new AllPages();
//        allPages.landingPage().acceptButton().tap();
//        allPages.landingPage().guestButton().tap();
//        allPages.landingPage().continueButton().tap();
//        allPages.lobbyPage().dailyRewardCloseButton().tap();
//    }
//    /**
//     * Changes device language to English. Use it for cafebazaar builds
//     * */
//    public static void changeLanguageToEnglish(){
//        AllPages allPages = new AllPages();
//        allPages.lobbyPage().settingsButton().tap();
//        allPages.settingsPage().changeLanguageToEnglish();
//        waitForSecond(4);
//    }
//    /**
//     * Generic logout function
//     * */
//    public static void logOutGame(){
//        AllPages allPages = new AllPages();
//        allPages.lobbyPage().settingsButton().tap();
//        allPages.settingsPage().accountButton().tap();
//        allPages.settingsPage().logOutButton().tap();
//        allPages.settingsPage().okButtonForLogOut().tap();
//        try {
//            allPages.landingPage().acceptButton().tap();
//        }catch (Exception e){
//            LOG.info("Skipping accept button...");
//        }
//    }
    /**
     * Static wait function
     * */
    public static void waitForSecond(int second) {
        int sec = 1000*second;
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    /**
//     * Gets player ID from client and define it as globalParam
//     * */
//    public static void getAndWritePlayerID(){
//        AllPages pages = new AllPages();
//        pages.lobbyPage().profileButton().tap();
//        waitForSecond(1);
//        GlobalParams.setPlayerID(pages.profilePage().playerIDValueText().getText());
//        pages.profilePage().profilePageBackButton().tap();
//    }
//    /**
//     * Generic closePopup function
//     * */
//    public static void closePopUp(){
//        AllPages allPages = new AllPages();
//        allPages.lobbyPage().closePopUpButton().tap();
//    }
//
//    /**
//     * Generic back to Lobby function
//     * */
//    public static void backToLobby(){
//        LOG.info("Navigating back to Main Lobby");
//        AllPages allPages = new AllPages();
//        allPages.inventoryPage().backButtonToLobby().tap();
//        LOG.info("Main Lobby is Loaded");
//    }
//
//    /**
//     * Generates playfabSessionToken
//     * @return playfabToken
//     * */
//    public static String getPlayFabToken() {
//        LOG.info("Creating PlayFab Token");
//        String playfabToken =
//                given().
//                        spec(playFabReqSpecForJson().pathParam("resource","login")).
//                        body(PlayFabTokenBuilder.getPlayFabToken()).
//                when().
//                        post("{resource}").
//                        getHeader("Set-Cookie");
//        LOG.info("PlayFab Token is Created");
//        return playfabToken;
//    }
//    /**
//     * Unlinks account from Device ID
//     * */
//    public static void unlinkAccountFromDevice() {
//        Response response =
//                given().
//                        spec(playFabReqSpecForXml().
//                                pathParams("env", "DE21D",
//                                        "resource1", "players",
//                                        "playerID", GlobalParams.getPlayerID(),
//                                        "resource2", "account")).
//                        header("Cookie", getPlayFabToken()).
//                        formParams(PlayFabUnlinkAccountData.formData()).relaxedHTTPSValidation().
//                when().
//                        delete("{env}/{resource1}/{playerID}/{resource2}");
//        response.
//                then().
//                statusCode(204);
//    }
//    /**
//     * Sets player level to 21
//     * */
//    public static void setUserLevelTo21() {
//        LOG.info("Setting Player Level...");
//        Response response =
//                given().
//                        spec(cmsRequestSpec().
//                                pathParams("playerID", GlobalParams.getPlayerID(), "resource", "UpdateXp")).
//                        auth().
//                        oauth2(getCMSToken()).
//                        body(CMSLevelDataBuilder.getLevelData()).
//                when().
//                        put("Players/".concat("{playerID}/{resource}"));
//        response.
//                then().
//                statusCode(200);
//        LOG.info("Player level is upgraded...");
//    }
//    /**
//     * Adds currency to players account with CMS
//     * @param currency (ZG, ZP)
//     * @param  amount (Default 11000 for ZG)
//     * */
//    public static void addCurrencyWithCMS(String currency, String amount){
//        LOG.info("Updating Currency...");
//        Response response = given().
//                spec(cmsRequestSpec().
//                        pathParams("playerID",GlobalParams.getPlayerID(),"resource","UpdateCurrency")).
//                auth().
//                oauth2(getCMSToken()).
//                body(CMSCurrencyUpdateDataBuilder.getZGUpdateData(currency,amount)).
//                when().
//                put("Players/".concat("{playerID}/{resource}"));
//        response.then().statusCode(200);
//        LOG.info("Currency is updated...");
//    }
//    /**
//     * Generates CMS Token
//     * */
//    public static String getCMSToken(){
//        LOG.info("Creating CMS Token");
//        String token =
//                given().
//                spec(cmsRequestSpec()).
//                body(CMSTokenBuilder.tokenCreds()).
//                when().
//                post("Account/Login").
//                jsonPath().
//                getString("token");
//        LOG.info("CMS Token is Created");
//        return token;
//    }
//
//    /**
//     *
//     */
//    public static void clientLoginRequest(){
//        Response response = given().spec(TitleDataBasePage.clientRequestSpec()).
//                body(LoginRequestDataBuilder.loginRequestBody(GlobalParams.getEnvironment())).
//                when().post("Client/LoginWithIOSDeviceID");
//        // Sets SessionTicket as GlobalParam
//        GlobalParams.setSessionTicket(response.jsonPath().getString("data.SessionTicket"));
//        // Sets EntityToken as GlobalParam
//        GlobalParams.setEntityToken(response.jsonPath().getString("data.EntityToken.EntityToken"));
//        // Sets ActiveOffers as GlobalParam
//        GlobalParams.setActiveOffers(switchToJson(response.jsonPath().getString("data.InfoResultPayload.TitleData.Store_SpecialOffers")).
//                                                            getList("StoreItems.findAll{it-> it.IsActive == true}.Contents.en-US.Title"));
//        // Sets ActiveGameModes as GlobalParam
//        GlobalParams.setActiveGameModes(switchToJson(response.jsonPath().getString("data.InfoResultPayload.TitleData.GameModes")).
//                getList("Data.findAll{it-> it.VisibilityWindows.VisibilityState[0] == 1 & it.VisibilityWindows.StartDate[0] == null}.Name"));
//         //Sets ActiveMapsForTDM as GlobalParam
//        GlobalParams.setActiveMapsForTDM(switchToJson(response.jsonPath().getString("data.InfoResultPayload.TitleData.GameModes")).
//                getList("Data.findAll{it-> it.VisibilityWindows.VisibilityState[0] == 1 && it.VisibilityWindows.StartDate[0] == null && it.Name == 'TeamDeathmatch'}." +
//                        "Maps[0].findAll{it-> it.VisibilityWindows.VisibilityState[0] == 1 && it.VisibilityWindows.StartDate[0] == null}.Name"));
//        // Sets ActiveMapsForSabotage as GlobalParam
//        GlobalParams.setActiveMapsForSabotage(switchToJson(response.jsonPath().getString("data.InfoResultPayload.TitleData.GameModes")).
//                getList("Data.findAll{it-> it.VisibilityWindows.VisibilityState[0] == 1 && it.VisibilityWindows.StartDate[0] == null && it.Name == 'Sabotage'}." +
//                        "Maps[0].findAll{it-> it.VisibilityWindows.VisibilityState[0] == 1 && it.VisibilityWindows.StartDate[0] == null}.Name"));
//        // Sets ActiveMapsForFFA as GlobalParam
//        GlobalParams.setActiveMapsForFFA(switchToJson(response.jsonPath().getString("data.InfoResultPayload.TitleData.GameModes")).
//                getList("Data.findAll{it-> it.VisibilityWindows.VisibilityState[0] == 1 && it.VisibilityWindows.StartDate[0] == null && it.Name == 'FreeForAll'}." +
//                        "Maps[0].findAll{it-> it.VisibilityWindows.VisibilityState[0] == 1 && it.VisibilityWindows.StartDate[0] == null}.Name"));
//    }

    /**
     * Converts String to Json Object
     * @param data
     * @return
     */
    public static JsonPath switchToJson(String data){
        return new JsonPath(data);
    }

}

package com.unicoGames.brainTest3.stepDefinitions;

import com.alttester.AltDriver;
import com.unicoGames.brainTest3.pages.AllPages;
import com.unicoGames.brainTest3.pages.android.LevelPages;
import com.unicoGames.brainTest3.utilities.DriverManager;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import io.cucumber.java.After;

import io.cucumber.java.Scenario;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    protected AltDriver altDriver;

    public Hooks(){
        this.altDriver = new DriverManager().getAltDriver();
    }
    LevelOneStepDefs landingPageStepDefs= new LevelOneStepDefs();
    AllPages allPages = new AllPages();

//    private static String goldAmount;
//    public static int countForSendGoldZulaPass = 0;
//    public static int countForSendGoldChestPurchase = 0;
//    public static int countForSendGoldZPPurchase = 0;
//    public static int countForLevelUp = 0;
//
//    @Before("@sendzulagold")
//    public void setUpSendingGold(Scenario scenario) {
//        if (scenario.getName().equals("ZulaPassItem_Purchase_with_Enough_Zula_Gold")) {
//            goldAmount = "11000";
//            if (countForSendGoldZulaPass < 1) {
//                ReusableMethods.getAndWritePlayerID();
//                ReusableMethods.logOutGame();
//                ReusableMethods.addCurrencyWithCMS("ZG", goldAmount);
//                stepDefs.user_logs_in_as_guest();
//                for (int i = 0; i < 2; i++) {
//                    if (Integer.parseInt(allPages.lobbyPage().zulaGoldCurrency().getText()) < Integer.parseInt(goldAmount)) {
//                        ReusableMethods.getAndWritePlayerID();
//                        ReusableMethods.logOutGame();
//                        ReusableMethods.addCurrencyWithCMS("ZG", goldAmount);
//                        stepDefs.user_logs_in_as_guest();
//                    }
//                }
//                countForSendGoldZulaPass++;
//            }
//        } else if (scenario.getName().equals("Case_Purchases_With_Enough_Zula_Gold")) {
//            goldAmount = "2000";
//            if (countForSendGoldChestPurchase < 1) {
//                ReusableMethods.getAndWritePlayerID();
//                ReusableMethods.logOutGame();
//                ReusableMethods.addCurrencyWithCMS("ZG", goldAmount);
//                stepDefs.user_logs_in_as_guest();
//                for (int i = 0; i < 2; i++) {
//                    if (Integer.parseInt(allPages.lobbyPage().zulaGoldCurrency().getText()) < Integer.parseInt(goldAmount)) {
//                        ReusableMethods.getAndWritePlayerID();
//                        ReusableMethods.logOutGame();
//                        ReusableMethods.addCurrencyWithCMS("ZG", goldAmount);
//                        stepDefs.user_logs_in_as_guest();
//                    }
//                }
//                countForSendGoldChestPurchase++;
//            }
//        } else if (scenario.getName().equals("Zula_Mobile_Point_Purchases_With_Enough_Zula_Gold")) {
//            goldAmount = "50600";
//            if (countForSendGoldZPPurchase < 1) {
//                ReusableMethods.getAndWritePlayerID();
//                ReusableMethods.logOutGame();
//                ReusableMethods.addCurrencyWithCMS("ZG", goldAmount);
//                stepDefs.user_logs_in_as_guest();
//                for (int i = 0; i < 2; i++) {
//                    if (Integer.parseInt(allPages.lobbyPage().zulaGoldCurrency().getText()) < Integer.parseInt(goldAmount)) {
//                        ReusableMethods.getAndWritePlayerID();
//                        ReusableMethods.logOutGame();
//                        ReusableMethods.addCurrencyWithCMS("ZG", goldAmount);
//                        stepDefs.user_logs_in_as_guest();
//                    }
//                }
//                countForSendGoldZPPurchase++;
//            }
//        }
//
//    }
//
//    @Before("@highlevelmaps")
//    public void setUserLevel(){
//        if(countForLevelUp<0){
//            ReusableMethods.getAndWritePlayerID();
//            ReusableMethods.logOutGame();
//            ReusableMethods.setUserLevelTo21();
//            stepDefs.user_logs_in_as_guest();
//        }
//        countForLevelUp++;
//    }
//
//    @Before("@skipinitialinstall")
//    public void changeLanguageForCafebazaar(){
//        if(GlobalParams.getMarketName().equalsIgnoreCase("cafebazaar")){
//            ReusableMethods.skipInitialLaunchAndLoginAsGuest();
//            ReusableMethods.changeLanguageToEnglish();
//            ReusableMethods.logOutGame();
//        }
//    }

    @After
    public void methodTearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()){
            String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            String target = System.getProperty("user.dir") + File.separator + "test_output" + File.separator + "ScreenShots_" + scenario.getName() + date + ".png";
            altDriver.getPNGScreenshot(target);
            ReusableMethods.killBrainTest3();
            ReusableMethods.waitForSecond(5);
            ReusableMethods.runBrainTest3();

        }
    }
}

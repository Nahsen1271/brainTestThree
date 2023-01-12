package com.unicoGames.brainTest3.stepDefinitions;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.InputActions.AltSwipeParams;
import com.unicoGames.brainTest3.pages.android.LevelPages;
import org.testng.annotations.Test;

public class SettingPage extends TestBase{

//    AltDriver altDriver;
    LevelPages levelPages;



    @Test
    public void settingsTest() throws InterruptedException {
        levelPages=new LevelPages();
//        settingButton().click();
//        System.out.println("soundText().getText() = " + soundText().getText());
//        System.out.println("musicButton().getText() = " + musicText().getText());
//        System.out.println("notificationText().getText() = " + notificationText().getText());
//        System.out.println("LanguageTitle().getText() = " + LanguageTitle().getText());

//        LanguageSelectButton().click(); // open the languages Panel
//        List<String> languages = new ArrayList<>(); // Check the languages
//        Arrays.stream(LanguagesText()).forEach(x-> languages.add(x.getText()));
//        System.out.println(languages);
//        Thread.sleep(1000);
//        selectAlanguage("DE").click();
//        Thread.sleep(1000);
//        closeButton().click(); // Close the languages Panel
//        Thread.sleep(1000);
//        System.out.println("soundText().getText() = " + soundText().getText());
//        LanguageSelectButton().click();
//        Thread.sleep(1000);
//        selectAlanguage("EN").click();
//        closeButton().click();Thread.sleep(1000);
//        backButton().click();Thread.sleep(3000);
//        firstPopup().click();Thread.sleep(1000);
//        tapToPlay().click();
//        Thread.sleep(9000);
        altDriver.swipe(new AltSwipeParams.Builder(levelPages.theRock().getScreenPosition(),levelPages.theRockTrig().getScreenPosition()).withDuration(2).build());
        Thread.sleep(3000);
        altDriver.swipe(new AltSwipeParams.Builder(levelPages.alxyRaycastTarget().getScreenPosition(),levelPages.alyxTrig().getScreenPosition()).withDuration(2).build());
        Thread.sleep(10000);
        levelPages.claim1().click();
        Thread.sleep(5000);
        levelPages.claimButton().click();
        Thread.sleep(5000);
        levelPages.buttonNext().click();
        Thread.sleep(5000);
        System.out.println("key().getName() = " + levelPages.key().getName());
        System.out.println("Ben");
        levelPages.key().click();
        altDriver.swipe(new AltSwipeParams.Builder(levelPages.keyDraggable().getScreenPosition(),levelPages.safe().getScreenPosition()).withDuration(2).build());
        Thread.sleep(1000);
        try{
            Thread.sleep(1000);
            levelPages.bust().click();
        }catch (Exception E){
            System.out.println("\"catchde\" = " + "catchde"); // Bu sefer buraya girmedi.
            Thread.sleep(1000);
            levelPages.safe2().click();
        }
        Thread.sleep(1000);
        levelPages.arrowRight().click();
//        System.out.println("key().getScreenPosition() = " + key().getScreenPosition());
//        System.out.println("key().getIdCamera() = " + key().getIdCamera());
//        System.out.println("key().getMessageHandler() = " + key().getMessageHandler());
//        System.out.println("key().getId() = " + key().getId());
//        System.out.println("key().getMobileY() = " + key().getMobileY());
//        System.out.println("key().getParent() = " + key().getParent());
//        System.out.println("key().getWorldPosition() = " + key().getWorldPosition());
//        System.out.println("key().getType() = " + key().getType());
//        System.out.println("key().getWorldPosition() = " + key().getWorldPosition());
//        System.out.println("key().getWorldX() = " + key().getWorldX());
//        System.out.println("key().getWorldY() = " + key().getWorldY());
//        System.out.println("key().getWorldZ() = " + key().getWorldZ());
//        key().click();

//        System.out.println("shareButton().getText() = " + shareButton().getText());
//        System.out.println("twitterButton().getText() = " + twitterButton().getText());
//        System.out.println("instagramButton().getText() = " + instagramButton().getText());
//        System.out.println("facebookButton().getText() = " + facebookButton().getText());


        //    Assert.assertEquals("SOUND",soundText().getText());
    }
    public AltObject settingButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SettingsButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(100 ).build();
        return altDriver.waitForObject(params);
    }
    public AltObject soundText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SoundText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject musicText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "MusicText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(100 ).build();
        return altDriver.waitForObject(params);
    }
    public AltObject notificationText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "NotificationText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject LanguageTitle(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LanguageTitle").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);


    }
    public AltObject LanguageSelectButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LanguageSelectButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);

    }

    public AltObject [] LanguagesText(){
        AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Text").
                isEnabled(true).build();
        return altDriver.findObjects(par);
    }
    public AltObject selectAlanguage(String language){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/CanvasUI/LanguagePanel/Popup/Items/"+language).
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// /Canvas/TutorialPopUp/Panel/Window/NoButton/Text (TMP) (1)
    }

    public AltObject closeButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "CloseButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// /CanvasUI/LanguagePanel/Popup/Items/VN/Text
    }
    public AltObject backButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "BackButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }

    public AltObject twitterButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TwitterButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// TapToPlay
    }

    public AltObject instagramButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "InstagramButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject facebookButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "FacebookButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
}

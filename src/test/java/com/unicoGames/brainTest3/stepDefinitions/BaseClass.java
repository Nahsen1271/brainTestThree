package com.unicoGames.brainTest3.stepDefinitions;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.AltPortForwarding;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.InputActions.AltSwipeParams;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {

    AltDriver altDriver;
    @BeforeTest
    public void setUpBase(){
        AltPortForwarding.forwardAndroid();
        altDriver = new AltDriver();
    }

    @Test
    public void settingsTest() throws InterruptedException {

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
        /* LEVEL 1 */
        altDriver.swipe(new AltSwipeParams.Builder(theRock().getScreenPosition(),theRockTrig().getScreenPosition()).withDuration(2).build());
        Thread.sleep(3000);
        altDriver.swipe(new AltSwipeParams.Builder(alxyRaycastTarget().getScreenPosition(),alyxTrig().getScreenPosition()).withDuration(2).build());
        Thread.sleep(10000);
        claim1().click();
        Thread.sleep(5000);
        claimButton().click();
        Thread.sleep(5000);
        buttonNext().click();
        Thread.sleep(5000);
        /* LEVEL 2 */
//        key().click();
//        altDriver.swipe(new AltSwipeParams.Builder(keyDraggable().getScreenPosition(),safe().getScreenPosition()).withDuration(2).build());
//        Thread.sleep(1000);
//        try{
//            Thread.sleep(1000);
//            bust().click();
//        }catch (Exception E){
//            System.out.println("\"catchde\" = " + "catchde"); // Bu sefer buraya girmedi.
//            Thread.sleep(1000);
//            safe2().click();
//        }
//        Thread.sleep(5000);
//        arrowRight().tap();
//        Thread.sleep(5000);
//        try {
//            altDriver.swipe(new AltSwipeParams.Builder(bustDraggable().getScreenPosition(),bust2().getScreenPosition()).withDuration(2).build());
//            Thread.sleep(5000);
//        }catch (Exception e){
//            altDriver.swipe(new AltSwipeParams.Builder(bustDraggable().getScreenPosition(),bust().getScreenPosition()).withDuration(2).build());
//        }
//        try {
//            claimDay2();
//            Thread.sleep(5000);
//            try {
//                claimButtonDay2();
//                Thread.sleep(5000);
//        } catch (Exception e){
//            System.out.println("İkinci Claim Yok.");
//        }
        /* LEVEL 3 */
//        cake().click();
//        Thread.sleep(1000);
//        trap().click();
//        Thread.sleep(1000);
//        altDriver.swipe(new AltSwipeParams.Builder(trapDraggable().getScreenPosition(),cakeDraggable().getScreenPosition()).withDuration(2).build());
//        Thread.sleep(1000);
//        arrowRight().click();
//        Thread.sleep(1000);
//        altDriver.swipe(new AltSwipeParams.Builder(trapDraggable2().getScreenPosition(),trapSnapped().getScreenPosition()).withDuration(2).build());
//        Thread.sleep(1000);
//        door().tap();
//        Thread.sleep(5000);
//         buttonNext().click();
//         Thread.sleep(2000);
//        MissThisChance().click();
//        Thread.sleep(9000);
//
//        /* LEVEL 4 */
//        stone().click();
//        Thread.sleep(1000);
//        sling().click();
//        Thread.sleep(1000);
//        altDriver.swipe(new AltSwipeParams.Builder(slingDraggable().getScreenPosition(),stoneDraggable().getScreenPosition()).withDuration(2).build());
//        Thread.sleep(1000);
//        altDriver.swipe(new AltSwipeParams.Builder(slingDraggable2().getScreenPosition(),lamp().getScreenPosition()).withDuration(2).build());
//        Thread.sleep(1000);
//        arrowRight().click();
//        Thread.sleep(1000);
//        scissors().click();
//        Thread.sleep(1000);
//        altDriver.swipe(new AltSwipeParams.Builder(scissorsDraggable().getScreenPosition(),cableTrig().getScreenPosition()).withDuration(2).build());
//        Thread.sleep(5000);
//        buttonNext().click();
//        System.out.println("\"Burada\" = " + "Burada");

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
    //Levels Part
    public AltObject firstPopup(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/TutorialPopUp/Panel/Window/NoButton/Text (TMP) (1)").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//
    }
    public AltObject tapToPlay(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TapToPlay").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// rock
    }

    public AltObject theRock(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "rock").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// rockTrig
    }
    public AltObject theRockTrig(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "rockTrig").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// raycastTarget
    }
    public AltObject alxyRaycastTarget(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "raycastTarget").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// alyxTrig
    }
    public AltObject alyxTrig(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "alyxTrig").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// alyxTrig
    }
    public AltObject claim1(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "1").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// ClaimButton
    }
    public AltObject claimButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ClaimButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// buttonNext
    }
    public AltObject buttonNext(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "buttonNext").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// Image
    }
    public AltObject key(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "key").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// keyDraggable
    }
    public AltObject keyDraggable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "keyDraggable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// safe2
    }
    public AltObject safe(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "safe").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// safe2// bust
    }
    public AltObject bust(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "bust").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// safe2// bust
    }
    public AltObject safe2(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "safe2").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// arrowRight
    }
    public AltObject arrowRight(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "arrowRight").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// bustDraggable
    }
    public AltObject bustDraggable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "bustDraggable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// bust2
    }
    public AltObject bust2(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "bust2").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// bust2
    }
    public AltObject claimDay2(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "2").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject claimButtonDay2(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ClaimButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject cake(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "cake").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject trap(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "trap").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject trapDraggable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "trapDraggable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject cakeDraggable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "cakeDraggable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject trapDraggable2(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "trapDraggable2").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject trapSnapped(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "trapSnapped").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject door(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "door").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//MissThisChance
    }
    public AltObject MissThisChance(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "MissThisChance").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//MissThisChance
    }
    public AltObject stone(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "stone").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject sling(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "sling").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject stoneDraggable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "stoneDraggable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject slingDraggable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "slingDraggable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject slingDraggable2(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "slingDraggable2").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject lamp(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "lamp").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject scissors(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "scissors").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//scissorsDraggable
    }
    public AltObject scissorsDraggable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "scissorsDraggable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//scissorsDraggable
    }
    public AltObject cableTrig(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "cableTrig").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }
    public AltObject cable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "cable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//ClaimButton
    }

}

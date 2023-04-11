package com.unicoGames.brainTest3.pages.android;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.InputActions.AltSwipeParams;

public class SettingsPages extends BasePage {

   public void swipeMethod(AltObject APoint,AltObject bPoint){
       altDriver.swipe(new AltSwipeParams.Builder(APoint.getScreenPosition(),bPoint.getScreenPosition()).withDuration(2).build());
   }
    public AltObject SettingsButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SettingsButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);//
    }

    public AltObject languageCloseButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "CloseButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);//
    }
    public AltObject soundText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SoundText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject musicText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "MusicText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject notificationText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "NotificationText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject LanguageText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LanguageTitle").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);

    }
    public AltObject tryOurOtherGames(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/OtherGames/Text (TMP)").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);

    }
    public AltObject support(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SupportButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
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
        return altDriver.waitForObject(params);
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

    public AltObject settingsTitle(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Title").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject PrivacyPolicy(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "PrivacyPolicy").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// ShareButton

    }
    public AltObject ShareButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ShareButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// OtherGames

    }

    public AltObject otherGames(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "OtherGames").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// OtherGames

    }

    public AltObject TermsOfUse(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TermsOfUse").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//  /Canvas/OtherGamesScroll/Viewport/Content/BrainTest/PlayNow

    }
    public AltObject firstGame(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "BrainTest").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//  

    }
    public AltObject secondGame(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "WhoIs").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//  

    }
    public AltObject thirdGame(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "BT2").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//  

    }
    public AltObject fourthGame(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LifeCoices").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//  

    }
    public AltObject fifthGame(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "WordPearls").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//  

    }
    public AltObject sixthGame(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TrickyWords").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//

    }
    public AltObject seventhGame(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "WordVoyage").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//

    }

}

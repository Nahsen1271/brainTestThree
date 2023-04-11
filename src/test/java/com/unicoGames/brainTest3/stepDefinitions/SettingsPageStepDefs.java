package com.unicoGames.brainTest3.stepDefinitions;


import com.unicoGames.brainTest3.pages.AllPages;
import com.unicoGames.brainTest3.pages.android.SettingsPages;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.unicoGames.brainTest3.utilities.DriverManager.appiumDriver;


public class SettingsPageStepDefs {

    private static Logger LOG = LogManager.getLogger("SettingsStepDefs.class");

   AllPages allPages= new AllPages();


    @Given("Gamer clicks the setting button on the homepage")
    public void gamer_clicks_the_setting_button_on_the_homepage() {

        allPages.settingsPages().SettingsButton().click();

    }
    @Given("Gamer can click the language selection button")
    public void gamer_can_click_the_language_selection_button() {

        ReusableMethods.waitForSecond(1);
        allPages.settingsPages().LanguageSelectButton().click();
        List<String> languages = new ArrayList<>(); // Check the languages
        Arrays.stream(allPages.settingsPages().LanguagesText()).forEach(x-> languages.add(x.getText()));
        System.out.println(languages);
        ReusableMethods.waitForSecond(1);

    }
    @Given("Gamer can choose a language")
    public void gamer_can_choose_a_language() {

        allPages.settingsPages().selectAlanguage("DE").click();
        ReusableMethods.waitForSecond(1);
        allPages.settingsPages().languageCloseButton().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer checks if the language is selected")
    public void gamer_checks_if_the_language_is_selected() {

        String selected= allPages.settingsPages().soundText().getText();
        Assert.assertEquals(selected,"TON");
        ReusableMethods.waitForSecond(1);

    }

    @Given("Gamer gets all the text on the settings page and check them")
    public void gamer_gets_all_the_text_on_the_settings_page_and_check_them() {
        String settingsTitle= allPages.settingsPages().settingsTitle().getText();
        String soundText= allPages.settingsPages().soundText().getText();
        String musicText= allPages.settingsPages().musicText().getText();
        String notificationText= allPages.settingsPages().notificationText().getText();
        String languageText= allPages.settingsPages().LanguageText().getText();

        System.out.println("settingsTitle = " + settingsTitle);
        System.out.println("soundText = " + soundText);
        System.out.println("musicText = " + musicText);
        System.out.println("notificationText = " + notificationText);
        System.out.println("languageText = " + languageText);

        Assert.assertFalse(settingsTitle.isEmpty());
        Assert.assertFalse(soundText.isEmpty());
        Assert.assertFalse(musicText.isEmpty());
        Assert.assertFalse(notificationText.isEmpty());
        Assert.assertFalse(languageText.isEmpty());
    }

    @Given("Tasters check the support button")
    public void tasters_check_the_support_button() {
        allPages.settingsPages().support().click();
        ReusableMethods.waitForSecond(1);
        appiumDriver.navigate().back();
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);

    }
    @Given("Tasters check the share button")
    public void tasters_check_the_share_button() {
        allPages.settingsPages().ShareButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the Twitter button")
    public void tasters_check_the_twitter_button() {
        allPages.settingsPages().twitterButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the Instagram button")
    public void tasters_check_the_instagram_button() {
        allPages.settingsPages().instagramButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the Facebook button")
    public void tasters_check_the_facebook_button() {
        allPages.settingsPages().facebookButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the PP button")
    public void tasters_check_the_pp_button() {
        allPages.settingsPages().PrivacyPolicy().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the ToU button")
    public void tasters_check_the_to_u_button() {
        allPages.settingsPages().TermsOfUse().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the first game button")
    public void tasters_check_the_first_game_button() {
        allPages.settingsPages().otherGames().click();
        ReusableMethods.waitForSecond(1);
        allPages.settingsPages().firstGame().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Tasters check the second game button")
    public void tasters_check_the_second_game_button() {
        allPages.settingsPages().secondGame().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Tasters check the third game button")
    public void tasters_check_the_third_game_button() {
        allPages.settingsPages().thirdGame().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Tasters check the fourth game button")
    public void tasters_check_the_fourth_game_button() {
        allPages.settingsPages().fourthGame().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Tasters check the fifth game button")
    public void tasters_check_the_fifth_game_button() {
        allPages.settingsPages().fifthGame().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Tasters check the sixth game button")
    public void tasters_check_the_sixth_game_button() {
        allPages.settingsPages().sixthGame().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Tasters check the seventh game button")
    public void tasters_check_the_seventh_game_button() {
        allPages.settingsPages().seventhGame().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);
    }

}

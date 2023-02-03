package com.unicoGames.brainTest3.stepDefinitions;


import com.unicoGames.brainTest3.pages.android.SettingsPages;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SettingsPageStepDefs {

    private static Logger LOG = LogManager.getLogger("SettingsStepDefs.class");
   SettingsPages settingsPages= new SettingsPages();


    @Given("Gamer clicks the setting button on the homepage")
    public void gamer_clicks_the_setting_button_on_the_homepage() {

        settingsPages.SettingsButton().click();

    }
    @Given("Gamer can click the language selection button")
    public void gamer_can_click_the_language_selection_button() {

        ReusableMethods.waitForSecond(1);
        settingsPages.LanguageSelectButton().click();
        List<String> languages = new ArrayList<>(); // Check the languages
        Arrays.stream(settingsPages.LanguagesText()).forEach(x-> languages.add(x.getText()));
        System.out.println(languages);
        ReusableMethods.waitForSecond(1);

    }
    @Given("Gamer can choose a language")
    public void gamer_can_choose_a_language() {

        settingsPages.selectAlanguage("DE").click();
        ReusableMethods.waitForSecond(1);
        settingsPages.languageCloseButton().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer checks if the language is selected")
    public void gamer_checks_if_the_language_is_selected() {

        String selected= settingsPages.soundText().getText();
        Assert.assertEquals(selected,"TON");
        ReusableMethods.waitForSecond(1);

    }

    @Given("Gamer gets all the text on the settings page")
    public void gamer_gets_all_the_text_on_the_settings_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Gamer checks if all texts and buttons are on the settings page")
    public void gamer_checks_if_all_texts_and_buttons_are_on_the_settings_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

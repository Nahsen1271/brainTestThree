package com.unicoGames.brainTest3.stepDefinitions;

import com.unicoGames.brainTest3.pages.AllPages;
import com.unicoGames.brainTest3.pages.android.HomePage;
import com.unicoGames.brainTest3.pages.android.LevelPages;
import com.unicoGames.brainTest3.pages.android.SettingsPages;
import com.unicoGames.brainTest3.pages.android.ShopPage;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import java.io.IOException;


public class HomePageStepDefs {

    private static Logger LOG = LogManager.getLogger("LevelOneStepDefs.class");
  // HomePage allPages.homePage() = new HomePage();
   
   AllPages allPages = new AllPages();

    String string;

    @Given("Gamer can click the pets button on the home page")
    public void gamer_can_click_the_pets_button_on_the_home_page() {
        allPages.homePage().petButton().click();
        ReusableMethods.waitForSecond(1);
        System.out.println("homePage.petButton().getId() = " + allPages.homePage().petButton().getId());
        System.out.println("homePage.petButton().getName() = " + allPages.homePage().petButton().getName());
      //  Assert.assertEquals(5978,homePage.petButton().getId());
        Assert.assertEquals("petsButton",allPages.homePage().petButton().getName());

    }
    @Given("Gamer check the pets button shows a note and doesn't work")
    public void gamer_check_the_pets_button_shows_a_note_and_doesn_t_work() {
        string= allPages.homePage().petLockedButton().getName();
        System.out.println("lockedButton = " + string);
        Assert.assertTrue(string.contains("lockedIcon"));
    }


    @Given("Gamer can click the action button on the home page")
    public void gamer_can_click_the_action_button_on_the_home_page() {
        allPages.homePage().actionButton().click();
        ReusableMethods.waitForSecond(1);
        System.out.println("homePage.actionButton().getId() = " + allPages.homePage().actionButton().getId());
        System.out.println("homePage.actionButton().getName() = " + allPages.homePage().actionButton().getName());
     //   Assert.assertEquals(5978,homePage.actionButton().getId());
     //   Assert.assertEquals("petsButton",homePage.actionButton().getName());
    }
    @Given("Gamer checks the action button shows a note and doesn't work")
    public void gamer_checks_the_action_button_shows_a_note_and_doesn_t_work() {
        string= allPages.homePage().actionLockedButton().getName();
        System.out.println("actionLockedButton()= " + string);
        Assert.assertTrue(string.contains("lockedIcon"));
    }

    @Given("Gamer can click the shop button on the home page")
    public void gamer_can_click_the_shop_button_on_the_home_page() {
      allPages.homePage().shopButton().click();
      ReusableMethods.waitForSecond(1);

    }
    @Given("Gamer checks the shop button works and goes to the shop")
    public void gamer_checks_the_shop_button_works_and_goes_to_the_shop() {
        ReusableMethods.waitForSecond(1);
        Assert.assertEquals("SHOP", allPages.shopPage().shopTitle().getText());

    }
    @Given("Gamer can return to the home page from the shop page")
    public void gamer_can_return_to_the_home_page_from_the_shop_page() {
        allPages.shopPage().shopBackButton().click();
        ReusableMethods.waitForSecond(1);
        allPages.homePage().homeCloseButton().click();
        ReusableMethods.waitForSecond(1);

    }

    @Given("Gamer can click the path button on the home page")
    public void gamer_can_click_the_path_button_on_the_home_page() {
       // homePage.levelHomeButton().click();
        allPages.levelPages().tapToPlay().click();
        ReusableMethods.waitForSecond(1);


    }
    @Given("Gamer checks the path button works and goes to the levels")
    public void gamer_checks_the_path_button_works_and_goes_to_the_levels() {
        string=  allPages.homePage().levelOneTitle().getText();
        System.out.println("homePage.levelOneTitle().getText() = " + string);
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(string.contains("LEVEL"));

    }
    @Given("Gamer can return to the home page from the levels")
    public void gamer_can_return_to_the_home_page_from_the_levels() {
        allPages.homePage().levelHomeButton().click();
        ReusableMethods.waitForSecond(1);
    }

    @Given("Gamer can click the coin button on the home page")
    public void gamer_can_click_the_coin_button_on_the_home_page() {
        allPages.homePage().homeCoinBg().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer checks the coin button works and goes to the shop page")
    public void gamer_checks_the_coin_button_works_and_goes_to_the_shop_page() {
        ReusableMethods.waitForSecond(1);
        string = allPages.shopPage().shopTitle().getText();
        ReusableMethods.waitForSecond(1);
        Assert.assertEquals("SHOP",string);

    }


    @Given("Gamer can click the settings button on the home page")
    public void gamer_can_click_the_settings_button_on_the_home_page() {

        allPages.settingsPages().SettingsButton().click();
        ReusableMethods.waitForSecond(1);

    }
    @Given("Gamer checks the settings button works and goes to the settings page")
    public void gamer_checks_the_settings_button_works_and_goes_to_the_settings_page() {

        System.out.println("settingsPages.settingsTitle().getText() = " + allPages.settingsPages().settingsTitle().getText());

    }
    @Given("Gamer can return to the home page from the settings page")
    public void gamer_can_return_to_the_home_page_from_the_settings_page() {
        allPages.settingsPages().backButton().click();
        ReusableMethods.waitForSecond(1);


    }

}

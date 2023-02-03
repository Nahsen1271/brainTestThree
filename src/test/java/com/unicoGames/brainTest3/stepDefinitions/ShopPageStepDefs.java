package com.unicoGames.brainTest3.stepDefinitions;

import com.unicoGames.brainTest3.pages.android.LevelPages;
import com.unicoGames.brainTest3.pages.android.ShopPage;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ShopPageStepDefs {

    ShopPage shopPage= new ShopPage();

    private static Logger LOG = LogManager.getLogger("ShopPageStepDefs.class");



    @Given("Gamer can take first button's title and price on the shop page")
    public void gamer_can_take_first_button_s_title_and_price_on_the_shop_page() {
        System.out.println("shopPage.shopTitle().getText() = " + shopPage.shopTitle().getText());
        System.out.println("shopPage.removeAdTitle().getText() = " + shopPage.removeAdTitle().getText());
        System.out.println("shopPage.removeAdPrice().getText() = " + shopPage.removeAdPrice().getText());
    }
    @Given("Gamer check if the first button's title and price right")
    public void gamer_check_if_the_first_button_s_title_and_price_right() {

        System.out.println("I will assertions later");

    }

    @Given("Gamer can take second button's title and price on the shop page")
    public void gamer_can_take_second_button_s_title_and_price_on_the_shop_page() {
        System.out.println("shopPage.adventurePackTitle().getText() = " + shopPage.adventurePackTitle().getText());
        System.out.println("shopPage.adventurePackPrice().getText() = " + shopPage.adventurePackPrice().getText());
    }
    @Given("Gamer check if the second button's title and price right")
    public void gamer_check_if_the_second_button_s_title_and_price_right() {
        System.out.println("I will assertions later-2");
    }

    @Given("Gamer can take third button's title and price on the shop page")
    public void gamer_can_take_third_button_s_title_and_price_on_the_shop_page() {
        System.out.println("shopPage.gundolfMagicTitle().getText() = " + shopPage.gundolfMagicTitle().getText());
        System.out.println("shopPage.gundolfMagicPrice().getText() = " + shopPage.gundolfMagicPrice().getText());

    }
    @Given("Gamer check if the third button's title and price right")
    public void gamer_check_if_the_third_button_s_title_and_price_right() {
        System.out.println("I will assertions later -3");
    }

    @Given("Gamer can take fourth button's title and price on the shop page")
    public void gamer_can_take_fourth_button_s_title_and_price_on_the_shop_page() {
        System.out.println("I wiil take that part later");
    }
    @Given("Gamer check if the fourth button's title and price right")
    public void gamer_check_if_the_fourth_button_s_title_and_price_right() {
        System.out.println("I will assertions later -4");
    }

}

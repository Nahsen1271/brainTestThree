package com.unicoGames.brainTest3.pages;

import com.unicoGames.brainTest3.pages.android.*;


public class AllPages {

    public AllPages(){
    }


    private LevelPages levelPages;
    private HomePage homePage;
    private SettingsPages settingsPages;
    private ShopPage shopPage;



    public LevelPages levelPages(){
        if (levelPages == null){
            levelPages = new LevelPages();
        }
        return levelPages;
    }

    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }

    public SettingsPages settingsPages(){
        if (settingsPages == null){
            settingsPages = new SettingsPages();
        }
        return settingsPages;
    }

    public ShopPage shopPage(){
        if (shopPage == null){
            shopPage = new ShopPage();
        }
        return shopPage;
    }

}

package com.unicoGames.brainTest3.pages;

import com.unicoGames.brainTest3.pages.android.*;


public class AllPages {

    public AllPages(){
    }


    private LevelPages levelPages;



    public LevelPages levelPages(){
        if (levelPages == null){
            levelPages = new LevelPages();
        }
        return levelPages;
    }

}

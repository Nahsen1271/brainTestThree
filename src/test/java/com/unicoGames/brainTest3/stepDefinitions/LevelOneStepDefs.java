package com.unicoGames.brainTest3.stepDefinitions;

import com.alttester.AltDriver;
import com.alttester.Commands.InputActions.AltSwipeParams;
import com.unicoGames.brainTest3.pages.AllPages;
import com.unicoGames.brainTest3.pages.android.LevelPages;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.unicoGames.brainTest3.utilities.DriverManager.*;


public class LevelOneStepDefs {

    private static Logger LOG = LogManager.getLogger("LevelOneStepDefs.class");
   LevelPages levelPages = new LevelPages();
  //  AllPages allPages= new AllPages();
   // AltDriver altDriver;
    @Given("Gamer can swipe the rock to the drum can")
    public void gamer_can_swipe_the_rock_to_the_drum_can() throws InterruptedException {
        levelPages.swipeMethod(levelPages.theRock(),levelPages.theRockTrig());
        Thread.sleep(3000);
    }
    @Given("Gamer can swipe Alxy to left to drum can")
    public void gamer_can_swipe_alxy_to_left_to_drum_can() throws InterruptedException {
        levelPages.swipeMethod(levelPages.alxyRaycastTarget(),levelPages.alyxTrig());
        Thread.sleep(10000);
    }
    @Given("Gamer can pass the level")
    public void gamer_can_pass_the_level() throws InterruptedException {
        levelPages.claim1().click();
        Thread.sleep(5000);
        levelPages.claimButton().click();
        Thread.sleep(5000);
        levelPages.buttonNext().click();
        Thread.sleep(5000);
    }
}

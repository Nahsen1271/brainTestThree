package com.unicoGames.brainTest3.stepDefinitions;

import com.alttester.AltDriver;
import com.alttester.Commands.InputActions.AltSwipeParams;
import com.unicoGames.brainTest3.pages.AllPages;
import com.unicoGames.brainTest3.pages.android.LevelPages;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.unicoGames.brainTest3.utilities.DriverManager.*;


public class LevelOneStepDefs {

    private static Logger LOG = LogManager.getLogger("LevelOneStepDefs.class");
   LevelPages levelPages = new LevelPages();
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

    @Given("Gamer can claim the daily reward")
    public void gamer_can_claim_the_daily_reward() {
        try {
            levelPages.claim1().click();
        }catch (Exception e){
            System.out.println("There is no claim page");

        }catch (ExceptionInInitializerError claimButton){
            ReusableMethods.waitForSecond(2);
            levelPages.claimButton().click();
            System.out.println("There is no claimPage button");
        }
    }
    @Given("Gamer can pass the level")
    public void gamer_can_pass_the_level()  {
        ReusableMethods.waitForSecond(7);
        levelPages.buttonNext().click();
        ReusableMethods.waitForSecond(5);
    }


    // LEVEL TWO


    @Given("Gamer can swipe the key to the frame")
    public void gamer_can_swipe_the_key_to_the_frame() {
        levelPages.key().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can swipe the key to the money case")
    public void gamer_can_swipe_the_key_to_the_money_case() {
        levelPages.swipeMethod(levelPages.keyDraggable(),levelPages.safe());
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can swipe the bust to the frame")
    public void gamer_can_swipe_the_bust_to_the_frame() {
        try{
            ReusableMethods.waitForSecond(1);
            levelPages.bust().click();
        }catch (Exception E){
            System.out.println("Safe2 kullanıldı.Bust değil.");
            ReusableMethods.waitForSecond(1);
            levelPages.safe2().click();
        }
    }
    @Given("Gamer can click the right arrow button")
    public void gamer_can_click_the_right_arrow_button() {
        ReusableMethods.waitForSecond(3);
        levelPages.arrowRight().tap();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe the bust to the place")
    public void gamer_can_swipe_the_bust_to_the_place() {

            levelPages.swipeMethod(levelPages.bustDraggable(),levelPages.bust2());
            ReusableMethods.waitForSecond(3);

//        }catch (Exception e){
//            levelPages.swipeMethod(levelPages.bustDraggable(),levelPages.bust());
//            ReusableMethods.waitForSecond(1);
//            System.out.println("Level 2 bust ile ekrana geldi");
//            try {
//                levelPages.claimDay2();
//                ReusableMethods.waitForSecond(1);
//                try {
//                    levelPages.claimButtonDay2();
//                    Thread.sleep(5000);
//                } catch (Exception ikinciClaim) {
//                    System.out.println("İkinci Claim Yok.");
//                }
//            }
//        }

    }
    // LEVEL THREE

    @Given("Gamer can click the cake to the frame")
    public void gamer_can_click_the_cake_to_the_frame() {
        levelPages.cake().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can click the trap to the frame")
    public void gamer_can_click_the_trap_to_the_frame() {
        levelPages.trap().click();
        ReusableMethods.waitForSecond(1);

    }
    @Given("Gamer can swipe the trap to the cake in frames")
    public void gamer_can_swipe_the_trap_to_the_cake_in_frames() {
        levelPages.swipeMethod(levelPages.trapDraggable(),levelPages.cakeDraggable());
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can swipe the trap with cake to the place")
    public void gamer_can_swipe_the_trap_with_cake_to_the_place() {
        levelPages.swipeMethod(levelPages.trapDraggable2(),levelPages.trapSnapped());
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer knocks the door")
    public void gamer_knocks_the_door() {
        levelPages.door().click();
        ReusableMethods.waitForSecond(13);
    }
    @Given("Gamer wants to miss the chance")
    public void gamer_wants_to_miss_the_chance() {

        levelPages.MissThisChance().click();
        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer wants to skip the spin wheel")
    public void gamer_wants_to_skip_the_spin_wheel() {
        try {
            levelPages.skipButton().click();
            ReusableMethods.waitForSecond(5);
        }catch (Exception skipButton){
            System.out.println("There is no spin wheel");
        }
    }
      // LEVEL FOUR

}

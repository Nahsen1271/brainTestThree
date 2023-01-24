package com.unicoGames.brainTest3.stepDefinitions;

import com.alttester.AltDriver;
import com.alttester.Commands.InputActions.AltSwipeParams;
import com.unicoGames.brainTest3.pages.AllPages;
import com.unicoGames.brainTest3.pages.android.LevelPages;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import io.appium.java_client.functions.ExpectedCondition;
import io.cucumber.java.en.Given;
import jdk.jfr.events.ExceptionThrownEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

import static com.unicoGames.brainTest3.utilities.DriverManager.*;


public class LevelOneStepDefs {

    private static Logger LOG = LogManager.getLogger("LevelOneStepDefs.class");
   LevelPages levelPages = new LevelPages();


    @Given("Gamer can open the game and can click skip or can click lets go")
    public void gamer_can_open_the_game_and_can_click_skip_or_can_click_lets_go() throws IOException, InterruptedException {
     //   ReusableMethods.runBrainTest3();
        ReusableMethods.waitForSecond(7);
        boolean yesButton = true;
        if(yesButton) {
            try {
                ReusableMethods.waitForSecond(3);
                levelPages.firstSkipButton().click();
                ReusableMethods.waitForSecond(3);
                yesButton=false;
            } catch (Exception skip) {
                System.out.println("There is no skip button");
            }
        }
        if(yesButton) {
            try {
                ReusableMethods.waitForSecond(9);
                levelPages.letsGoButton().click();
                ReusableMethods.waitForSecond(3);
            } catch (Exception letsGo) {
                System.out.println("There is no letGo button");
            }
        }

    }
    @Given("Gamer click yes please or I am master button")
    public void gamer_click_yes_please_or_i_am_master_button() {
        boolean yesButton = true;
        if(yesButton) {
            try {
                levelPages.yesButton().click();
                ReusableMethods.waitForSecond(3);
                yesButton = false;
            } catch (Exception noButton) {
                System.out.println("Gamer can't click yes button");

            }
        }
        if (yesButton) {
            try {
                levelPages.noButton().click();
                ReusableMethods.waitForSecond(3);
            } catch (Exception Button) {
                System.out.println("There is no firstPopup");
            }
        }
    }
    @Given("Gamer click the tap to start button")
    public void gamer_click_the_tap_to_start_button() {
       ReusableMethods.waitForSecond(3);
       levelPages.tapToPlay().click();
       ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe the rock to the drum can")
    public void gamer_can_swipe_the_rock_to_the_drum_can() {
        ReusableMethods.waitForSecond(3);
        levelPages.swipeMethod(levelPages.theRock(),levelPages.theRockTrig());
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe Alxy to left to drum can")
    public void gamer_can_swipe_alxy_to_left_to_drum_can() {
        levelPages.swipeMethod(levelPages.alxyRaycastTarget(),levelPages.alyxTrig());
        ReusableMethods.waitForSecond(3);
    }

    @Given("Gamer can claim the daily reward")
    public void gamer_can_claim_the_daily_reward() {
        try {
            ReusableMethods.waitForSecond(3);
            levelPages.claim1().click();
            ReusableMethods.waitForSecond(5);
        }catch (Exception claim1){
            System.out.println("There is no claim page");
        }
        try {
            ReusableMethods.waitForSecond(3);
            levelPages.claimButton().click();
            ReusableMethods.waitForSecond(5);
        }catch (Exception claimButton){
            System.out.println("There is no claimPage button");
        }
    }
    @Given("Gamer can pass the level")
    public void gamer_can_pass_the_level()  {
        ReusableMethods.waitForSecond(9);
        levelPages.buttonNext().click();
        ReusableMethods.waitForSecond(5);
    }

    // LEVEL TWO

    @Given("Gamer can swipe the key to the frame")
    public void gamer_can_swipe_the_key_to_the_frame() {
        ReusableMethods.waitForSecond(3);
        levelPages.key().click();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe the key to the money case")
    public void gamer_can_swipe_the_key_to_the_money_case() {
        ReusableMethods.waitForSecond(3);
        levelPages.swipeMethod(levelPages.keyDraggable(),levelPages.safe());
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can swipe the bust to the frame")
    public void gamer_can_swipe_the_bust_to_the_frame() {
        boolean bust=true;
        if(bust) {
            try {
                ReusableMethods.waitForSecond(1);
                levelPages.bust().click();
                bust = false;
            } catch (Exception E) {
                System.out.println("Safe2 kullanıldı.Bust değil.");
            }
        }
        if (bust) {
            try {
                ReusableMethods.waitForSecond(3);
                levelPages.safe2().click();
            } catch (Exception E) {
                System.out.println("Safe2 kullanıldı. Bust değil.");
            }
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
        ReusableMethods.waitForSecond(3);
        levelPages.swipeMethod(levelPages.bustDraggable(),levelPages.bust2());
        ReusableMethods.waitForSecond(3);

    }
    // LEVEL THREE

    @Given("Gamer can click the cake to the frame")
    public void gamer_can_click_the_cake_to_the_frame() {
        ReusableMethods.waitForSecond(1);
        levelPages.cake().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can click the trap to the frame")
    public void gamer_can_click_the_trap_to_the_frame() {
        ReusableMethods.waitForSecond(1);
        levelPages.trap().click();
        ReusableMethods.waitForSecond(1);

    }
    @Given("Gamer can swipe the trap to the cake in frames")
    public void gamer_can_swipe_the_trap_to_the_cake_in_frames() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.trapDraggable(),levelPages.cakeDraggable());
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can swipe the trap with cake to the place")
    public void gamer_can_swipe_the_trap_with_cake_to_the_place() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.trapDraggable2(),levelPages.trapSnapped());
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer knocks the door")
    public void gamer_knocks_the_door() {
        ReusableMethods.waitForSecond(1);
        levelPages.door().click();
        ReusableMethods.waitForSecond(13);
    }
    @Given("Gamer submit the rate")
    public void gamer_submit_the_rate() {
        ReusableMethods.waitForSecond(3);
        levelPages.rateFiveStar().tap();
        ReusableMethods.waitForSecond(3);
        levelPages.rateSubmitButton().click();
    }
    @Given("Gamer wants to miss the chance")
    public void gamer_wants_to_miss_the_chance() {
        ReusableMethods.waitForSecond(1);
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


    @Given("Gamer can swipe the sling to the frame")
    public void gamer_can_swipe_the_sling_to_the_frame() {
        ReusableMethods.waitForSecond(1);
        levelPages.sling().click();
        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer can swipe the stone to the frame")
    public void gamer_can_swipe_the_stone_to_the_frame() {
        ReusableMethods.waitForSecond(1);
        levelPages.stone().click();
        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer can swipe the stone to the sling")
    public void gamer_can_swipe_the_stone_to_the_sling() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.stoneDraggable(),levelPages.slingDraggable());
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe the sling with stone to the lamp")
    public void gamer_can_swipe_the_sling_with_stone_to_the_lamp() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.slingDraggable2(),levelPages.lamp());

        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe the scissors to the frame")
    public void gamer_can_swipe_the_scissors_to_the_frame() {
        ReusableMethods.waitForSecond(1);
        levelPages.scissors().click();
        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer can swipe the scissors to the cable")
    public void gamer_can_swipe_the_scissors_to_the_cable() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.scissorsDraggable(),levelPages.cableTrig());
        ReusableMethods.waitForSecond(3);
    }

    // LEVEL FIVE
    @Given("Gamer can choose an answer at scene one")
    public void gamer_can_choose_an_answer_at_scene_one() {
        ReusableMethods.waitForSecond(1);
        levelPages.aChoice().click();
        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer can choose an answer at scene two")
    public void gamer_can_choose_an_answer_at_scene_two() {
        ReusableMethods.waitForSecond(1);
        levelPages.aChoice().click();
        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer can choose an answer at scene three")
    public void gamer_can_choose_an_answer_at_scene_three() {
        ReusableMethods.waitForSecond(1);
        levelPages.aChoice().click();
        ReusableMethods.waitForSecond(5);
    }

    @Given("Gamer can swipe the box to the door")
    public void gamer_can_swipe_the_box_to_the_door() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.box(),levelPages.arrowLeft());
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe the handle  to the frame")
    public void gamer_can_swipe_the_handle_to_the_frame() {
        ReusableMethods.waitForSecond(1);
        levelPages.handle().tap();

        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer can swipe the handle to the handle snapped")
    public void gamer_can_swipe_the_handle_to_the_handle_snapped() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.handleDraggable(),levelPages.handleSnapped());
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can tap the first button two times")
    public void gamer_can_tap_the_first_button_two_times() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.box(),levelPages.arrowLeft());
        levelPages.levelSixBtn1().click();
        levelPages.swipeMethod(levelPages.box(),levelPages.arrowLeft());
        levelPages.levelSixBtn1().click();
        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer can tap the second button two times")
    public void gamer_can_tap_the_second_button_two_times() {
        ReusableMethods.waitForSecond(1);
        levelPages.swipeMethod(levelPages.box(),levelPages.arrowLeft());
        levelPages.levelSixBtn2().click();
        levelPages.swipeMethod(levelPages.box(),levelPages.arrowLeft());
        levelPages.levelSixBtn2().click();
        ReusableMethods.waitForSecond(5);
    }

}

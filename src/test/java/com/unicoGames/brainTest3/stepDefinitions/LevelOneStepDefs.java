package com.unicoGames.brainTest3.stepDefinitions;

import com.alttester.AltDriver;
import com.alttester.Commands.InputActions.AltSwipeParams;
import com.unicoGames.brainTest3.pages.AllPages;
import com.unicoGames.brainTest3.pages.android.BasePage;
import com.unicoGames.brainTest3.pages.android.LevelPages;
import com.unicoGames.brainTest3.utilities.ReusableMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import io.cucumber.java.en.Given;
import jdk.jfr.events.ExceptionThrownEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;

import java.io.IOException;

import static com.unicoGames.brainTest3.utilities.DriverManager.*;
import static io.appium.java_client.touch.offset.PointOption.point;


public class LevelOneStepDefs {

    private static Logger LOG = LogManager.getLogger("LevelOneStepDefs.class");
   LevelPages levelPages = new LevelPages();
   AllPages allPages = new AllPages();


    @Given("Gamer can open the game and can click skip or can click lets go")
    public void gamer_can_open_the_game_and_can_click_skip_or_can_click_lets_go() throws IOException, InterruptedException {
     //   ReusableMethods.runBrainTest3();
     //   ReusableMethods.waitForSecond(7);
//        appiumDriver.rotate(ScreenOrientation.LANDSCAPE);
//        appiumDriver.rotate(ScreenOrientation.valueOf("landscape"));
        boolean yesButton = true;
        if(yesButton) {
            try {
             //   ReusableMethods.waitForSecond(3);
                allPages.levelPages().firstSkipButton().click();
                ReusableMethods.waitForSecond(1);
                yesButton=false;
            }catch (Exception skip) {
                System.out.println("There is no skip button");
            }
        }
        if(yesButton) {
            try {
             //   ReusableMethods.waitForSecond(9);
                levelPages.letsGoButton().click();
                ReusableMethods.waitForSecond(1);
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
                ReusableMethods.waitForSecond(1);
                yesButton = false;
            } catch (Exception noButton) {
                System.out.println("Gamer can't click yes button");

            }
        }
        if (yesButton) {
            try {
                levelPages.noButton().click();
                ReusableMethods.waitForSecond(1);
            } catch (Exception Button) {
                System.out.println("There is no firstPopup");
            }
        }
    }
    @Given("Gamer click the tap to start button")
    public void gamer_click_the_tap_to_start_button() {
       ReusableMethods.waitForSecond(3);
       levelPages.tapToPlay().click();

    }
    @Given("Gamer can swipe the rock to the drum can")
    public void gamer_can_swipe_the_rock_to_the_drum_can() {
        ReusableMethods.waitForSecond(11);
        levelPages.swipeMethod(levelPages.theRock(),levelPages.theRockTrig());
        ReusableMethods.waitForSecond(3);


    }
    @Given("Gamer can swipe Alxy to left to drum can")
    public void gamer_can_swipe_alxy_to_left_to_drum_can() {
        levelPages.swipeMethod(levelPages.alxyRaycastTarget(),levelPages.alyxTrig());
        ReusableMethods.waitForSecond(9);
    }

    @Given("Gamer can claim the daily reward")
    public void gamer_can_claim_the_daily_reward() {
        boolean claimPage = true;
        if (claimPage) {
            try {
                ReusableMethods.waitForSecond(3);
                levelPages.claim1().click();
                ReusableMethods.waitForSecond(3);
                claimPage = false;
            } catch (Exception claim1) {
                System.out.println("There is no claim page");
            }
        }
        if (!claimPage) {
            try {
                ReusableMethods.waitForSecond(7);
                levelPages.claimButton().click();
                ReusableMethods.waitForSecond(5);
            } catch (Exception claimButton) {
                System.out.println("There is no claimPage button");
            }
        }
    }
    @Given("Gamer can click share button")
    public void gamer_can_click_share_button() {
        ReusableMethods.waitForSecond(3);
        levelPages.buttonShare().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);


    }
    @Given("Gamer can click play again button")
    public void gamer_can_click_play_again_button() {
        ReusableMethods.waitForSecond(3);
        levelPages.buttonRestart().click();
        ReusableMethods.waitForSecond(3);
    }

    @Given("Gamer can click hint button")
    public void gamer_can_click_hint_button() {
        ReusableMethods.waitForSecond(3);
        levelPages.HintButton().click();
        ReusableMethods.waitForSecond(1);

    }
    @Given("Gamer can click first hint button")
    public void gamer_can_click_first_hint_button() {
        ReusableMethods.waitForSecond(1);
        levelPages.Hint0Locked().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can click second hint button")
    public void gamer_can_click_second_hint_button() {

            ReusableMethods.waitForSecond(1);
            levelPages.Hint1Locked().click();
            ReusableMethods.waitForSecond(1);
            System.out.println("There is no hint");
          try {
              System.out.println("click coordinate");
              ReusableMethods.waitForSecond(1);
           //   levelPages.HomeButton().click();
              new BasePage().tapByCoordinates(110,110); //135-400
              ReusableMethods.waitForSecond(1);
          }catch (Exception Hint){
              System.out.println("click home page");
              ReusableMethods.waitForSecond(1);
              levelPages.HomeButton().click();
              ReusableMethods.waitForSecond(1);
          }



    }
    @Given("Gamer can click skip button")
    public void gamer_can_click_skip_button() {
        System.out.println("ı am on skip button");
        ReusableMethods.waitForSecond(11);
        levelPages.helpButton().click();
        ReusableMethods.waitForSecond(5);
        levelPages.swipeMethod(levelPages.alxyRaycastTarget(),levelPages.alyxTrig());
        ReusableMethods.waitForSecond(9);
    }
    @Given("Gamer can pass the level")
    public void gamer_can_pass_the_level()  {
        ReusableMethods.waitForSecond(9);
        levelPages.buttonNext().click();
        ReusableMethods.waitForSecond(5);
    }
    @Given("Gamer can pass the ad")
    public void gamer_can_pass_the_ad()  {
        ReusableMethods.waitForSecond(50);
        try {
            appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View")).click();
        }catch (Exception ads){
            System.out.println("There is no ads");
        }

    }

    // LEVEL TWO

    @Given("Gamer can swipe the key to the frame")
    public void gamer_can_swipe_the_key_to_the_frame() {
        ReusableMethods.waitForSecond(3);
        levelPages.HintButton().click();
        ReusableMethods.waitForSecond(1);
        new BasePage().tapByCoordinates(100,100);
        ReusableMethods.waitForSecond(3);
        levelPages.key().click();
        ReusableMethods.waitForSecond(1);
    }

    @Given("Gamer can swipe the key to the money case")
    public void gamer_can_swipe_the_key_to_the_money_case() {
        ReusableMethods.waitForSecond(5);
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
        ReusableMethods.waitForSecond(3);
        levelPages.cake().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer can click the trap to the frame")
    public void gamer_can_click_the_trap_to_the_frame() {
        ReusableMethods.waitForSecond(3);
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
        try {
            ReusableMethods.waitForSecond(3);
            levelPages.rateFiveStar().tap();
            ReusableMethods.waitForSecond(3);
            levelPages.rateSubmitButton().click();
        }catch (Exception skipButton){
            System.out.println("There is no rate page");
        }

    }
    @Given("Gamer wants to miss the chance")
    public void gamer_wants_to_miss_the_chance() {
        try {
            ReusableMethods.waitForSecond(1);
            levelPages.MissThisChance().click();
            ReusableMethods.waitForSecond(5);
        }catch (Exception skipButton){
            System.out.println("There is no miss the chance page");
        }

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

    @Given("Gamer can swipe the block aside")
    public void gamer_can_swipe_the_block_aside() {

        ReusableMethods.waitForSecond(1);
        allPages.levelPages().swipeMethod(allPages.levelPages().block(),allPages.levelPages().levelEightTitle());
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe the ball to the ballPasOne")
    public void gamer_can_swipe_the_ball_to_the_ball_pas_one() {
        ReusableMethods.waitForSecond(1);
        appiumDriver.rotate(ScreenOrientation.LANDSCAPE);
        allPages.levelPages().swipeMethod(allPages.levelPages().ball(),allPages.levelPages().ballPosOne());
        ReusableMethods.waitForSecond(3);

    }
    @Given("Gamer can swipe the ballPasOne to the ballPasTwo")
    public void gamer_can_swipe_the_ball_pas_one_to_the_ball_pas_two() {
        ReusableMethods.waitForSecond(1);
        allPages.levelPages().swipeMethod(allPages.levelPages().ballPosOne(),allPages.levelPages().ballPosTwo());
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can swipe the ballPasTwo to the ballPasThree")
    public void gamer_can_swipe_the_ball_pas_two_to_the_ball_pas_three() {
        ReusableMethods.waitForSecond(1);
        allPages.levelPages().swipeMethod(allPages.levelPages().ballPosTwo(),allPages.levelPages().ballPosThree());
        ReusableMethods.waitForSecond(3);
    }

}

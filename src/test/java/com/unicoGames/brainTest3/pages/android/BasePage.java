package com.unicoGames.brainTest3.pages.android;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.InputActions.AltSwipeParams;
import com.unicoGames.brainTest3.utilities.DriverManager;

public class BasePage {

   protected AltDriver altDriver;


  public BasePage() { this.altDriver = new DriverManager().getAltDriver(); }
    public AltDriver getDriver() {
        return altDriver;
    }

    public void setDriver(AltDriver driver) {
        this.altDriver = driver;
    }


}

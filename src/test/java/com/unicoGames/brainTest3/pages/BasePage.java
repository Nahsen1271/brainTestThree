package com.unicoGames.brainTest3.pages;

import com.alttester.AltDriver;
import com.unicoGames.brainTest3.utilities.DriverManager;

public class BasePage {
   protected AltDriver altDriver;

  public BasePage() { this.altDriver = new DriverManager().getAltDriver(); }

}

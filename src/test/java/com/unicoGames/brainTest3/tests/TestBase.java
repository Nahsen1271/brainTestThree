package com.unicoGames.brainTest3.tests;

import com.alttester.AltDriver;
import com.alttester.AltPortForwarding;
import com.unicoGames.brainTest3.utilities.DriverManager;
import org.testng.annotations.BeforeTest;

public class TestBase {

    AltDriver altDriver;
    @BeforeTest
    public void setUp(){
        AltPortForwarding.forwardAndroid();
        altDriver = new DriverManager().getAltDriver();
    }
}

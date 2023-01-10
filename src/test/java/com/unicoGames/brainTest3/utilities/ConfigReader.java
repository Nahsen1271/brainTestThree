package com.unicoGames.brainTest3.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;
    static {
        String path = "src/test/resources/configuration.properties";
        try{
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        }catch (Exception e){
            System.out.println("File could not found");
        }
    }
    //will return value from config
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}

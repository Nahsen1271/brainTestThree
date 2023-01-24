package com.unicoGames.brainTest3.utilities;

import java.util.List;

public class GlobalParams {

    private static String playerID;

    private static String marketName;

    private static String environment;

    private static String systemOS;

    private static String sessionTicket;
    private static String entityToken;

    private static List<String> activeOffers;
    private static List<String> activeGameModes;

    public static List<String> getActiveMapsForTDM() {
        return activeMapsForTDM;
    }

    public static void setActiveMapsForTDM(List<String> activeMapsForTDM) {
        GlobalParams.activeMapsForTDM = activeMapsForTDM;
    }

    public static List<String> getActiveMapsForSabotage() {
        return activeMapsForSabotage;
    }

    public static void setActiveMapsForSabotage(List<String> activeMapsForSabotage) {
        GlobalParams.activeMapsForSabotage = activeMapsForSabotage;
    }

    public static List<String> getActiveMapsForFFA() {
        return activeMapsForFFA;
    }

    public static void setActiveMapsForFFA(List<String> activeMapsForFFA) {
        GlobalParams.activeMapsForFFA = activeMapsForFFA;
    }

    private static List<String> activeMapsForTDM;
    private static List<String> activeMapsForSabotage;
    private static List<String> activeMapsForFFA;


    public static List<String> getActiveOffers() {
        return activeOffers;
    }

    public static void setActiveOffers(List<String> activeOffers) {
        GlobalParams.activeOffers = activeOffers;
    }

    public static List<String> getActiveGameModes() {
        return activeGameModes;
    }

    public static void setActiveGameModes(List<String> activeGameModes) {
        GlobalParams.activeGameModes = activeGameModes;
    }

    public static String getSessionTicket() {
        return sessionTicket;
    }

    public static void setSessionTicket(String sessionTicket) {
        GlobalParams.sessionTicket = sessionTicket;
    }

    public static String getEntityToken() {
        return entityToken;
    }

    public static void setEntityToken(String entityToken) {
        GlobalParams.entityToken = entityToken;
    }


    public static String getSystemOS() {
        return systemOS;
    }

    public static void setSystemOS(String systemOS) {
        GlobalParams.systemOS = systemOS;
    }

    public static String getEnvironment() {
        return environment;
    }

    public static void setEnvironment(String environment) {
        GlobalParams.environment = environment;
    }

    public static String getMarketName() {
        return marketName;
    }

    public static void setMarketName(String marketName) {
        GlobalParams.marketName = marketName;
    }

    public static String getPlayerID() {
        return playerID;
    }

    public static void setPlayerID(String playerID) {
        GlobalParams.playerID = playerID;
    }
}

package cs295capstone.tennistracker.models;

import java.util.ArrayList;

public class Match {

    private static ArrayList<Match> matches;
    private String player1Name;
    private String player2Name;
    private int setsPerMatch;
    private int gamesPerSet;
    private boolean player1ServesFirst;

    public Match(String player1Name, String player2Name, int setsPerMatch, int gamesPerSet, boolean player1ServesFirst) {
        this.matches = new ArrayList<>();
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.setsPerMatch = setsPerMatch;
        this.gamesPerSet = gamesPerSet;
        this.player1ServesFirst = player1ServesFirst;
    }

    public Match() {
    }

    public static void addMatch(Match match) {
        matches.add(match);
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public int getSetsPerMatch() {
        return setsPerMatch;
    }

    public void setSetsPerMatch(int setsPerMatch) {
        this.setsPerMatch = setsPerMatch;
    }

    public int getGamesPerSet() {
        return gamesPerSet;
    }

    public void setGamesPerSet(int gamesPerSet) {
        this.gamesPerSet = gamesPerSet;
    }

    public boolean isPlayer1ServesFirst() {
        return player1ServesFirst;
    }

    public void setPlayer1ServesFirst(boolean player1ServesFirst) {
        this.player1ServesFirst = player1ServesFirst;
    }
}

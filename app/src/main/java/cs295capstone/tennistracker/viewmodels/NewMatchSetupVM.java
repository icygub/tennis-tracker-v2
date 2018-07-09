package cs295capstone.tennistracker.viewmodels;


import android.databinding.BaseObservable;

import cs295capstone.tennistracker.models.Match;

public class NewMatchSetupVM extends BaseObservable{

    private Match match;

    public NewMatchSetupVM() { }

    public void createMatch(String player1Name, String player2Name, int setsPerMatch,
                            int gamesPerSet, boolean player1ServesFirst) {
        match = new Match(player1Name, player2Name, setsPerMatch, gamesPerSet, player1ServesFirst);
        Match.addMatch(match);
    }
}

package com.example.nmaokafor.pingpongapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamTiger = 0;
    int scoreTeamJaguar = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team Tiger by 1 point. check here Nma
     */
    public void addOneHere(View v) {
        scoreTeamTiger = scoreTeamTiger++;
        displayForTeamTiger(scoreTeamTiger);
    }

    /**
     * Decrease the score for Team Tiger by 1 point. check here Nma
     */
    public void removeOneHere(View v) {
        scoreTeamTiger = scoreTeamTiger--;
        displayForTeamTiger(scoreTeamTiger);
    }

    /**
     * Displays the given score for Team Tiger.
     */
    public void displayForTeamTiger(int score) {
        TextView scoreView = findViewById(R.id.team_tiger_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team Jaguar by 1 point.
     */
    public void addOneHereB(View v) {
        scoreTeamJaguar = scoreTeamJaguar + 1;
        displayForTeamJaguar(scoreTeamJaguar);
    }

    /**
     * Decrease the score for Team Jaguar by 1 point.
     */
    public void removeOneHereB(View v) {
        scoreTeamJaguar = scoreTeamJaguar - 1;
        displayForTeamJaguar(scoreTeamJaguar);
    }

    /**
     * Displays the given score for Team Jaguar.
     */
    public void displayForTeamJaguar(int score) {
        TextView scoreView = findViewById(R.id.team_jaguar_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets and Displays scores for both Teams to 0 points.
     */
    public void resetBoth(View v) {
        scoreTeamTiger = 0;
        displayForTeamTiger(scoreTeamTiger);
        scoreTeamJaguar = 0;
        displayForTeamJaguar(scoreTeamJaguar);

    }
}
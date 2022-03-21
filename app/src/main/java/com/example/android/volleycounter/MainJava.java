package com.example.android.volleycounter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.example.volleycounter.R;


public class MainJava extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int setsTeamA = 0;
    int setsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wonSetTeamA(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        setsTeamA = setsTeamA + 1;
        displaySetsTeamA("SETS: " + setsTeamA);
    }

    public void pointTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void faultTeamA(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void wonSetTeamB(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        setsTeamB = setsTeamB + 1;
        displaySetsTeamB("SETS: " + setsTeamB);
    }

    public void pointTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void faultTeamB(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        setsTeamA = 0;
        setsTeamB = 0;
        displaySetsTeamA("SETS: " + setsTeamA);
        displaySetsTeamB("SETS: " + setsTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetsTeamA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_sets);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetsTeamB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_sets);
        scoreView.setText(String.valueOf(score));
    }
}
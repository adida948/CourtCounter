package com.danilocarrion.courtcounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    final int POINTS_FOR_THREE_THROW = 3;
    final int POINTS_FOR_TWO_THROW = 2;
    final int POINTS_FOR_FREE_THROW = 1;

    //Tracks Score for team A
    int scoreTeamA = 0;
    //Tracks Score for team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*Display score for team A*/
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Display score for team B*/
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Increase the score for Team A by 3 points*/
    public void addThreeForTeamA(View view) {
        scoreTeamA += POINTS_FOR_THREE_THROW;
        displayForTeamA(scoreTeamA);

    }

    /*Increase the score for Team A by 2 points*/
    public void addTwoForTeamA(View view) {
        scoreTeamA += POINTS_FOR_TWO_THROW;
        displayForTeamA(scoreTeamA);
    }

    /*Increase the score for Team A by 1 points*/
    public void addOneForTeamA(View view) {
        scoreTeamA += POINTS_FOR_FREE_THROW;
        displayForTeamA(scoreTeamA);

    }

    /*Increase the score for Team B by 3 points*/
    public void addThreeForTeamB(View view) {
        scoreTeamB += POINTS_FOR_THREE_THROW;
        displayForTeamB(scoreTeamB);

    }

    /*Increase the score for Team B by 2 points*/
    public void addTwoForTeamB(View view) {
        scoreTeamB += POINTS_FOR_TWO_THROW;
        displayForTeamB(scoreTeamB);
    }

    /*Increase the score for Team B by 1 points*/
    public void addOneForTeamB(View view) {
        scoreTeamB += POINTS_FOR_FREE_THROW;
        displayForTeamB(scoreTeamB);

    }

    /*Resets score for Team A and B*/
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }



}

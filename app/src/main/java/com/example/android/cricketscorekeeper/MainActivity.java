package com.example.android.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int runsInd = 0;
    private int runsAus = 0;
    private int wicketsInd = 0;
    private int wicketsAus = 0;
    private double oversInd = 0;
    private double oversAus = 0;
    private int currentOverInd = 0;
    private int currentOverAus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Function to display the runs scored by team India
    * */
    public void displayRunsInd(int runs) {
        TextView textView = (TextView) findViewById(R.id.runsInd);
        textView.setText("" + runs);
    }

    /* Function to add one run to team India score and display the score
    * */
    public void addOneRunInd(View view) {
        runsInd++;
        displayRunsInd(runsInd);
    }

    /* Function to add four runs to team India score and display the score
    * */
    public void addFourRunsInd(View view) {
        runsInd += 4;
        displayRunsInd(runsInd);
    }

    /* Function to add six runs to team India score and display the score
    * */
    public void addSixRunsInd(View view) {
        runsInd += 6;
        displayRunsInd(runsInd);
    }

    /* Function to display the wickets lost by team India
    * */
    public void displayWicketsInd(int wickets) {
        TextView textView = (TextView) findViewById(R.id.wicketsInd);
        textView.setText("" + wickets);
    }

    /* Function to add a wicket lost by team India
    * */
    public void addWicketInd(View view) {
        if (wicketsInd < 10) {
            wicketsInd++;
            displayWicketsInd(wicketsInd);
        }
    }

    /* Function to display the number of overs played by team India
    * */
    public void displayOversInd(String overs) {
        TextView textView = (TextView) findViewById(R.id.oversInd);
        textView.setText("" + overs);
    }

    /* Function to add one ball to the current over
    * */
    public void addBallInd(View view) {
        if (oversInd < 50) {
            currentOverInd++;
            oversInd += 0.1;
            if (currentOverInd == 6) {
                oversInd = (oversInd - 0.6) + 1;
                currentOverInd = 0;
            }
            displayOversInd(String.format("%.1f", oversInd));
        }
    }

    /* Function to display the runs scored by team Australia
    * */
    public void displayRunsAus(int runs) {
        TextView textView = (TextView) findViewById(R.id.runsAus);
        textView.setText("" + runs);
    }

    /* Function to add one run to team Aus score and display the score
    * */
    public void addOneRunAus(View view) {
        runsAus++;
        displayRunsAus(runsAus);
    }

    /* Function to add four runs to team Aus score and display the score
   * */
    public void addFourRunsAus(View view) {
        runsAus += 4;
        displayRunsAus(runsAus);
    }

    /* Function to add six runs to team India score and display the score
    * */
    public void addSixRunsAus(View view) {
        runsAus += 6;
        displayRunsAus(runsAus);
    }

    /* Function to display the wickets lost by team Aus
    * */
    public void displayWicketsAus(int wickets) {
        TextView textView = (TextView) findViewById(R.id.wicketsAus);
        textView.setText("" + wickets);
    }

    /* Function to add a wicket lost by team Aus
    * */
    public void addWicketAus(View view) {
        if (wicketsAus < 10) {
            wicketsAus++;
            displayWicketsAus(wicketsAus);
        }
    }

    /* Function to display the number of overs played by team India
    * */
    public void displayOversAus(String overs) {
        TextView textView = (TextView) findViewById(R.id.oversAus);
        textView.setText("" + overs);
    }

    /* Function to add one ball to the current over
    * */
    public void addBallAus(View view) {
        if (oversAus < 50) {
            currentOverAus++;
            oversAus += 0.1;
            if (currentOverAus == 6) {
                oversAus = (oversAus - 0.6) + 1;
                currentOverAus = 0;
            }
            displayOversAus(String.format("%.1f", oversAus));
        }
    }

    /* Function to reset all the scores
    * */
    public void reset(View view) {
        runsInd = 0;
        runsAus = 0;
        wicketsInd = 0;
        wicketsAus = 0;
        oversInd = 0;
        oversAus = 0;
        displayRunsInd(runsInd);
        displayWicketsInd(wicketsInd);
        displayOversInd(String.format("%.1f", oversInd));
        displayRunsAus(runsAus);
        displayWicketsAus(wicketsAus);
        displayOversAus(String.format("%.1f", oversAus));
    }
}

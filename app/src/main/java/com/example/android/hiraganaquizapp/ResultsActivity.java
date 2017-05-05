package com.example.android.hiraganaquizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * HiraganaQuizApp Created by Muir on 24/03/2017.
 */

public class ResultsActivity extends AppCompatActivity {

    private int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        score = getIntent().getExtras().getInt("SCORE");

        // string which tells the user how many questions they got correct
        String finalScoreString = score + getString(R.string.out_of_5);

        /*
        Toast message which says "You scored (score)/5"
         */
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.you_scored) + finalScoreString;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void goBack(View view) {

        // create a new intent to restart the quiz
        Intent restartIntent = new Intent(ResultsActivity.this, MainActivity.class);

        // start the new activity
        startActivity(restartIntent);
    }

    public void continueQuiz (View view){

        // create a new intent to continue with the next section
        Intent continueIntent = new Intent(ResultsActivity.this, MainActivity2.class);

        //save the score in the intent to pass to the next activity
        continueIntent.putExtra("SCORE", score);

        //start the new activity
        startActivity(continueIntent);
    }
}

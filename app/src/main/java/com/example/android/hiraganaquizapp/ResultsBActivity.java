package com.example.android.hiraganaquizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * HiraganaQuizApp Created by Muir on 10/04/2017.
 */

public class ResultsBActivity extends AppCompatActivity {

    private int score;
    private int quiz2Score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_b);

        score = getIntent().getExtras().getInt("SCORE");
        quiz2Score = getIntent().getExtras().getInt("QUIZ2SCORE");
        score = score + quiz2Score;

        // string which tells the user how many questions they got correct
        String quiz2ScoreString = quiz2Score + getString(R.string.out_of_5);
        String finalScoreString = getString(R.string.and_) + (score)
                + getString(R.string.out_of_10);

        /*
        Toast message which says "You scored (quiz2Score)/5 in this quiz and (score)/10 overall"
         */
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.you_scored) + quiz2ScoreString + " in this quiz, "
                + finalScoreString;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void goBack(View view) {

        // create a new intent to restart the quiz
        Intent restartBIntent = new Intent(ResultsBActivity.this, MainActivity2.class);

        restartBIntent.putExtra("SCORE", score);

        // start the new activity
        startActivity(restartBIntent);
    }


        /*
        When quiz 3 is created, this code will need to be changed to direct the user to that activity.
        For now, it returns the user to the MainActivity class.
         */
        public void continueQuiz (View view){

        score = score + quiz2Score;

        // create a new intent to continue with the next section
        Intent continueIntent = new Intent(ResultsBActivity.this, MainActivity.class);

        //save the score in the intent to pass to the next activity
        continueIntent.putExtra("SCORE", score);

        //start the new activity
        startActivity(continueIntent);
    }
}

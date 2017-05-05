package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * HiraganaQuizApp Created by Muir on 10/04/2017.
 */

public class MainActivity2 extends AppCompatActivity {

    private int score;
    private static final int quiz2Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);

        score = getIntent().getExtras().getInt("SCORE");

    }

    /*
     When the FAB is clicked, proceed to the first question
     */
    public void proceedToQuiz(View view) {

        // create a new intent to open the @link QuizActivityB
        Intent quizIntent = new Intent(MainActivity2.this, QuizActivityB.class);

        //save the scores in the intent to pass to the next activity
        quizIntent.putExtra("SCORE", score);
        quizIntent.putExtra("QUIZ2SCORE", quiz2Score);

        // start the new activity
        startActivity(quizIntent);
    }
}

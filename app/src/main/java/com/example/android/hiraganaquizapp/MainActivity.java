package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static final int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

    }

    /*
     When the FAB is clicked, proceed to the first question
     */
    public void proceedToQuiz(View view) {

        // create a new intent to open the @link QuizActivity
        Intent QuizIntent = new Intent(MainActivity.this, QuizActivity.class);

        //save the score in the intent to pass to the next activity
        QuizIntent.putExtra("SCORE", score);

        // start the new activity
        startActivity(QuizIntent);
    }

}


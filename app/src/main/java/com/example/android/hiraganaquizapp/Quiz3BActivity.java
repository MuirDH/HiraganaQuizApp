package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * HiraganaQuizApp Created by Muir on 10/04/2017.
 */

public class Quiz3BActivity extends AppCompatActivity{

    private static String answerString;
    private EditText answerText; // the text that the user typed in
    private int score;
    private int quiz2Score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3b);

        answerText = (EditText) findViewById(R.id.answer);
        answerText.setText(answerString); //turn user input into a string

        score = getIntent().getExtras().getInt("SCORE");
        quiz2Score = getIntent().getExtras().getInt("QUIZ2SCORE");

    }

    /*
     When the FAB is clicked, adjust the score as needed and proceed to the next question
     */
    public void onClick(View view) {

        answerString = answerText.getText().toString();

        // If the user's answer is one of these, then the answer is correct
        if ((answerString.equalsIgnoreCase("koo")) || (answerString.equalsIgnoreCase("ku"))) {
            quiz2Score = quiz2Score + 1; // add one to the current score
        }

        //proceed to question 4
        Intent quiz4BIntent = new Intent(Quiz3BActivity.this, Quiz4BActivity.class);

        //save the score in the intent to pass to the next activity
        quiz4BIntent.putExtra("SCORE", score);
        quiz4BIntent.putExtra("QUIZ2SCORE", quiz2Score);

        startActivity(quiz4BIntent);
    }
}

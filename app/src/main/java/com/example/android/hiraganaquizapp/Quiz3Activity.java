package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


/**
 * HiraganaQuizApp Created by Muir on 24/03/2017.
 */

public class Quiz3Activity extends AppCompatActivity {

    private static String answerString;
    private EditText answerText; // the text that the user typed in
    private int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        answerText = (EditText) findViewById(R.id.answer);
        answerText.setText(answerString); //turn user input into a string

        score = getIntent().getExtras().getInt("SCORE");

    }

    /*
     When the FAB is clicked, adjust the score as needed and proceed to the next question
     */
    public void onClick(View view) {

        answerString = answerText.getText().toString();

        // If the user's answer is one of these, then the answer is correct
        if ((answerString.equalsIgnoreCase("oo")) || (answerString.equalsIgnoreCase("u"))) {
            score = score + 1; // add one to the current score
        }

        //proceed to question 4
        Intent quiz4Intent = new Intent(Quiz3Activity.this, Quiz4Activity.class);

        //save the score in the intent to pass to the next activity
        quiz4Intent.putExtra("SCORE", score);

        startActivity(quiz4Intent);
    }

}

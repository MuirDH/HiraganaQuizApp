package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;


/**
 * HiraganaQuizApp Created by Muir on 24/03/2017.
 */

public class Quiz5Activity extends AppCompatActivity {

    private int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);

        score = getIntent().getExtras().getInt("SCORE");

    }

    public void onRadioButtonClicked(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    score = 0; // wrong answer
                break;
            case R.id.radioButton2:
                if (checked)
                    score = 0; // wrong answer
                break;
            case R.id.radioButton3:
                if (checked)
                    score = 0; // wrong answer
                break;
            case R.id.radioButton4:
                if (checked)
                    score = score + 1; // correct answer, add one to the current score
                break;
        }
    }

    public void onClick(View view) {

        // create a new intent to open the @link ResultsActivity
        Intent resultsIntent = new Intent(Quiz5Activity.this, ResultsActivity.class);

        //save the score in the intent to pass to the next activity
        resultsIntent.putExtra("SCORE", score);

        // start the new activity
        startActivity(resultsIntent);
    }
}

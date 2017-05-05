package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;


/**
 * HiraganaQuizApp Created by Muir Halleron on 23/03/2017.
 */

public class QuizActivity extends AppCompatActivity {

    // get the current score from the intent
    private int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity);

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
                    score = score + 1; // correct answer, add one to the score
                break;
            case R.id.radioButton4:
                if (checked)
                    score = 0; // wrong answer
                break;
        }
    }

    /*
     When the FAB is clicked, proceed to the next question
     */
    public void onClick(View view) {
        // create a new intent to open the @link Quiz2Activity
        Intent Quiz2Intent = new Intent(QuizActivity.this, Quiz2Activity.class);

        //save the score in the intent to pass to the next activity
        Quiz2Intent.putExtra("SCORE", score);

        // start the new activity
        startActivity(Quiz2Intent);
    }
}

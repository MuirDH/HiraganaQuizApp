package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

/**
 * HiraganaQuizApp Created by Muir on 10/04/2017.
 */

public class QuizActivityB extends AppCompatActivity {

    // get the current score from the intent
    private int score;
    private int quiz2Score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity_b);

        score = getIntent().getExtras().getInt("SCORE");
        quiz2Score = getIntent().getExtras().getInt("QUIZ2SCORE");


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    quiz2Score = 0; // wrong answer
                break;
            case R.id.radioButton2:
                if (checked)
                    quiz2Score = 0; // wrong answer
                break;
            case R.id.radioButton3:
                if (checked)
                    quiz2Score = quiz2Score + 1; // correct answer, add one to the score
                break;
            case R.id.radioButton4:
                if (checked)
                    quiz2Score = 0; // wrong answer
                break;
        }
    }

    /*
     When the FAB is clicked, proceed to the next question
     */
    public void onClick(View view) {
        // create a new intent to open the @link Quiz2BActivity
        Intent quiz2BIntent = new Intent(QuizActivityB.this, Quiz2BActivity.class);

        //save the scores in the intent to pass to the next activity
        quiz2BIntent.putExtra("SCORE", score);
        quiz2BIntent.putExtra("QUIZ2SCORE", quiz2Score);

        // start the new activity
        startActivity(quiz2BIntent);
    }
}

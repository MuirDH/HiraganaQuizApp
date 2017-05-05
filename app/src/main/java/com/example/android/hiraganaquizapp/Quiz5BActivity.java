package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

/**
 * HiraganaQuizApp Created by Muir on 10/04/2017.
 */

public class Quiz5BActivity extends AppCompatActivity {

    private int score;
    private int quiz2Score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5b);

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
                    quiz2Score = 0; // wrong answer
                break;
            case R.id.radioButton4:
                if (checked)
                    quiz2Score = quiz2Score + 1; // correct answer, add one to the current score
                break;
        }
    }

    public void onClick(View view) {

        // create a new intent to open the @link ResultsActivity
        Intent resultsBIntent = new Intent(Quiz5BActivity.this, ResultsBActivity.class);

        //save the scores in the intent to pass to the next activity
        resultsBIntent.putExtra("SCORE", score);
        resultsBIntent.putExtra("QUIZ2SCORE", quiz2Score);

        // start the new activity
        startActivity(resultsBIntent);
    }
}

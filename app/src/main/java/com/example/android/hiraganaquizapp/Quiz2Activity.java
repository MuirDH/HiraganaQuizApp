package com.example.android.hiraganaquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

/**
 * HiraganaQuizApp Created by Muir on 23/03/2017.
 */

public class Quiz2Activity extends AppCompatActivity {

    private CheckBox chk1;
    private CheckBox chk2;
    private CheckBox chk3;
    private CheckBox chk4;

    private int answerScore;

    private int score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        chk1 = (CheckBox) findViewById(R.id.checkBox);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk4 = (CheckBox) findViewById(R.id.checkBox4);

        answerScore = 0;

        score = getIntent().getExtras().getInt("SCORE");

    }

    /*
     When the FAB is clicked, adjust the score as needed and proceed to the next question
     */
    public void onClick(View view) {

        /*
        if checkboxes 1, 2, and 3 are checked, then the question has been answered correctly
         */
        if (chk1.isChecked() && chk2.isChecked() && chk3.isChecked() && !chk4.isChecked()) {
            answerScore = 1;
        } else {
            answerScore = 0;
        }

        score = score + answerScore;

        // create a new intent to open the @link Quiz3Activity
        Intent quiz3Intent = new Intent(Quiz2Activity.this, Quiz3Activity.class);

        //save the score in the intent to pass to the next activity
        quiz3Intent.putExtra("SCORE", score);

        // start the new activity
        startActivity(quiz3Intent);

    }

}

package com.gotg.birdquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    // Add an intro before starting the quiz
    public void startQuiz(View view)
    {
        // Create the main quiz page as an intent
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

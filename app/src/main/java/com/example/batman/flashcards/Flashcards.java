package com.example.batman.flashcards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Flashcards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcards);
        findViewById(R.id.flashcard_question).setBackgroundColor(getResources().getColor(R.color.my_red_color, null));
        findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.colorAccent, null));

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
            }
        });
    }
}

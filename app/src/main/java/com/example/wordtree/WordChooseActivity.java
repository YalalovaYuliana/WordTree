package com.example.wordtree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WordChooseActivity extends AppCompatActivity {

    Button claimButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_choose);

        claimButton = findViewById(R.id.claimButton);

        claimButton.setOnClickListener(v -> {
            Intent intent = new Intent(WordChooseActivity.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}
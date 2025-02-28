package com.example.wordtree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView allWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        allWords = findViewById(R.id.allWords);

        allWords.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, DictionaryActivity.class);
            startActivity(intent);
        });
    }
}
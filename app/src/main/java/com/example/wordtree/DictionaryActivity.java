package com.example.wordtree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Arrays;
import java.util.List;

public class DictionaryActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView wordListView;
    List<String> wordList = Arrays.asList("Abandon", "Ability", "Able", "Cat");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        wordListView = findViewById(R.id.wordListView);

        WordAdapter adapter = new WordAdapter(wordList, this);
        wordListView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, WordCardActivity.class);
        startActivity(intent);
    }
}
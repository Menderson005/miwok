package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create new ArrayList englishNumbers
        ArrayList<Word> wordsArray = new ArrayList<Word>();

        //Add english numbers to ArrayList
        wordsArray.add(new Word("red", "weṭeṭṭi"));
        wordsArray.add(new Word("green", "chokokki"));
        wordsArray.add(new Word("brown", "ṭakaakki"));
        wordsArray.add(new Word("gray", "ṭopoppi"));
        wordsArray.add(new Word("black", "kululli"));
        wordsArray.add(new Word("white", "kelelli"));
        wordsArray.add(new Word("dusty yellow", "topiise"));
        wordsArray.add(new Word("mustard yellow", "kawinta"));
        wordsArray.add(new Word("nine", "chiwiite"));


        WordAdapter adapter =
                new WordAdapter(this, wordsArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

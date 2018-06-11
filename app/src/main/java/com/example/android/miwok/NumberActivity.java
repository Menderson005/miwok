package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //Create new ArrayList englishNumbers
        ArrayList<Word> wordsArray = new ArrayList<Word>();

        //Add english numbers to ArrayList
        wordsArray.add(new Word("one", "lutti"));
        wordsArray.add(new Word("two", "otiiko"));
        wordsArray.add(new Word("three", "tolookosu"));
        wordsArray.add(new Word("four", "oyyisa"));
        wordsArray.add(new Word("five", "massokka"));
        wordsArray.add(new Word("six", "temmokka"));
        wordsArray.add(new Word("seven", "kenekaku"));
        wordsArray.add(new Word("eight", "kawinta"));
        wordsArray.add(new Word("nine", "wo'e"));
        wordsArray.add(new Word("ten", "na'aacha"));

        WordAdapter adapter =
                new WordAdapter(this, wordsArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}

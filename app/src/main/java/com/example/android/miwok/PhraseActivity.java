package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create new ArrayList englishNumbers
        ArrayList<Word> wordsArray = new ArrayList<Word>();

        //Add english numbers to ArrayList
        wordsArray.add(new Word(getString(R.string.phrase_Where), getString(R.string.phrase_Where_Mi)));
        wordsArray.add(new Word(getString(R.string.phrase_name), getString(R.string.phrase_NameMi)));
        wordsArray.add(new Word(getString(R.string.phrase_MyName), getString(R.string.phrase_MyNameMi)));
        wordsArray.add(new Word(getString(R.string.phrase_Feeling), getString(R.string.phrase_FeelingMi)));
        wordsArray.add(new Word(getString(R.string.phrase_Good), getString(R.string.phrase_GoodMi)));
        wordsArray.add(new Word(getString(R.string.phrase_Coming), getString(R.string.phrase_ComingMi)));
        wordsArray.add(new Word(getString(R.string.phrase_YesComing), getString(R.string.phrase_YesComingMi)));
        wordsArray.add(new Word(getString(R.string.phrase_ComingResponse), getString(R.string.phrase_ComingResponseMi)));
        wordsArray.add(new Word(getString(R.string.phrase_Go), getString(R.string.phrase_GoMi)));
        wordsArray.add(new Word(getString(R.string.phrase_Here), getString(R.string.phrase_HereMi)));


        WordAdapter adapter =
                new WordAdapter(this, wordsArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

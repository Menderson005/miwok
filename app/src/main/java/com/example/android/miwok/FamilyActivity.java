package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Create new ArrayList englishNumbers
        ArrayList<Word> wordsArray = new ArrayList<Word>();

        //Add english numbers to ArrayList
        wordsArray.add(new Word(getString(R.string.family_father), getString(R.string.family_fatherMi)));
        wordsArray.add(new Word(getString(R.string.family_Mother), getString(R.string.family_MotherMi)));
        wordsArray.add(new Word(getString(R.string.family_Son), getString(R.string.family_SonMi)));
        wordsArray.add(new Word(getString(R.string.family_Daughter), getString(R.string.family_DaughterMi)));
        wordsArray.add(new Word("older brother", "taachi"));
        wordsArray.add(new Word("younger brother", "chalitti"));
        wordsArray.add(new Word("older sister", "tete"));
        wordsArray.add(new Word("younger sister", "kolliti"));
        wordsArray.add(new Word("grandmother", "ama"));
        wordsArray.add(new Word("grandfather", "paapa"));


        WordAdapter adapter =
                new WordAdapter(this, wordsArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

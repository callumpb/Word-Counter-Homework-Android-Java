package com.example.user.countwords;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private EditText inputWords;
    private Button count_words_button;
    private int countValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.counter = (TextView) findViewById(R.id.counter);
        this.inputWords = (EditText) findViewById(R.id.inputWords);
        this.count_words_button = (Button) findViewById(R.id.count_words_button);

    }

    //how do i java

    //public void blah(View view)
    // if this method is grey, it means not hooked up
    public void onButtonClicked(View button) {
        String text =  this.inputWords.getText().toString();

        int countWords = Words.countWords(text);

        String countWordsAsString = Integer.toString(countWords);

        this.counter.setText(countWordsAsString);


        // EditText.countWords().toString();
        //int countWords = Words.countWords(text);
       // TextView.setText(Integer.toString(countWords));
        //this.counter.setText(Integer.toString(Words.countWords("text")));
    }


}


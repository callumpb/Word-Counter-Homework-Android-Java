package com.example.user.countwords;

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

    public int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }


    public void onButtonClicked(View button) {
        //
        // this.countValue = this.countWords(???? button);

        this.counter.setText(Integer.toString(this.countValue));
        //return this.countWords(View view);
    }


}


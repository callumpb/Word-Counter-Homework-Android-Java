package com.example.user.countwords;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.user.countwords.R;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private EditText inputWords;
    private Button count_words_button;
//    private int countValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.counter = (TextView) findViewById(R.id.counter);
        this.inputWords = (EditText) findViewById(R.id.inputWords);
        this.count_words_button = (Button) findViewById(R.id.count_words_button);

    }


    // if this method is grey, it means not hooked up
    public void onButtonClicked(View button) {
//        String text =  this.inputWords.getText().toString();
//        int countWords = Words.countWords(text);
//        String countWordsAsString = Integer.toString(countWords);
//        this.counter.setText(countWordsAsString);
        Intent intent = new Intent(this, CountActivity.class);
//        startActivity(intent);

        String text =  this.inputWords.getText().toString();
        int countWords = Words.countWords(text);
        String countWordsAsString = Integer.toString(countWords);
        this.counter.setText(countWordsAsString);

        intent.putExtra("count", countWordsAsString);
        startActivity(intent);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }

        else if (item.getItemId() == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }
        return true;
    }


}


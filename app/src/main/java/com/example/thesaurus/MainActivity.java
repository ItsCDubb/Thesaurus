package com.example.thesaurus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textBeginning;
    EditText textInput;
    TextView textDisplay;
    Button   buttonSynonyms;

    synonyms();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBeginning  = findViewById(R.id.text_beginning);
        textInput      = findViewById(R.id.text_input);
        buttonSynonyms = findViewById(R.id.button_synonyms);
        textDisplay    = findViewById(R.id.text_display);
        buttonSynonyms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Synonym", "The Synonym button was clicked");
            }
        });
    }
}

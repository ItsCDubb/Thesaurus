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

    String[] synonyms(String s){
        String[][] synonyms = new String[][] { {"swift",  "abrupt", "expeditious", "hasty", "nimble", "quick", "rapid", "speedy", "sudden", "unexpected"},
                {"objective", "detached", "disinterested", "dispassionate", "equitable", "evenhanded", "nonpartisan", "open-minded", "unbiased"},
                {"calculate", "adjust", "appraise", "consider", "count", "determine", "forecast", "gauge", "guess", "measure", "multiply", "reckon", "subtract", "tally", "weigh", "work out"},
                {"create", "build", "conceive", "constitute", "construct", "design", "devise", "discover", "establish", "forge", "form"} };

        for(int i = 0; i < synonyms.length; ++i) {
            for(int j = 0; j < synonyms[i].length; ++j){
                if(s.equals(synonyms[i][j])) {
                    return synonyms[i];
                }
            }
        }

        return null;
    }

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

                String[] synonymList = synonyms(textInput.getText().toString());
                String arrayToString = "";
                for(int i = 0; i < synonymList.length; ++i) {
                    arrayToString = arrayToString + synonymList[i] + " ";
                }
                textDisplay.setText(arrayToString);
            }
        });
    }
}

package com.example.logicaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submitButton;
    private EditText trueTrueInput;
    private EditText trueFalseInput;
    private EditText falseTrueInput;
    private EditText falseFalseInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueTrueInput = findViewById(R.id.trueTrueInput);
        trueFalseInput = findViewById(R.id.trueFalseInput);
        falseTrueInput = findViewById(R.id.falseTrueInput);
        falseFalseInput = findViewById(R.id.falseFalseInput);
        submitButton = findViewById(R.id.submitButton);


        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                checkAnswer();

            }
        });


    }

    public void checkAnswer(){
        if ((trueTrueInput.getText().toString().equals(R.string.T) ||trueTrueInput.getText().toString().equals(R.string.t))
                && (trueFalseInput.getText().toString().equals(R.string.F) ||trueFalseInput.getText().toString().equals(R.string.f))
                && (falseTrueInput.getText().toString().equals(R.string.F) ||falseTrueInput.getText().toString().equals(R.string.f))
                && (falseFalseInput.getText().toString().equals(R.string.F) || falseFalseInput.getText().toString().equals(R.string.f)))
        {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.wrong), Toast.LENGTH_SHORT).show();

        }

    }
}
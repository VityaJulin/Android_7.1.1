package com.example.android_711;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AfternoonActivity extends AppCompatActivity {
    private TextView mainTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);

        mainTxt = findViewById(R.id.text_main_afternoon);
    }
}
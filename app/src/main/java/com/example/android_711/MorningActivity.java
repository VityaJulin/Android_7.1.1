package com.example.android_711;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MorningActivity extends AppCompatActivity {
    private TextView mainTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);

        mainTxt = findViewById(R.id.text_main_morning);
    }
}
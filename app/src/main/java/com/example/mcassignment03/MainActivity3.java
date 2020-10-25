package com.example.mcassignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text = findViewById(R.id.ans);
        Intent intent = getIntent();
        String prayers  = intent.getStringExtra("RESULT");

        if(prayers != "")
            text.setText("Selected Prayers: " + prayers);
        else
            text.setText("No Prayers were Selected");
    }
}
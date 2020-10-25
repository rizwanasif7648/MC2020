package com.example.mcassignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioGroup radioGroup1, radioGroup2;
    RadioButton btn1, btn2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text  = findViewById(R.id.result);
        radioGroup1 = findViewById(R.id.radioGroup01);
        radioGroup2 = findViewById(R.id.radioGroup02);
    }


    public void ShowResults(View view)
    {
        btn1 = findViewById(radioGroup1.getCheckedRadioButtonId());
        btn2 = findViewById(radioGroup2.getCheckedRadioButtonId());

        text.setText(btn1.getText() + ", " + btn2.getText());
    }

    public void SecondActivity(View view)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
package com.example.mcassignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity2 extends AppCompatActivity
{
    CheckBox fajr, zohr, asr, maghrib,esha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fajr = findViewById(R.id.fj);
        zohr = findViewById(R.id.zh);
        asr = findViewById(R.id.ar);
        maghrib = findViewById(R.id.mg);
        esha = findViewById(R.id.es);


    }
    public void SelectedPrayers(View view)
    {
        String prayers = "";

        if (fajr.isChecked()){
            prayers += fajr.getText() + "  ";
        }

        if (zohr.isChecked()){
            prayers += zohr.getText() + "  ";
        }

        if (asr.isChecked()){
            prayers += asr.getText() + "  ";
        }

        if (maghrib.isChecked()){
            prayers += maghrib.getText() + "  ";
        }

        if (esha.isChecked()){
            prayers += esha.getText();
        }

        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("RESULT", prayers);
        startActivity(intent);
    }
}
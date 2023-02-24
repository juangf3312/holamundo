package com.example.datosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActividadDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);

        TextView textView=(TextView)findViewById(R.id.textView);

        textView.setText(getIntent().getStringExtra("nombre"));

        Intent intent=getIntent();
    }
}
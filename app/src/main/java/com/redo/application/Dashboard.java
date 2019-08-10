package com.redo.application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(v->{
            Intent intent = new Intent(this, suggestion.class);
            startActivity(intent);
        });

    }
}

package com.redo.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class suggestion extends AppCompatActivity {

    ImageButton b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        b1 = findViewById(R.id.imageButton);
        b2 = findViewById(R.id.imageButton1);
        b3 = findViewById(R.id.imageButton2);

        b1.setOnClickListener(v->{
            Intent intent = new Intent(this, checkOut.class);
            startActivity(intent);
        });

        b2.setOnClickListener(v->{
            Intent intent1 = new Intent(this, checkOut.class);
            startActivity(intent1);
        });
        b3.setOnClickListener(v->{
        Intent intent2 = new Intent(this, checkOut.class);
        startActivity(intent2);
        });
    }
}

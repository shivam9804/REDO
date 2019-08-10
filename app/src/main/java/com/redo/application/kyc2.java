package com.redo.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class kyc2 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyc2);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(v-> {
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        });

    }
}

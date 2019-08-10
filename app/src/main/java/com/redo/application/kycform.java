package com.redo.application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.redo.application.ui.kycform.KycformFragment;

public class kycform extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kycform_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, KycformFragment.newInstance())
                    .commitNow();
        }
        btn = findViewById(R.id.button);

        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}

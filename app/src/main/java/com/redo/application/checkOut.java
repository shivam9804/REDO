package com.redo.application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.redo.application.ui.checkout.CheckOutFragment;

public class checkOut extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_out_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CheckOutFragment.newInstance())
                    .commitNow();
        }

        btn1 = findViewById(R.id.button3);
        //Intent intent = new Intent(this, payment.class);
        //startActivity(intent);
    }
}

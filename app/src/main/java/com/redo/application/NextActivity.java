package com.redo.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.net.URI;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent receivedIntent = getIntent();
        String photo = receivedIntent.getStringExtra("photo");
        String name = receivedIntent.getStringExtra("name");
        String email = receivedIntent.getStringExtra("email");

        ImageView profileView = findViewById(R.id.profilePic);
        TextView nameView =  findViewById(R.id.name);
        TextView emailView =  findViewById(R.id.email);
        Log.d("==> Picasso Error", "Photo: " + photo);
        Picasso.get().load(photo).into(profileView);
        nameView.setText(name);
        emailView.setText(email);
    }
}

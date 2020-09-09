package com.agarwal.screennavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);
    }

    public void openMainActivity(View view) {
        Intent intent = new Intent(StartingScreen.this, MainActivity.class);
        startActivity(intent);
    }
}
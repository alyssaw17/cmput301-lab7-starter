package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameText = findViewById(R.id.cityNameText);
        Button backButton = findViewById(R.id.backButton);

        // Get the city name from intent
        String cityName = getIntent().getStringExtra("CITY_NAME");
        cityNameText.setText(cityName);

        // Go back to main activity
        backButton.setOnClickListener(v -> {
            // finish() just closes the current activity and returns to the previous one
            finish();
        });
    }
}

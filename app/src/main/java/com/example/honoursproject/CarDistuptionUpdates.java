package com.example.honoursproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CarDistuptionUpdates extends AppCompatActivity {
    ImageView returnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_distuption_updates);

        returnHome = (ImageView)findViewById(R.id.returnButton);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToMainActivity = new Intent(CarDistuptionUpdates.this, MainActivity.class);
                startActivity(returnToMainActivity);
            }
        });
    }
}

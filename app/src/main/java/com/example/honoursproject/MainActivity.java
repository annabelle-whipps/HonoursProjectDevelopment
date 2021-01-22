package com.example.honoursproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView carButton, trainButton, busButton, settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carButton = (ImageView)findViewById(R.id.carButton);

        //When car image clicked sent to car disruption update page.
        carButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewCarDisruptions = new Intent(MainActivity.this, CarDistuptionUpdates.class);
                startActivity(viewCarDisruptions);
            }
        });
    }
}

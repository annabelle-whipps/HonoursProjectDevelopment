package com.example.honoursproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    EditText username, password;
    Button signIn;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        //Edit text for username and password
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        //Button
        signIn = (Button)findViewById(R.id.signIn);
        //TextView
        register = (TextView) findViewById(R.id.registerNewUser);


    }
}

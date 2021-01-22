package com.example.honoursproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    EditText email, username, password, conPassword;
    Button register;
    TextView signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Edit text for registering new user
        email = (EditText)findViewById(R.id.emailAddress);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        conPassword = (EditText)findViewById(R.id.confirmPassword);

        //Button
        register = (Button)findViewById(R.id.register);
        //TextView to return to sign in page
        signIn = (TextView)findViewById(R.id.signInFromRegister);
    }
}

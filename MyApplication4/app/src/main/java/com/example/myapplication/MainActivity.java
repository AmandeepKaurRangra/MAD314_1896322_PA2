package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button button;
    String s1="abc";
    String s2="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username=findViewById(R.id.username);
        password=findViewById(R.id.password1);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Editable usernameEditText = username.getText();
                String name=usernameEditText.toString();

                Editable passwordEditText = password.getText();
                String password=passwordEditText.toString();

                if(name.equalsIgnoreCase(s1) && password.equalsIgnoreCase(s2))

                {
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);


                    intent.putExtra("username",name);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplication(),"incorrect username or password ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        }
    }

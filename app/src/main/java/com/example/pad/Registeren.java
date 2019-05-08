package com.example.pad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registeren extends AppCompatActivity {
    EditText email, wachtwoord, kenteken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeren);
        email = (EditText)findViewById(R.id.emailReg);
        wachtwoord = (EditText)findViewById(R.id.wwReg);
        kenteken = (EditText)findViewById(R.id.kentekenReg);


    }


    private void onReg(View view){
        String str_email = email.getText().toString();
        String str_wachtwoord = wachtwoord.getText().toString();
        String str_kenteken = kenteken.getText().toString();

        String type = "register";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,str_email,str_wachtwoord,str_kenteken);
    }


    private void terugNaarInlog(){
        Button terugButton = (Button) findViewById(R.id.RegTerugButton);
        terugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }





}






package com.example.pad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  private EditText userEmail,userWachtwoord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userEmail = (EditText) findViewById(R.id.homeEmail);
        userWachtwoord = (EditText) findViewById(R.id.homeww);
        naarRegPagina();
    }


    private void naarRegPagina(){
        Button nextButton = (Button) findViewById(R.id.homeReg);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,Registeren.class));

                }
            });
        }

    public void OnLogin(View view) {
        String username = userEmail.getText().toString();
        String password = userWachtwoord.getText().toString();
        String type = "login";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,username,password);


    }
}










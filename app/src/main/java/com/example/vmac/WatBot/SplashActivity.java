package com.example.vmac.WatBot;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private Button walkSafe, mentalHealth, careerAdvisor, fitnessAdvisor, campusHelp, sexualHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView floatingButton = findViewById(R.id.floatingButton);
        walkSafe = findViewById(R.id.btnWalkSafe);
        mentalHealth = findViewById(R.id.btnMentalHealth);
        careerAdvisor = findViewById(R.id.btnCareerAdvisor);
        fitnessAdvisor = findViewById(R.id.btnFitnessAdvisor);
        campusHelp = findViewById(R.id.btnCampusHelp);
        sexualHealth = findViewById(R.id.btnSexualAssault);




        floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }

        });

        walkSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog("https://uwsa.ca/uwsa-services/walksafe/");
            }
        });

        mentalHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("https://uwsa.ca/uwsa-services/walksafe/");


            }
        });


        careerAdvisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("https://uwsa.ca/uwsa-services/walksafe/");


            }
        });



        campusHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("https://uwsa.ca/uwsa-services/walksafe/");


            }
        });



        sexualHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("https://uwsa.ca/uwsa-services/walksafe/");


            }
        });



        fitnessAdvisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog("https://uwsa.ca/uwsa-services/walksafe/");

            }
        });

    }


    private void openDialog(String url) {

        Dialog dialog = new Dialog(this, android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_view);
        dialog.setCancelable(true);
        WebView browser = dialog.findViewById(R.id.webview);
       browser.loadUrl(url);
        dialog.show();

    }


}

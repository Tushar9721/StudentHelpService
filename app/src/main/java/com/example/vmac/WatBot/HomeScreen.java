package com.example.vmac.WatBot;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeScreen extends AppCompatActivity {

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
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

        });


        walkSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                walkSafeDialog();
            }
        });


        mentalHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mentalHealthDialog();

            }
        });


        careerAdvisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                careerServiceAdvisor();
            }
        });


        campusHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                campusHelpDialog();

            }
        });


        sexualHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sexualAssault();

            }
        });


        fitnessAdvisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fitnessDialog();

            }
        });

    }

    private void sexualAssault() {

        Dialog dialog = new Dialog(this, android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.service_sexual_assault);
        dialog.setCancelable(true);
        dialog.show();

    }

    private void fitnessDialog() {

        final boolean[] bookstore = {false};
        final boolean[] campus = {false};
        final boolean[] food = {false};
        final boolean[] conference = {false};


        Dialog dialog = new Dialog(this, android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.service_fitness);
        dialog.setCancelable(true);
        dialog.show();

        Button viewFoodPlan = dialog.findViewById(R.id.viewFitnessCenter);
        Button campusParking = dialog.findViewById(R.id.newForgefit);
        Button foodServices = dialog.findViewById(R.id.personalTrainingButton);
        Button viewConferenceService = dialog.findViewById(R.id.employeeWellness);

        final LinearLayout foodLayout = dialog.findViewById(R.id.fitnessLayout);
        final LinearLayout workShopLayoutView = dialog.findViewById(R.id.forgeFitLayout);
        final LinearLayout foodServiceLayout = dialog.findViewById(R.id.personalTrainingLayout);
        final LinearLayout conferenceServiceLayout = dialog.findViewById(R.id.employeeWellnessLayout);

        viewFoodPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!bookstore[0]) {
                    foodLayout.setVisibility(View.VISIBLE);
                    bookstore[0] = true;
                }
                else{
                    foodLayout.setVisibility(View.GONE);
                    bookstore[0] = false;
                }
            }
        });


        campusParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!campus[0]) {
                    workShopLayoutView.setVisibility(View.VISIBLE);
                    campus[0] = true;
                }
                else{
                    workShopLayoutView.setVisibility(View.GONE);
                    campus[0] = false;
                }
            }
        });

        foodServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!food[0]) {
                    foodServiceLayout.setVisibility(View.VISIBLE);
                    food[0] = true;
                }
                else{
                    foodServiceLayout.setVisibility(View.GONE);
                    bookstore[0] = false;
                }
            }
        });


        viewConferenceService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!conference[0]) {
                    conferenceServiceLayout.setVisibility(View.VISIBLE);
                    conference[0] = true;
                }
                else{
                    conferenceServiceLayout.setVisibility(View.GONE);
                    conference[0] = false;
                }
            }
        });



    }

    private void campusHelpDialog() {

        final boolean[] bookstore = {false};
        final boolean[] campus = {false};
        final boolean[] food = {false};
        final boolean[] conference = {false};


        Dialog dialog = new Dialog(this, android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.service_career_advisor);
        dialog.setCancelable(true);
        dialog.show();

        Button viewFoodPlan = dialog.findViewById(R.id.viewFoodPlan);
        Button campusParking = dialog.findViewById(R.id.campusParking);
        Button foodServices = dialog.findViewById(R.id.foodServices);
        Button viewConferenceService = dialog.findViewById(R.id.viewConferenceService);

        final LinearLayout foodLayout = dialog.findViewById(R.id.foodLayout);
        final LinearLayout workShopLayoutView = dialog.findViewById(R.id.workShopLayoutView);
        final LinearLayout foodServiceLayout = dialog.findViewById(R.id.foodServiceLayout);
        final LinearLayout conferenceServiceLayout = dialog.findViewById(R.id.conferenceServiceLayout);


        viewFoodPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!bookstore[0]) {
                    foodLayout.setVisibility(View.VISIBLE);
                    bookstore[0] = true;
                }
                else{
                    foodLayout.setVisibility(View.GONE);
                    bookstore[0] = false;
                }
            }
        });


        campusParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!campus[0]) {
                    workShopLayoutView.setVisibility(View.VISIBLE);
                    campus[0] = true;
                }
                else{
                    workShopLayoutView.setVisibility(View.GONE);
                    campus[0] = false;
                }
            }
        });

        foodServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!food[0]) {
                    foodServiceLayout.setVisibility(View.VISIBLE);
                    food[0] = true;
                }
                else{
                    foodServiceLayout.setVisibility(View.GONE);
                    bookstore[0] = false;
                }
            }
        });


        viewConferenceService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!conference[0]) {
                    conferenceServiceLayout.setVisibility(View.VISIBLE);
                    conference[0] = true;
                }
                else{
                    conferenceServiceLayout.setVisibility(View.GONE);
                    conference[0] = false;
                }
            }
        });



    }

    private void careerServiceAdvisor() {

        final boolean[] winter = {false};
        final boolean[] workshop = {false};


        Dialog dialog = new Dialog(this, android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.service_campus_help);
        dialog.setCancelable(true);
        dialog.show();

        Button viewWinters = dialog.findViewById(R.id.viewWinter);
        Button workshopButton = dialog.findViewById(R.id.viewWorkshop);


        final LinearLayout winterLayout = dialog.findViewById(R.id.winterLayout);
        final LinearLayout workShopLayout = dialog.findViewById(R.id.workShopLayout);


        viewWinters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!winter[0]) {
                    winterLayout.setVisibility(View.VISIBLE);
                    winter[0] = true;
                }
                else{
                    winterLayout.setVisibility(View.GONE);
                    winter[0] = false;
                }
            }
        });


        workshopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!workshop[0]) {
                    workShopLayout.setVisibility(View.VISIBLE);
                    workshop[0] = true;
                }
                else{
                    workShopLayout.setVisibility(View.GONE);
                    workshop[0] = false;
                }
            }
        });



    }

    private void walkSafeDialog() {

        Dialog dialog = new Dialog(this, android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.service_walksafe);
        dialog.setCancelable(true);
        dialog.show();

    }


    private void mentalHealthDialog() {

        final boolean[] viewCampus = {false};
        final boolean[] hour = {false};


        Dialog dialog = new Dialog(this, android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.service_mental);
        dialog.setCancelable(true);
        dialog.show();

        Button viewOnCampus = dialog.findViewById(R.id.viewOnCampus);
        Button view24Hour = dialog.findViewById(R.id.view24Hour);

        final LinearLayout onCampusHide = dialog.findViewById(R.id.onCampusHide);
        final LinearLayout fullHoursHelp = dialog.findViewById(R.id.fullHoursHelp);


            viewOnCampus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!viewCampus[0]) {
                        onCampusHide.setVisibility(View.VISIBLE);
                        viewCampus[0] = true;
                    }
                    else{
                        onCampusHide.setVisibility(View.GONE);
                        viewCampus[0] = false;
                    }
                }
            });

        view24Hour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!hour[0]) {
                    fullHoursHelp.setVisibility(View.VISIBLE);
                    hour[0] = true;
                }
                else{
                    fullHoursHelp.setVisibility(View.GONE);
                    hour[0] = false;
                }
            }
        });

    }


}

package com.cruxapps.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button profile_button , about_button;
    private TextView welcome_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         profile_button =  findViewById (R.id.profile_button);
         about_button=findViewById(R.id.about_button);
         welcome_tv = findViewById(R.id.welcome_tv);

         profile_button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //start My profile Class//
                 Intent myIntent = new Intent(MainActivity.this,
                         MyProfile.class);
                 startActivity(myIntent);
             }
         });

         about_button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                //start  AboutAlc class//
                 Intent myIntent= new Intent(MainActivity.this,
                         AboutAlc.class);
                 startActivity(myIntent);

             }
         });


    }



}

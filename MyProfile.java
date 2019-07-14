package com.cruxapps.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {
private TextView track_tv, country_tv, email_tv,slackusername_tv,phonenumber_tv, android_tv,nigeria_tv, email_textview,numberdigits_tv, danieln_tv;
private ImageView dp_image;
private View divider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        track_tv= findViewById(R.id.track_tv);
        country_tv= findViewById(R.id.country_tv);
        email_tv= findViewById(R.id.email_tv);
        slackusername_tv= findViewById(R.id.slackusername_tv);
        phonenumber_tv= findViewById(R.id.phonenumber_tv);
        android_tv= findViewById(R.id.android_tv);
        nigeria_tv= findViewById(R.id.nigeria_tv);
        email_textview= findViewById(R.id.email_textview);
        numberdigits_tv= findViewById(R.id.numberdigits_tv);
        danieln_tv= findViewById(R.id.danieln_tv);

        dp_image= findViewById(R.id.dp_image);










    }
}

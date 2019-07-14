package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private Button cAboutAlc;
    private Button cMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG ,"onCreate:started" );

        cAboutAlc = (Button)findViewById(R.id.button_1);
        cAboutAlc.setOnClickListener(this);
        cMyProfile = (Button)findViewById(R.id.button_2);
        cMyProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     if(v.getId() == R.id.button_1){
         Log.d(TAG,"about alc:logging to alc page");

         Intent intent = new Intent(MainActivity.this,AboutAlcActivity.class);
         startActivity(intent);
         overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

     }
     else {
         if (v.getId() == R.id.button_2) {

             Log.d(TAG, "my profile:logging to my profile");
             Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
             startActivity(intent);
             overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
         }
     }
    }
}

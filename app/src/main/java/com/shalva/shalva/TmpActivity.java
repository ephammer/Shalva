package com.shalva.shalva;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

public class TmpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmp);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // SharedPreference that checks if user already used App
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        boolean neverStarted = prefs.getBoolean("firstRun", true);

//        if (neverStarted) {
//
//            SharedPreferences.Editor edit = prefs.edit();
//            edit.putBoolean("firstRun", false);
//            edit.commit();

        startActivity(new Intent(TmpActivity.this, MainActivity.class));
        finish();
//        }
//        else {
//            startActivity(new Intent(TmpActivity.this , DriverActivity.class));
//            finish();
//        }
    }

}

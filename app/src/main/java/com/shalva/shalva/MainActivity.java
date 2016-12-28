package com.shalva.shalva;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button driverButton;
    Button helperButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        driverButton = (Button) findViewById(R.id.driver_button);
        helperButton = (Button) findViewById(R.id.helper_button);


        driverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent driverIntent = new Intent(MainActivity.this, DriverActivity.class);
                startActivity(driverIntent);
                finish();
            }
        });

        helperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverIntent = new Intent(MainActivity.this, HelperActivity.class);
                startActivity(driverIntent);
                finish();
            }
        });
    }


}

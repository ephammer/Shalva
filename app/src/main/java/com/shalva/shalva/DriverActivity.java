package com.shalva.shalva;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DriverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hood_list);

        final ArrayList<Hood> hoods = new ArrayList<>();
        hoods.add(new Hood("Bayt Vegan"));
        hoods.add(new Hood("Givat Mordekhai"));
        hoods.add(new Hood("Talpioth"));
        hoods.add(new Hood("Shaarei Hessed"));
        hoods.add(new Hood("Givat Ram"));

        HoodAdapter adapter = new HoodAdapter(this, hoods);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Hood hood = hoods.get(position);

                Intent intent = new Intent(DriverActivity.this, GeoFencingActivity.class);
                startActivity(intent);
            }
        });

    }


}

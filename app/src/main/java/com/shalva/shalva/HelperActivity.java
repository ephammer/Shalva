package com.shalva.shalva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HelperActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hood_list);

        final ArrayList<Child> children = new ArrayList<>();
        children.add(new Child("Gabriel Levy", new Hood("Bayt Vegan")));
        children.add(new Child("Jessica Marciano", new Hood("Bayt Vegan")));
        children.add(new Child("Gabriel Abensour", new Hood("Talpioth")));

        final ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Dan Levy", children));
        teachers.add(new Teacher("Patrick Cohen", children));
        teachers.add(new Teacher("Kimberly Johanna", children));


        TextView question = (TextView) findViewById(R.id.question_textView);
        question.setText("Which Helper is there ?");
        TeacherAdapter adapter = new TeacherAdapter(this, teachers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Teacher teacher = teachers.get(position);

                // Start GeoFencing for this activity
                Intent intent = new Intent(HelperActivity.this, GeoFencingActivity.class);
                startActivity(intent);
            }
        });

    }

}
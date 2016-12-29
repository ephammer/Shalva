package com.shalva.shalva;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChildActivity extends AppCompatActivity {
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
        question.setText("Which Kid is there ?");
        ChildAdapter adapter = new ChildAdapter(this, children);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

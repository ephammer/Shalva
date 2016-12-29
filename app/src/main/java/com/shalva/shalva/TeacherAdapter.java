package com.shalva.shalva;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kid0n on 29/12/2016.
 */

public class TeacherAdapter extends ArrayAdapter<Teacher> {

    public TeacherAdapter(Context context, ArrayList<Teacher> teachers) {
        super(context, 0, teachers);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.human_list_item, parent, false);
        }

        final Teacher currentTeacher = getItem(position);

        TextView humanName = (TextView) listItemView.findViewById(R.id.human_name_text_view);
        humanName.setText(currentTeacher.getName());

        Switch presenceSwitch = (Switch) listItemView.findViewById(R.id.presence_switch);

        presenceSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    currentTeacher.present();
                    Intent intent = new Intent(getContext(), ChildActivity.class);
                    getContext().startActivity(intent);
                } else
                    currentTeacher.absent();

            }
        });
        return listItemView;
    }
}

package com.shalva.shalva;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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

        Teacher currentTeacher = getItem(position);

        TextView hoodName = (TextView) listItemView.findViewById(R.id.human_name_text_view);
        hoodName.setText(currentTeacher.getName());

        return listItemView;
    }
}

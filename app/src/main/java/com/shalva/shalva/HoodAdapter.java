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
 * Created by kid0n on 27/12/2016.
 */

public class HoodAdapter extends ArrayAdapter<Hood> {

    public HoodAdapter(Context context, ArrayList<Hood> hoods) {
        super(context, 0, hoods);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hood_list_item, parent, false);
        }

        Hood currentHood = getItem(position);

        TextView hoodName = (TextView) listItemView.findViewById(R.id.hood_name_text_view);
        hoodName.setText(currentHood.getName());

        return listItemView;
    }
}

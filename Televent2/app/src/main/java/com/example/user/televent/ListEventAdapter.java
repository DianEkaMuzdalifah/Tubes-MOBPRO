package com.example.user.televent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 3/15/2017.
 */

public class ListEventAdapter extends ArrayAdapter<ListEvent>{
    public ListEventAdapter(Context context, List<ListEvent> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);
        }


        ListEvent current =  getItem(position);

        ImageView imageEvent = (ImageView) convertView.findViewById(R.id.imageEvent);
        imageEvent.setImageResource(current.getmImageEvent());

        TextView costEvent = (TextView) convertView.findViewById(R.id.cost);
        costEvent.setText(current.getmCostEvent());

        TextView titleEvent = (TextView) convertView.findViewById(R.id.titleEvent);
        titleEvent.setText(current.getmTitleEvent());

        TextView schedule = (TextView) convertView.findViewById(R.id.schedule);
        schedule.setText(current.getmScheduleEvent());

        TextView location = (TextView) convertView.findViewById(R.id.location);
        location.setText(current.getmLocationEvent());

        return  convertView;
    }




}

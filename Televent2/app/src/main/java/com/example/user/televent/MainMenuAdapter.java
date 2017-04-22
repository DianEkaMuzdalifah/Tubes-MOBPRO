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
 * Created by user on 3/17/2017.
 */

public class MainMenuAdapter extends ArrayAdapter<MainMenu> {
    public MainMenuAdapter(Context context, List<MainMenu> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_mainlist, parent, false);
        }

        MainMenu current = (MainMenu) getItem(position);

        ImageView imageEvent = (ImageView) convertView.findViewById(R.id.icon);
        imageEvent.setImageResource(current.getmImageResource());

        TextView costEvent = (TextView) convertView.findViewById(R.id.menuTitle);
        costEvent.setText(current.getmTextResource());

        return  convertView;
    }
}

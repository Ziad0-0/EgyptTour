package me.ziad_khaled.egypttour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AppAdapter extends ArrayAdapter<App> {
    public AppAdapter(Context context, ArrayList<App> appsList) {
        super(context, 0, appsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        }
        App currentApp = getItem(position);

        //set the current app image
        ImageView appImage = convertView.findViewById(R.id.item_image);
        Glide.with(convertView).load(currentApp.getImageID()).into(appImage);


        //set the current app name
        TextView appName = convertView.findViewById(R.id.item_name);
        appName.setText(currentApp.getName());

        //set the current app description
        TextView appDescription = convertView.findViewById(R.id.item_description);
        appDescription.setText(currentApp.getDescription());

        return convertView;
    }
}

package me.ziad_khaled.egypttour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, int resources, ArrayList<Place> placesList) {
        super(context, 0, placesList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);
        }

        Place currentPlace = getItem(position);

        //set the current place image
        ImageView placeImage = listItem.findViewById(R.id.item_image);
        Glide.with(listItem).load(currentPlace.getImageID()).into(placeImage);


        //set the current place name
        TextView placeName = listItem.findViewById(R.id.item_name);
        placeName.setText(currentPlace.getName());

        //set the current place description
        TextView placeDescription = listItem.findViewById(R.id.item_description);
        placeDescription.setText(currentPlace.getDescription());


        return listItem;
    }
}

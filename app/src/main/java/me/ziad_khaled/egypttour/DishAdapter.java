package me.ziad_khaled.egypttour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class DishAdapter extends ArrayAdapter<Dish> {
    public DishAdapter(Context context, ArrayList<Dish> dishesList) {
        super(context, 0, dishesList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        }

        Dish currentDish = getItem(position);
        
        //set the current dish image
        ImageView dishImage = convertView.findViewById(R.id.item_image);
        Glide.with(convertView).load(currentDish.getImageID()).into(dishImage);


        //set the current dish name
        TextView dishName = convertView.findViewById(R.id.item_name);
        dishName.setText(currentDish.getName());

        //set the current dish description
        TextView dishDescription = convertView.findViewById(R.id.item_description);
        dishDescription.setText(currentDish.getDescription());

        return convertView;
    }
}

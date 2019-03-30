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
    public DishAdapter(Context context, int resources, ArrayList<Dish> dishesList) {
        super(context, 0, dishesList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);
        }

        Dish currentDish = getItem(position);
        
        //set the current dish image
        ImageView dishImage = listItem.findViewById(R.id.item_image);
        Glide.with(listItem).load(currentDish.getImageID()).into(dishImage);


        //set the current dish name
        TextView dishName = listItem.findViewById(R.id.item_name);
        dishName.setText(currentDish.getName());

        //set the current dish description
        TextView dishDescription = listItem.findViewById(R.id.item_description);
        dishDescription.setText(currentDish.getDescription());

        return listItem;
    }
}

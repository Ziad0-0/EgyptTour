package me.ziad_khaled.egypttour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder> {
    private ArrayList<Place> placesList;

    public static class PlaceViewHolder extends RecyclerView.ViewHolder{

        public ImageView placeImage;
        public TextView placeName;
        public TextView placeDescription;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.item_image);
            placeName = itemView.findViewById(R.id.item_name);
            placeDescription = itemView.findViewById(R.id.item_description);
        }

    }

    public PlacesAdapter(ArrayList<Place> placesList) {
        this.placesList = placesList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public PlacesAdapter.PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new PlaceViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(PlaceViewHolder holder, final int position) {
        Place currentPlace = placesList.get(position);
        Glide.with(holder.itemView).load(currentPlace.getImageID()).into(holder.placeImage);
        holder.placeName.setText(currentPlace.getName());
        holder.placeDescription.setText(currentPlace.getDescription());
        holder.itemView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Place currentPlace = placesList.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentPlace.getLocation()));
                v.getContext().startActivity(intent);
            }
        }));
    }


    @Override
    public int getItemCount() {
        return placesList.size();
    }

}



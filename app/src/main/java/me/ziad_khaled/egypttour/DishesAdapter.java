package me.ziad_khaled.egypttour;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DishesAdapter extends RecyclerView.Adapter<DishesAdapter.DishViewHolder> {
private ArrayList<Dish> dishesList;

public static class DishViewHolder extends RecyclerView.ViewHolder{

    public ImageView dishImage;
    public TextView dishName;
    public TextView dishDescription;

    public DishViewHolder(@NonNull View itemView) {
        super(itemView);
        dishImage = itemView.findViewById(R.id.item_image);
        dishName = itemView.findViewById(R.id.item_name);
        dishDescription = itemView.findViewById(R.id.item_description);
    }

}

    public DishesAdapter(ArrayList<Dish> dishesList) {
        this.dishesList = dishesList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public DishesAdapter.DishViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new DishesAdapter.DishViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(DishesAdapter.DishViewHolder holder, final int position) {
        Dish currentDish = dishesList.get(position);
        Glide.with(holder.itemView).load(currentDish.getImageID()).into(holder.dishImage);
        holder.dishName.setText(currentDish.getName());
        holder.dishDescription.setText(currentDish.getDescription());
        holder.itemView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dish currentDish = dishesList.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentDish.getRecipeURL()));
                v.getContext().startActivity(intent);
            }
        }));
    }


    @Override
    public int getItemCount() {
        return dishesList.size();
    }

}



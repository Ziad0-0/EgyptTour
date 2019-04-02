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

public class AppsAdapter extends RecyclerView.Adapter<AppsAdapter.AppViewHolder> {
    private ArrayList<App> appsList;

    public static class AppViewHolder extends RecyclerView.ViewHolder{

        public ImageView appImage;
        public TextView appName;
        public TextView appDescription;

        public AppViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.item_image);
            appName = itemView.findViewById(R.id.item_name);
            appDescription = itemView.findViewById(R.id.item_description);
        }

    }

    public AppsAdapter(ArrayList<App> appsList) {
        this.appsList = appsList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AppsAdapter.AppViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new AppsAdapter.AppViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(AppsAdapter.AppViewHolder holder, final int position) {
        App currentApp = appsList.get(position);
        Glide.with(holder.itemView).load(currentApp.getImageID()).into(holder.appImage);
        holder.appName.setText(currentApp.getName());
        holder.appDescription.setText(currentApp.getDescription());
        holder.itemView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                App currentApp = appsList.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentApp.getUrl()));
                v.getContext().startActivity(intent);
            }
        }));
    }


    @Override
    public int getItemCount() {
        return appsList.size();
    }

}



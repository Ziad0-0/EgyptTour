package me.ziad_khaled.egypttour;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {
    private ArrayList<Contact> contactsList;

    public static class ContactViewHolder extends RecyclerView.ViewHolder{

        public TextView contactName;


        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            contactName = itemView.findViewById(R.id.contact_name);
        }

    }

    public ContactsAdapter(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ContactsAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_layout, parent, false);
        return new ContactsAdapter.ContactViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(ContactsAdapter.ContactViewHolder holder, final int position) {
        Contact currentContact = contactsList.get(position);
        holder.contactName.setText(currentContact.getName());
        holder.itemView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact currentContact = contactsList.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentContact.getNumber()));
                v.getContext().startActivity(intent);
            }
        }));
    }


    @Override
    public int getItemCount() {
        return contactsList.size();
    }

}




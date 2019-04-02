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

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(Context context, ArrayList<Contact> contactsList) {
        super(context, 0, contactsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_layout, parent, false);
        }

        Contact currentContact = getItem(position);

        //set the current contact name
        TextView contactName = convertView.findViewById(R.id.contact_name);
        contactName.setText(currentContact.getName());

        return convertView;
    }
}

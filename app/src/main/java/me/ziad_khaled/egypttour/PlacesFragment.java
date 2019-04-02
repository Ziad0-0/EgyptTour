package me.ziad_khaled.egypttour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final ArrayList<Place> placesList = DataStorage.getTouristicPlacesList();

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),  placesList);
        View view = inflater.inflate(R.layout.items_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.items_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Place currentPlace = placesList.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentPlace.getLocation()));
                startActivity(intent);
            }
        });

        return view;
    }
}


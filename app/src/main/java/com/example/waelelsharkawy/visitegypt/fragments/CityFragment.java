package com.example.waelelsharkawy.visitegypt.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.waelelsharkawy.visitegypt.R;
import com.example.waelelsharkawy.visitegypt.adapters.PlacesAdapter;
import com.example.waelelsharkawy.visitegypt.classes.City;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CityFragment extends Fragment {

    ListView simpleList;
    ArrayList<City> CityList = new ArrayList<>();
    public CityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_city, container, false);
        simpleList = view.findViewById(R.id.list_places);
        CityList.add(new City("Pyramids","The Egyptian pyramids are ancient pyramid-shaped masonry structures located in Egypt. As of November 2008, sources cite either 118 or 138 as the number of identified Egyptian pyramids",R.drawable.pyramids));
        CityList.add(new City("Al-Hussain Mosque","The Al-Hussain Mosque is a mosque built in 1154 The mosque is located in Cairo, Egypt, near the Khan El-Khalili bazaar",R.drawable.huseyi));
        CityList.add(new City("Azhar park","Its a good place for Relaxing",R.drawable.azharpark));
        CityList.add(new City("Ibn Tulun Mosque","The Mosque of Ibn Tulun is located in Cairo, Egypt. It is the oldest mosque in the city surviving in its original form, and is the largest mosque in Cairo in terms of land area.",R.drawable.ibntulunmosque));
        CityList.add(new City("Ibn Tulun Mosque","The Mosque of Ibn Tulun is located in Cairo, Egypt. It is the oldest mosque in the city surviving in its original form, and is the largest mosque in Cairo in terms of land area.",R.drawable.ibntulunmosque));
        PlacesAdapter myAdapter = new PlacesAdapter(getContext(), R.layout.row_city_layout, CityList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "This click Will move to an Activity that show more details about That City", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}

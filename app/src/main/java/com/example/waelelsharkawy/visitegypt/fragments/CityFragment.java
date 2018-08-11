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
        CityList.add(new City(getString(R.string.pyramds),getString(R.string.cityfragmentdesc1),R.drawable.pyramids));
        CityList.add(new City(getString(R.string.hussain_mosque),getString(R.string.cityfragmentdesc2),R.drawable.huseyi));
        CityList.add(new City(getString(R.string.azhar_park),getString(R.string.cityfragmentdesc3),R.drawable.azharpark));
        CityList.add(new City(getString(R.string.tulun_mosque),getString(R.string.cityfragmentdesc4),R.drawable.ibntulunmosque));
        CityList.add(new City(getString(R.string.tulun_mosque),getString(R.string.cityfragmentdesc4),R.drawable.ibntulunmosque));
        PlacesAdapter myAdapter = new PlacesAdapter(getContext(), R.layout.row_city_layout, CityList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), R.string.toast_cityfragment, Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}

package com.example.waelelsharkawy.visitegypt.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.waelelsharkawy.visitegypt.DestnationActivity;
import com.example.waelelsharkawy.visitegypt.R;
import com.example.waelelsharkawy.visitegypt.adapters.CustomPlacesAdapter;
import com.example.waelelsharkawy.visitegypt.classes.Places;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DestnationsFragment extends Fragment {

    ListView simpleList;
    ArrayList<Places> PlacesList = new ArrayList<>();
    public DestnationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_destnations, container, false);


        simpleList = view.findViewById(R.id.list_places);
        PlacesList.add(new Places("Alexandria",R.drawable.alexandria));
        PlacesList.add(new Places("Cairo",R.drawable.cairo));
        PlacesList.add(new Places("Ain Sokhna",R.drawable.ain_sokhna));
        PlacesList.add(new Places("Giza",R.drawable.giza));
        PlacesList.add(new Places("Aswan",R.drawable.aswan));
        PlacesList.add(new Places("Sharm Elsheikh",R.drawable.sharm_elsheikh));
        PlacesList.add(new Places("Luxor",R.drawable.luxor));
        PlacesList.add(new Places("Suez",R.drawable.suez));
        CustomPlacesAdapter myAdapter = new CustomPlacesAdapter(getContext(), R.layout.row_places_layout, PlacesList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getContext(), DestnationActivity.class);
                    startActivity(intent);
                }
        });
        return view;
    }

}

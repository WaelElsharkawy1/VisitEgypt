package com.example.waelelsharkawy.visitegypt.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.waelelsharkawy.visitegypt.adapters.CustomHomeAdapter;
import com.example.waelelsharkawy.visitegypt.R;
import com.example.waelelsharkawy.visitegypt.classes.Places;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ListView simpleList;
    ArrayList<Places> PlacesList = new ArrayList<>();
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        simpleList = view.findViewById(R.id.list_items);
        PlacesList.add(new Places(getString(R.string.alexandria),getString(R.string.alex_desc),R.drawable.alexandria));
        PlacesList.add(new Places(getString(R.string.cairo),getString(R.string.cairo_desc),R.drawable.cairo));
        PlacesList.add(new Places(getString(R.string.giza),getString(R.string.giza_desc),R.drawable.giza));
        PlacesList.add(new Places(getString(R.string.aswan),getString(R.string.aswan_desc),R.drawable.aswan));
        CustomHomeAdapter myAdapter = new CustomHomeAdapter(getContext(), R.layout.row_home_layout, PlacesList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), R.string.toast_homefragment, Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}

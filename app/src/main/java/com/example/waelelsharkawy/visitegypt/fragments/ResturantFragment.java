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
import com.example.waelelsharkawy.visitegypt.adapters.ResturantAdapter;
import com.example.waelelsharkawy.visitegypt.classes.Resturant;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResturantFragment extends Fragment {

    ListView simpleList;
    ArrayList<Resturant> RestList = new ArrayList<>();
    public ResturantFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resturant, container, false);
        simpleList = view.findViewById(R.id.list_places);
        RestList.add(new Resturant(getString(R.string.zitouni),getString(R.string.rest_desc),R.drawable.zitouni));
        RestList.add(new Resturant(getString(R.string.zooba),getString(R.string.rest_desc2),R.drawable.zooba));
        RestList.add(new Resturant(getString(R.string.zooba),getString(R.string.rest_desc2),R.drawable.zooba));
        RestList.add(new Resturant(getString(R.string.healthy),getString(R.string.rest_desc3),R.drawable.healthy));
        RestList.add(new Resturant(getString(R.string.healthy),getString(R.string.rest_desc3),R.drawable.healthy));
        ResturantAdapter myAdapter = new ResturantAdapter(getContext(), R.layout.row_resturant_layout, RestList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), R.string.toast_restfragment, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}

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
        RestList.add(new Resturant("zitouni","'Enjoy authentic Egyptian food at Zitouni restaurant, Four Seasons Hotel Cairo at Nile Plaza's 24-hour-a-day restaurant.'",R.drawable.zitouni));
        RestList.add(new Resturant("Zooba","Food Delivery Like Never Before. Order Your Favourite Food Here! Best Delivery Service. No More Calls. Cash on Delivery. Types: Burger, Pizza, Pasta, Sushi, Kebab, Indian, Thai, Mexican.",R.drawable.zooba));
        RestList.add(new Resturant("Zooba","Food Delivery Like Never Before. Order Your Favourite Food Here! Best Delivery Service. No More Calls. Cash on Delivery. Types: Burger, Pizza, Pasta, Sushi, Kebab, Indian, Thai, Mexican.",R.drawable.zooba));
        RestList.add(new Resturant("healthy ","Healthy uses the freshest Egyptian local produce to create simple and flavourful gourmet interpretations of Egyptian street food",R.drawable.healthy));
        RestList.add(new Resturant("healthy ","Healthy uses the freshest Egyptian local produce to create simple and flavourful gourmet interpretations of Egyptian street food",R.drawable.healthy));
        ResturantAdapter myAdapter = new ResturantAdapter(getContext(), R.layout.row_resturant_layout, RestList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "This click Will move to an Activity that show more details about This Resturant", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}

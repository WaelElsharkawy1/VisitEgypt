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
import com.example.waelelsharkawy.visitegypt.adapters.HotelAdapter;
import com.example.waelelsharkawy.visitegypt.classes.Hotel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    ListView simpleList;
    ArrayList<Hotel> HotelList = new ArrayList<>();
    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);
        simpleList = view.findViewById(R.id.list_places);
        HotelList.add(new Hotel("Pharaohs Hotel","50 $ per night","A great hotel in the middle of cairo",R.drawable.pharaohshotel));
        HotelList.add(new Hotel("Pharaohs Hotel","50 $ per night","A great hotel in the middle of cairo",R.drawable.pharaohshotel));
        HotelList.add(new Hotel("Steigenberger Hotels","90 $ per night","A great hotel in the middle of cairo",R.drawable.steigenberghotels));
        HotelList.add(new Hotel("Steigenberger Hotels","90 $ per night","A great hotel in the middle of cairo",R.drawable.steigenberghotels));


        HotelAdapter myAdapter = new HotelAdapter(getContext(), R.layout.row_hotel_layout, HotelList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "This click Will move to an Activity that show more details about This Hotel", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}

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
        PlacesList.add(new Places("Alexandria","Alexandria is a Mediterranean port city in Egypt. During the Hellenistic period, it was home to a lighthouse ranking among the Seven Wonders of the Ancient World as well as a storied library. Today the library is reincarnated in the disc-shaped, ultramodern Bibliotheca Alexandrina.",R.drawable.alexandria));
        PlacesList.add(new Places("Cairo","Capital of Egypt\n" +
                "Cairo, Egypt’s sprawling capital, is set on the Nile River. At its heart is Tahrir Square and the vast Egyptian Museum",R.drawable.cairo));
        PlacesList.add(new Places("Giza","Giza is a year-round destination. A popular time to visit is Aug, the height of summer.",R.drawable.giza));
        PlacesList.add(new Places("Aswan","Aswan, a city on the Nile River, has been southern Egypt’s strategic and commercial gateway since antiquity. It contains significant archaeological sites like the Philae temple complex, on Agilkia Island near the landmark Aswan Dam.",R.drawable.aswan));
        CustomHomeAdapter myAdapter = new CustomHomeAdapter(getContext(), R.layout.row_home_layout, PlacesList);
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

package com.example.waelelsharkawy.visitegypt.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.waelelsharkawy.visitegypt.R;
import com.example.waelelsharkawy.visitegypt.classes.City;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<City> {
    ArrayList<City> CityList;
    public PlacesAdapter(Context context, int textViewResourceId, ArrayList<City> objects) {
        super(context, textViewResourceId, objects);
        CityList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.row_city_layout, null);
        City list1= getItem(position);
        ImageView im_City_image = view.findViewById(R.id.im_city_image);
        TextView tx_City_name = view.findViewById(R.id.tx_city_name);
        TextView tx_City_desc = view.findViewById(R.id.tx_city_desc);
        im_City_image.setImageResource(list1.getImage());
        tx_City_name.setText(list1.getName());
        tx_City_desc.setText(list1.getDescription());
        return view;
    }
}

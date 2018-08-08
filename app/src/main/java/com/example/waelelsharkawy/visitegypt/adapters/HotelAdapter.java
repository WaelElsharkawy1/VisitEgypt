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
import com.example.waelelsharkawy.visitegypt.classes.Hotel;

import java.util.ArrayList;

public class HotelAdapter extends ArrayAdapter<Hotel> {
    ArrayList<Hotel> CityList;

    public HotelAdapter(Context context, int textViewResourceId, ArrayList<Hotel> objects) {
        super(context, textViewResourceId, objects);
        CityList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.row_hotel_layout, null);
        Hotel list1= getItem(position);
        ImageView im_hotel_image = view.findViewById(R.id.im_hotel_image);
        TextView tx_hotel_name = view.findViewById(R.id.tx_hotel_name);
        TextView tx_hotel_desc = view.findViewById(R.id.tx_hotel_desc);
        TextView tx_hotel_price = view.findViewById(R.id.tx_hotel_price);
        im_hotel_image.setImageResource(list1.getImage());
        tx_hotel_name.setText(list1.getName());
        tx_hotel_desc.setText(list1.getDescription());
        tx_hotel_price.setText(list1.getPrice());
        return view;
    }
}

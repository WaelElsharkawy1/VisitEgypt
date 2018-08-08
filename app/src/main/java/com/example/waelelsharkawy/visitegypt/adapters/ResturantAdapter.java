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
import com.example.waelelsharkawy.visitegypt.classes.Resturant;

import java.util.ArrayList;

public class ResturantAdapter extends ArrayAdapter<Resturant> {
    ArrayList<Resturant> CityList;
    public ResturantAdapter(Context context, int textViewResourceId, ArrayList<Resturant> objects) {
        super(context, textViewResourceId, objects);
        CityList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.row_resturant_layout, null);
        Resturant list1= getItem(position);
        ImageView im_resturant_image = view.findViewById(R.id.im_resturant_image);
        TextView tx_resturant_name = view.findViewById(R.id.tx_resturant_name);
        TextView tx_resturant_desc = view.findViewById(R.id.tx_resturant_desc);
        im_resturant_image.setImageResource(list1.getImage());
        tx_resturant_name.setText(list1.getName());
        tx_resturant_desc.setText(list1.getDescription());
        return view;
    }
}

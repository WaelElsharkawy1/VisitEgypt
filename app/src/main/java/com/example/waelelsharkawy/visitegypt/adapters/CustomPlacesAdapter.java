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
import com.example.waelelsharkawy.visitegypt.classes.Places;

import java.util.ArrayList;

public class CustomPlacesAdapter extends ArrayAdapter<Places> {
    ArrayList<Places> PlacesList;

    public CustomPlacesAdapter(Context context, int textViewResourceId, ArrayList<Places> objects) {
        super(context, textViewResourceId, objects);
        PlacesList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.row_places_layout, null);
        Places list1= getItem(position);
        ImageView im_place_image = view.findViewById(R.id.im_place_image);
        TextView tx_place_name = view.findViewById(R.id.tx_place_name);
        im_place_image.setImageResource(list1.getImage());
        tx_place_name.setText(list1.getName());
        return view;
    }
}

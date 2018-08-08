package com.example.waelelsharkawy.visitegypt.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.waelelsharkawy.visitegypt.fragments.CityFragment;
import com.example.waelelsharkawy.visitegypt.fragments.HotelsFragment;
import com.example.waelelsharkawy.visitegypt.R;
import com.example.waelelsharkawy.visitegypt.fragments.ResturantFragment;

public class DestinationAdapter extends FragmentPagerAdapter {
    Context mContext;
    public DestinationAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else  {
            return new ResturantFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.city);
        } else if (position == 1)
        {
            return mContext.getString(R.string.hotels);
        } else {
            return mContext.getString(R.string.restaurants);
        }
    }
}

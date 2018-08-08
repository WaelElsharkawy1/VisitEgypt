package com.example.waelelsharkawy.visitegypt;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.waelelsharkawy.visitegypt.adapters.DestinationAdapter;

public class DestnationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destnation);
        ViewPager viewPager = findViewById(R.id.viewpager);
        DestinationAdapter adapter = new DestinationAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout =findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

    }
}

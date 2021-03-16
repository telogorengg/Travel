package com.example.ajai.betravel.MenuHotel.Santika;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.ajai.betravel.MenuHotel.HotelPagerAdapter;
import com.example.ajai.betravel.R;

public class santika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.santika_layout);

        Toolbar santikabar = (Toolbar) findViewById(R.id.santika_toolbar);
        setSupportActionBar(santikabar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout santikaCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.santika_collapsing_toolbar);
        santikaCollapsingToolbar.setTitle("Hotel Santika");
        santikaCollapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);
        santikaCollapsingToolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout santikaTablayout = findViewById(R.id.santika_tablayout);
        final ViewPager santikaViewpager = findViewById(R.id.santika_viewpager);
        HotelPagerAdapter hotelPagerAdapter = new HotelPagerAdapter(getSupportFragmentManager(), santikaTablayout.getTabCount(), R.id.santika_activity);

        santikaViewpager.setAdapter(hotelPagerAdapter);

        santikaTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                santikaViewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab)
            {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {

            }
        });

        santikaViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(santikaTablayout));
    }
}

package com.example.ajai.betravel.MenuHotel.Horizon;

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

public class horizon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horizon_layout);

        Toolbar horizonbar = (Toolbar) findViewById(R.id.horizon_toolbar);
        setSupportActionBar(horizonbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout horizonCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.horizon_collapsing_toolbar);
        horizonCollapsingToolbar.setTitle("Hotel Horizon");
        horizonCollapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);
        horizonCollapsingToolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout horizonTablayout = findViewById(R.id.horizon_tablayout);
        final ViewPager horizonViewpager = findViewById(R.id.horizon_viewpager);
        HotelPagerAdapter hotelPagerAdapter = new HotelPagerAdapter(getSupportFragmentManager(), horizonTablayout.getTabCount(), R.id.horizon_activity);

        horizonViewpager.setAdapter(hotelPagerAdapter);

        horizonTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                horizonViewpager.setCurrentItem(tab.getPosition());
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

        horizonViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(horizonTablayout));
    }
}

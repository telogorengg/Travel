package com.example.ajai.betravel.MenuHotel.SinarSport;

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

public class sinarsport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinarsport_layout);

        Toolbar sinarsportbar = (Toolbar) findViewById(R.id.sinarsport_toolbar);
        setSupportActionBar(sinarsportbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout sinarsportCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.sinarsport_collapsing_toolbar);
        sinarsportCollapsingToolbar.setTitle("Hotel Sinar Sport");
        sinarsportCollapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);
        sinarsportCollapsingToolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout sinarsportTablayout = findViewById(R.id.sinarsport_tablayout);
        final ViewPager sinarsportViewpager = findViewById(R.id.sinarsport_viewpager);
        HotelPagerAdapter hotelPagerAdapter = new HotelPagerAdapter(getSupportFragmentManager(), sinarsportTablayout.getTabCount(), R.id.sinarsport_activity);

        sinarsportViewpager.setAdapter(hotelPagerAdapter);

        sinarsportTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                sinarsportViewpager.setCurrentItem(tab.getPosition());
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

        sinarsportViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(sinarsportTablayout));
    }
}

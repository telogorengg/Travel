package com.example.ajai.betravel.MenuHotel.Splash;

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

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        Toolbar splashbar = (Toolbar) findViewById(R.id.splash_toolbar);
        setSupportActionBar(splashbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout splashCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.splash_collapsing_toolbar);
        splashCollapsingToolbar.setTitle("Hotel Splash");
        splashCollapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);
        splashCollapsingToolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout splashTablayout = findViewById(R.id.splash_tablayout);
        final ViewPager splashViewpager = findViewById(R.id.splash_viewpager);
        HotelPagerAdapter hotelPagerAdapter = new HotelPagerAdapter(getSupportFragmentManager(), splashTablayout.getTabCount(), R.id.splash_activity);

        splashViewpager.setAdapter(hotelPagerAdapter);

        splashTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                splashViewpager.setCurrentItem(tab.getPosition());
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

        splashViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(splashTablayout));
    }
}

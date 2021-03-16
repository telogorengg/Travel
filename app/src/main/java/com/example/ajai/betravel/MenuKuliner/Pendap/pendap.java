package com.example.ajai.betravel.MenuKuliner.Pendap;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.ajai.betravel.MenuKuliner.KulinerPagerAdapter;
import com.example.ajai.betravel.R;

public class pendap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendap_layout);

        Toolbar pendapbar = (Toolbar) findViewById(R.id.pendap_toolbar);
        setSupportActionBar(pendapbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout pendapCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.pendap_collapsing_toolbar);
        pendapCollapsingtoolbar.setTitle("Pendap");
        pendapCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        pendapCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout pendapTablayout = findViewById(R.id.pendap_tablayout);
        final ViewPager pendapViewpager = findViewById(R.id.pendap_viewpager);
        KulinerPagerAdapter kulinerPageradapter = new KulinerPagerAdapter(getSupportFragmentManager(), pendapTablayout.getTabCount(), R.id.pendap_activity);

        pendapViewpager.setAdapter(kulinerPageradapter);

        pendapTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                pendapViewpager.setCurrentItem(tab.getPosition());
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

        pendapViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(pendapTablayout));
    }
}

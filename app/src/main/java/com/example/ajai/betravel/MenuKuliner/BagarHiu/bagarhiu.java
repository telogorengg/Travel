package com.example.ajai.betravel.MenuKuliner.BagarHiu;

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

public class bagarhiu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bagarhiu_layout);

        Toolbar bagarhiubar = (Toolbar) findViewById(R.id.bagarhiu_toolbar);
        setSupportActionBar(bagarhiubar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout bagarhiuCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.bagarhiu_collapsing_toolbar);
        bagarhiuCollapsingtoolbar.setTitle("Bagar Hiu");
        bagarhiuCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        bagarhiuCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout bagarhiuTablayout = findViewById(R.id.bagarhiu_tablayout);
        final ViewPager bagarhiuViewpager = findViewById(R.id.bagarhiu_viewpager);
        KulinerPagerAdapter kulinerPageradapter = new KulinerPagerAdapter(getSupportFragmentManager(), bagarhiuTablayout.getTabCount(), R.id.bagarhiu_activity);

        bagarhiuViewpager.setAdapter(kulinerPageradapter);

        bagarhiuTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                bagarhiuViewpager.setCurrentItem(tab.getPosition());
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

        bagarhiuViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(bagarhiuTablayout));
    }
}

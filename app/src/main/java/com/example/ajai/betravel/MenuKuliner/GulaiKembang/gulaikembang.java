package com.example.ajai.betravel.MenuKuliner.GulaiKembang;

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

public class gulaikembang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gulaikembang_layout);

        Toolbar gulaikembangbar = (Toolbar) findViewById(R.id.gulaikembang_toolbar);
        setSupportActionBar(gulaikembangbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout gulaikembangCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.gulaikembang_collapsing_toolbar);
        gulaikembangCollapsingtoolbar.setTitle("Gulai Kembang");
        gulaikembangCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        gulaikembangCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout gulaikembangTablayout = findViewById(R.id.gulaikembang_tablayout);
        final ViewPager gulaikembangViewpager = findViewById(R.id.gulaikembang_viewpager);
        KulinerPagerAdapter kulinerPageradapter = new KulinerPagerAdapter(getSupportFragmentManager(), gulaikembangTablayout.getTabCount(), R.id.gulaikembang_activity);

        gulaikembangViewpager.setAdapter(kulinerPageradapter);

        gulaikembangTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                gulaikembangViewpager.setCurrentItem(tab.getPosition());
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

        gulaikembangViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(gulaikembangTablayout));
    }
}

package com.example.ajai.betravel.MenuOleh2.PerutPunai;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.ajai.betravel.MenuOleh2.Oleh2PagerAdapter;
import com.example.ajai.betravel.R;

public class perutpunai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perutpunai_layout);

        Toolbar perutpunaibar = (Toolbar) findViewById(R.id.perutpunai_toolbar);
        setSupportActionBar(perutpunaibar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout perutpunaiCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.perutpunai_collapsing_toolbar);
        perutpunaiCollapsingtoolbar.setTitle("Perut Punai");
        perutpunaiCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        perutpunaiCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout perutpunaiTablayout = findViewById(R.id.perutpunai_tablayout);
        final ViewPager perutpunaiViewpager = findViewById(R.id.perutpunai_viewpager);
        Oleh2PagerAdapter oleh2Pageradapter = new Oleh2PagerAdapter(getSupportFragmentManager(), perutpunaiTablayout.getTabCount(), R.id.perutpunai_activity);

        perutpunaiViewpager.setAdapter(oleh2Pageradapter);

        perutpunaiTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                perutpunaiViewpager.setCurrentItem(tab.getPosition());
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

        perutpunaiViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(perutpunaiTablayout));
    }
}

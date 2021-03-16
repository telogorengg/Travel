package com.example.ajai.betravel.MenuOleh2.BatikBesurek;

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

public class batikbesurek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batikbesurek_layout);

        Toolbar batikbesurekbar = (Toolbar) findViewById(R.id.batikbesurek_toolbar);
        setSupportActionBar(batikbesurekbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout batikbesurekCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.batikbesurek_collapsing_toolbar);
        batikbesurekCollapsingtoolbar.setTitle("Batik Besurek");
        batikbesurekCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        batikbesurekCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout batikbesurekTablayout = findViewById(R.id.batikbesurek_tablayout);
        final ViewPager batikbesurekViewpager = findViewById(R.id.batikbesurek_viewpager);
        Oleh2PagerAdapter oleh2Pageradapter = new Oleh2PagerAdapter(getSupportFragmentManager(), batikbesurekTablayout.getTabCount(), R.id.batikbesurek_activity);

        batikbesurekViewpager.setAdapter(oleh2Pageradapter);

        batikbesurekTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                batikbesurekViewpager.setCurrentItem(tab.getPosition());
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

        batikbesurekViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(batikbesurekTablayout));
    }
}

package com.example.ajai.betravel.MenuKuliner.RebungAsam;

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

public class rebungasam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rebungasam_layout);

        Toolbar rebungasambar = (Toolbar) findViewById(R.id.rebungasam_toolbar);
        setSupportActionBar(rebungasambar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout rebungasamCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.rebungasam_collapsing_toolbar);
        rebungasamCollapsingtoolbar.setTitle("Rebung Asam");
        rebungasamCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        rebungasamCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout rebungasamTablayout = findViewById(R.id.rebungasam_tablayout);
        final ViewPager rebungasamViewpager = findViewById(R.id.rebungasam_viewpager);
        KulinerPagerAdapter kulinerPageradapter = new KulinerPagerAdapter(getSupportFragmentManager(), rebungasamTablayout.getTabCount(), R.id.rebungasam_activity);

        rebungasamViewpager.setAdapter(kulinerPageradapter);

        rebungasamTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                rebungasamViewpager.setCurrentItem(tab.getPosition());
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

        rebungasamViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(rebungasamTablayout));
    }
}

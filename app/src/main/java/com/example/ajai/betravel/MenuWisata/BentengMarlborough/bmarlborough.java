package com.example.ajai.betravel.MenuWisata.BentengMarlborough;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.ajai.betravel.MenuWisata.WisataPagerAdapter;
import com.example.ajai.betravel.R;

public class bmarlborough extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmarlborough_layout);

        Toolbar bentengmarlboroughBar = (Toolbar) findViewById(R.id.bmarlborough_toolbar);
        setSupportActionBar(bentengmarlboroughBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout bmarlboroughCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.bmarlborough_collapsing_toolbar);
        bmarlboroughCollapsingtoolbar.setTitle("Benteng Marlborough");
        bmarlboroughCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        bmarlboroughCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout bmarlboroughTablayout = findViewById(R.id.bmarlborough_tablayout);
        final ViewPager bmarlboroughViewpager = findViewById(R.id.bmarlborough_viewpager);
        WisataPagerAdapter bmarlboroughPageradapter = new WisataPagerAdapter(getSupportFragmentManager(), bmarlboroughTablayout.getTabCount(), R.id.bentengmarlborough_activity);

        bmarlboroughViewpager.setAdapter(bmarlboroughPageradapter);

        bmarlboroughTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                bmarlboroughViewpager.setCurrentItem(tab.getPosition());
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

        bmarlboroughViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(bmarlboroughTablayout));
    }
}

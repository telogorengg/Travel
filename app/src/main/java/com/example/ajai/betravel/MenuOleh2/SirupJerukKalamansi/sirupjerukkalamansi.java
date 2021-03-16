package com.example.ajai.betravel.MenuOleh2.SirupJerukKalamansi;

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

public class sirupjerukkalamansi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sirupjerukkalamansi_layout);

        Toolbar sirupjerukkalamansibar = (Toolbar) findViewById(R.id.sirupjerukkalamansi_toolbar);
        setSupportActionBar(sirupjerukkalamansibar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout sirupjerukkalamansiCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.sirupjerukkalamansi_collapsing_toolbar);
        sirupjerukkalamansiCollapsingtoolbar.setTitle("Sirup Jeruk Kalamansi");
        sirupjerukkalamansiCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        sirupjerukkalamansiCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout sirupjerukkalamansiTablayout = findViewById(R.id.sirupjerukkalamansi_tablayout);
        final ViewPager sirupjerukkalamansiViewpager = findViewById(R.id.sirupjerukkalamansi_viewpager);
        Oleh2PagerAdapter oleh2Pageradapter = new Oleh2PagerAdapter(getSupportFragmentManager(), sirupjerukkalamansiTablayout.getTabCount(), R.id.sirupjerukkalamansi_activity);

        sirupjerukkalamansiViewpager.setAdapter(oleh2Pageradapter);

        sirupjerukkalamansiTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                sirupjerukkalamansiViewpager.setCurrentItem(tab.getPosition());
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

        sirupjerukkalamansiViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(sirupjerukkalamansiTablayout));
    }
}

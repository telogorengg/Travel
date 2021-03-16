package com.example.ajai.betravel.MenuOleh2.ManisanTerong;

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

public class manisanterong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manisanterong_layout);

        Toolbar manisanterongbar = (Toolbar) findViewById(R.id.manisanterong_toolbar);
        setSupportActionBar(manisanterongbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout manisanterongCollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.manisanterong_collapsing_toolbar);
        manisanterongCollapsingtoolbar.setTitle("Manisan Terong");
        manisanterongCollapsingtoolbar.setExpandedTitleColor(Color.TRANSPARENT);
        manisanterongCollapsingtoolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout manisanterongTablayout = findViewById(R.id.manisanterong_tablayout);
        final ViewPager manisanterongViewpager = findViewById(R.id.manisanterong_viewpager);
        Oleh2PagerAdapter oleh2Pageradapter = new Oleh2PagerAdapter(getSupportFragmentManager(), manisanterongTablayout.getTabCount(), R.id.manisanterong_activity);

        manisanterongViewpager.setAdapter(oleh2Pageradapter);

        manisanterongTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                manisanterongViewpager.setCurrentItem(tab.getPosition());
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

        manisanterongViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(manisanterongTablayout));
    }
}

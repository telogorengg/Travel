package com.example.ajai.betravel.MenuWisata.TuguThomasParr;

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

public class thomasparr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thomasparr_layout);

        Toolbar thomasparrbar = (Toolbar) findViewById(R.id.thomasparr_toolbar);
        setSupportActionBar(thomasparrbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout thomasparrCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.thomasparr_collapsing_toolbar);
        thomasparrCollapsingToolbar.setTitle("Tugu Thomas Parr");
        thomasparrCollapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);
        thomasparrCollapsingToolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout thomasparrTablayout = findViewById(R.id.thomasparr_tablayout);
        final ViewPager thomasparrViewpager = findViewById(R.id.thomassparr_viewpager);
        WisataPagerAdapter thomasparrPageradapter = new WisataPagerAdapter(getSupportFragmentManager(), thomasparrTablayout.getTabCount(), R.id.thomasparr_activity);

        thomasparrViewpager.setAdapter(thomasparrPageradapter);

        thomasparrTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                thomasparrViewpager.setCurrentItem(tab.getPosition());
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

        thomasparrViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(thomasparrTablayout));
    }
}

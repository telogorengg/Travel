package com.example.ajai.betravel.MenuWisata.RumahSoekarno;

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

public class rsoekarno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsoekarno_layout);

        Toolbar rsoekarnobar = (Toolbar) findViewById(R.id.rsoekarno_toolbar);
        setSupportActionBar(rsoekarnobar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout rsoekarnoCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.rsoekarno_collapsing_toolbar);
        rsoekarnoCollapsingToolbar.setTitle("Rumah Pengasingan Soekarno");
        rsoekarnoCollapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);
        rsoekarnoCollapsingToolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout rsoekarnoTablayout = findViewById(R.id.rsoekarno_tablayout);
        final ViewPager rsoekarnoViewpager = findViewById(R.id.rsoekarno_viewpager);
        WisataPagerAdapter rsoekarnoPageradapter = new WisataPagerAdapter(getSupportFragmentManager(), rsoekarnoTablayout.getTabCount(), R.id.rsoekarno_activity);

        rsoekarnoViewpager.setAdapter(rsoekarnoPageradapter);

        rsoekarnoTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                rsoekarnoViewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab)
            {

            }
        });

        rsoekarnoViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(rsoekarnoTablayout));
    }
}

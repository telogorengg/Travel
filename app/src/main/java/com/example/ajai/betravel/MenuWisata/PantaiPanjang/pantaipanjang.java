package com.example.ajai.betravel.MenuWisata.PantaiPanjang;

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

public class pantaipanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantaipanjang_layout);

        Toolbar pantaipanjangBar = (Toolbar) findViewById(R.id.pantaipanjang_toolbar);
        setSupportActionBar(pantaipanjangBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout pantaipanjangCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.pantaipanjang_collapsing_toolbar);
        pantaipanjangCollapsingToolbar.setTitle("Pantai Panjang");
        pantaipanjangCollapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);
        pantaipanjangCollapsingToolbar.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));

        final TabLayout pantaipanjangTablayout = findViewById(R.id.pantaipanjang_tablayout);
        final ViewPager pantaipanjangViewpager = findViewById(R.id.pantaipanjang_viewpager);
        WisataPagerAdapter pantaipanjangPageradapter = new WisataPagerAdapter(getSupportFragmentManager(), pantaipanjangTablayout.getTabCount(), R.id.pantaipanjang_activity);

        pantaipanjangViewpager.setAdapter(pantaipanjangPageradapter);

        pantaipanjangTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                pantaipanjangViewpager.setCurrentItem(tab.getPosition());
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

        pantaipanjangViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(pantaipanjangTablayout));
    }
}

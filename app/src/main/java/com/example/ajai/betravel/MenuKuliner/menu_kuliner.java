package com.example.ajai.betravel.MenuKuliner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.ajai.betravel.MenuKuliner.BagarHiu.bagarhiu;
import com.example.ajai.betravel.MenuKuliner.GulaiKembang.gulaikembang;
import com.example.ajai.betravel.MenuKuliner.Pendap.pendap;
import com.example.ajai.betravel.MenuKuliner.RebungAsam.rebungasam;
import com.example.ajai.betravel.R;

public class menu_kuliner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_kuliner_layout);

        Toolbar kulinerToolbar = (Toolbar) findViewById(R.id.kuliner_toolbar);
        setSupportActionBar(kulinerToolbar);
        kulinerToolbar.setLogoDescription(getResources().getString(R.string.kuliner_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView kulinerPendap = (CardView) findViewById(R.id.kuliner_pendapikan);
        CardView kulinerBagarhiu = (CardView) findViewById(R.id.kuliner_bagar);
        CardView kulinerGulaikembang = (CardView) findViewById(R.id.kuliner_gkembaang);
        CardView kulinerRebungasam = (CardView) findViewById(R.id.kuliner_rasam);

        //Menu clicked
        kulinerPendap.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent pendapIntent = new Intent(getApplicationContext(), pendap.class);
                startActivity(pendapIntent);
            }
        });

        kulinerBagarhiu.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent bagarhiuIntent = new Intent(getApplicationContext(), bagarhiu.class);
                startActivity(bagarhiuIntent);
            }
        });

        kulinerGulaikembang.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent gulaikembangIntent = new Intent(getApplicationContext(), gulaikembang.class);
                startActivity(gulaikembangIntent);
            }
        });

        kulinerRebungasam.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent rebungasamIntent = new Intent(getApplicationContext(), rebungasam.class);
                startActivity(rebungasamIntent);
            }
        });
    }
}

package com.example.ajai.betravel.MenuOleh2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.ajai.betravel.MenuOleh2.BatikBesurek.batikbesurek;
import com.example.ajai.betravel.MenuOleh2.ManisanTerong.manisanterong;
import com.example.ajai.betravel.MenuOleh2.PerutPunai.perutpunai;
import com.example.ajai.betravel.MenuOleh2.SirupJerukKalamansi.sirupjerukkalamansi;
import com.example.ajai.betravel.R;

public class menu_oleh2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_oleh2_layout);

        Toolbar oleh2Toolbar = (Toolbar) findViewById(R.id.oleh2_toolbar);
        setSupportActionBar(oleh2Toolbar);
        oleh2Toolbar.setLogoDescription(getResources().getString(R.string.oleh2_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView oleh2Perutpunai = (CardView) findViewById(R.id.oleh2_ppunai);
        CardView oleh2Manisanterong = (CardView) findViewById(R.id.oleh2_mterong);
        CardView oleh2Skalamansi = (CardView) findViewById(R.id.oleh2_skalamansi);
        CardView oleh2Batikbesurek = (CardView) findViewById(R.id.oleh2_besurek);

        //Menu clicked
        oleh2Perutpunai.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent perutpunaiIntent = new Intent(getApplicationContext(), perutpunai.class);
                startActivity(perutpunaiIntent);
            }
        });

        oleh2Manisanterong.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent manisanterongIntent = new Intent(getApplicationContext(), manisanterong.class);
                startActivity(manisanterongIntent);
            }
        });

        oleh2Skalamansi.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent skalamansiIntent = new Intent(getApplicationContext(), sirupjerukkalamansi.class);
                startActivity(skalamansiIntent);
            }
        });

        oleh2Batikbesurek.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent batikbesurekIntent = new Intent(getApplicationContext(), batikbesurek.class);
                startActivity(batikbesurekIntent);
            }
        });
    }
}

package com.example.ajai.betravel.MenuHotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.ajai.betravel.MenuHotel.Horizon.horizon;
import com.example.ajai.betravel.MenuHotel.Santika.santika;
import com.example.ajai.betravel.MenuHotel.SinarSport.sinarsport;
import com.example.ajai.betravel.MenuHotel.Splash.splash;
import com.example.ajai.betravel.R;

public class menu_hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_hotel_layout);

        Toolbar hotelToolbar = (Toolbar) findViewById(R.id.hotel_toolbar);
        setSupportActionBar(hotelToolbar);
        hotelToolbar.setLogoDescription(getResources().getString(R.string.hotel_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView hotelSantika = (CardView) findViewById(R.id.hotel_santikabkl);
        CardView hotelHorizon = (CardView) findViewById(R.id.hotel_horizonbkl);
        CardView hotelSinarsport = (CardView) findViewById(R.id.hotel_sinarsportbkl);
        CardView hotelSplash = (CardView) findViewById(R.id.hotel_splashbkl);

        //Menu clicked
        hotelSantika.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent santikaIntent = new Intent(getApplicationContext(), santika.class);
                startActivity(santikaIntent);
            }
        });

        hotelHorizon.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent horizonIntent = new Intent(getApplicationContext(), horizon.class);
                startActivity(horizonIntent);
            }
        });

        hotelSinarsport.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent sinarsportIntent = new Intent(getApplicationContext(), sinarsport.class);
                startActivity(sinarsportIntent);
            }
        });

        hotelSplash.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent splashIntent = new Intent(getApplicationContext(), splash.class);
                startActivity(splashIntent);
            }
        });
    }
}

package com.example.ajai.betravel.MenuWisata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.ajai.betravel.MenuWisata.BentengMarlborough.bmarlborough;
import com.example.ajai.betravel.MenuWisata.PantaiPanjang.pantaipanjang;
import com.example.ajai.betravel.MenuWisata.RumahSoekarno.rsoekarno;
import com.example.ajai.betravel.MenuWisata.TuguThomasParr.thomasparr;
import com.example.ajai.betravel.R;

public class menu_wisata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_wisata_layout);

        Toolbar wisataToolbar = (Toolbar) findViewById(R.id.wisata_toolbar);
        setSupportActionBar(wisataToolbar);
        wisataToolbar.setLogoDescription(getResources().getString(R.string.wisata_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView rumahSoekarno = (CardView) findViewById(R.id.wisata_soekarno);
        CardView tuguThomasparr = (CardView) findViewById(R.id.wisata_thomasparr);
        CardView bentengMarlborough = (CardView) findViewById(R.id.wisata_marlborough);
        final CardView pantaiPanjang = (CardView) findViewById(R.id.wisata_ppanjang);

        //Menu clicked
        rumahSoekarno.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent rsoekarnoIntent = new Intent(getApplicationContext(), rsoekarno.class);
                startActivity(rsoekarnoIntent);
            }
        });

        tuguThomasparr.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent thomasparrIntent = new Intent(getApplicationContext(), thomasparr.class);
                startActivity(thomasparrIntent);
            }
        });

        bentengMarlborough.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent bmarlboroughIntent = new Intent(getApplicationContext(), bmarlborough.class);
                startActivity(bmarlboroughIntent);
            }
        });

        pantaiPanjang.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent ppanjangIntent = new Intent(getApplicationContext(), pantaipanjang.class);
                startActivity(ppanjangIntent);
            }
        });
    }
}

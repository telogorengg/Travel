package com.example.ajai.betravel;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.ajai.betravel.MenuHotel.menu_hotel;
import com.example.ajai.betravel.MenuKuliner.menu_kuliner;
import com.example.ajai.betravel.MenuOleh2.menu_oleh2;
import com.example.ajai.betravel.MenuWisata.menu_wisata;
import com.example.ajai.betravel.navdrawer_fragments.NavContactus;
import com.example.ajai.betravel.navdrawer_fragments.NavFeedback;
import com.example.ajai.betravel.navdrawer_fragments.NavHelp;
import com.example.ajai.betravel.navdrawer_fragments.NavShare;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity
        implements NavContactus.OnFragmentInteractionListener,
        NavFeedback.OnFragmentInteractionListener,
        NavHelp.OnFragmentInteractionListener,
        NavShare.OnFragmentInteractionListener,
        NavigationView.OnNavigationItemSelectedListener {

    CarouselView carouselView;
    int[] slideImages = {R.drawable.bengkulu_kota, R.drawable.wisata_pantaipanjang, R.drawable.benteng_marlborough};
    int backStackCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));

        //ImageListener for CarouselView
        ImageListener imageListener = new ImageListener()
        {

            @Override
            public void setImageForPosition(int position, ImageView imageView)
            {
                imageView.setImageResource(slideImages[position]);
            }
        };

        //CarouselView declaration and initialization
        carouselView = (CarouselView) findViewById(R.id.carousel_view);
        carouselView.setPageCount(slideImages.length);
        carouselView.setImageListener(imageListener);
    }

    //Main menu clicked
    public void wisataClick(View view)
    {
        Intent wisataIntent = new Intent(getApplicationContext(), menu_wisata.class);
        startActivity(wisataIntent);
    }

    public void hotelClick(View view)
    {
        Intent hotelIntent = new Intent(getApplicationContext(), menu_hotel.class);
        startActivity(hotelIntent);
    }

    public void kulinerClick(View view)
    {
        Intent kulinerIntent = new Intent(getApplicationContext(), menu_kuliner.class);
        startActivity(kulinerIntent);
    }

    public void olehClick(View view)
    {
        Intent olehIntent = new Intent(getApplicationContext(), menu_oleh2.class);
        startActivity(olehIntent);
    }

    @Override
    public void onBackPressed() {
        if(backStackCount > 0)
        {
            Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(mainIntent);
            backStackCount = 0;
        } else if(backStackCount == 0)
        {
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        Fragment fragment = null;

        switch(id)
        {
            case R.id.contact:
            {
                getSupportActionBar().setTitle(getResources().getString(R.string.contactus_name));
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                fragment = new NavContactus();
                backStackCount++;
                break;
            }

            case R.id.feedback:
            {
                getSupportActionBar().setTitle(getResources().getString(R.string.feedback_name));
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                fragment = new NavFeedback();
                backStackCount++;
                break;
            }

            case R.id.help:
            {
                getSupportActionBar().setTitle(getResources().getString(R.string.help_name));
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                fragment = new NavHelp();
                backStackCount++;
                break;
            }

            case R.id.about:
            {
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
                alertBuilder.setTitle("About");
                alertBuilder.setMessage("BeTravel version 1.0.0");
                alertBuilder.setIcon(R.drawable.betravel_logo);
                alertBuilder.setCancelable(true);
                alertBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.dismiss();
                    }
                });

                AlertDialog alertDialog = alertBuilder.create();
                alertDialog.show();
                break;
            }

            case R.id.share:
            {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "BeTravel");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "WOW");
                startActivity(Intent.createChooser(shareIntent, "Share via"));
                break;
            }
        }

        if(fragment != null)
        {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.mainLinearLayout, fragment);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

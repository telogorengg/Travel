package com.example.ajai.betravel.MenuHotel.Splash;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ajai.betravel.R;

public class splash_desc extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewDesc = inflater.inflate(R.layout.splash_desc_layout, container, false);
        return viewDesc;
    }
}

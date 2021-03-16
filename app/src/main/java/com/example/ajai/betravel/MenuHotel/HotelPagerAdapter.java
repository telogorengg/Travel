package com.example.ajai.betravel.MenuHotel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ajai.betravel.MenuHotel.Horizon.horizon_desc;
import com.example.ajai.betravel.MenuHotel.Horizon.horizon_loc;
import com.example.ajai.betravel.MenuHotel.Santika.santika_desc;
import com.example.ajai.betravel.MenuHotel.Santika.santika_loc;
import com.example.ajai.betravel.MenuHotel.SinarSport.sinarsport_desc;
import com.example.ajai.betravel.MenuHotel.SinarSport.sinarsport_loc;
import com.example.ajai.betravel.MenuHotel.Splash.splash_desc;
import com.example.ajai.betravel.MenuHotel.Splash.splash_loc;
import com.example.ajai.betravel.R;

public class HotelPagerAdapter extends FragmentStatePagerAdapter
{
    private int numberOfTabs = 0;
    private int activityId = 0;

    public HotelPagerAdapter(FragmentManager fm, int numberOfTabs, int activityId)
    {
        super(fm);
        this.numberOfTabs = numberOfTabs;
        this.activityId = activityId;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
            {
                if(activityId == R.id.santika_activity)
                {
                    return new santika_desc();
                } else if(activityId == R.id.horizon_activity)
                {
                    return new horizon_desc();
                } else if(activityId == R.id.sinarsport_activity)
                {
                    return new sinarsport_desc();
                } else if(activityId == R.id.splash_activity)
                {
                    return new splash_desc();
                }
            }

            case 1:
            {
                if(activityId == R.id.santika_activity)
                {
                    return new santika_loc();
                } else if(activityId == R.id.horizon_activity)
                {
                    return new horizon_loc();
                } else if(activityId == R.id.sinarsport_activity)
                {
                    return new sinarsport_loc();
                } else if(activityId == R.id.splash_activity)
                {
                    return new splash_loc();
                }
            }

            default:
            {
                return null;
            }
        }
    }

    @Override
    public int getCount()
    {
        return numberOfTabs;
    }
}

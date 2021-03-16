package com.example.ajai.betravel.MenuOleh2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ajai.betravel.MenuOleh2.BatikBesurek.batikbesurek_desc;
import com.example.ajai.betravel.MenuOleh2.BatikBesurek.batikbesurek_loc;
import com.example.ajai.betravel.MenuOleh2.ManisanTerong.manisanterong_desc;
import com.example.ajai.betravel.MenuOleh2.ManisanTerong.manisanterong_loc;
import com.example.ajai.betravel.MenuOleh2.PerutPunai.perutpunai_desc;
import com.example.ajai.betravel.MenuOleh2.PerutPunai.perutpunai_loc;
import com.example.ajai.betravel.MenuOleh2.SirupJerukKalamansi.sirupjerukkalamansi_desc;
import com.example.ajai.betravel.MenuOleh2.SirupJerukKalamansi.sirupjerukkalamansi_loc;
import com.example.ajai.betravel.R;

public class Oleh2PagerAdapter extends FragmentStatePagerAdapter
{
    private int numberOfTabs = 0;
    private int activityId = 0;

    public Oleh2PagerAdapter(FragmentManager fm, int numberOfTabs, int activityId)
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
                if(activityId == R.id.perutpunai_activity)
                {
                    return new perutpunai_desc();
                } else if(activityId == R.id.manisanterong_activity)
                {
                    return new manisanterong_desc();
                } else if(activityId == R.id.sirupjerukkalamansi_activity)
                {
                    return new sirupjerukkalamansi_desc();
                } else if(activityId == R.id.batikbesurek_activity)
                {
                    return new batikbesurek_desc();
                }
            }

            case 1:
            {
                if(activityId == R.id.perutpunai_activity)
                {
                    return new perutpunai_loc();
                } else if(activityId == R.id.manisanterong_activity)
                {
                    return new manisanterong_loc();
                } else if(activityId == R.id.sirupjerukkalamansi_activity)
                {
                    return new sirupjerukkalamansi_loc();
                } else if(activityId == R.id.batikbesurek_activity)
                {
                    return new batikbesurek_loc();
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

package com.example.ajai.betravel.MenuKuliner;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ajai.betravel.MenuKuliner.BagarHiu.bagarhiu_desc;
import com.example.ajai.betravel.MenuKuliner.BagarHiu.bagarhiu_loc;
import com.example.ajai.betravel.MenuKuliner.GulaiKembang.gulaikembang_desc;
import com.example.ajai.betravel.MenuKuliner.GulaiKembang.gulaikembang_loc;
import com.example.ajai.betravel.MenuKuliner.Pendap.pendap_desc;
import com.example.ajai.betravel.MenuKuliner.Pendap.pendap_loc;
import com.example.ajai.betravel.MenuKuliner.RebungAsam.rebungasam_desc;
import com.example.ajai.betravel.MenuKuliner.RebungAsam.rebungasam_loc;
import com.example.ajai.betravel.R;

public class KulinerPagerAdapter extends FragmentStatePagerAdapter
{
    private int numberOfTabs = 0;
    private int activityId = 0;

    public KulinerPagerAdapter(FragmentManager fm, int numberOfTabs, int activityId)
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
                if(activityId == R.id.pendap_activity)
                {
                    return new pendap_desc();
                } else if(activityId == R.id.bagarhiu_activity)
                {
                    return new bagarhiu_desc();
                } else if(activityId == R.id.gulaikembang_activity)
                {
                    return new gulaikembang_desc();
                } else if(activityId == R.id.rebungasam_activity)
                {
                    return new rebungasam_desc();
                }
            }

            case 1:
            {
                if(activityId == R.id.pendap_activity)
                {
                    return new pendap_loc();
                } else if(activityId == R.id.bagarhiu_activity)
                {
                    return new bagarhiu_loc();
                } else if(activityId == R.id.gulaikembang_activity)
                {
                    return new gulaikembang_loc();
                } else if(activityId == R.id.rebungasam_activity)
                {
                    return new rebungasam_loc();
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

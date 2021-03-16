package com.example.ajai.betravel.MenuWisata;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ajai.betravel.MenuWisata.BentengMarlborough.bmarlborough_desc;
import com.example.ajai.betravel.MenuWisata.BentengMarlborough.bmarlborough_loc;
import com.example.ajai.betravel.MenuWisata.PantaiPanjang.pantaipanjang_desc;
import com.example.ajai.betravel.MenuWisata.PantaiPanjang.pantaipanjang_loc;
import com.example.ajai.betravel.MenuWisata.RumahSoekarno.rsoekarno_desc;
import com.example.ajai.betravel.MenuWisata.RumahSoekarno.rsoekarno_loc;
import com.example.ajai.betravel.MenuWisata.TuguThomasParr.thomasparr_desc;
import com.example.ajai.betravel.MenuWisata.TuguThomasParr.thomasparr_loc;
import com.example.ajai.betravel.R;

public class WisataPagerAdapter extends FragmentStatePagerAdapter
{
    private int numberOfTabs = 0;
    private int activityId = 0;

    public WisataPagerAdapter(FragmentManager fm, int numberOfTabs, int activityId)
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
                if(activityId == R.id.rsoekarno_activity)
                {
                    return new rsoekarno_desc();
                } else if(activityId == R.id.thomasparr_activity)
                {
                    return new thomasparr_desc();
                } else if(activityId == R.id.bentengmarlborough_activity)
                {
                    return new bmarlborough_desc();
                } else if(activityId == R.id.pantaipanjang_activity)
                {
                    return new pantaipanjang_desc();
                }
            }

            case 1:
            {
                if(activityId == R.id.rsoekarno_activity)
                {
                    return new rsoekarno_loc();
                } else if(activityId == R.id.thomasparr_activity)
                {
                    return new thomasparr_loc();
                } else if(activityId == R.id.bentengmarlborough_activity)
                {
                    return new bmarlborough_loc();
                } else if(activityId == R.id.pantaipanjang_activity)
                {
                    return new pantaipanjang_loc();
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

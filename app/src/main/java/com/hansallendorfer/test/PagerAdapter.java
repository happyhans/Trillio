package com.hansallendorfer.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter{

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0){
        switch (arg0){
            case 0:
                return new StartFragment();
            case 1:
                return new SheetFragment();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount(){
        return 2;
    }
}

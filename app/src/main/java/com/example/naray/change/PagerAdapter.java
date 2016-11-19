package com.example.naray.change;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
int mNumOfTabs;

public PagerAdapter(FragmentManager fm, int NumOfTabs) {
    super(fm);
    this.mNumOfTabs = NumOfTabs;
}

@Override
public Fragment getItem(int position) {

    switch (position) {
        case 0:
            GetCash tab1 = new GetCash();
            return tab1;
        case 1:
            Chat tab2 = new Chat();
            return tab2;

        default:
            return null;
    }
}

@Override
public int getCount() {
    return mNumOfTabs;
}
}

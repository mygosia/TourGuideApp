package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mygosia on 27.03.18.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    //    Context of the app
    private Context mContext;

    //      Create a new CategoryAdapter object.
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //    Return the Fragment that should be displayed for the given page number.
    private static final int POSITION0 = 0;
    private static final int POSITION1 = 1;
    private static final int POSITION2 = 2;

    public Fragment getItem(int position) {
        if (position == POSITION0) {
            return new NatureFragment();
        } else if (position == POSITION1) {
            return new FoodFragment();
        } else if (position == POSITION2) {
            return new CraftFragment();
        } else {
            return new AnimalsFragment();
        }
    }

//     Return the total number of pages.

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_nature);
        } else if (position == 1) {
            return mContext.getString(R.string.category_food);
        } else if (position == 2) {
            return mContext.getString(R.string.category_craft);
        } else {
            return mContext.getString(R.string.category_animals);
        }
    }
}

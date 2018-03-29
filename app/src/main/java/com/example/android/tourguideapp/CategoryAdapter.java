package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mygosia on 27.03.18.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new CategoryAdapter object.
     *  context is the context of the app
     *fm is the fragment manager that will keep each fragment's state in the adapter
     across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NatureFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new CraftFragment();
        } else {
            return new AnimalsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    //    @Override
//    public CharSequence getPageTitle(int position) {
//        // Generate title based on item position
//        return tabTitles[position];
//    }
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

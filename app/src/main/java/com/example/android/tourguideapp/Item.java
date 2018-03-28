package com.example.android.tourguideapp;

/**
 * Created by mygosia on 27.03.18.
 */


public class Item {
    private String mTitleText;
    private  String mSubtitleText;
    private  String mContensText;
    private int mImageResourceId = NO_IMAGAE_PROVIDED;
    private static final int NO_IMAGAE_PROVIDED = -1;



    public Item(String titleText, String subtitleText, String contensText, int imageResourceId){
        mTitleText = titleText;
        mSubtitleText = subtitleText;
        mContensText = contensText;
        mImageResourceId = imageResourceId;
    }

    public String getTitleText() {
        return mTitleText;
    }

    public String getSubtitleText(){
        return  mSubtitleText;
    }
    public String getContensText(){
        return  mContensText;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }



}
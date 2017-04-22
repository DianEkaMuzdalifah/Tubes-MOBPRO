package com.example.user.televent;

/**
 * Created by user on 3/17/2017.
 */

public class MainMenu {
    private int mImageResource, mTextResource;

    public MainMenu(int mImageResource, int mTextResource) {
        this.mImageResource = mImageResource;
        this.mTextResource = mTextResource;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public int getmTextResource() {
        return mTextResource;
    }
}

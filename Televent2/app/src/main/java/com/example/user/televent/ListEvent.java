package com.example.user.televent;

/**
 * Created by user on 3/15/2017.
 */

public class ListEvent {

    private String mTitleEvent;
    private String mLocationEvent;
    private String mScheduleEvent;
    private String mCostEvent;
    private int mImageEvent;

    public ListEvent(String titleEvent, String locationEvent, String scheduleEvent, int imageEvent, String costEvent) {
        mTitleEvent = titleEvent;
        mLocationEvent = locationEvent;
        mScheduleEvent = scheduleEvent;
        mCostEvent = costEvent;
        mImageEvent = imageEvent;
    }

    public String getmTitleEvent() {
        return mTitleEvent;
    }

    public String getmLocationEvent() {
        return mLocationEvent;
    }

    public String getmScheduleEvent() {
        return mScheduleEvent;
    }

    public String getmCostEvent() {
        return mCostEvent;
    }

    public int getmImageEvent() {
        return mImageEvent;
    }


}

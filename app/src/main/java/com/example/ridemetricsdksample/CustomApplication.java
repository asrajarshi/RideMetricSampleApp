package com.example.ridemetricsdksample;

import android.app.Application;

import com.ridemetric.sdk.RideMetricSDKconfig;

/**
 * Created by shelly on 6/20/2015.
 */
public class CustomApplication extends Application {

    //rideMetricSdkKey retrieved from ridemetric licensing site
    static final private String rideMetricSdkKey = "RetrieveFromGenerateSdkKeySite";

    @Override
    public void onCreate() {
        super.onCreate();
        RideMetricSDKconfig.initApp(this, rideMetricSdkKey, true);
    }
}
// Copyright (c) kotemaru.org  (APL/2.0)
package org.kotemaru.android.gcm_sample2;

import android.app.Application;

import org.kotemaru.android.gcm_sample2.lib.GCMListener;
import org.kotemaru.android.gcm_sample2.lib.GCMListenerFactory;
import org.kotemaru.android.gcm_sample2.lib.GCMRegister;

public class MyApplication extends Application implements GCMListenerFactory{

    private final GCMListener mGCMListener= new GCMListenerImpl();

    @Override
    public void onCreate() {
        super.onCreate();
        GCMRegister.init(this, true);
    }

    @Override
    public GCMListener getGCMListener() {
        return mGCMListener;
    }
}

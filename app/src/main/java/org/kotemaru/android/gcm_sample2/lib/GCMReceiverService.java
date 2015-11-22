package org.kotemaru.android.gcm_sample2.lib;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * GCM のメッセージを受け取るサービス。
 *
 * @author kotemaru@kotemaru.org
 */
public class GCMReceiverService extends GcmListenerService {
    private static final String TAG = GCMReceiverService.class.getSimpleName();

    private GCMListener mListener;

    @Override
    public void onCreate() {
        super.onCreate();
        mListener = ((GCMListenerFactory) getApplication()).getGCMListener();
    }

    @Override
    public void onMessageReceived(String from, Bundle data) {
        if (mListener == null) return;
        mListener.onMessageReceived(this, from, data);
    }

    @Override
    public void onDeletedMessages() {
        if (mListener == null) return;
        mListener.onDeletedMessages(this);
    }

    @Override
    public void onMessageSent(String msgId) {
        if (mListener == null) return;
        mListener.onMessageSent(this, msgId);
    }

    @Override
    public void onSendError(String msgId, String error) {
        if (mListener == null) return;
        mListener.onSendError(this, msgId, error);
    }
}

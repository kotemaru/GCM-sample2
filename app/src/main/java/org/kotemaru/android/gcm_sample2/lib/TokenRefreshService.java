package org.kotemaru.android.gcm_sample2.lib;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * RegistrationId の更新タイミングを受け取るだけのサービス。
 *
 * @author kotemaru@kotemaru.org
 */
public class TokenRefreshService extends InstanceIDListenerService {
    @Override
    public void onTokenRefresh() {
        GCMRegister.onTokenRefresh(this);
    }
}

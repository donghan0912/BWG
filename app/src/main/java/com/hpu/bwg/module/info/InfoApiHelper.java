package com.hpu.bwg.module.info;

import com.hpu.common.api.ServiceGenerator;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created on 2017/11/18
 */

public class InfoApiHelper {
    private InfoService mInfoService;

    public static InfoApiHelper getInstance() {
        return InfoApiHelperLoader.INSTANCE;
    }

    private static class InfoApiHelperLoader {
        private static final InfoApiHelper INSTANCE = new InfoApiHelper();
    }

    private InfoService getService() {
        if(mInfoService == null) {
            mInfoService = ServiceGenerator.getInstance().createService(InfoService.class, false);
        }
        return mInfoService;
    }

    public Observable<ServiceInfo> getServiceInfo(String veid, String apiKey) {
        return getService().getServiceInfo(veid, apiKey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

}

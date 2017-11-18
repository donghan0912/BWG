package com.hpu.bwg.module.info;

import com.hpu.bwg.RequestConstant;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created on 2017/11/18
 */

public interface InfoService {

    @GET(RequestConstant.GET_SERVICE_INFO)
    Observable<ServiceInfo> getServiceInfo(@Query("veid") String veid, @Query("api_key") String apiKey);

}

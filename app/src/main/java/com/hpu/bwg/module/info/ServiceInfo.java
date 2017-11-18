package com.hpu.bwg.module.info;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created on 2017/11/18
 */

public class ServiceInfo {

    @SerializedName("vm_type")
    public String vm_type;
    @SerializedName("hostname")
    public String hostname;
    @SerializedName("node_ip")
    public String node_ip;
    @SerializedName("node_alias")
    public String node_alias;
    @SerializedName("node_location")
    public String node_location;
    @SerializedName("location_ipv6_ready")
    public boolean location_ipv6_ready;
    @SerializedName("plan")
    public String plan;
    @SerializedName("plan_monthly_data")
    public long plan_monthly_data;
    @SerializedName("monthly_data_multiplier")
    public int monthly_data_multiplier;
    @SerializedName("plan_disk")
    public long plan_disk;
    @SerializedName("plan_ram")
    public int plan_ram;
    @SerializedName("plan_swap")
    public int plan_swap;
    @SerializedName("plan_max_ipv6s")
    public int plan_max_ipv6s;
    @SerializedName("os")
    public String os;
    @SerializedName("email")
    public String email;
    @SerializedName("data_counter")
    public long data_counter;
    @SerializedName("data_next_reset")
    public int data_next_reset;
    @SerializedName("rdns_api_available")
    public boolean rdns_api_available;
    // TODO 参考 http://baurine.github.io/2017/02/24/gson_adapter.html
//    @SerializedName("ptr")
//    public PtrBean ptr;
    @SerializedName("suspended")
    public boolean suspended;
    @SerializedName("error")
    public int error;
    @SerializedName("ip_addresses")
    public List<String> ip_addresses;

    public static class PtrBean {
        @SerializedName("104.224.141.22")
        public Object _$_10422414122183; // FIXME check this code
    }
}

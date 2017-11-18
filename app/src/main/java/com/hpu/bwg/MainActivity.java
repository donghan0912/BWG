package com.hpu.bwg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.hpu.bwg.module.info.InfoApiHelper;
import com.hpu.bwg.module.info.ServiceInfo;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = findViewById(R.id.text);
        InfoApiHelper.getInstance().getServiceInfo("745791", "private_0q1ukZsdB2JqwWIEqWeQ4KLN")
                .subscribe(new Consumer<ServiceInfo>() {
                    @Override
                    public void accept(ServiceInfo info) throws Exception {
                        text.setText(info.data_counter / (1024 * 1024 * 1024f) + "/" + info.plan_monthly_data / (1024 * 1024 * 1024) + "GB");
                    }
                }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {

            }
        });
    }
}